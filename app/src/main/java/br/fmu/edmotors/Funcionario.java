package br.fmu.edmotors;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Funcionario {
    @PrimaryKey
    private int CPF;
    private String nome;
    private int Tel;
    private int Senha;
    private String Login;

    public Funcionario() {

    }

    public Funcionario(String Login, String nome, int CPF, int Tel, int Senha) {
        this.Login = Login;
        this.CPF = CPF;
        this.Tel = Tel;
        this.Senha = Senha;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "Login=" + Login +
                ", CPF='" + CPF + '\'' +
                ", Telefone=" + Tel +
                ", Senha=" + Senha +
                ", Nome Completo='" + nome + '\'' +
                '}';
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }
}
