package android.com.venusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        getSupportActionBar().setTitle(R.string.app_name_gallery);
    }
}
