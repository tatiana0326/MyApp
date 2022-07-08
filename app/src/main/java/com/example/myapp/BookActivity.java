package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;


public class BookActivity extends AppCompatActivity {
    private Button next_btn;
    private Button return_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        next_btn = findViewById(R.id.next_btn);
        return_btn = findViewById(R.id.return_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "Not available yet", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                });
                snackbar.show();
            }
        });

        return_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BookActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}