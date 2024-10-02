#include "battleship.h"
#include <iostream>
int main() {
	Fleet fl;
	Location loc;
	fl.deployFleet();
	char check;
	while (fl.operational()) {
		cout << "would you like to print the fleet [Y/N]"; cin >> check;
		if (check == 'y' || check == 'Y') {
			fl.printFleet(); 
			loc.fire();
			if (fl.isHitNSink(loc) == 1) {
				loc.print();
				cout << "hit" << endl;
			}
			else if (fl.isHitNSink(loc) == 0) {
				loc.print();
				cout << "miss" << endl;
			} 
		} 
		else {
			loc.fire();
			if (fl.isHitNSink(loc) == 1) {
				loc.print();
				cout << "hit"<<endl; 
			}
			else if (fl.isHitNSink(loc) == 0) {
				loc.print();
				cout << "miss"<<endl; 
			}
		}
	}
}