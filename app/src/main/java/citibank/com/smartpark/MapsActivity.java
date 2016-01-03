package citibank.com.smartpark;

import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
        if(null != getIntent()) {
            String destinationAddress = getIntent().getStringExtra("DestAdd");
            if(null != destinationAddress && !destinationAddress.isEmpty()) {
                LatLng locationPosition = getLocationFromAddress(MapsActivity.this, destinationAddress);
                Marker marker = mMap.addMarker(new MarkerOptions()
                        .position(locationPosition)
                        .title(destinationAddress));
                zoomCamera(locationPosition);
            }

            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    Intent mainIntent = new Intent(MapsActivity.this, ArrivedActivity.class);
                    startActivity(mainIntent);
                }
            }, 8 * 1000);
        }


    }

    private void zoomCamera(LatLng locationPosition) {
        DisplayMetrics metrics  = getResources().getDisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width               = metrics.widthPixels;

        LatLng loc = new LatLng(locationPosition.latitude, locationPosition.longitude);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, calculateZoomLevel(width, 1)));
    }

    public float calculateZoomLevel(int screenWidth, int kilometers) {
        float equatorLength  = 40075004;
        float meterPerPixels = equatorLength / 256;
        float zoomLevel = 1.0f;
        while ((meterPerPixels * (float) screenWidth) > kilometers * 10000.0f) {
            meterPerPixels /= 2;
            ++zoomLevel;
        }
        return zoomLevel;
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
       // mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
    }

    public LatLng getLocationFromAddress(Context context,String strAddress) {

        Geocoder coder = new Geocoder(context);
        List<Address> address;
        LatLng p1 = null;

        try {
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            location.getLatitude();
            location.getLongitude();

            p1 = new LatLng(location.getLatitude(), location.getLongitude() );

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return p1;
    }
}
