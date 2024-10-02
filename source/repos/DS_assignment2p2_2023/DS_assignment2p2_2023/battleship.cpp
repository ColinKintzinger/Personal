#include "battleship.h"
#include <iostream>
#include <ctime>
#include<string>
#include<limits>
using namespace std;

//this is a friend function to Location class.
bool compare(const Location& loc1, const Location& loc2) {
    return (loc1 == loc2);
    /*nitoce that == operator is overloaded for the Location class*/

}
//overloding the << operator to teach the compiler how to print a ship info using cout
ostream& operator<<(ostream& os, const Ship& sh)
{
    string status;
    if (!sh.sunk)
        status = " up ";
    else
        status = " sunk ";
    sh.loc.print();

    os << "->" << status;
    return os;
}

//--------Location implementation-----------------------------------------------------------------------//
Location::Location() {
	coordinates = new int[2];
	coordinates[0] = -1;
	coordinates[1] = -1;
}
Location::Location(int x,int y) {
	coordinates = new int[2];
	coordinates[0] = x;
	coordinates[1] = y;
}
void Location::print() const {
	cout << "[" << coordinates[0] << "," << coordinates[1] << "]";
}

void Location::pick() {
	srand(time(nullptr)+ rand()%1000);

	coordinates[0] = 1+rand()%6;
	coordinates[1] = 1+rand()%6;
}
void Location::fire() {//needs data validation
	int x, y;
	cout << "x cord-->"<<endl; cin >> x;
	while (1) {
		if (cin.fail()|| x<1||x>6 ) {//checks to make sure the input is a integer and if it is between 1-6
			cin.clear();//clears the input to make room for new one
			cin.ignore(numeric_limits<streamsize>::max(), '\n');//used to ignore the rest of the line and prevent an infinite loop
			cout << "please enter a integer between 1-6"<<endl;
			cout << "x cord-->"; cin >> x;//input again
		}
		if (!cin.fail()&& 1<= x&& x<= 6 ) {//if the check is good then it breaks the loop
			coordinates[0] = x;
			break;
		}
	}
	cout << "y cord-->"; cin >> y;
	while (1) {
		if (cin.fail()||y<1||y>6) {//checks to make sure the input is a integer and if it is between 1-6
			cin.clear();//clears the input to make room for new one
			cin.ignore(numeric_limits<streamsize>::max(), '\n');//used to ignore the rest of the line and prevent an infinite loop
			cout << "please enter a integer between 1-6"<<endl;
			cout << "y cord-->"; cin >> y;//input try again
		}
		if (!cin.fail()&& 1<=y && y<=6) {//if the check is good then it breaks the loop
			coordinates[1] = y;
			cout << y;
			break;

		}
	}	
}
Location::Location(const Location& org) {//copy constructor
	coordinates = new int[2];
	coordinates[0] = org.coordinates[0];
	coordinates[1] = org.coordinates[1];
}
Location& Location::operator=(const Location& rhs){//assignmen over loading
	if (this != &rhs) {
		coordinates[0] = rhs.coordinates[0];
		coordinates[1] = rhs.coordinates[1];
	}
	return *this;
}

Location::~Location(){//deconstructor
	delete[] coordinates;
}


//--------Ship implementation------------------------------------------------//
Ship::Ship(){//default constructor 
	sunk = false;
}
bool Ship::match(const Location& loc_) const{
	return loc==loc_;
}
void Ship::sink(){
	sunk = true;
}
void Ship::setLocation(const Location& _loc){
	loc = _loc;
}

//--------Fleet implementation ------------------//
void Fleet::deployFleet(){
	for (int i = 0; i < FLEET_SIZE; ++i) {
		
		Location location;
		location.pick();
		while (check(location)!=-1) {
			location.pick();
			
		}
		ships[i].setLocation(location); 
	}
}
bool Fleet::operational() const{
	for (int i = 0; i < FLEET_SIZE; ++i) {
		if (!ships[i].isSunk()) {
			return true;
		}
	}
	return false;
}
int Fleet::isHitNSink(const Location& loc){
	for (int i = 0; i < FLEET_SIZE; ++i) {
		if (ships[i].match(loc)) {
			if (ships[i].isSunk()) {
				return 2;
			}
			ships[i].sink();
			return 1;
		}	
	}
	return 0;
}
Ship* Fleet::getShipList()
{
	return ships;
}
int Fleet::getFleetSize()
{
	return FLEET_SIZE;
}
int Fleet::check(const Location& location) const{
	for (int i = 0; i < FLEET_SIZE; ++i) {
		if (ships[i].match(location)) {
			return i;
	}
	}
	return -1;
}
void Fleet::printFleet() const{
	for (int i = 0; i < FLEET_SIZE; ++i) {
		cout << ships[i]; 
	}
}
