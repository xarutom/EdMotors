package br.fmu.edmotors;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FuncionarioDao {
    @Query("SELECT * FROM Funcionario where Login=:login and Senha=:Senha")
    Funcionario buscarPorLogin(String login, int Senha);

    @Query("SELECT * FROM Funcionario")
    List<Funcionario> getFuncionarios();
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Funcionario funcionario);
    @Delete
    void delete(Funcionario funcionario);
    @Update
    void update(Funcionario funcionario);

}
