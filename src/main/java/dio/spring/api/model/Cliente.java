package dio.spring.api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;

    @ManyToOne
    private Endereco endereco;

}
