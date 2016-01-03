package citibank.com.smartpark;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Launcher activity for the application
 */
public class SplashActivity extends Activity {
    private static final String TAG = SplashActivity.class.getSimpleName();
    private VideoView mVideoHolder;
    private ImageView mImgLogo;
    private TextView mTextName;
    private Animation mAnimateLoginRegisterBottomToTop;
    private Animation mAnimateNameBottomToTop;
    private Animation mAnimateLogoMiddleToTop;
    private Animation mAnimateTextCarousel;

    private RelativeLayout mFading;
    private Boolean mIsMusicActive;

    private RelativeLayout mPageContent;
    private LinearLayout mInitBtn;


    private RelativeLayout mVideoWrap;


    private ProgressDialog mCustomProgressDialog;
    private View mVideoWrapStatic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_activity);

        setUI();
        initContent();
        startAnimation();
    }

    /**
     * Initialises the UI of the current activity.
     */
    private void setUI() {
        mAnimateLoginRegisterBottomToTop    = AnimationUtils.loadAnimation(this, R.anim.anim_translate_bottom_to_top);
        mAnimateNameBottomToTop             = AnimationUtils.loadAnimation(this, R.anim.anim_name_bottom_to_top);
        mAnimateLogoMiddleToTop             = AnimationUtils.loadAnimation(this, R.anim.anim_translate_logo_middle_to_top);
        mAnimateTextCarousel                = AnimationUtils.loadAnimation(this, R.anim.anim_translate_bottom_to_top);

        mInitBtn                            = (LinearLayout) findViewById(R.id.initbutton);
        mPageContent                        = (RelativeLayout) findViewById(R.id.pagecontent);
        mVideoHolder                        = (VideoView) findViewById(R.id.videoview);
        mVideoWrap                          = (RelativeLayout) findViewById(R.id.videocontainer);
        mVideoWrapStatic                    = findViewById(R.id.videocontainer_img);
        mImgLogo                            = (ImageView) findViewById(R.id.imageLogo);
        mTextName                           = (TextView) findViewById(R.id.textName);

        mFading                             = (RelativeLayout) findViewById(R.id.transparent_layout);

        loadVideo();
    }

    /**
     * Load videos according to the device's density.
     */
    private void loadVideo() {
        DisplayMetrics metrics              = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int widthPixels                     = metrics.widthPixels;
        int heightPixels                    = metrics.heightPixels;

        int sdkVersion = Build.VERSION.SDK_INT; // e.g. sdkVersion := 8;
        if(sdkVersion <= Build.VERSION_CODES.GINGERBREAD_MR1) {
            mVideoWrap.setVisibility(View.GONE);
            mVideoWrapStatic.setVisibility(View.VISIBLE);
        } else {

            Uri video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                    + "/" + R.raw.landing_video_mdpi_new);

            try {
                if (widthPixels >= 320 && heightPixels <= 480) {
                    video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                            + "/" + R.raw.landing_video_mdpi_new);
                }

                if (widthPixels >= 480 && heightPixels <= 854) {
                    if (heightPixels == 800) {

                        video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                                + "/" + R.raw.landing_video_mdpi_new);

                    } else if (heightPixels == 854) {
                        video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                                + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                    }
                }

                if (widthPixels >= 540 && heightPixels <= 960) {
                    video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                            + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                }

                if (widthPixels >= 720 && heightPixels <= 1280) {
                    if (widthPixels == 720) {
                        video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                                + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                    } else if (widthPixels == 768) {
                        video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                                + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                    }
                }

                if (widthPixels == 750 && heightPixels == 1330) {
                    video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE+ getPackageName()
                            + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                }

                if (widthPixels >= 1080 && heightPixels <= 1920) {
                    video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE+ getPackageName()
                            + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                }

                if (widthPixels >= 1440 && heightPixels <= 2560) {
                    video = Uri.parse(Constants.SPLASH_VIDEO_RESOURCE + getPackageName()
                            + "/" + R.raw.landing_video_xxhdpi_low_resolution);
                }

                mVideoHolder.setVideoURI(video);
                mVideoHolder.requestFocus();

                mVideoHolder.setOnPreparedListener(new OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                            @Override
                            public boolean onInfo(MediaPlayer mp, int what, int extra) {
                                if (what == MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START) {
                                    mVideoWrap.setVisibility(View.VISIBLE);
                                    return true;
                                }
                                return false;
                            }
                        });
                        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN) {
                            mVideoWrap.setVisibility(View.VISIBLE);
                        }
                        mVideoHolder.start();
                        mp.setLooping(true); // Looping set to true
                        mp.setVolume(0f, 0f); // Volume mute
                    }
                });
            } catch (Exception ex) {
            }
        }

        mIsMusicActive = false;
        AudioManager mAudioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        if (mAudioManager.isMusicActive()) {
            mIsMusicActive = true;
        }
    }

    private void initContent() {
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashActivity.this,LandingActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, 6000);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
        mFading.setVisibility(View.GONE);

        // Call the 'activateApp' method to log an app event for use in analytics and advertising reporting.  Do so in
        // the onResume methods of the primary Activities that an app may be launched into.

    }

    @Override
    protected void onStop() {
        super.onStop();
        mFading.getBackground().setAlpha(255);
        mFading.setVisibility(View.GONE);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void startAnimation() {
        try {
            // Play AnimationCarouselFragment.java
            mImgLogo.startAnimation(mAnimateLogoMiddleToTop);

            mTextName.startAnimation(mAnimateNameBottomToTop);

            mInitBtn.startAnimation(mAnimateLoginRegisterBottomToTop);

            mAnimateTextCarousel.setStartOffset(1000);
            mPageContent.startAnimation(mAnimateTextCarousel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mIsMusicActive) {
            Intent i = new Intent(Constants.SPLASH_MUSIC_RESOURCE);
            i.putExtra("command", "play");
            sendBroadcast(i);
        }

        mIsMusicActive = false;
    }
}