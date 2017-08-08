package android.com.venusapp;

import android.com.venusapp.CustomAdapter.ServicesCustomAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ServicesActivity extends AppCompatActivity {

    ListView servicesListView;
    String[] servicesName = {"Skin and Hair Care", "Laser Hair Removal", "Derma Services", "Cosmetic Surgery", "Facial Services", "Peeling Services"};
    String[] servicesDescription = {"Coming Soon", "Coming Soon", "Coming Soon", "Coming Soon", "Coming Soon", "Coming Soon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        getSupportActionBar().setTitle(R.string.app_name_services);

        servicesCustomListView();

    }

    public void servicesCustomListView() {
        servicesListView = (ListView) findViewById(R.id.servicesListView);
        ServicesCustomAdapter servicesCustomAdapter = new ServicesCustomAdapter(this, servicesName, servicesDescription);
        servicesListView.setAdapter(servicesCustomAdapter);

        servicesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ServiceListActivity.class);
                startActivity(intent);
            }
        });
    }

}
