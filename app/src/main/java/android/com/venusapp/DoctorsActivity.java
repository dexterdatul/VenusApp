package android.com.venusapp;

import android.com.venusapp.CustomAdapter.DoctorCustomAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DoctorsActivity extends AppCompatActivity {

    ListView doctorsListView;
    String[] doctorsName = {"Mang Kepweng", "Dr Kwak Kwak", "Dr Belyo", "Dr Cawayan"};
    String[] doctorsDescription = {"Dahon Dahon Master", "Healing Galing", "Plastic Surgery", "Dermatology"};
    Integer[] imgDoctor = {R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        getSupportActionBar().setTitle(R.string.app_name_doctors);

        doctorsCustomListView();


    }


    public void doctorsCustomListView(){
        doctorsListView = (ListView) findViewById(R.id.doctorsListView);
        DoctorCustomAdapter doctorCustomAdapter = new DoctorCustomAdapter(this, doctorsName, doctorsDescription, imgDoctor);
        doctorsListView.setAdapter(doctorCustomAdapter);

        doctorsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), DoctorsProfileActivity.class);
                startActivity(intent);
            }
        });

    }

}
