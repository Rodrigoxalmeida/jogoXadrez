package boardgame;

public class Position {

	private int row;
	private int column;
	
	//construtor passando uma linha e coluna
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// get e set
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// toString para imprimir a posi��o na tela
	@Override
	public String toString() {
		
		return row + ", " + column;
		
		}
	
	
	}

