package com.example.assignment3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;



public class StudentAdapter extends ArrayAdapter<StudentModel> {

    public StudentAdapter(@NonNull Context context, ArrayList<StudentModel> students) {
        super(context, 0, students);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.student_view, parent, false);

        StudentModel student = getItem(position);

        TextView name = convertView.findViewById(R.id.name);
        TextView rollno = convertView.findViewById(R.id.rollno);
        TextView enroll = convertView.findViewById(R.id.enroll);

        name.setText(student.getName());
        rollno.setText(String.valueOf(student.getRollNmber()));
        enroll.setText(String.valueOf(student.isEnroll()));

        return convertView;
    }
}
