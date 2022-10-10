package com.example.practica02_hypotenochas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityPerso  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_personajes);

        iv = (ImageView) findViewById(R.id.imageViewPersonaje);
        Spinner spn = (Spinner) findViewById(R.id.spinnerPersonajes);
        spn.setOnItemSelectedListener(this);


    }

    @SuppressLint("ResourceType")
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id) {

       int item= parent.getSelectedItemPosition();
        Toast.makeText(getApplicationContext(),
                        R.array.personajes,
                        Toast.LENGTH_LONG)
                .show();
        System.out.println(item);
        /*




    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id)
    {
      String item = parent.getItemAtPosition(pos).toString();
      tv.setText(item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {
      tv.setText("");
    }
        switch (item){
            case "Bob Esponja":
                iv.setImageResource(R.drawable.bob);
                break;
            case "Arenita":
                iv.setImageResource(R.drawable.arenita);
                break;
            case "Calamardo":

                break;
            case "Don Cangrejo":
                iv.setImageResource(R.drawable.cangrejo);
                break;
            case "Patricio":
                iv.setImageResource(R.drawable.patricio);
                break;
            case "Plankton":
                iv.setImageResource(R.drawable.placton);
                break;
            case "Gary":
                iv.setImageResource(R.drawable.gary);
                break;
            default:
                break;
        }*/



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        iv.setImageResource(R.drawable.bob);
    }
}