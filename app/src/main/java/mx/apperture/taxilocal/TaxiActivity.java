package mx.apperture.taxilocal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TaxiActivity extends AppCompatActivity {

    private Button buttonSend;
    private EditText editTextLatitude;
    private EditText editTextLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi);
    }
}
