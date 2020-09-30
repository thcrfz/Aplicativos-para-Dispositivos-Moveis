package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button  btn9,
            btn8,
            btn7,
            btn6,
            btn5,
            btn4,
            btn3,
            btn2,
            btn1,
            btn0,
            erase,
            igual,
            div,mult,sub,soma;

    private final String ADICAO = "+";
    private final String SUBTRACAO = "-";
    private final String MULTIPLICACAO = "X";
    private final String DIVISAO = "/";
    private final String IGUA="0";
    private double val1 = Double.NaN;
    private double val2;
    private String ACAO;


    TextView tv_controle, tv_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn0) {
                    tv_controle.setText(tv_controle.getText().toString() + "0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn1) {
                    tv_controle.setText(tv_controle.getText().toString() + "1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn2) {
                    tv_controle.setText(tv_controle.getText().toString() + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn3) {
                    tv_controle.setText(tv_controle.getText().toString() + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn4) {
                    tv_controle.setText(tv_controle.getText().toString() + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn5) {
                    tv_controle.setText(tv_controle.getText().toString() + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn0) {
                    tv_controle.setText(tv_controle.getText().toString() + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn0) {
                    tv_controle.setText(tv_controle.getText().toString() + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn0) {
                    tv_controle.setText(tv_controle.getText().toString() + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId == R.id.btn_btn0) {
                    tv_controle.setText(tv_controle.getText().toString() + "9");
                }
            }
        });
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computa();
                ACAO = ADICAO;
                tv_resultado.setText(String.valueOf(val1 + "+"));
                tv_controle.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computa();
                ACAO = SUBTRACAO;
                tv_resultado.setText(String.valueOf(val1 + "-"));
                tv_controle.setText(null);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computa();
                ACAO = MULTIPLICACAO;
                tv_resultado.setText(String.valueOf(val1 + "x"));
                tv_controle.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computa();
                ACAO = DIVISAO;
                tv_resultado.setText(String.valueOf(val1 + "/"));
                tv_controle.setText(null);
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computa();
                ACAO=IGUA;
                tv_resultado.setText(tv_resultado.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1) );
                tv_controle.setText(null);
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv_controle.getText().length() > 0){
                    CharSequence name = tv_controle.getText().toString();
                    tv_controle.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    tv_controle.setText(null);
                    tv_resultado.setText(null);
                }
            }
        });

    }

    private void setupViews(){
        btn0=findViewById(R.id.btn_btn0);
        btn1=findViewById(R.id.btn_btn1);
        btn2=findViewById(R.id.btn_btn2);
        btn3=findViewById(R.id.btn_btn3);
        btn4=findViewById(R.id.btn_btn4);
        btn5=findViewById(R.id.btn_btn5);
        btn6=findViewById(R.id.btn_btn6);
        btn7=findViewById(R.id.btn_btn7);
        btn8=findViewById(R.id.btn_btn8);
        btn9=findViewById(R.id.btn_btn9);

        erase=findViewById(R.id.btn_erase);
        igual=findViewById(R.id.btn_igual);
        div=findViewById(R.id.btn_divisao);
        mult=findViewById(R.id.btn_multiplicacao);
        sub=findViewById(R.id.btn_subtracao);
        soma=findViewById(R.id.btn_soma);

        tv_controle=findViewById(R.id.tv_control);
        tv_resultado=findViewById((R.id.tv_result));
    }

    private void computa(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(tv_controle.getText().toString());

            switch (ACAO){
                case ADICAO:
                    val1 = val1+val2;
                    break;
                case SUBTRACAO:
                    val1 = val1-val2;
                    break;
                case MULTIPLICACAO:
                    val1 = val1*val2;
                    break;
                case DIVISAO:
                    val1 = val1/val2;
                    break;
                case IGUA:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(tv_controle.getText().toString());
        }
    }
}

