package com.example.veticalcareexamen;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.veticalcareexamen.database.AdminSQLiteOpenHelper;

public class GESTION_ANIMALES_ACT extends AppCompatActivity {

    private EditText ficha, nombre, tipo, edad, enfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_animales);

        ficha = findViewById(R.id.ficha);
        nombre = findViewById(R.id.nombre);
        tipo = findViewById(R.id.tipo);
        edad = findViewById(R.id.edad);
        enfer = findViewById(R.id.enfer);


    }

    public void guardarClases(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(), "veticalcare", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String numeroficha = ficha.getText().toString();
        String nombreAni = nombre.getText().toString();
        String tipoAni = tipo.getText().toString();
        String edadAni = edad.getText().toString();
        String enferAni = enfer.getText().toString();

        if(!numeroficha.isEmpty() && !nombreAni.isEmpty() && !tipoAni.isEmpty() && !edadAni.isEmpty() && !enferAni.isEmpty())
        {
            ContentValues cont =new ContentValues();
            cont.put("ficha", numeroficha);
            cont.put("nombre", nombreAni);
            cont.put("tipo", tipoAni);
            cont.put("edad", edadAni);
            cont.put("enfer", enferAni);

            db.insert("clases", null, cont);
            Clean();
            db.close();

            Toast.makeText(getBaseContext(), "Has guardado una clase!", Toast.LENGTH_LONG).show();

        }else
        {
            Toast.makeText(getBaseContext(), "debe rellenar los campos requeridos", Toast.LENGTH_LONG).show();
        }
    }

    public void mostrarClases(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(), "veticalcare", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String numeroficha = ficha.getText().toString();

        if (!numeroficha.isEmpty())
        {

            Cursor file = db.rawQuery("SELECT clase, tipoAni FROM clases WHERE numeroficha = "+ficha, null);

            if (file.moveToFirst())
            {
                ficha.setText(file.getString(0));
                tipo.setText(file,getString(2));

            }else
            {
                Toast.makeText(getBaseContext(),"No hay clase asociada", Toast.LENGTH_LONG).show();
            }

        } else
        {
            Toast.makeText(getBaseContext(), "El codigo no debe estar vacio", Toast.LENGTH_LONG).show();
        }
    }

    public void eliminarClases(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(), "veticalcare", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String numeroficha = ficha.getText().toString();

        if(!numeroficha.isEmpty())
        {
            db.delete("clases", "ficha="+numeroficha, null);
            db.close();
            Clean();
            Toast.makeText(getBaseContext(), "Has eliminado una clase: "+numeroficha, Toast.LENGTH_LONG).show();

        }else
        {
            Toast.makeText(getBaseContext(), "El codigo no debe venir vacio: ", Toast.LENGTH_LONG).show();
        }

    }

    public void Clean()
    {
        ficha.setText("");
        nombre.setText("");
        tipo.setText("");
        edad.setText("");
        enfer.setText("");
    }

}