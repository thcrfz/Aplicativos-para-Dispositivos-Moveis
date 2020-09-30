package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText  et_min, et_max;
    Button btn_sort;
    TextView tv_saida;;

    Random r;
    int min, max, saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        et_min = findViewById(R.id.et_min);
        et_max = findViewById(R.id.et_max);
        btn_sort = findViewById(R.id.btn_sort);
        tv_saida = findViewById(R.id.tv_saida);


        btn_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempMin,tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();

                if(!tempMin.equals("")&&!tempMax.equals("")){
                    min = Integer.parseInt(et_min.getText().toString());
                    max = Integer.parseInt(et_max.getText().toString());

                    if(max>min){
                        saida = r.nextInt((max - min)+1) + min;
                        tv_saida.setText(""+ saida);
                    }

                }

            }
        });

    }

}
