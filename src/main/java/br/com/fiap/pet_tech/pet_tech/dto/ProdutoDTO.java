package br.com.fiap.pet_tech.pet_tech.dto;

import java.util.UUID;

public record ProdutoDTO(
        UUID id,
        String nome,
        String descricao,
        double preco,
        String urlDaImage
) {
}
