#include "Header.h"
void outputToFile(Movie*& movieList, int size) {
	movieList = new Movie[size];



	ofstream outFile;
	outFile.open("movies.txt");
	if (outFile.fail()) {
		cout << "Could not open file" << endl;



	}
	outFile << size << endl;
	for (int i = 0; i < size; ++i) {
		cout << "ID " << i + 1 << "-> ";
		cin >> movieList[i].id;
		outFile << movieList[i].id << endl;
		cin.ignore(1000, '\n');
		cout << "Name " << i + 1 << "-> ";
		getline(cin, movieList[i].name);
		outFile << movieList[i].name << endl;
		cout << "Cost " << i + 1 << "-> ";
		cin >> movieList[i].cost;
		outFile << movieList[i].cost << endl;
	}
	outFile.close();
}



int readFile(int*& id, string*& name, double*& cost) {
	ifstream inFile;
	inFile.open("movies.txt");



	if (inFile.fail()) {
		cout << "Failed to open Movies.txt";
	}




	int total;
	inFile >> total;



	id = new int[total];
	name = new string[total];
	cost = new double[total];



	for (int i = 0; i < total; ++i) {
		inFile >> id[i];
		inFile.ignore(1000, '\n');
		getline(inFile, name[i]);
		inFile >> cost[i];
	}



	inFile.close();



	return total;
}



//void printFile(int*, string*, double*, int); 
void print(int* id, string* name, double* cost, int size) {
	for (int i = 0; i < size; ++i) {
		cout << "ID: " << id[i] << endl;
		cout << "Name: " << name[i] << endl;
		cout << "Cost: " << cost[i] << endl;
	}
}



void sortFile(int*& id, string*& name, double*& cost, int size) {



	for (int i = 0; i < size; ++i) {
		for (int j = i + 1; j < size; ++j) {
			if (cost[j] < cost[i]) {
				double tempCost = cost[i];
				cost[i] = cost[j];
				cost[j] = tempCost;



				string tempName = name[i];
				name[i] = name[j];
				name[j] = tempName;



				int tempId = id[i];
				id[i] = id[j];
				id[j] = tempId;
			}
		}
	}
}