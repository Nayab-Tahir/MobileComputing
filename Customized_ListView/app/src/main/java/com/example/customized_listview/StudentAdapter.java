package com.example.customized_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(@NonNull Context context, ArrayList<Student> students) {
        super(context, 0,students);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.student_view, parent, false);

        Student student = getItem(position);

        TextView studentName = convertView.findViewById(R.id.name);
        TextView studentCampus = convertView.findViewById(R.id.campus);
        TextView studentRollNo = convertView.findViewById(R.id.rollNo);
        ImageView studentImage = convertView.findViewById(R.id.imageView);

        studentName.setText(student.name);
        studentCampus.setText(student.campus);
        studentRollNo.setText(student.rollNumber);
        studentImage.setImageResource(student.image_id);

        return convertView;
    }
}
