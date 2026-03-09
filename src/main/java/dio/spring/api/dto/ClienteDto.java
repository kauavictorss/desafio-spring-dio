package dio.spring.api.dto;

public record ClienteDto(Long id, String nome, Integer idade, EnderecoDto endereco) {
}
