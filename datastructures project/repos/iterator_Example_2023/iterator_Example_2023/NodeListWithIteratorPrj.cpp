//Main File (App)
// NodeListWithIteratorPrj.cpp : This file contains the 'main' function. Program execution begins and ends there.
//



// Simple Test=============

#include <iostream> 
#include <string> //needed for string and to_string()
#include "NodeListClass_H.h"
using namespace std;
string printIntList(const NodeList<int> nodeListObj) {
	//print out functon for testing purposes
	string itemsInListStr = "[";
	if (!nodeListObj.empty()) {
		//nodelistObj must be a valid and non-empty node list that supports iterator

		NodeList<int>::Iterator iter = nodeListObj.begin();
		itemsInListStr = itemsInListStr + to_string(*iter);  //make is string :)
		for (++iter; iter != nodeListObj.end(); ++iter) {
			itemsInListStr = itemsInListStr + ", " + to_string(*iter);
		}
	}
	itemsInListStr.append("]");
	return itemsInListStr;
}
int main() {
	NodeList<int> smartList;
	for (int i = 0; i <= 10; i++) {
		smartList.insertBack(i);
	}
	cout << printIntList(smartList) << endl;
	// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	smartList.insertFront(20);
	cout << printIntList(smartList) << endl;
	// [20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	smartList.insertFront(30);
	cout << printIntList(smartList) << endl;
	// [30, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	smartList.insertFront(40);
	cout << printIntList(smartList) << endl;
	// [40, 30, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	smartList.insertBack(50);
	cout << printIntList(smartList) << endl;
	// [40, 30, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50]
	smartList.eraseBack();
	cout << printIntList(smartList) << endl;
	// [40, 30, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	smartList.eraseFront();
	cout << printIntList(smartList) << endl;
	// [30, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]



	cout << endl;
	cout << "The number of elements in the List: " << endl;
	cout << smartList.size() << endl;
	cout << "First item is: " << *(smartList.begin()) << endl; //second item
	cout << "Second item is: " << *(++smartList.begin()) << endl; //second item
	NodeList<int>::Iterator itrX = smartList.end();
	--itrX; //move the iterator to the last node
	cout << "last value in the list is " << *itrX << endl; // last item

	//deleting the list elements
	NodeList<int>::Iterator currentItr = smartList.begin();
	while (currentItr != smartList.end()) {
		smartList.eraseFront();
		currentItr = smartList.begin(); //fixing the pointer
		cout << printIntList(smartList) << endl;
	}

	//to give more freedon to the application level developers, errors are handled on the app level.
	try {
		if (smartList.empty())
			throw string("Cannot delete an item from an empty list!.");
		smartList.eraseFront();
	}
	catch (string e) {
		cout << "Exception: " << e << endl;
	}
	cout << printIntList(smartList) << endl;
	return 0;
}