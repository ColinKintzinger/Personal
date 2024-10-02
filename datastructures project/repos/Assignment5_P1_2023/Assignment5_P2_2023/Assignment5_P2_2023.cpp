// Assignment5_P2_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include "DLL.h"
#include "impFile.cpp"

int main() {
    Rental rentalSystem;
    rentalSystem.loadVehiclesFromFile("vehicles.txt");

    int choice;
    do {
        //choices
        cout << "\nCar Rental System Menu:\n";
        cout << "1. Print All Vehicles\n";
        cout << "2. Print Available Vehicles\n";
        cout << "3. Print Reserved Vehicles\n";
        cout << "4. Check Availability\n";
        cout << "5. Reserve a Vehicle\n";
        cout << "6. Return a Reserved Vehicle\n";
        cout << "7. Print All Vehicles to File\n";
        cout << "8. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            rentalSystem.printAllVehicles();
            break;
        case 2:
            rentalSystem.printAvailableVehicles();
            break;
        case 3:
            rentalSystem.printReservedVehicles();
            break;
        case 4:
        {
            string plate;
            cout << "Enter the plate number: ";
            cin >> plate;
            if (rentalSystem.checkAvailability(plate)) {
                cout << "Vehicle is available." << endl;
            }
            else {
                cout << "Vehicle is not available." << endl;
            }
        }
        break;
        case 5:
        {
            string plate;
            cout << "Enter the plate number to reserve: ";
            cin >> plate;
            rentalSystem.reserveVehicle(plate);
        }
        break;
        case 6:
        {
            string plate;
            cout << "Enter the plate number to return: ";
            cin >> plate;
            rentalSystem.returnVehicle(plate);
        }
        break;
        case 7:
            rentalSystem.printVehiclesToFile("vehicles_output.txt");
            break;
        case 8:
            cout << "Exiting the program." << endl;
            break;
        default:
            cout << "Invalid choice. Please enter a valid option." << endl;
        }

    } while (choice != 8);

    return 0;
}