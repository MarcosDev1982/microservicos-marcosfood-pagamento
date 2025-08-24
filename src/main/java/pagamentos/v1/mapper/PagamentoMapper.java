package pagamentos.v1.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;
import pagamentos.v1.dto.PagamentoDTO;
import pagamentos.v1.entity.Pagamento;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PagamentoMapper {

    @Inject
    ModelMapper modelMapper;

    public PagamentoDTO toDto(Pagamento entity) {
        return modelMapper.map(entity, PagamentoDTO.class);
    }

    public Pagamento toEntity(PagamentoDTO dto) {
        return modelMapper.map(dto, Pagamento.class);
    }

    public List<PagamentoDTO> toDtoList(List<Pagamento> entities) {
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}

