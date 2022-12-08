package br.fmu.edmotors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class PagamentoActivity extends AppCompatActivity {

    private EditText editTextCodcartao;
    private EditText editTextCods;
    private TextView textViewCartao;
    private TextView textViewSeguranca;
    private TextView textViewAviso;
    private CheckBox checkBoxCartao;
    private CheckBox checkBoxPix;
    private CheckBox checkBoxBoleto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
        editTextCodcartao = findViewById(R.id.editTextCodc);
        editTextCods = findViewById(R.id.editTextCods);
        textViewCartao = findViewById(R.id.textViewCartao);
        textViewSeguranca = findViewById(R.id.textViewSeguranca);
        textViewAviso = findViewById(R.id.textViewAviso);
        checkBoxCartao = findViewById(R.id.Cartao);
        checkBoxPix = findViewById(R.id.Pix);
        checkBoxBoleto = findViewById(R.id.Boleto);

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



    public void btnAvancar(View view){
        textViewAviso.setVisibility(View.VISIBLE);
    }


    }


