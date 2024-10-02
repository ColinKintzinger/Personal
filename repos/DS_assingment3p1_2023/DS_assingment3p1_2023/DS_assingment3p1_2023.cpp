// DS_assingment3p1_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;
class drone {
public:
	string droneName;
	drone() {
		droneName = "Unknown drone";
		licensed = true;
		payload = 1.5; 
	}
	bool getLicensed() {return licensed;}
	double getPayload() { return payload;}
	virtual void printPayload() = 0;

private:
	bool licensed;
	double payload;
};
class ScientificDrone : public drone {
public:
	ScientificDrone() {
		sensorsWeight = 3.6;
		batteryWeight = 1.6;
	}
	void printPayload() {		
		cout << "Drone information" << endl << "---------------------" << endl;
		cout << "Name:" << droneName << endl;
		if (this->getLicensed() == 1) {
			cout << "licensed:True"<<endl;
		}
		else {
			cout << "Licensed:False" << endl;
		}
		cout << "Payload:" << getPayload()<<endl;
		cout << "Sensore weight:" << sensorsWeight << endl;
		cout << "Battery weight:" << batteryWeight << endl;
	}
	double getsensorsWeight() { return sensorsWeight; }
	double getbatteryWeight() { return batteryWeight; }
private:
	double sensorsWeight;
	double batteryWeight;
};
int main()
{
	ScientificDrone dr;
	dr.printPayload();
}

