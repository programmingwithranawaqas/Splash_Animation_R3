package com.example.splash_animation_r3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText etId, etName, etSem;
    Button btnSubmit, btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = etId.getText().toString().trim();
                String name = etName.getText().toString().trim();
                String sem = etSem.getText().toString().trim();
                int flag = 0;

                if(id.isEmpty())
                {
                    flag = 1;
                    Toast.makeText(MainActivity.this, "ID empty", Toast.LENGTH_SHORT).show();
                }
                if(name.isEmpty())
                {
                    flag = 1;
                    Toast.makeText(MainActivity.this, "Name empty", Toast.LENGTH_SHORT).show();
                }
                if(sem.isEmpty())
                {
                    flag = 1;
                    Toast.makeText(MainActivity.this, "Semester empty", Toast.LENGTH_SHORT).show();
                }


                if(flag==0)
                {
                    Intent i = new Intent(MainActivity.this, Home.class);
                    i.putExtra("key_id", id);
                    i.putExtra("key_name", name);
                    i.putExtra("key_sem", sem);
                    startActivity(i);
                    finish();

                }


            }
        });

    }

    private void init()
    {
        etId = findViewById(R.id.etId);
        etName = findViewById(R.id.etName);
        etSem = findViewById(R.id.etSemester);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel = findViewById(R.id.btnCancel);

    }
}