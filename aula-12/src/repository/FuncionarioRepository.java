package repository;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository<Funcionario> {
    @Override
    public List<Funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM funcionarios ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Find All =>");
        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);
        }
        conn.close();
        return funcionarios;
    }

    @Override
    public Funcionario findById(Integer id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
