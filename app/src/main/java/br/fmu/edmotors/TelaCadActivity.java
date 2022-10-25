package br.fmu.edmotors;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;

public class TelaCadActivity extends AppCompatActivity {
    private EditText editTextLogin;
    private EditText editTextCpf;
    private EditText editTextTel;
    private EditText editTextSenha;
    private EditText editTextNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cad);
        editTextLogin = findViewById(R.id.editTextLogin);
        editTextCpf = findViewById(R.id.editTextCpf2);
        editTextTel = findViewById(R.id.editTextTel);
        editTextSenha = findViewById(R.id.editTextSenha);
        editTextNome = findViewById(R.id.editTextNome2);
    }

    public void cadastroCliente(View view) {
        String login = editTextLogin.getText().toString();
        String nome = editTextNome.getText().toString();
        int CPF = Integer.parseInt(editTextCpf.getText().toString());
        int tel = Integer.parseInt(editTextTel.getText().toString());
        int Senha = Integer.parseInt(editTextSenha.getText().toString());

        AppDataBase db = AppDataBase.getsInstance(this);
        FuncionarioDao dao = db.funcionarioDao();
        Funcionario func = new Funcionario(login, nome, CPF, tel, Senha);
        dao.insert(func);
    }

    public void oi(View view){}
}