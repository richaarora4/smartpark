package citibank.com.smartpark;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.NumberPicker;

public class ArrivedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrived);

        NumberPicker hours = (NumberPicker) findViewById(R.id.hour_picker);
        hours.setMaxValue(2);
        hours.setMinValue(0);
        hours.setWrapSelectorWheel(false);

        NumberPicker mts = (NumberPicker) findViewById(R.id.mt_picker);
        mts.setMaxValue(59);
        mts.setMinValue(0);
        mts.setWrapSelectorWheel(false);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(ArrivedActivity.this, ExpiryActivity.class);
                startActivity(mainIntent);
            }
        }, 8 * 1000);
    }
}
