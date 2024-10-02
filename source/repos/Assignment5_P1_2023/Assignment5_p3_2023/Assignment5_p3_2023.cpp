// Assignment5_p3_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;
template <class T>
class Stack {
public:
    Stack() {
        top = -1;
        data = new T[CAPACITY];
    }
    ~Stack() {
        delete[] data;
    }
    //copy constructor
    Stack(const Stack&); 
    //copy assignment opperator
    Stack& operator = (const Stack&); 
    
    void push(T item);
    void pop();
    bool empty() { return (top == -1); }
    int size() { return (top + 1); }
    int getCAPACITY() { return CAPACITY; }

    T atTop();
private:
    int CAPACITY = 10;
    int top;
    T* data;
    bool expand(int newSize); //expanding the array
    bool shrink(int newSize);//reducing the size of the array
};
template <class T>
void Stack<T>::push(T item) {
    //pre-conditions:  stack is not Full.
    if (top < (CAPACITY - 1)) {
        ++top;
        data[top] = item;
    }
    else
    {
        //cout << "Stack Overflow!\n";
        int newCAPACITY = CAPACITY + (CAPACITY / 4);
        if (expand(newCAPACITY)) {
            ++top;
            data[top] = item;
        }
        else
            cout << "Problem while expanding the stack!\nunsuccessful push operation.";
    }
}
template <class T>
void Stack<T>::pop() {
    //pre-conditions:  stack is not empty

    if (!empty()) {
        --top;
        if ((top + 1) <= (CAPACITY / 2) && (top + 1) > 10)
        {
            int newCAPACITY = CAPACITY - (CAPACITY / 4);
            if (!shrink(newCAPACITY))
                cout << "Problem while shrinking the stack!\n";
        }
    }
    else
        cout << "Stack Underflow!\n";
}

template <class T>
T Stack<T>::atTop() {
    //pre-conditions:  stack is not empty
    if (!empty())
        return data[top];
    else {
        cout << "Stack Underflow!\n";
        exit(1); //terminate the program
    }
}
template <class T>
bool Stack<T>::expand(int newCAPACITY) { //expanding the array
    if (newCAPACITY > CAPACITY) {
        T* tmpArray = new T[newCAPACITY];
        for (int i = 0; i < size(); ++i)
            tmpArray[i] = data[i];
        delete[] data;
        data = tmpArray;
        CAPACITY = newCAPACITY;
        return true;
    }
    else
        return false;
}
template <class T>
bool Stack<T>::shrink(int newCAPACITY) {//reducing the size of the array
    if (newCAPACITY < CAPACITY) {
        T* tmpArray = new T[newCAPACITY];
        for (int i = 0; i < newCAPACITY; ++i)
            tmpArray[i] = data[i];
        delete[] data;
        data = tmpArray;
        CAPACITY = newCAPACITY;
        return true;
    }
    else
        return false;
}
//copy constructor
template<class T>
Stack<T>::Stack(const Stack& org) {
    CAPACITY = org.CAPACITY;
    top = org.top;
    data = new T[CAPACITY];
    for (int i = 0; i < CAPACITY; ++i) {
        data[i] = org.data[i]; 
    }
    
}
 template<class T>
 Stack<T>&Stack<T>::operator= (const Stack & rhs){
    if (this != &rhs) {
        CAPACITY = rhs.CAPACITY;
        top = rhs.top;
        delete[] data;
        data = new T[CAPACITY];
        for (int i = 0; i < CAPACITY; ++i) {
            data[i] = rhs.data[i];
        }
    }
    return *this;
 }
int main() {

    return 0;
}
