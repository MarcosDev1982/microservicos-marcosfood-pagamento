package pagamentos.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagamentoDTO {
    private Long id;
    private String valor; // String para mostrar formatado
    private String metodo;
    private String dataPagamento; // String ISO ou formatada
}
