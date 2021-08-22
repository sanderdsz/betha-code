package service;

import model.Diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiretorService implements IService<Diretor>{
    @Override
    public Diretor save(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionManager.getConnection();
        PreparedStatement insert = connection.prepareStatement(
                "insert into diretores values(?,?,?,?,?)"
        );
        insert.setLong(1, diretor.getId());
        insert.setString(2, diretor.getNome());
        insert.setString(3, diretor.getCpf());
        insert.setDouble(4, diretor.getSalario());
        insert.setDouble(5, diretor.getSalario());
        insert.executeUpdate();
        connection.close();
        return diretor;
    }

    @Override
    public Diretor update(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionManager.getConnection();
        PreparedStatement insert = connection.prepareStatement(
                "update diretores set nome = ?, cpf = ?, salario = ?, bonus = ? where id = ?"
        );
        insert.setString(1, diretor.getNome());
        insert.setString(2, diretor.getCpf());
        insert.setDouble(3, diretor.getSalario());
        insert.setDouble(4, diretor.getBonus());
        insert.setLong(5, diretor.getId());
        insert.executeUpdate();
        connection.close();
        return diretor;
    }

    @Override
    public Diretor delete(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement(
                "delete from diretores where id = ?"
        );
        statement2.setLong(1, diretor.getId());
        statement2.executeUpdate();
        conn.close();
        return diretor;
    }
}
