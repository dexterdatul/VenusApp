package android.com.venusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        getSupportActionBar().setTitle(R.string.app_name_send_message_to_doctor);


    }
}
