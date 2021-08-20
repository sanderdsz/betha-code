package Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteMain {

  public static void main(String[] args) {
    List<Cliente> clienteList = new ArrayList<Cliente>();

    Cliente a = new Cliente(1L, "Foo", "523.724.500-50", "48.089.636-7");
    Cliente b = new Cliente(2L, "Bar", "215.307.930-68", "39.551.302-9");
    Cliente c = new Cliente(3L, "Lorem", "857.188.680-69", "12.037.827-9");
    Cliente d = new Cliente(4L, "Ipsum", "370.411.620-36", "21.915.237-8");
    Cliente e = new Cliente(4L, "Dolor", "825.791.820-20", "28.165.466-9");

    clienteList.add(a);
    clienteList.add(b);
    clienteList.add(c);
    clienteList.add(d);
    clienteList.add(e);

    List<String> nomes = clienteList.stream().map(p -> p.getNome()).collect(Collectors.toList());
    System.out.println(nomes);

    List<Cliente> filtrado = clienteList.stream().filter(p -> p.getNome().startsWith("F")).collect(Collectors.toList());
    System.out.println(filtrado);

    clienteList.stream().forEach(p -> {
      System.out.println(p.getNome());
      System.out.println(p.getCpf());
    });

  }

}
