package com.example.e_diary;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Sign_up extends AppCompatActivity {
    private EditText nickname;
    private EditText email;
    private Button login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);


        nickname = findViewById(R.id.editTextTextEmailAddress);
        email = findViewById(R.id.editTextTextEmailAddress);
        login = findViewById(R.id.button2);

        //when you press the button "login"
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredNickname = nickname.getText().toString();
                String enteredEmail = email.getText().toString();

            }
        });
    }
        public void btnClick(View v) {
            showInfo(((Button) v).getText().toString());

        }

        private void showInfo(String text) {
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }

    }







