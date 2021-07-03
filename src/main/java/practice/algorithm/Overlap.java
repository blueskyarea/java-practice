package practice.algorithm;

public class Overlap {

	public static void main(String[] args) {
		int ax = 5;
		int ay = 5;
		int aw = 10;
		int ah = 10;
		int bx = 6;
		int by = 3;
		int bw = 3;
		int bh = 3;

		int x = bx - ax;
		int y = by - ay;
		if (-bw < x && x < aw && -bh < y && y < ah) {
			System.out.println("overrap");
			int width, height = 0;
			if (ay > by) {
				height = (by + bh - ay);
			} else {
				height = (ay + ah - by);
			}
			if (ax > bx) {
				width = (bx + bw - ax);
			} else {
				width = (ax + aw - bx);
			}
			System.out.println(width * height);
		} else {
			System.out.println("not overrap");
		}
	}

}
