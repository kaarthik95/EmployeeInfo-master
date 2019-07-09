package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16043850 on 7/13/2018.
 */

public class CutomeAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<EmployeeList> movieList;

    public CutomeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployeeList> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById((R.id.textViewName));
        TextView tvTitle = rowView.findViewById((R.id.textViewTitle));
        TextView tvSalary = rowView.findViewById((R.id.textViewSalary));
        EmployeeList currentItem = movieList.get(position);
        tvName.setText(currentItem.getEmployeeName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(currentItem.getSalary());

        return rowView;
    }
}