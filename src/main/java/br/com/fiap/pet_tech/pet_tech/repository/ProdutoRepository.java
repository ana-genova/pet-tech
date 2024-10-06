package br.com.fiap.pet_tech.pet_tech.repository;

import br.com.fiap.pet_tech.pet_tech.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
