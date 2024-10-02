#include "header.h"



Person::Person() { //default
	ID = 0;
	fullName = "no name";
	email = "no email";
	numVehicles = 0;
	//already declared
	plates = new string[0];
}
Person::Person(int _ID, string _fullName, string _email, int _numVehicles) {
	ID = _ID;
	fullName = _fullName;
	email = _email;
	numVehicles = _numVehicles;
	plates = new string[numVehicles];
}
Person::Person(const Person& org) {
	ID = org.ID;
	fullName = org.fullName;
	email = org.email;
	numVehicles = org.numVehicles;
	plates = new string[numVehicles];
	for (int i = 0; i < numVehicles; ++i)
		plates[i] = org.plates[i];
}
//assignment overloading
Person&Person::operator=(const Person& rhs) {
	if (this != &rhs) {
		ID = rhs.ID;
		fullName = rhs.fullName;
		email = rhs.email;
		numVehicles = rhs.numVehicles;
		delete[] plates;
		plates = new string[numVehicles];
		for (int i = 0; i < numVehicles; ++i)
			plates[i] = rhs.plates[i];
	}
	return *this;
}
void Person::printOut() {
	cout << "Person [ID: " << getID() << ", " << "fullName: " << getfullName() << ", " << "email: "
		<< getEmail() << ", number of cars: " << numVehicles << ": {";
	if (numVehicles > 0)
	{
		cout << plates[0];
		for (int i = 1; i < numVehicles; ++i)
			cout << ", " << plates[i];
	}
	cout << "}]" << endl;
}
void Person::readPlates() {
	if (numVehicles > 0) {
		for (int i = 0; i < numVehicles; ++i) {
			cout << "Plate[" << i << "]-> ";
			cin >> plates[i];
		}
	}
	else
		cout << "This person has no registered vehicles" << endl;
}
string toStringPerson(Person person) {
	string str = "";
	str += person.fullName;
	str += ", " + person.email;
	str += ", " + to_string(person.numVehicles);
	str = "[" + to_string(person.ID) + ", " + str +", " + to_string(person.numVehicles)+ "{";
	for (int i = 0; i < person.numVehicles; ++i) {
		str = str + person.plates[i]+ ", ";
	}
	str = str + "}]";
	return str;
}