package pagamentos.v1.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import pagamentos.v1.dto.PagamentoDTO;
import pagamentos.v1.entity.Pagamento;
import pagamentos.v1.mapper.PagamentoMapper;
import pagamentos.v1.service.PagamentoService;


import java.util.List;

@Path("/pagamentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PagamentoResource {

    @Inject
    PagamentoService service;

    @Inject
    PagamentoMapper mapper;

    @GET
    public List<PagamentoDTO> listar() {
        return mapper.toDtoList(service.listarTodos());
    }

    @GET
    @Path("/{id}")
    public Response buscar(@PathParam("id") Long id) {
        Pagamento entity = service.buscarPorId(id);
        if (entity == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(mapper.toDto(entity)).build();
    }

    @POST
    public Response criar(PagamentoDTO dto) {
        Pagamento novo = service.salvar(mapper.toEntity(dto));
        return Response.status(Response.Status.CREATED).entity(mapper.toDto(novo)).build();
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(@PathParam("id") Long id, PagamentoDTO dto) {
        Pagamento atualizado = service.atualizar(id, mapper.toEntity(dto));
        if (atualizado == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(mapper.toDto(atualizado)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        boolean apagado = service.deletar(id);
        if (!apagado) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.noContent().build();
    }
}
