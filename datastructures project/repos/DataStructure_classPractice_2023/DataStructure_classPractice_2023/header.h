#ifndef PERSON_H
#define PERSON_H
#include <iostream>
#include <string>
using namespace std;
class Person {
public:
	//constructors==========================================
	//default cosntructor
	Person();
	//normal constructor
	Person(int _ID, string _fullName, string _email, int _numVehicles);
	//rule of 3
	//copy constructor
	Person(const Person&);
	//assignment overload
	Person& operator=(const Person& rhs);	
	//destructor
	~Person() { delete[] plates; cout << "The Dynamic array has been successfully removed\n"; }
	//methods/functions==========================================
	int getID() { return ID; }
	string getfullName() { return fullName; }
	string getEmail() { return email; }
	void setID(int _ID) { ID = _ID; }
	void setFullName(string _fullName) { fullName = _fullName; }
	void setEmail(string _email) { email = _email; }
	void printOut();
	void readPlates();
	//friends: when a function that is outside of the class needs access to private variables
	// example -> overloading the <<
	friend string toStringPerson(Person);
private:
	int ID;
	string fullName;
	string email;
	string* plates;
	int numVehicles;
};
#endif