package com.example.ptsgenap10rpl107;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtponsel;
EditText txtsandi;
Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtponsel = (EditText)findViewById(R.id.txtponsel);
        txtsandi = (EditText)findViewById(R.id.txtsandi);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtponsel.getText().toString();
                String password = txtsandi.getText().toString();
                if (email.equalsIgnoreCase("cen@gmail.com") && password.equalsIgnoreCase("cen")){
                    Toast.makeText(MainActivity.this, "sukses login", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "gagal login", Toast.LENGTH_SHORT).show();
                }

            }


        });


    }
}