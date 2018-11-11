package app.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("unused")
@Getter
@Setter
@NoArgsConstructor
public class ContaBancaria {
	private String conta;
	private BigDecimal saldoInicial;
	private Pessoa pessoa;
}
