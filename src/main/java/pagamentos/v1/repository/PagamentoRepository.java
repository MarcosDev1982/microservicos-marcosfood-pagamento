package pagamentos.v1.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import pagamentos.v1.entity.Pagamento;

@ApplicationScoped
public class PagamentoRepository implements PanacheRepositoryBase<Pagamento, Long> {
}