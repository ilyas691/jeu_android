package com.example.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btnMonBouton;
int [] memory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        memory = new int[20];
        for(int i=0;i<10;i++)
            memory[i]=i;
        for(int i=10;i<20;i++)
            memory[i]=i-10;

        Random random = new Random();
        int nb;
        int oldMemory;
        for(int i=0;i<20;i++) {
            nb = random.nextInt(19);
            oldMemory = memory[nb];
            memory[nb] = memory[3];
            memory[3] = oldMemory;
        }
        setContentView(R.layout.activity_main);
        btnMonBouton = (Button)findViewById(R.id.btnMsg);
        btnMonBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "le bts a été cliqué", Toast.LENGTH_LONG).show();
            }
        });
    }
}
