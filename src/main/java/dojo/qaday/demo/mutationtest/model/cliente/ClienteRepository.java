package dojo.qaday.demo.mutationtest.model.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<EntityCliente, Long> {
}
