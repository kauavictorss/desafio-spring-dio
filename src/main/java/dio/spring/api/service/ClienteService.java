package dio.spring.api.service;

import dio.spring.api.dto.ClienteDto;
import dio.spring.api.dto.EnderecoDto;
import dio.spring.api.model.Cliente;
import dio.spring.api.model.Endereco;
import dio.spring.api.repository.ClienteRepository;
import dio.spring.api.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;

    public ClienteService(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(() ->
            new RuntimeException("Cliente não encontrado"));
    }

    public Cliente cadastrar(ClienteDto clienteDto) {
        return salvarClienteComCep(clienteDto, null);
    }

    public Cliente atualizar(Long id, ClienteDto clienteDto) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado");
        }
        return salvarClienteComCep(clienteDto, id);
    }

    public void remover(Long id) {
        clienteRepository.deleteById(id);
    }

    private Cliente salvarClienteComCep(ClienteDto clienteDto, Long id) {
        Endereco endereco = new Endereco();
        EnderecoDto endDto = clienteDto.endereco();
        if (endDto != null) {
            endereco.setCep(endDto.cep());
            endereco.setNumero(endDto.numero());
            endereco.setBairro(endDto.bairro());
            endereco.setCidade(endDto.cidade());
            endereco.setEstado(endDto.estado());
            endereco.setComplemento(endDto.complemento());
            endereco = enderecoRepository.save(endereco);
        }

        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(clienteDto.nome());
        cliente.setIdade(clienteDto.idade());
        cliente.setEndereco(endDto != null ? endereco : null);
        return clienteRepository.save(cliente);
    }
}
