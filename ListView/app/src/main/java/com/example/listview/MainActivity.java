package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> studentList = new ArrayList<String>();
    ListView listView;
    Button btnAdd, btnConfirm;
    EditText editText;
    TextView selectedItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList.add("Saad");
        studentList.add("Zahid");
        studentList.add("Saeed");
        studentList.add("Zainab");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, studentList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        editText = findViewById(R.id.editText);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean found = false;
                for (String i: studentList
                     ) {
                    if(i.equals(editText.getText().toString())){
                        found = true;
                    }
                }
                if(!found) {

                    if(studentList.size() == 7){
                        studentList.remove(0);
                    }
                        studentList.add(editText.getText().toString());
                        arrayAdapter.notifyDataSetChanged();
                }
            }
        });

        selectedItem = findViewById(R.id.selectedItem);
        btnConfirm = findViewById(R.id.btnConfirm);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedItem.setText("You selected: " + studentList.get(position));
                btnConfirm.setVisibility(View.VISIBLE);
            }
        });




    }
}