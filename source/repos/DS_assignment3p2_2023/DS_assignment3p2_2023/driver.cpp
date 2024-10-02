#include "varList.h"

template <class T> 
VarList<T> InputAdd(VarList<T>);
template <class T> 
VarList<T> InputRemove(VarList<T>);
template<class T>
VarList<T> InputAdd(VarList<T> myList) {// this function allows the concil to ask the user what to add with data validation
	bool checkInput = false;
	do {
		T value;
		cout << "Please input value: ";
		cin >> value;
		checkInput = cin.fail() || myList.check(value) != -1;

		if (checkInput) {
			cout << "try again. Value was either invalid or is already in list." << endl;
		}
		else {
			myList.addValue(value);
		}
		cin.clear();
		cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
	} while (checkInput);
	return myList;
}
template<class T>
VarList<T> InputRemove(VarList<T> myList) {// this function allows the concil to ask the user what to remove with data validation
	bool checkInput = false;
	do {
		T value;
		cout << "please input value: ";
		cin >> value;
		checkInput = cin.fail() || myList.check(value) == -1;

		if (checkInput) {
			cout << "try again, either invalid entry or is already in list." << endl;
		}
		else {
			myList.removeValue(value);
		}
		cin.clear();
		cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
	} while (checkInput);
	return myList;
}
int main() {
	VarList<int> List;
	string Input;
	bool invalidInput = false;
	do {
		cout << "[A/R/Q]:"; 
		cin >> Input;
		invalidInput =!(cin.fail()) && Input != "A" && Input != "a" && Input != "R" && Input != "r" && Input != "Q" && Input !="q";
		if (invalidInput) {
			cout << "Invalid entry, try again." << endl;
			cin.clear();
			cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
		}

		if(Input == "A"||Input=="a") {//when user enters an A sets off function input add
			List = InputAdd(List);
		}
		if (List.getSize() != 0 && Input == "R"||Input=="r") {//when user enters R activates input remove 
			List = InputRemove(List);
		}
		else if (List.getSize() == 0) {//makes sure user cant remove anything from an empty list
			cout << "There is nothing to remove from the list. Try adding somthing." << endl;
		}

		cout << "Your current list: "; List.printList();

	} while (Input != "Q"||Input !="q");//if user enters Q the program will end
}