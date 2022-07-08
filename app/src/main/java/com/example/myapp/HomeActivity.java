package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {
    private Button snackbarButton;
    private Button dialogButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        snackbarButton = findViewById(R.id.snackbar_btn);
        dialogButton = findViewById(R.id.dialog_btn);
        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "He clickeado el button del Snackbar", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //
                    }
                });
                snackbar.show();
            }
        });

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(HomeActivity.this);
                builder.setTitle("Alert Dialog");
                builder.setMessage("This is a simple alert Dialog");
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.show();
            }
        });
    }
}