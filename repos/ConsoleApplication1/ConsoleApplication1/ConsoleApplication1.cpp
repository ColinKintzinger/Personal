// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
struct tree {
    char data;
    tree* left;
    tree* right;
    tree(char value) :data(value), left(nullptr), right(nullptr);
};

int main()
{
    tree* root = new tree('A');
    root->left = new tree('b');
}

