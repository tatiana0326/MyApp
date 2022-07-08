package com.example.myapp;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;

public class VerifyRegister {
    public static boolean verifyCompleteData(TextInputEditText... inputs){
        for (TextInputEditText i : inputs){
            if (TextUtils.isEmpty(i.getText().toString().trim())){
                return false;
            }
        }return true;
    }

    public static void showAlert(Context context,String description){
        new MaterialAlertDialogBuilder(context)
                .setMessage(description)
                .setPositiveButton("Mistake", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
    }
}