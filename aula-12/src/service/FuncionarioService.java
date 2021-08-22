package service;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioService implements IService<Funcionario>{
    @Override
    public Funcionario save(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionManager.getConnection();
        PreparedStatement insert = connection.prepareStatement(
                "insert into funcionarios values(?,?,?,?)"
        );
        insert.setLong(1, funcionario.getId());
        insert.setString(2, funcionario.getNome());
        insert.setString(3, funcionario.getCpf());
        insert.setDouble(4, funcionario.getSalario());
        insert.executeUpdate();
        connection.close();
        return funcionario;
    }

    @Override
    public Funcionario update(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionManager.getConnection();
        PreparedStatement insert = connection.prepareStatement(
                "update funcionarios set nome = ?, cpf = ?, salario = ? where id = ?"
        );
        insert.setString(1, funcionario.getNome());
        insert.setString(2, funcionario.getCpf());
        insert.setDouble(3, funcionario.getSalario());
        insert.setLong(4, funcionario.getId());
        insert.executeUpdate();
        connection.close();
        return funcionario;
    }

    @Override
    public Funcionario delete(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement(
                "delete from funcionarios where id = ?"
        );
        statement2.setLong(1, funcionario.getId());
        statement2.executeUpdate();
        conn.close();
        return funcionario;
    }
}
