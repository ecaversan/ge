package app.model;

public enum SituacaoReceita {
	A_RECEBER(0),
	RECEBIDO(1);
	
	private int value;
	
	SituacaoReceita(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static SituacaoReceita fromValue(int value) {
		for(SituacaoReceita sit : SituacaoReceita.values()) {
			if(sit.value==value) {
				return sit;
			}
		}
		return null;
	}
}
