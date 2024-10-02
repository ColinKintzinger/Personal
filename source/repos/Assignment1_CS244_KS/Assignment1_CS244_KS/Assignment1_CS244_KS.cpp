// CS244_Project1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <ctime>
#include <vector>
#include <fstream>
using namespace std;
struct Player {
	string fullName;
	string team;
	double rating;
	int jN;
	int goal;
};
//PRINTING
void printRecords(Player* players, int howMany) {
	for (int i = 0; i < howMany; ++i) {
		cout << "Player Name : " << players[i].fullName << endl;
		cout << "Current Team : " << players[i].team << endl;
		cout << "Current Rating: " << players[i].rating << endl;
		cout << "Player Jersey : " << players[i].jN << endl;
		cout << "Goal Scored : " << players[i].goal << endl;
		cout << " " << endl;
	}
}
void readingFromFile(Player*& players, int& howMany);
void sortingRecords(Player*& players, int& howMany);
int main() {


	int howMany = 0;
	Player* players = nullptr;

	readingFromFile(players, howMany);
	printRecords(players, howMany);

	sortingRecords(players, howMany);
	cout << "After Sorting" << endl;
	printRecords(players, howMany);
	return 0;
}
//READING
void readingFromFile(Player*& players, int& howMany) {
	ifstream inFile;
	inFile.open("fifadatabase.txt");
	if (inFile.fail()) {
		cout << "Error 322: Cannot open file" << endl;
		exit(1);
	}
	string currentLine;
	while (getline(inFile, currentLine))
		++howMany;  //reading number of the records in the file
	howMany = howMany / 4;
	cout << "There are " << howMany << " Records in this file\n";

	players = new Player[howMany];

	for (int i = 0; i < howMany; ++i) {
		getline(inFile, players[i].fullName);
		getline(inFile, players[i].team);
		inFile >> players[i].rating;
		inFile >> players[i].jN;
		inFile.ignore(10000, '\n');
		inFile >> players[i].goal;
		inFile.ignore(10000, '\n');


	}
	inFile.close();
}


//SORTING
void sortingRecords(Player*& players, int& howMany) {
	for (int i = 0; i < howMany; ++i)
		for (int j = i + 1; j < howMany; ++j) {
			if (players[j].goal > players[i].goal) {
				Player tmpPlayer = players[i];
				players[i] = players[j];
				players[j] = tmpPlayer;




			}
		}



}