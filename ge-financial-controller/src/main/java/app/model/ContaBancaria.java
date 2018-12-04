package app.model;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Getter
@Setter
@Document(collection = "contasBancarias")
public class ContaBancaria {

	@Id
	private ObjectId _id;
	private String conta;
	private BigDecimal saldoInicial;
	private BigDecimal saldoAtual;
	private ContaControle contaControle;
	
	public ContaBancaria(ObjectId _id, String conta, BigDecimal saldoInicial, BigDecimal saldoAtual,
			ContaControle contaControle) {
		super();
		this._id = _id;
		this.conta = conta;
		this.saldoInicial = saldoInicial;
		this.saldoAtual = saldoAtual;
		this.contaControle = contaControle;
	}
	
	
}
