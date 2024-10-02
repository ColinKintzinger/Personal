// ProjectEuler2_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.


#include <iostream>
using namespace std;
int main()
{
    int a=1, b=2;
    int sum=0;
    //cout << a << " " << b<<" ";
    for (int i = 3; i <= 1000; ++i) {
        if (sum < 4000000) {
            if (b % 2 == 0) {
                sum += b;
            }
            int tmp = b;
            b = a + b;
            a = tmp;
            //cout << b << " ";
        }
    }
    cout << sum;
}