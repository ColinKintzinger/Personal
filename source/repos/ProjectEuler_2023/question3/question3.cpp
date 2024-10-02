// question3.cpp : This file contains the 'main' function. Program execution begins and ends there.


#include <iostream>
using namespace std;
int reversDigits(int num)
{
	int rev_num = 0;
	while (num != 0) {
		rev_num = rev_num * 10 + num % 10;
		num = num / 10;
	}
	return rev_num;
}
int main()
{
	int x, y;
	int n = 0;
	
	for (int i = 100; i <= 999; i++) {
		for (int j = i ; j <= 999; j++) {
			x = i * j;
			//cout << x << endl;
			if (x==reversDigits(x)) {
				//cout << x << endl; 
				if (x > n) {
					n = x;
				}	
			}
		}
	}
	cout << n;

}
