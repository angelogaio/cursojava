package aula141exer;

public class LimitException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public LimitException(String msg) {
		super(msg);
	}
}
