package genrandomint;

import java.util.Arrays;
import java.util.Random;

public class Randoms {
	private int length;

	private int range;

	private int[] uniqueRandomNumbers;

	private int[] uniqueRandomSortedNumbers;
	Random rand = new Random();

	public Randoms(int length, int range) {
		super();
		this.length = length;
		this.range = range;
		this.uniqueRandomNumbers = new int[length];
		this.uniqueRandomSortedNumbers = new int[length];
	}

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public int[] getUniqueRandomNumbers() {
		return uniqueRandomNumbers;
	}


	public void setUniqueRandomNumbers(int[] uniqueRandomNumbers) {
		this.uniqueRandomNumbers = uniqueRandomNumbers;
	}


	public int[] getUniqueRandomSortedNumbers() {
		return uniqueRandomSortedNumbers;
	}


	public void setUniqueRandomSortedNumbers(int[] uniqueRandomSortedNumbers) {
		this.uniqueRandomSortedNumbers = uniqueRandomSortedNumbers;
	}


	public Random getRand() {
		return rand;
	}


	public void setRand(Random rand) {
		this.rand = rand;
	}


	public void fillArray(int[] uniqueRandomNumbers) {
		for (int i = 0; i < uniqueRandomNumbers.length; ++i) {
			uniqueRandomNumbers[i] = rand.nextInt(range);
		}
		System.out.println(Arrays.toString(uniqueRandomNumbers));
	}
	

}
