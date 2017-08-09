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

public class ServiceListCustomAdapter extends ArrayAdapter<String> {

    private String[] serviceItem;
    private Activity context;

    public ServiceListCustomAdapter(Activity context, String[] serviceItem) {
        super(context, R.layout.service_list_custom_row, serviceItem);

        this.context = context;
        this.serviceItem = serviceItem;
    }

    class ViewHolder {
        TextView serviceItem;

        ViewHolder(View v) {
            serviceItem = (TextView) v.findViewById(R.id.txtServiceItem);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder = null;

        if (view == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.service_list_custom_row, null, true);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.serviceItem.setText(serviceItem[position]);

        return view;
    }
}
