package cs2assignment4;

import java.util.Random;
import java.util.Scanner;

public class Location implements LocationAPI {

	private int x;
	private char y;

	public Location() {
		super();
		this.x = -1;
		this.y = '*';
	}

	public Location(int x_, char y_) {
		super();
		this.x = x_;
		this.y = y_;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public char getY() {
		return y;
	}

	public void setY(char y) {
		this.y = y;
	}
//picks random location to put into ship object
	@Override
	public void pick() {
		Random rand = new Random();

		this.x = rand.nextInt(7) + 1;
		this.y = (char) ('a' + rand.nextInt(7));

	}
//asks the user to insert a value to fire on, on the board
	@Override
	public void fire() {
		Scanner sc = new Scanner(System.in);
		boolean test = true;
		while (test) {
			System.out.println("\nenter a letter between [a-g]\n");
			char ycord = sc.next().charAt(0);
			if (ycord >= 'a' && ycord <= 'g') {
				y = ycord;
				test = false;
			}
		}

		test = true;
		while (test) {
			System.out.println("\nenter integer between [1-7]\n");
			int xcord = sc.nextInt();
			if (xcord >= 1 && xcord <= 7) {
				x = xcord;
				test = false;
			}
		}
	}
//prints location in certain
	@Override
	public void print() {

		System.out.print(this.y + "" + this.x + " ");

	}

}
