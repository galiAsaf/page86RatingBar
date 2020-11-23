package com.example.page86ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar1;
    private TextView result;
    Button btnSubmit;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ratingBar1 = findViewById(R.id.ratingBar);
        result = findViewById(R.id.textView3);
        
        ratingBar1.setOnRatingBarChangeListener(rtListener);
    }

    private RatingBar.OnRatingBarChangeListener rtListener = new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
            result.setText(String.valueOf(rating));
        }
    };

    public void btn(View view) {
        Toast.makeText(MainActivity.this, String.valueOf(ratingBar1.getRating()), Toast.LENGTH_SHORT).show();
    }
}