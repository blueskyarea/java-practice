package main.java.practice.algorithm;

public class Overlap2 {

	public static void main(String[] args) {
		int ax = 5;
		int ay = 5;
		int aw = 10;
		int ah = 10;
		int bx = 6;
		int by = 3;
		int bw = 3;
		int bh = 3;

		int left = Math.max(ax, bx); // 6
        int right = Math.min(ax + aw, bx + bw); // 9
        int bottom = Math.max(ay, by);  // 5
        int top = Math.min(ay + ah, by + bh);  // 6
        
        //If overlap
        int overlap = 0;
        if(right > left && top > bottom) {
        	overlap = (right - left) * (top - bottom);
        	System.out.println(overlap);
        } else {
        	System.out.println("no overlap");
        }
             
	}

}
