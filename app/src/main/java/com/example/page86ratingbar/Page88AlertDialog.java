package com.example.page86ratingbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page88AlertDialog extends AppCompatActivity {

    public TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page88_alert_dialog);

        tv1= findViewById(R.id.textView4);
    }

    public void btnOnClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("משחק");
        //builder.setIcon(R.drawable.sea);
        builder.setMessage("המשחק הסתיים בניצחון!");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv1.setText("yes option");
            }
        });

        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv1.setText("no option");
            }
        });

        AlertDialog mDialog = builder.create();
        mDialog.show();
    }
}