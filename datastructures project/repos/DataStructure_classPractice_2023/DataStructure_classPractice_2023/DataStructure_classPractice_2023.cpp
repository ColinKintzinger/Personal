// DataStructure_classPractice_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "header.h"

int main() {
	Person p2(1, "colin kintzinger", "colink@email.com", 2);
	p2.readPlates();
	//cout << toStringPerson(p2) << endl;
	p2.printOut();
	{
		Person p3(500, "chris chris", "chris123@gmail.com", 1);
		p3.readPlates();
		p3.printOut();

		p3 = p2;
		p3.printOut();
	}
	cout << "now testing the original data";
	p2.printOut();
	
	return 0;
}

