
public class Equestria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double BM = distance(31, 15, 35, 9);		
		System.out.println("Distance between Baltimare and Manehattan: " + BM);
		double LPNF = distance(6, 20, 24, 7);
		System.out.println("Distance between Los Pegasus and Neighagra Falls: " + LPNF);
		double BP = distance(28, 22, 16, 13);
		System.out.println("Distance between Badlands and Ponyville: " + BP);
	}
	//this method uses formula to find distance between cities
	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
}
