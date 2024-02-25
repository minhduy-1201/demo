package com.example.myandroiproject;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class mainActivity extends AppCompatActivity {
    TextView user, password;
    EditText edtUser, edtPass;
     @Override
    protected void onCreate(Bundle saveIntanceState){
         super.onCreate(saveIntanceState);
         setContentView(R.layout.activity_main);

         user = (TextView) findViewById(R.id.tv_username);
         password = (TextView) findViewById(R.id.tv_password);

         edtUser = (EditText) findViewById(R.id.edt_username);
         edtPass = (EditText) findViewById(R.id.edt_password);
     }

}
