package com.example.practica02_hypotenochas;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityConfig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_config);
    }

    public void onRadioButtonClicked(View view){
        switch (view.getId()){
            case R.id.radioButtonPrincipiante:

                break;
            case R.id.radioButtonAmateur:

                break;
            case R.id.radioButtonAvanzado:

                break;
        }
    }
}