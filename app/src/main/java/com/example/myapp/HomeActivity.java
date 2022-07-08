package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
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
                Snackbar snackbar = Snackbar.make(view, "Successfully saved to your library", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                });
                snackbar.show();
            }
        });

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(HomeActivity.this);
                builder.setTitle("Summary");
                builder.setMessage("When you read the synopsis of Two meters from you, it is inevitable to think of the novel Under the same star, since the characters, as well as the plot, are very similar.\n" +
                        "\n" +
                        "Two meters from you tells us the story of two boys who are sick. One of them wants to fight to be cured as soon as possible; while the other has thrown in the towel and all he wants is to be left alone. When they both meet, they see in each other a different point of view that makes them rethink their lives, they don't know if they really do well or not.\n" +
                        "\n" +
                        "But they have a problem, and that is that the two boys cannot get close because, if the girl falls ill, she will not be eligible for a lung transplant that would save her.");
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                    }
                });
                builder.setPositiveButton("Start reading", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent intent = new Intent(HomeActivity.this, BookActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });

                builder.show();
            }
        });
    }
}