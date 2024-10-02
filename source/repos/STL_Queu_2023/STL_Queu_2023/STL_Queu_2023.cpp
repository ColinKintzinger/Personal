// STL_Queu_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<queue>
using namespace std;
void remove(queue<char> myChar, char key) {

}
int main(){
    queue<char> myChar;
    for (char ch = 'A'; ch <= 'E';ch=ch+1)
        myChar.push(ch);
    remove(myChar, 'c');

    return 0;
}
