// DS_StackADT_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<stack>
using namespace std;
void printStack(stack <int> s1) {
    while(!s1.empty()) {
        cout << s1.top()<<endl;
        s1.pop();
    }
}
int main()
{
    stack<int> s1,s2;
    for (int i = 1; i <= 5; ++i) 
        s1.push(i * 100);
    printStack(s1);
    
}
