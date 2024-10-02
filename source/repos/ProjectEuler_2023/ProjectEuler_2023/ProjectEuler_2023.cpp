// ProjectEuler_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <math.h>
using namespace std;
int main(){
	int amount = 1000;
	int sum = 0;
	for(int count=1;count<amount;++count){
		if (count % 3 == 0 || count % 5 == 0) {
			sum= sum+count;
		}
	}
	cout << sum;
}