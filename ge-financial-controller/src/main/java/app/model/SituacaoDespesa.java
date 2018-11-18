package app.model;

public enum SituacaoDespesa {
	A_PAGAR(0),
	PAGA(1);
	
	private int value;
	
	SituacaoDespesa(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static SituacaoDespesa fromValue(int value) {
		for(SituacaoDespesa sit : SituacaoDespesa.values()) {
			if(sit.value==value) {
				return sit;
			}
		}
		return null;
	}
	
}
