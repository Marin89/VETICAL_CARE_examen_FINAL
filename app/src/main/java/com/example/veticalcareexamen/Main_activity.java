package com.example.veticalcareexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import Objetos.Usuarios;

public class Main_activity extends AppCompatActivity {

    private TextView name,pass;

    Usuarios us = new Usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.tv_name);
        pass = (TextView) findViewById(R.id.tv_pass);
    }

    public void Validar(View view){

        String [] list_name = us.getName();
        String [] list_pass = us.getPass();

        String v_name = name.getText().toString();
        String v_pass = pass.getText().toString();

        if (v_name.equals(list_name[0]) && v_pass.equals(list_pass[0])){

            Intent i = new Intent(this,HOME_ACT.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(), "datos incorrecto, intententalo denuevo ", Toast.LENGTH_SHORT).show();
        }
    }
    public void Salir(View view){
        Intent i = new Intent(this, Main_activity.class);
        finishActivity(i);
    }

    private void finishActivity(Intent i) {
    }
}