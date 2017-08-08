package android.com.venusapp.CustomAdapter;

import android.app.Activity;
import android.com.venusapp.R;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Dexter John Datul on 07/08/2017.
 */

public class ServicesCustomAdapter extends ArrayAdapter<String> {

    private String[] serviceName;
    private String[] serviceDescription;
    private Activity context;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder = null;

        if (view == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.services_custom_row, null, true);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.serviceName.setText(serviceName[position]);
        viewHolder.serviceDescription.setText(serviceDescription[position]);

        return view;
    }

    public ServicesCustomAdapter(Activity context, String[] serviceName, String[] serviceDescription) {
        super(context, R.layout.services_custom_row, serviceName);

        this.context = context;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;

    }

    class ViewHolder {
        TextView serviceName;
        TextView serviceDescription;

        ViewHolder(View v) {
            serviceName = (TextView) v.findViewById(R.id.txtServiceName);
            serviceDescription = (TextView) v.findViewById(R.id.txtServiceDescription);
        }

    }

}
