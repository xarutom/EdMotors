package br.fmu.edmotors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void abrirValores(View view){
        Intent intent = new Intent(this, ValoresActivity.class);
        startActivity(intent);
    }

    public void abrirConvenio(View view){

        Intent intent = new Intent(this, ConvenioActivity.class);
        startActivity(intent);
    }

    public void abrirInicio(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}