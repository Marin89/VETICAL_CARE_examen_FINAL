package com.example.veticalcareexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Animales;
import Objetos.Enfermedad;

public class INGRESOS_ACT extends AppCompatActivity {

    private Spinner Animales, Enfermedad;
    private TextView resultado;
    private Button Volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        Animales = (Spinner)findViewById(R.id.spnAnimales);
        Enfermedad = (Spinner)findViewById(R.id.spnEnfermedad);
        resultado = (TextView)findViewById(R.id.result);
        Volver =(Button)findViewById(R.id.btn8);


        Animales ani = new Animales();
        Enfermedad enf = new Enfermedad();

        ArrayAdapter adaptAnimales =new ArrayAdapter(this, android.R.layout.simple_list_item_1,ani.getAnimales());
        ArrayAdapter adaptEnfermedad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,enf.getEnfermedad());

        Animales.setAdapter(adaptAnimales);
        Enfermedad.setAdapter(adaptEnfermedad);
    }

    public void Calcular(View view) {
    }
    public void Volver(View view) {
    }

    {
        Animales ani = new Animales();

        if (Animales.getSelectedItem().toString().equals("Animal Doméstico") &&
            Enfermedad.getSelectedItem().toString().equals("Brucelosis"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Domestico(75000) );

        }

        if (Animales.getSelectedItem().toString().equals("Animal Doméstico") &&
                Enfermedad.getSelectedItem().toString().equals("Fiebre Aftosa"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Domestico(22500) );
        }

        if (Animales.getSelectedItem().toString().equals("Animal Doméstico") &&
                Enfermedad.getSelectedItem().toString().equals("Salmonella"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Domestico(35000) );
        }

        if (Animales.getSelectedItem().toString().equals("Animal Doméstico") &&
                Enfermedad.getSelectedItem().toString().equals("Rabia"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Domestico(54000) );
        }

        if (Animales.getSelectedItem().toString().equals("Animal Salvaje") &&
                Enfermedad.getSelectedItem().toString().equals("Brucelosis"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Salvaje(75000) );
        }

        if (Animales.getSelectedItem().toString().equals("Animal Salvaje") &&
                Enfermedad.getSelectedItem().toString().equals("Fiebre Aftosa"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Salvaje(22500) );
        }

        if (Animales.getSelectedItem().toString().equals("Animal Salvaje") &&
                Enfermedad.getSelectedItem().toString().equals("Salmonella"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Salvaje(35000) );
        }

        if (Animales.getSelectedItem().toString().equals("Animal Salvaje") &&
                Enfermedad.getSelectedItem().toString().equals("Rabia"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularAnimal_Salvaje(54000) );
        }

        if (Animales.getSelectedItem().toString().equals("Otros") &&
                Enfermedad.getSelectedItem().toString().equals("Brucelosis"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularOtros(75000) );
        }

        if (Animales.getSelectedItem().toString().equals("Otros") &&
                Enfermedad.getSelectedItem().toString().equals("Fiebre Aftosa"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularOtros(22500) );
        }

        if (Animales.getSelectedItem().toString().equals("Otros") &&
                Enfermedad.getSelectedItem().toString().equals("Salmonella"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularOtros(35000) );
        }

        if (Animales.getSelectedItem().toString().equals("Otros") &&
                Enfermedad.getSelectedItem().toString().equals("Rabia"))
        {
            resultado.setText("La cotizacion final es:  " +
                    ani.CalcularOtros(54000) );
        }
        if (Volver.isSelected());
        Intent intent = new Intent(INGRESOS_ACT.this,HOME_ACT.class);
        startActivity(intent);
    }


}