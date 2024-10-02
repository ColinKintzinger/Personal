// Project6_OldVersion.cpp : This file contains the 'main' function. Program execution begins and ends there.
// VehileManagment_TransportationSystem.cpp 
//Dr. Alnaeli, University of Wisconsin
//note: system("cls"); is ro run the system command cls that clears the screen

#include "transportation.h"
//#include "testers.h"
#include "NodeList.h"
#include <string>
#include <iostream>
#include <fstream>
using namespace std;
string menu() {

	string message;
	message = "0. Clear Screen..\n1. Print All of the registered  vehicles.\n2. Print list of the available vehicles.";
	message = message + "\n3.List of the reserved vehicles.\n4. Check availability.\n5.Reserve a vehicle.\n6. return a vehicle.\n7. Print All of the registered vehicles to a text file.\n8. Exit.\nYour Selection --> ";
	return message;
}
bool readingDataFromDBfile(Inventory& myInventory, ifstream& inFile, int recordsInFile);

int main()
{
	//////testing Vehicle class. You are welcome to reuse it.
	//if (testingVehicle())
	//	cout << "Class Vehicle Passed all the available tests" << endl;

	////cout << "Loading the data .";
	ifstream inFile;
	ofstream outFile;
	try {
		inFile.open("vehicles.txt");
		if (!inFile)throw 2;
	}
	catch (int e) {
		if(e==2)
		exit(2);
	}
	int recordsInFile = 0;
	inFile >> recordsInFile; // reading number of the records in the file.
	//inFile.ignore(1000, '\n');  // ignore the \n
	Inventory myInventory(recordsInFile); // capacity is set to numer of the records in the file.
	if (!readingDataFromDBfile(myInventory, inFile, recordsInFile)) {
		cout << "" << endl;
		exit(-1); //terminate// exceptions
	}
	cout << endl;
	//myInventory.printList(); //testing
	cout << endl;
	cout << menu();
	int userEntry = 0;
	
	try {
		cin >> userEntry;
		if (cin.fail())throw 1;
	}
	catch (...) {
		cout << "out of bounds 1";
		exit(1);
	}
		int seatsNo = 0;
		//system("cls") is used for clearing the console screen. cls is a Dos command
		while (userEntry != 8) {
		
			switch (userEntry) {
			case 0: system("cls"); break;
			case 1: system("cls");  myInventory.printList();  break;
			case 2: system("cls");  myInventory.printAvailableList(); break;
			case 3:system("cls"); myInventory.printResevedList(); break;
			case 4: {system("cls");
				cout << "Enter number of seats? "; cin >> seatsNo;
				//cout<<"GPS [Y/N]?"
				if (!myInventory.found(seatsNo)) cout << "Not available\n";
			}break;
			case 5: {system("cls"); cout << "Please Enter the Vehicle ID: ";
				int tmpVehicleID;
				cin >> tmpVehicleID;
				try {
					if (!myInventory.reserveVehicle(tmpVehicleID))throw 22;
					else {
						if (!myInventory.saveToFile("vehicles.txt"))
							cout << "Reservation Failed...... Make sure that the Vehilce ID is valid." << endl;
					}
				}
				catch (int e) {
					if (e == 22)exit(3); 
				}
				/*if (myInventory.reserveVehicle(tmpVehicleID))*/
				//{
			}
				  break;
			case 6: {system("cls"); cout << "Please Enter the Vehicle ID: ";
				int tmpVehicleID;
				cin >> tmpVehicleID;
				if (myInventory.returnVehicle(tmpVehicleID))
				{
					if (!myInventory.saveToFile("vehicles.txt"))
						cout << "Return Failed...... Make sure that the Vehilce ID is valid." << endl;;
				}
				else
					cout << "Return Failed...... Make sure that the Vehilce ID is valid." << endl;
			}
				  break;

			case 7: {
				string fileName = "";
				cout << "Please enter a file name without an extension (Ex: myFile) -> "; cin >> fileName;
				ofstream outFile;
				fileName.append(".txt");
				outFile.open(fileName);
				if (outFile.fail()) { cout << "\nSystem was not able to create a file\n"; break; }
				outFile << myInventory;
				outFile.close();
				cout << "\nData sent to file inventoryCopy.txt\n"; } break;
			case 8: system("cls"); break;
			default: system("cls");
				cout << "Invalid Entry\n"; break;
			}// end switch
			if (userEntry == 8) break; // exit
			cout << menu();
			cin >> userEntry;
	
	

		}
	cout << "Ending the program..... Done!" << endl;

	return 0;
}

bool readingDataFromDBfile(Inventory& myInventory, ifstream& inFile, int recordsInFile) {
	/*reading the inventory informaton (cars that are registered) from the file to the inventory list (data structure.*/
	try {
		int vehicleID;
		string make;
		string model;
		int seats;
		bool available;
		int extarFeatures;
		string* featuresListTmp;
		for (int i = 0; i < recordsInFile; ++i) { // reading the vehcile information from the file
			//cout << " .";
			inFile >> vehicleID;
			//cout << vehicleID<<endl;
			inFile.ignore(1000, '\n');
			getline(inFile, make);
			getline(inFile, model);
			inFile >> seats;
			int tmp;
			inFile >> tmp;
			available = (tmp == 0) ? false : true;
			inFile >> extarFeatures;
			if (extarFeatures > 0)
				inFile.ignore(1000, '\n');
			featuresListTmp = new string[extarFeatures];
			for (int k = 0; k < extarFeatures; ++k) {
				getline(inFile, featuresListTmp[k]);
				//cout << featuresListTmp[k]<<" ";
			}
			
			Vehicle tempVehicle(vehicleID, make, model, seats, available, extarFeatures, featuresListTmp);
			myInventory.push_Back(tempVehicle);
			delete[] featuresListTmp;
			
		}
		inFile.close();

	}
	catch (...) {
		return false;
	}

	return  true;
}