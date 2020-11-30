package com.example.page86ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Page92HashMap extends AppCompatActivity {

    TextView tv1 = null;

    HashMap <String,Boolean> cMap = new HashMap<String, Boolean>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page92_hash_map);

        cMap.put ("course1", true);
        cMap.put ("course2", true);
        cMap.put ("course3", true);
        cMap.put ("course4", true);
        cMap.put ("course5", true);
        cMap.put ("course6", true);

        tv1 = (TextView) findViewById(R.id.textView);

    }

    public void btnClick(View view) {
        final String[] stAry = cMap.keySet().toArray(new String[0]); // stAry[0] = "course1",.... מערך מפתחות
        boolean [] boolAry = new boolean[cMap.size()];
        for (int i = 0; i<stAry.length; i++)
        {
            boolAry[i]=cMap.get(stAry[i]);
        }
        AlertDialog.Builder courseBuilder = new AlertDialog.Builder(this);
        courseBuilder.setTitle("Courses List:");

        courseBuilder.setMultiChoiceItems(stAry, boolAry, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which, boolean b) {
                cMap.put(stAry[which], b );
            }
        });

        courseBuilder.setPositiveButton("init", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                displayAllCourses();
            }
        });

        courseBuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Page92HashMap.this, "no action", 1000).show();
            }
        });

        courseBuilder.create().show();
    }
    private void displayAllCourses() {
        final String[] stAry = cMap.keySet().toArray(new String[0]);
        for (int i = 0; i<stAry.length; i++)
        {
            tv1.append("\n"+ stAry[i] + " -> " + cMap.get(stAry[i]));
        }
    }
}