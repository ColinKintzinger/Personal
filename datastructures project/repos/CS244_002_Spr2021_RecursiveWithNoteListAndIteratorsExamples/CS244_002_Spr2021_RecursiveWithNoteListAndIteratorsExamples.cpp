// CS244_002_Spr2021_RecursiveWithNoteListAndIteratorsExamples.cpp : This file contains the 'main' function. Program execution begins and ends there.
//Dr. Alnaeli
//This project shows some examples of recursively traversing (scanning) a List (NodeList) that is supported with Iterators.


#include <iostream>
#include <string>
#include <ctime>
#include "NodeList.h"
using namespace std; /*used this for simplicity. In real life, use the std:: prefix*/
/*****Customer Class ***************************************************************/
class Customer {
public:
	Customer() {}
	Customer(int _customerID_, double _currentBalance_) {
		 customerID= _customerID_;
		 currentBalance = _currentBalance_;
	}
	int getcustomerID() {return customerID;	}
	double getcurrentBalance() { return currentBalance; }
private:
    int customerID;
    double currentBalance;
};
/************************************************************************************/
/*******CustomerList class **********************************************************/
class CustomerList {
public:
	CustomerList() {}
	bool addNewCustomer(Customer cust) {
		/*inserting a customer record to the back of the list*/
		try {
			customers.insertBack(cust);
			++registredCustomers;
			return true;
		}
		catch (...) { /*catch: return false if something goes wrong*/
			return false;
		}
	}// end of push_back
	void printCustomerIDsRecursively(NodeList<Customer>::Iterator thisPosition);
	void printlowBalances_lessThan100_Recursively(NodeList<Customer>::Iterator thisPosition);
	int numberOfBalances_lessThan100_Recursively(NodeList<Customer>::Iterator thisPosition);

	bool is_Id_Found_Recursively(int custID, NodeList<Customer>::Iterator thisPosition);
/*	typename NodeList<Customer>::Iterator checkID(string _customerFullName_);*/

	/*The following methods will be used to get the head and the trailer of the list*/
	typename NodeList<Customer>::Iterator beginIter() { return  customers.begin(); }
	typename NodeList<Customer>::Iterator endIter() { return  customers.end(); }
	int size() { return registredCustomers; }  // inline implementation

private:
	int registredCustomers;
	NodeList<Customer> customers;
};
void CustomerList::printCustomerIDsRecursively(NodeList<Customer>::Iterator thisPosition) {
	if (thisPosition != customers.end()) {
			cout << " " << (*thisPosition).getcustomerID() << endl;
		printCustomerIDsRecursively(++thisPosition);
	}
}

void CustomerList::printlowBalances_lessThan100_Recursively(NodeList<Customer>::Iterator thisPosition) {
	/*print balances that are less than 100*/
	if (thisPosition != customers.end()) {
		if((*thisPosition).getcurrentBalance()<100)
			cout << " " << (*thisPosition).getcurrentBalance() << endl;
		printlowBalances_lessThan100_Recursively(++thisPosition);
	}
}

int CustomerList::numberOfBalances_lessThan100_Recursively(NodeList<Customer>::Iterator thisPosition) {
	/*print balances that are less than 100*/
	if (thisPosition != customers.end()) {
		if ((*thisPosition).getcurrentBalance() < 100)
			return 1 + numberOfBalances_lessThan100_Recursively(++thisPosition);
		else
			return 0 + numberOfBalances_lessThan100_Recursively(++thisPosition);
	}
	else
		return 0;
}

bool CustomerList::is_Id_Found_Recursively(int custID, NodeList<Customer>::Iterator thisPosition) {
//bool Yes = false;
	if (thisPosition != customers.end()) {
		if ((*thisPosition).getcustomerID() == custID)
		{
			/* cout << (*thisPosition).getcustomerID() << endl; */
			return true;
		}
		else
		{
			return is_Id_Found_Recursively(custID, ++thisPosition);
		}
	}
	else
		return false;
/*++++*/

//return Yes;
}
/*****main function *********************************************/
int main()
{
	srand(time(nullptr));
	CustomerList PizzaRomana;
	/*generate random records (ID, Balance)*/
	for (int i = 0; i < 20; ++i) {
		/*random id between 10000 and 20000*/
		int id = (rand() % 10001) + 10000;
		/*random balance between 0.0 and 1000.99*/
		double balance = (rand() % 1001) + ((rand() % 100) / 100.0); 		
		PizzaRomana.addNewCustomer(Customer(id, balance));
	}
	

	cout << "Customer Ids:\n";
	NodeList<Customer>::Iterator current = PizzaRomana.beginIter();
	PizzaRomana.printCustomerIDsRecursively(current);

	cout << "Low balances (less than 100):\n";
	current = PizzaRomana.beginIter();
	PizzaRomana.printlowBalances_lessThan100_Recursively(current);
	
	cout << "Number of the Low balances (less than 100):\n";
	current = PizzaRomana.beginIter();
	cout<<PizzaRomana.numberOfBalances_lessThan100_Recursively(current)<<endl;

	/*searching...*/
	int key = 5555;
	PizzaRomana.addNewCustomer(Customer(5555, 1000000.0));
	current = PizzaRomana.beginIter();
	if (PizzaRomana.is_Id_Found_Recursively(key, current) == true )
		cout << "The Key " << key << " is found" << endl;
	else
		cout << "the Key " << key << " is Not found" << endl;

	current = PizzaRomana.beginIter();
	key = 66666;
	if (PizzaRomana.is_Id_Found_Recursively(key, current) == true)
		cout << "The Key " << key << " is found" << endl;
	else
		cout << "the Key " << key << " is Not found" << endl;
    return 0;
}

