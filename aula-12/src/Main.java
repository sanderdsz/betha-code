import model.Funcionario;
import repository.FuncionarioRepository;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Funcionario funcionario = new Funcionario(
                1L,
                "Sander Zuchinalli",
                "07896128950",
                500.00
        );

        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        funcionarioRepository.findAll();
    }
}
