#ifndef HEADER_H
#define HEADER_H
#include <iostream>
#include<cstdlib>
#include<string>
#include<fstream>
#include<vector>
using namespace std;
//Structure of name player that holds 5 data types to be filled from the file
struct player {
	string fullName;
	string team;
	double rating;
	int jNumber;
	int goals;
};
void printingList(player*);
void sortingplayers(player*);
#endif
