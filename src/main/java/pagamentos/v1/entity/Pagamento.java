package pagamentos.v1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagamentos")
@Data // já inclui getters, setters, equals, hashCode e toString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private String metodo;

    private LocalDateTime dataPagamento;
}
