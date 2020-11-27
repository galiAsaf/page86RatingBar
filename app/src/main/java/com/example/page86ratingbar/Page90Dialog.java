package com.example.page86ratingbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

public class Page90Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page90_dialog);
    }

    public void btnClick(View view) {
        final String [] items= {"font 1","ᖴOᑎT 2","\uD835\uDD57\uD835\uDD60\uD835\uDD5F\uD835\uDD65 \uD835\uDFDB","\uD835\uDC87\uD835\uDC90\uD835\uDC8F\uD835\uDC95 4"};

        ListAdapter aryListAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Fonts");

        builder.setAdapter(aryListAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Page90Dialog.this, items[i], Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.getListView().setBackgroundColor(Color.CYAN);
        dialog.show();


    }
}