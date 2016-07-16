package com.fatecp.mymath;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public double getV1(){
        EditText edit1 = (EditText)findViewById(R.id.edit1);
        return Double.parseDouble(edit1.getText().toString());
    }
    public double getV2(){
        EditText edit2 = (EditText)findViewById(R.id.edit2);
        return Double.parseDouble(edit2.getText().toString());
    }
    public TextView getText(){
        return (TextView)findViewById(R.id.text);
    }
    public void somar(View view){
         double r = getV1()+getV2();
        getText().setText("Soma = " + r);
        Toast.makeText(getApplicationContext(), "Soma = " + r, Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this).setMessage("Soma = " + r).setPositiveButton("Ok", null).show();
    }
    public void subtrair(View view){
        double r = getV1()-getV2();
        getText().setText("Subtração =  " + r);
    }
    public void multiplicar(View view){
        double r = getV1()-getV2();
        getText().setText("Multiplicação = " + r);
    }
    public void dividir(View view){
        double r = getV1()-getV2();
        getText().setText("Divisão = " + r);

    }
}
