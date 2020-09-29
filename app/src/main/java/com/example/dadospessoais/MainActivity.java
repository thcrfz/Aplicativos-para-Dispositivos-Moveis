package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et_firstName, et_lastName, et_email;
    Button btn_showData;
    TextView tv_data;
    String str_firstName, str_lastName, str_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_firstName=findViewById(R.id.et_firstName);
        et_lastName=findViewById(R.id.et_lastName);
        et_email=findViewById(R.id.et_email);

        btn_showData=findViewById(R.id.btn_showData);

        tv_data=findViewById(R.id.tv_data);

        btn_showData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId=v.getId();

        if(viewId==R.id.btn_showData){
            str_firstName=et_firstName.getText().toString().trim();
            str_lastName=et_lastName.getText().toString().trim();
            str_email=et_email.getText().toString().trim();

            String name=str_firstName+" "+str_lastName+" "+str_email;

            tv_data.setText(name);
        }
    }
}
