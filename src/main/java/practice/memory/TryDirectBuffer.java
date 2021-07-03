package practice.memory;

import java.nio.ByteBuffer;

public class TryDirectBuffer {

	public static void main(String[] args) {
		System.out.println("-- allocate direct buffer --");
		long start = System.nanoTime();
		
		ByteBuffer bufferA = ByteBuffer.allocateDirect(5);
		bufferA.putInt(1);
		
		long end = System.nanoTime();
		System.out.println((end - start) + " nano seconds");
		
		System.out.println("-- allocate non-direct buffer --");
		long start2 = System.nanoTime();
		
		ByteBuffer bufferB = ByteBuffer.allocate(5);
		bufferB.putInt(1);
		
		long end2 = System.nanoTime();
		System.out.println((end2 - start2) + " nano seconds");
		
		System.out.println("-- access to direct buffer 100000 times --");
		long start3 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			bufferA.getInt(0);
		}
		long end3 = System.nanoTime();
		System.out.println((end3 - start3) + " nano seconds");
		
		System.out.println("-- access to non-direct buffer 100000 times --");
		long start4 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			bufferB.getInt(0);
		}
		long end4 = System.nanoTime();
		System.out.println((end4 - start4) + " nano seconds");
	}

}
