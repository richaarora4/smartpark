package citibank.com.smartpark;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SlotsActivity extends AppCompatActivity {

    private TextView reserveTime;
    private TextView timeToDest;
    private RelativeLayout takeMeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slots);

        final TextView addressLabel     = (TextView) findViewById(R.id.address_label);
        timeToDest                      = (TextView) findViewById(R.id.time_to_dest_timer);
        reserveTime                     = (TextView) findViewById(R.id.slots_txt);
        takeMeBtn                       = (RelativeLayout) findViewById(R.id.btn_take_me);

        if(null != getIntent()) {
            String destinationAddress = getIntent().getStringExtra("DestAdd");
            addressLabel.setText(destinationAddress);
        }

        setTimeToDestTimer();
        setReserveSlotTimer();

        takeMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takeMeThereIntent = new Intent(SlotsActivity.this, MapsActivity.class);
                if(null != getIntent()) {
                    takeMeThereIntent.putExtra("DestAdd", getIntent().getStringExtra("DestAdd"));
                }
                startActivity(takeMeThereIntent);
            }
        });

    }

    private void setTimeToDestTimer() {
        int hoursToGo   = 0;
        int minutesToGo = 15;
        int secondsToGo = 0;

        int millisToGo  = secondsToGo*1000+minutesToGo*1000*60+hoursToGo*1000*60*60;

        new CountDownTimer(millisToGo, 1000) {

            @Override
            public void onTick(long millis) {
                int seconds = (int) (millis / 1000) % 60 ;
                int minutes = (int) ((millis / (1000*60)) % 60);
                int hours   = (int) ((millis / (1000*60*60)) % 24);
                String text = String.format("%02d h, %02d m, %02d s",hours,minutes,seconds);
                timeToDest.setText(text);
                timeToDest.setTextColor(getResources().getColor(R.color.button_background_pressed_start));

            }

            @Override
            public void onFinish() {
                timeToDest.setText("--");
                timeToDest.setTextColor(getResources().getColor(R.color.offline_bar_color));
            }
        }.start();
    }

    private void setReserveSlotTimer() {
        int hoursToGo   = 0;
        int minutesToGo = 5;
        int secondsToGo = 0;

        int millisToGo  = secondsToGo*1000+minutesToGo*1000*60+hoursToGo*1000*60*60;

        new CountDownTimer(millisToGo, 1000) {

            @Override
            public void onTick(long millis) {
                int seconds = (int) (millis / 1000) % 60 ;
                int minutes = (int) ((millis / (1000*60)) % 60);
                int hours   = (int) ((millis / (1000*60*60)) % 24);
                String text = String.format("%02d m, %02d s", minutes,seconds);
                reserveTime.setText("Reserve in " + text);
                //reserveTime.setTextColor(getResources().getColor(R.color.button_background_pressed_start));

            }

            @Override
            public void onFinish() {
                reserveTime.setText("Reserve in --");
               // reserveTime.setTextColor(getResources().getColor(R.color.offline_bar_color));
            }
        }.start();
    }
}
