package com.example.customized_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<Student>();
    ListView studentsListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentsListView = findViewById(R.id.studentsListView);
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student("Ali", "Alpha", "1", R.drawable.a));
        studentArrayList.add(new Student("Saad", "Beta", "2", R.drawable.b));

        ArrayAdapter<Student> adapter = new StudentAdapter(this, studentArrayList);
        studentsListView = findViewById(R.id.studentsListView);
        studentsListView.setAdapter(adapter);

    }
}