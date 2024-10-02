#include <string>
#include <iostream>
#include <fstream>
#include "transportation.h"
#include "NodeList.h"
using namespace std;

/****************************Class Vehicle Method Implementations***************************************/
Vehicle::Vehicle() {
	/*default constructor
	//fields are initialized with default data.
	//for the vehicle object, an empty dynamic array is allocated.
	*/
	vehicleID = -1;
	make = "NA";
	model = "NA";
	seats = 0;
	available = true;
	extarFeatures = 0;
	//otherFeaturesList = new string[0];
};

Vehicle::Vehicle(int _vehicleID_, string _make_, string _model_, int _seats_,
	bool _available_, int _extarFeatures_, string* _otherFeaturesList_) {
	/*overloaded constructor
	//fields are initialized with data sent via the constructor.
	//the array of features is sent fro outsite as a pointer.
	*/
	vehicleID = _vehicleID_;
	make = _make_;
	model = _model_;
	seats = _seats_;
	available = _available_;
	extarFeatures = _extarFeatures_;
	//otherFeaturesList = new string[_extarFeatures_];
	for (int i = 0; i < extarFeatures; ++i)
		otherFeaturesList.insertBack(_otherFeaturesList_[i]); //= _otherFeaturesList_[i];
};

//-------------
// if (v1>v2) 
bool Vehicle::operator> (const Vehicle& v) {
	/*
	// overloading the greater than operator >. number of seats is used for
	//comparing the vehcle. If equal, then the number of extra features is used to break the ties.
	*/
	return ((seats > v.seats) || ((seats == v.seats) && (extarFeatures > v.extarFeatures)));
}

bool Vehicle::operator< (const Vehicle& v) { // used seats then extrafeatures as keys
	/*
// overloading the less than operator <. number of seats is used for
//comparing the vehcle. If equal, then the number of extra features is used to break the ties.
*/
	return ((seats < v.seats) || ((seats == v.seats) && (extarFeatures < v.extarFeatures)));
}


bool Vehicle::operator==(const Vehicle& v) // uses seats then extrafeatures as keys to compare between Vehicle objects
{
	/*
// overloading the equality operator ==. Number of seats and extra features are used
//for determining if two vehicles are equal.
*/
	return (this->seats == v.seats && this->extarFeatures == v.extarFeatures);
}

bool Vehicle::operator<=(const Vehicle& v) // seats is the key
{
	/* overloading operator <= */
	return ((this->seats == v.seats && this->extarFeatures == v.extarFeatures) || ((seats < v.seats) || ((seats == v.seats) && (extarFeatures < v.extarFeatures))));
}
bool Vehicle::operator>=(const Vehicle& v) // seats is the key
{	/* overloading operator >= */
	return ((this->seats == v.seats && this->extarFeatures == v.extarFeatures) || ((seats > v.seats) || ((seats == v.seats) && (extarFeatures > v.extarFeatures))));

}

bool Vehicle::operator!=(const Vehicle& v) // seats is the key
{
	/* overloading the  operator != not equal*/
	return (!((this->seats == v.seats) && (this->extarFeatures == v.extarFeatures)));
}


//Rule of Three:
//destructor
Vehicle::~Vehicle() {
	//delete[] otherFeaturesList;
	//node list class already has it implamented for us
};
// copy constructor	
Vehicle::Vehicle(const Vehicle& org) {
	vehicleID = org.vehicleID;
	make = org.make;
	model = org.model;
	seats = org.seats;
	available = org.available;
	extarFeatures = org.extarFeatures;
	//otherFeaturesList = new string[extarFeatures];
	//for (int i = 0; i < extarFeatures; ++i){
		otherFeaturesList= org.otherFeaturesList;
	//}
}
//assignment operator overloading
Vehicle Vehicle::operator=(const Vehicle& rhs) {
	if (this != &rhs)
	{
		//delete[] otherFeaturesList;
		vehicleID = rhs.vehicleID;
		make = rhs.make;
		model = rhs.model;
		seats = rhs.seats;
		available = rhs.available;
		extarFeatures = rhs.extarFeatures;
		//otherFeaturesList = new string[extarFeatures];
		//for (int i = 0; i < extarFeatures; ++i)
			otherFeaturesList = rhs.otherFeaturesList; 

	}
	return *this;
}

/******** Friend Functions to the Vehicle***********/
ostream& operator<<(ostream& out, const Vehicle& objV)
// overleaoding the insertion operator <<
{
	out << "------------------------------------------\n";
	out << "ID: " << objV.vehicleID << endl;
	out << "Make: " << objV.make << endl;
	out << "Model: " << objV.model << endl;
	out << "Vumber of seats: " << objV.seats << endl;
	if (objV.available)
		out << "Availability: available" << endl;
	else
		out << "Availability: Not available" << endl;
	out << "Extra Features[" << objV.extarFeatures << "]: " << endl;
	if (objV.extarFeatures < 1)
		out << "Basic trim" << endl;
	else {
		out << "[";
		NodeList<string>::Iterator curr = objV.otherFeaturesList.begin();
			out << *curr;
		for (++curr; curr != objV.otherFeaturesList.end(); ++curr)
			out << ", " << *curr;
		out << "]" << endl;
	}
	return out;
}
ofstream& operator<<(ofstream& out, const Vehicle& objV)
// overleaoding the insertion operator << for the output file stream
{
	out << objV.vehicleID << endl;
	out << objV.make << endl;
	out << objV.model << endl;
	out << objV.seats << endl;
	out << objV.available << endl;
	out << objV.extarFeatures << endl;
	NodeList<string>::Iterator curr = objV.otherFeaturesList.begin(); 
	for (curr; curr!= objV.otherFeaturesList.end(); ++curr)
		out << *curr << endl;
	
	return out;
}
/****************************Class Inventory Method Implementations***************************************/
//default constructor
Inventory::Inventory() {
	capacity = 100; //default size
	registredVehiclesNo = 0;
	
}

//constructor II
Inventory::Inventory(int _capacity_) {
	capacity = _capacity_;
	registredVehiclesNo = 0;
	
	//	registredVehiclesNo = capacity;
}
Inventory::~Inventory() //destructor
{
	
	
}
//copy constructor
Inventory::Inventory(const Inventory& obj) {
	capacity = obj.capacity;
	registredVehiclesNo = obj.registredVehiclesNo;
	
	//for (int i = 0; i < registredVehiclesNo; ++i)
		v_List = obj.v_List;
	
}

//assignment overloading.
Inventory Inventory::operator=(const Inventory& rhs) {
	if (this != &rhs) {
		capacity = rhs.capacity;
		registredVehiclesNo = rhs.registredVehiclesNo;
		//delete[] v_List;
		//v_List = new Vehicle[capacity];
		//for (int i = 0; i < registredVehiclesNo; ++i)
			v_List = rhs.v_List;
	}
	return *this;
}
//
bool Inventory::push_Back(Vehicle  ve) {
	/*inserting vehilce object to the inventory list*/
	/*Project 6: improve it by extending the underlining list, expands as needed.*/
	/*Project 6: make sure that it is consistent with the new data structure (NodeList) you used for this class.*/
	
		v_List.insertBack(ve);
		++registredVehiclesNo;
		return true;
}// end of push_back
//
void Inventory::sortList() {
	/*sorts the inventory list in decreasing order. See the operator > overloading for the class Vehicle*/
	NodeList<Vehicle>::Iterator curr = v_List.begin();
	NodeList<Vehicle>::Iterator curr2=v_List.begin();
	for (curr; curr != v_List.end(); curr++)
		for (curr2++; curr2 !=v_List.end(); curr2++)
			if (*curr > *curr2) {
				Vehicle strTmpTask = *curr2;
				*curr2 = *curr;
				*curr = strTmpTask;
			}
}
void Inventory::printList(NodeList<Vehicle>::Iterator curr) {
	/*Project 6: Refactoring is needed here. You need to reimplement this method in a recursive way.*/
	/*so the method will traverse the list reursively to print out the vehicle info for all the list*/
	if (curr != v_List.end()) {
		cout << *curr;
		cout << "------------------------------------------\n";
		printList(curr++);
	}
	//for (curr; curr != v_List.end(); curr++) {
		
	// }
}
void Inventory::printList(){
	printList(v_List.begin());
}
void Inventory::printResevedList(NodeList<Vehicle>::Iterator curr) {  // print list of the reserved vehicles
	/*Project 6: Refactoring is needed here. You need to reimplement this method in recursive way.*/
	 
		if (curr != v_List.end()) {
			if (!(*curr).status()) {
				cout << *curr;
				printResevedList(curr++);
			}
		}
}
void Inventory::printResevedList() {
	printAvailableList(v_List.begin());
}
void Inventory::printAvailableList(NodeList<Vehicle>::Iterator curr) {// print list of the available vehicles
	/*Project 6: Refactoring is needed here. You need to reimplement this method in recursive way.*/
	//for (curr; curr != v_List.end(); curr++)
		if (curr != v_List.end()) {
			if (!(*curr).status()) {
				cout << *curr;
				printAvailableList(curr++);
			}
		}
}
void Inventory::printAvailableList(){
	printAvailableList(v_List.begin());
}

bool Inventory::found(int seatsNo, NodeList<Vehicle>::Iterator curr) {
	// print list of the available vehicles that has AT LEAST seatsNo seats.
	//Pre-conditions: seatsNo is a positive value > 0
	/*Project 6: Refactoring is needed here. You need to reimplement this method in recursive way.*/

	
	bool Yes = false;
	if (curr != v_List.end()) {
		if ((*curr).status() && (*curr).getSeats() >= seatsNo) {
			cout << *curr;
			found(seatsNo,curr++)
				
		}
	}
	return Yes;
}
bool Inventory::found(int seatsNo) {
	found(seatsNo, v_List.begin());
	return false;
}
bool Inventory::reserveVehicle(int _vehicleID_) {
	
	NodeList<Vehicle>::Iterator curr = checkID(_vehicleID_);
	if ((*curr).status()) {
		(*curr).reserve();
		return true;
	}
	return false;
}
bool Inventory::returnVehicle(int _vehicleID_) {
	typename NodeList<Vehicle>::Iterator curr = checkID(_vehicleID_);
	
	if (!(*curr).status()) {  //found and reserved available			
		(*curr).unReserve(); 
		return true;
	}
	return false;
}
NodeList<Vehicle>::Iterator Inventory::checkID(int _vehicleID_) {
	/*Project 6: Refactoring is needed here. You need to reimplement this method in recursive way.*/
	NodeList<Vehicle>::Iterator curr = v_List.begin(); 
	for (curr; curr != v_List.end(); curr++) {
		if ((*curr).getID() == _vehicleID_) {
			return curr;
		}
	}
}
//
//
bool Inventory::saveToFile(string fileName) {
	/*this method prints the list data in a text file (received as a parameter) */
	//pre-conditions: fileName is a valid file name.  something.txt
	ofstream outFile;
	
	outFile.open(fileName);
	if (outFile.fail()) return false;
	outFile << size() << endl;
	NodeList<Vehicle>::Iterator curr = v_List.begin();
	for (curr; curr != v_List.end(); curr++) { // updating the database
		outFile << *curr;
	}

	outFile.close();
	return true;

}


/************** Freind functions to class Inventory ******************/


ofstream& operator<<(ofstream& outfile, const Inventory& objV)
// overleaoding the insertion operator << for the output file stream
{
	NodeList<Vehicle>::Iterator curr = objV.v_List.begin();
	for (curr; curr != objV.v_List.end(); curr++) {
		outfile << *curr;
		outfile << "------------------------------------------\n";
	}
	return outfile;
}
