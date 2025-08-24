package pagamentos.v1.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import pagamentos.v1.dto.PagamentoDTO;
import pagamentos.v1.entity.Pagamento;
import pagamentos.v1.mapper.PagamentoMapper;
import pagamentos.v1.repository.PagamentoRepository;


import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PagamentoService {

    @Inject
    PagamentoRepository repository;


    public List<Pagamento> listarTodos() {
        return repository.listAll();
    }

    public Pagamento buscarPorId(Long id) {
        return repository.findByIdOptional(id).orElse(null);
    }

    @Transactional
    public Pagamento salvar(Pagamento pagamento) {
        repository.persist(pagamento);
        return pagamento;
    }

    @Transactional
    public Pagamento atualizar(Long id, Pagamento novosDados) {
        Pagamento pagamento = repository.findById(id);
        if (pagamento == null) {
            return null;
        }
        pagamento.setMetodo(novosDados.getMetodo());
        pagamento.setValor(novosDados.getValor());
        pagamento.setDataPagamento(novosDados.getDataPagamento());
        return pagamento;
    }

    @Transactional
    public boolean deletar(Long id) {
        return repository.deleteById(id);
    }
}
