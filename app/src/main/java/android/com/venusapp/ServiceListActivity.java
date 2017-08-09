package android.com.venusapp;

import android.com.venusapp.CustomAdapter.ServiceListCustomAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ServiceListActivity extends AppCompatActivity {

    ListView serviceItemView;
    String[] serviceItem = {"BOTOX", "FILLER", "MESO", "CHENES", "ISKABECHE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_list);

        serviceItemCustomListView();

    }

    public void serviceItemCustomListView() {
        serviceItemView = (ListView) findViewById(R.id.servicesListView);
        ServiceListCustomAdapter serviceListCustomAdapter = new ServiceListCustomAdapter(this, serviceItem);
        serviceItemView.setAdapter(serviceListCustomAdapter);

        serviceItemView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
