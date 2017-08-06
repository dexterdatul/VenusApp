package android.com.venusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        getSupportActionBar().setTitle(R.string.app_name_services);
    }
}
