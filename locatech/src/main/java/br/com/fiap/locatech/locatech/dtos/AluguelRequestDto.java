package br.com.fiap.locatech.locatech.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AluguelRequestDto(
        @NotNull(message = "O id da pessoa não pode ser nulo")
        @NotNull(message = "O id da veiculo não pode ser nulo")
        Long pessoaId,
        Long veiculoId,
        LocalDate dataInicio,
        LocalDate dataFim

) {
}
