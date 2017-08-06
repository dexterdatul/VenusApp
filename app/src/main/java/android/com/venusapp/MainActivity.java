package android.com.venusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void offer(View view) {
        intent = new Intent(this, OffersActivity.class);
        startActivity(intent);
    }

    public void aboutUs(View view) {
        intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }

    public void doctors(View view) {
        intent = new Intent(this, DoctorsActivity.class);
        startActivity(intent);
    }

    public void services(View view) {
        intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
    }

    public void appointment(View view) {
        intent = new Intent(this, AppointmentActivity.class);
        startActivity(intent);
    }

    public void gallery(View view) {
        intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }

    public void contact(View view) {
        intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }

    public void offers(View view){
        intent = new Intent(this, OffersActivity.class);
        startActivity(intent);
    }


}
