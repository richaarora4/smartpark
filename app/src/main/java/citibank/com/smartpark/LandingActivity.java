package citibank.com.smartpark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LandingActivity extends AppCompatActivity {

    private RelativeLayout SlotsBtn;
    private TextView DestinationAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_2);


        DestinationAddress  = (TextView) findViewById(R.id.dest_add);
        SlotsBtn            = (RelativeLayout) findViewById(R.id.create_account);

        SlotsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slotsIntent = new Intent(LandingActivity.this, SlotsActivity.class);
                slotsIntent.putExtra("DestAdd", DestinationAddress.getText().toString());
                startActivity(slotsIntent);
            }
        });
    }
}
