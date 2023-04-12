package dojo.qaday.demo.mutationtest.model.pedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<EntityPedido, Long>{
}