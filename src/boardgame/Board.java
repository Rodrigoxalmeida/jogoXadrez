package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces; // Matriz de pe�as
	
	//Constructor
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	//get e set
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}
