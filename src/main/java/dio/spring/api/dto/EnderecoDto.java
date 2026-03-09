package dio.spring.api.dto;

public record EnderecoDto(String cep, String numero, String bairro, String cidade, String estado, String complemento) {
}
