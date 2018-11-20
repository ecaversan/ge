package app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Getter
@Setter
@AllArgsConstructor
@Document(collection = "receitas")
public class Receita {
	@Id
	private ObjectId _id;
	private ContaBancaria contaBancaria;
	private String documento;
	private LocalDate dataMovimento;
	private String referencia;
	private Cliente cliente;
	private BigDecimal valor;
	private LocalDate dataPagamento;
	private String observacoes;
	private SituacaoReceita situacao;
}
