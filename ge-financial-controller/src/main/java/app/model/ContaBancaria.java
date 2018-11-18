package app.model;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("unused")
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "contasBancarias")
public class ContaBancaria {
	@Id
	private ObjectId _id;
	private String conta;
	private BigDecimal saldoInicial;
	private BigDecimal saldoAtual;
	private ContaControle contaControle;
}
