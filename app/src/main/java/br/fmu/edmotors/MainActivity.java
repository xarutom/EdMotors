package br.fmu.edmotors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText editTextEntrar;
    private EditText editTextPass;
    private TextView textViewIncorreto;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEntrar = findViewById(R.id.editTextEntrar);
        editTextPass = findViewById(R.id.editTextPass);
        textViewIncorreto = findViewById(R.id.textViewIncorreto);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {
        super.setFinishOnTouchOutside(finish);
    }

    public void abrirCadastro(View view){
        Intent intent = new Intent(this, TelaCadActivity.class);
        startActivity(intent);
    }

    public void abrirHome(View view){
        System.out.println("Voce clicou em entrar");
        Intent intent = new Intent(this, HomeActivity.class);

        String Login = editTextEntrar.getText().toString();
        Integer Senha = Integer.parseInt(editTextPass.getText().toString());
        Login.toLowerCase();
        if (Login.equals("Gustavo") && Senha == 123){
            System.out.println("Autorizado");;
            startActivity(intent);
        }

        else{
            textViewIncorreto.setVisibility(View.VISIBLE);
            System.out.println("Acesso Negado -"+Login+"-"+Senha);
        }
    }

    public void abrirValores(View view){
        Intent intent = new Intent(this, ValoresActivity.class);
        startActivity(intent);
    }
}