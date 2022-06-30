package com.example.cardiacmonitor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] array;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] array) {
        this.context = context;
        this.array = array;
    }

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null)
        {
           layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view = layoutInflater.inflate(R.layout.sample_list,viewGroup,false);

        }

        TextView sys = view.findViewById(R.id.systol);
        TextView dias = view.findViewById(R.id.diastol);
        TextView pres_stat = view.findViewById(R.id.pressure_stat);
        TextView puls = view.findViewById(R.id.pulse);
        TextView puls_stat = view.findViewById(R.id.pulse_status);
        TextView d = view.findViewById(R.id.date);
        TextView t = view.findViewById(R.id.time);
        TextView comm = view.findViewById(R.id.comments);

        sys.setText(array[0]);
        dias.setText(array[1]);
        puls.setText(array[2]);
        d.setText(array[3]);
        t.setText(array[4]);
        comm.setText(array[5]);
        pres_stat.setText("High");
        puls_stat.setText("Normal");

        return view;
    }
}
