import java.util.*;

class Tile{
	
	private static double edgeLength;
	
	Tile(double edgeLength) {
		
		this.edgeLength = edgeLength;
	}
	
	static double areaOfTile() {
		
		return (edgeLength * edgeLength);
	}
}

class Floor{
	
	private static double length;
	private static double width;
	
	Floor(double length, double width) {
		
		this.length = length;
		this.width = width;

	}
	
	static double totalTiles(double Tile_t) {
		
		return ((length * width) / Tile_t);
	}
	
}

public class TileDemo{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of length of square tile.");
		double edgeLength = sc.nextDouble();
		
		Tile obj = new Tile(edgeLength);
		
		double Tile_t = Tile.areaOfTile();
		
		System.out.println("Enter the value of length and width of floor.");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		
		Floor obj1 = new Floor(length, width);
		
		double res = Floor.totalTiles(Tile_t);
		System.out.println("The number of total tiles required for the floor are : "+res);
	}
}