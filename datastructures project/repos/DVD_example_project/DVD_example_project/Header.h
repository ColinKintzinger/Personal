#ifndef HEADER_H
#define HEADER_H
#include <fstream>
#include <iostream>
#include <string>



using namespace std;





struct Movie {
    int id;
    string name;
    double cost;
};



int readFile(int*&, string*&, double*&);



//void printFile(int*, string*, double*, int);
void print(int*, string*, double*, int);



void sortFile(int*&, string*&, double*&, int);



void outputToFile(Movie*&, int);





#endif