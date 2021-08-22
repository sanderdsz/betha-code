import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FuncionarioService funcionarioService = new FuncionarioService();
        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

        DiretorService diretorService = new DiretorService();
        DiretorRepository diretorRepository = new DiretorRepository();

        Funcionario funcionario = new Funcionario(
                1L,
                "Sander",
                "00011122233",
                300.00
        );

        Diretor diretor = new Diretor(
                1L,
                "Sabrina",
                "3332221100",
                10000.00,
                100.00
        );

        funcionarioService.save(funcionario);

        diretorService.save(diretor);

        // funcionario.setNome(funcionario.getNome() + " Modificado");
        // funcionarioService.update(funcionario);
        // funcionarioService.delete(funcionario);

        funcionarioRepository.findAll();
        funcionarioRepository.findById(1);

        diretorRepository.findAll();
        diretorRepository.findById(1);
    }
}
