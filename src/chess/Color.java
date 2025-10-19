package chess;

public enum Color {
	
	BLACK (1),
	WHITE (2);
	
	private int code;
	
	private Color(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Color valueOf(int code) {
		for (Color value: Color.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Color code");
	}
	
}
