package app.model;

import java.util.List;

public class GEResponseBody {
	
	String msg;
	List<ContaControle> result ;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<ContaControle> getResult() {
		return result;
	}
	public void setResult(List<ContaControle> result) {
		this.result = result;
	}

	
}
