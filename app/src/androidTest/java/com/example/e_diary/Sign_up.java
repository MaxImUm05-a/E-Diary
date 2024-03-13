package com.example.e_diary;


import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Sign_up extends AppCompatActivity {

    EditText nickname;
    EditText email;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }

}
