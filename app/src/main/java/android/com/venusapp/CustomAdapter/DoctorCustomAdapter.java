package android.com.venusapp.CustomAdapter;

import android.app.Activity;
import android.com.venusapp.R;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dexter John Datul on 06/08/2017.
 */

public class DoctorCustomAdapter extends ArrayAdapter<String> {

    private String[] doctorsName;
    private String[] doctorsDescription;
    private Integer[] imgDoctor;
    private Activity context;


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder = null;

        if (view == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.doctors_custom_row, null, true);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.imgDoctor.setImageResource(imgDoctor[position]);
        viewHolder.doctorsName.setText(doctorsName[position]);
        viewHolder.doctorsDescription.setText(doctorsDescription[position]);

        return view;

    }

    public DoctorCustomAdapter(Activity context, String[] doctorsName, String[] doctorsDescription, Integer[] imgDoctor) {
        super(context, R.layout.doctors_custom_row, doctorsName);

        this.context = context;
        this.doctorsName = doctorsName;
        this.doctorsDescription = doctorsDescription;
        this.imgDoctor = imgDoctor;
    }

    class ViewHolder {
        TextView doctorsName;
        TextView doctorsDescription;
        ImageView imgDoctor;

        ViewHolder(View v) {
            doctorsName = (TextView) v.findViewById(R.id.txtDoctorsName);
            doctorsDescription = (TextView) v.findViewById(R.id.txtDoctorsSpecialty);
            imgDoctor = (ImageView) v.findViewById(R.id.imgDoctor);

        }
    }
}
