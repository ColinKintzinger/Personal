// dataStructure_assignment1_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "header.h"





const int numberOfPlayers = 4;
int main()
{
	player* info = new player[numberOfPlayers];
	ifstream inFile;
	inFile.open("fifadatabase.txt");
	if (inFile.fail()) {
		cout << "file could not be opened";
		exit(1);
	}
	int index=0;
	
	string tmpname = "";
	string tmpteam;
	double tmprating;
	int tmpnum;
	int tmpgoals;
	string dummy;
	while (getline(inFile, tmpname)) {
		getline(inFile, tmpteam);
		
		inFile >> tmprating; 
		inFile >> tmpnum;
		inFile >> tmpgoals;
		getline(inFile, dummy);
		info[index].fullName = tmpname;
		info[index].team = tmpteam;
		info[index].rating = tmprating;
		info[index].jNumber = tmpnum;
		info[index].goals = tmpgoals;
		++index;
	}
	inFile.close();
	sortingplayers(info);
	printingList(info);
	
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
