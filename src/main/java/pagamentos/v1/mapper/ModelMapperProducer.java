package pagamentos.v1.mapper;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class ModelMapperProducer {

    @Produces
    @ApplicationScoped
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
