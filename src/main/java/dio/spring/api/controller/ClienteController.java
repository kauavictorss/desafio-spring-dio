package dio.spring.api.controller;

import dio.spring.api.dto.ClienteDto;
import dio.spring.api.model.Cliente;
import dio.spring.api.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrar(@RequestBody ClienteDto clienteDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.inserir(clienteDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody ClienteDto clienteDto) {
        return ResponseEntity.ok(service.atualizar(id, clienteDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
