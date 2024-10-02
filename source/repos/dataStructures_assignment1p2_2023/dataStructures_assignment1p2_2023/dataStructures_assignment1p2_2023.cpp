// dataStructures_assignment1p2_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//


#include <iostream>
#include<cstdlib>
#include<string>
#include<fstream>
#include<vector>
using namespace std;
struct player {
	string fullName;
	string team;
	double rating;
	int jNumber;
	int goals;
	void printFields() {
		cout << "Player name: " << fullName << "\nteam:" << team << "\nRating: " << rating << "\nJersey number: " << jNumber << "\nGoals: " << goals << "\n----------------------------------" << endl;
	}
};
//Function that allows the data from the vector to be printed out in the window
void printinfo(vector<player> info) {
	for (int i = 0; i < info.size(); ++i) {
		info[i].printFields();
	}
}
//reverses the order of the vector 
void reverse(vector<player>& info) {
	for (int i = 0; i < info.size() / 2; ++i) {
		player temp = info[i];
		info[i] = info[info.size() - i - 1];
		info[info.size() - i - 1] = temp;
	}
}
int main()
{
	ifstream inFile;
	vector<player> info; 
	inFile.open("fifadatabase.txt");
	if (inFile.fail()) {
		cout << "file could not be opened";
		exit(1);
	}
	int index = 0;
	int indexcount = 0;
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

		player newplayer = { tmpname, tmpteam, tmprating,tmpnum, tmpgoals };
		info.push_back(newplayer); 
	}
	reverse(info);
	printinfo(info);

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
