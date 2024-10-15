package controller;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteController {

    ClienteRepository cr = new ClienteRepository();

    public void cadastrarCliente(String nome, long cpf, String data_nascimento) {
        if (nome != null && nome.length() > 0 && cpf > 0 && data_nascimento != null) {

            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setData_nascimento(data_nascimento);
            

            cr.cadastrarCliente(cliente);
        }
    }
}

