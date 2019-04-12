package com.ramadini.daftarmahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rev_students);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Amanda", "121"));
        students.add(new Student("Bayu", "122"));
        students.add(new Student("Cantika", "123"));
        students.add(new Student("Dandi", "124"));
        students.add(new Student("Elmira", "125"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        StudentAdapter studentAdapter = new StudentAdapter(students, this);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(studentAdapter);

    }
}
