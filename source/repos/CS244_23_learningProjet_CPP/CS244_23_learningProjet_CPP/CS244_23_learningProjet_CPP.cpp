// CS244_23_learningProjet_CPP.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <cmath>
#include<ctime>
#include<vector>//array list for c++
 
using namespace std;
const double PRICE =100;
//int incValue(int value) { 
//    ++value;
//    return value;
//}
//int decValue(int value) {
//    --value;
//    return value;
//}
//const int ARRAY_SIZE = 5;
//const int ARRAY_SIZE = 100000;
//const int ARRAY_SIZE = 100000;
void swapInts(int&, int&);
bool checkForMe(vector<int>, int, int);
void fillArray(vector<int>&, int);
void printArray(const vector<int>);
void sortingVector(vector<int>&);
int getMin(const vector<int>);



int main()
{
    srand(time(nullptr));
    vector<int> a;  //int a[ARRAY_SIZE];
    int userSize;
    cout << "How many numbers you need to generate: ";
    cin >> userSize;
    //filling the array:
    fillArray(a, userSize);
    //testing....
    cout << "Before sorting:\n";
    printArray(a);
    //finding minimum
    cout << "Min =" << getMin(a) << endl;
    //sorting
    sortingVector(a);
    cout << "after sorting:\n";
    printArray(a);
    return 0;
}
void swapInts(int& n1, int& n2) {
    int tmp = n1;
    n1 = n2;
    n2 = tmp;



}
bool checkForMe(vector<int> a, int key, int currentSize) {
    for (int i = 0; i < currentSize; ++i)
        if (a[i] == key) return true;
    return false;
}
void fillArray(vector<int>& a, int len) {
    int soFar = 0;
    while (soFar < len) {
        int randomNo = rand() % 10001;
        if (!checkForMe(a, randomNo, soFar)) {
            a.push_back(randomNo); //{a[soFar] = randomNo;  
            ++soFar;
        }
    }
}
void printArray(const vector<int> a) {
    for (int i = 0; i < a.size(); ++i)
        cout << a[i] << endl;
}
void sortingVector(vector<int>& a) {
    for (int i = 0; i < a.size(); ++i)
        for (int j = i + 1; j < a.size(); ++j)
            if (a[j] < a[i]) {
                swapInts(a[i], a[j]);
            }
}
int getMin(const vector<int> a) {
    int currentMIN = a[0];
    for (int i = 1; i < a.size(); ++i)
        if (a[i] < currentMIN) currentMIN = a[i];
    return currentMIN;
}

    /*double a[LIST_SIZE];
    double sum = 0;
    double ave = 0;
    cout << "Please enter " << LIST_SIZE << " numbers:\n ";
    for (int i = 0; i < LIST_SIZE; ++i)
    {
        cout << "A[" << i << "] --> ";
        cin >> a[i];
        sum = sum + a[i];
    }
    ave = sum / LIST_SIZE;*/



    /*int result;
    int value;
    string userEntry;
    cout << "please enter: \n ++ for incrament\n --for decrement\n enter your selection";
    cin >> userEntry;
    if (userEntry == "++") {
        cout << "please enter and integer:";
        cin >> value;
        incValue;
        result = incValue(value);
    }
    else if (userEntry == "--") {
        cout << "please enter and integer:";
        cin >> value;
        decValue;
        result = decValue(value);
    }
    else {
        cout << "enter valid answer";
    }
    cout << "result is:" << result;*/
   /* char opr;
    cout << "+ addition" << endl;
    cout << "- subtraction" << endl;
    cout << "* multiplication" << endl;
    cout << "/ division" << endl;
    cout << "^ power" << endl;
    cout << "s aqure root" << endl;
    cin >> opr;
    switch (opr) {
    case '+':
            break;
    case'-': "under construction";
        break;
    case'*': "under construction";
        break;
    case'/': "under construction";
        break;
    case'^': "under construction";
        break;
    }*/




    /*char again = 'n';
    do {
        int userEntry;
        cout << "1) student" << endl;
        cout << "2) teacher" << endl;
        cout << "3) parent" << endl;
        cout << "4) child" << endl;
        cout << "please enter the proper selection" << endl;
        cin >> userEntry;
        switch (userEntry) {
        case 1:cout << "Total cost after 50% discount is " << (PRICE - (PRICE * 0.5)) << endl;
            break;
 
 case 4:case 2:cout << "Total cost after 100% discount is " << (PRICE - (PRICE * 1)) << endl;
            break;
        case 3: cout << "Total cost after 70% discount is " << (PRICE - (PRICE * 0.7)) << endl;
            break;
        default:cout << "invalid entry";
        }
        cout << "would you like to select again y/n"; cin >> again;
        
    } while (again != 'n' && again != 'N');*/

    /*if (userEntry == 1)
        cout << "Total cost after 50% discount is " << (PRICE - (PRICE * 0.5)) << endl;
    else if (userEntry == 2|| userEntry==4)
        cout << "Total cost after 100% discount is " << (PRICE - (PRICE * 1)) << endl;
    else if (userEntry == 3)
        cout << "Total cost after 70% discount is " << (PRICE - (PRICE * 0.7)) << endl;
    else {
        cout << "invalid entry!";
    }*/
    //conditional statements
    /*int value;
    cout << "enter a value to see if it is even or odd"; cin >> value;
    if ((value % 2) == 0) {
        cout << value << " is an even number" << endl;
    }
    else {
        cout << value << " is an odd value" << endl;
    }*/
    //obtaining information from user 
    /*int id;
    string fullName;
    string email;
    double balance;
    cout << "pleace enter following info\n ID#, fullname, email,balance";
    cin >> id;
    cin.ignore(1000, '\n');
    getline(cin, fullName);
    cin >> email;
    cin >> balance;
    cout << "ID#:" << id << "\nfullName:" << fullName << "\nemail:" << email << "\nbalance:" << balance;*/
    //input and outputs for c++
    /*string name;
    int number = 2;
    std::cout << "Hello World!\n";
    cout << "What is your name:";
        cin >> name;
        if (name == "colin") {
            cout << "my mane is:" << name << endl;
            cout << "\\\\\\\\////" << "\"go liverpool\"" << endl;
            int a = 0;
            for (a; a < 10; a++) {
                cout << a << " ";
            }
        }
        else {
            cout << "wrong nerd";
        }*/

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
