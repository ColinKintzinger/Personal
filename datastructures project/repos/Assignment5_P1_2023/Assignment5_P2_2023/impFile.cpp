#include "DLL.h"


class Vehicle {
public:
    string plateNumber;
    string model;
    bool reserved;

    Vehicle(const string& plate, const string& mdl) : plateNumber(plate), model(mdl), reserved(false) {}
};

class Node {
public:
    Vehicle vehicle;
    Node* next;
    Node* prev;

    Node(const Vehicle& v) : vehicle(v), next(nullptr), prev(nullptr) {}
};


class Rental {
private:
    Node* head; // head of the doubly linked list
    Node* tail; // tail of the doubly linked list

public:
    Rental() : head(nullptr), tail(nullptr) {}

    // gets info from the file
    void loadVehiclesFromFile(const string& filename) {
        ifstream file(filename);
        if (file.is_open()) {
            string plate, model;
            while (file >> plate >> model) {
                Vehicle newVehicle(plate, model);
                addVehicle(newVehicle);
            }
            file.close();
        }
    }

    // prints all registered vehicles
    void printAllVehicles() const {
        cout << "All Registered Vehicles:" << endl;
        printVehicleList(head);
    }

    // shows available vehicles
    void printAvailableVehicles() const {
        cout << "Available Vehicles:" << endl;
        printVehicleList(head, false);
    }

    // shows reserved vehicles
    void printReservedVehicles() const {
        cout << "Reserved Vehicles:" << endl;
        printVehicleList(head, true);
    }

    // checks availability
    bool checkAvailability(const string& plateNumber) const {
        Node* current = findVehicle(plateNumber);
        return (current && !current->vehicle.reserved);
    }

    // reserves a vehicle through ID
    void reserveVehicle(const string& plateNumber) {
        Node* current = findVehicle(plateNumber);
        if (current && !current->vehicle.reserved) {
            current->vehicle.reserved = true;
            cout << "Vehicle reserved successfully." << endl;
            updateFile();
        }
        else {
            cout << "Vehicle not available for reservation." << endl;
        }
    }

    // unreserves vehicle
    void returnVehicle(const string& plateNumber) {
        Node* current = findVehicle(plateNumber);
        if (current && current->vehicle.reserved) {
            current->vehicle.reserved = false;
            cout << "Vehicle returned successfully." << endl;
            updateFile();
        }
        else {
            cout << "Invalid return operation. Vehicle not reserved." << endl;
        }
    }

    // prints all vehicles to txt file
    void printVehiclesToFile(const string& filename) const {
        ofstream file(filename);
        if (file.is_open()) {
            writeVehicleListToFile(head, file);
            file.close();
            cout << "Vehicle information written to file successfully." << endl;
        }
        else {
            cout << "Unable to open file for writing." << endl;
        }
    }

   
    ~Rental() {
        while (head) {
            Node* temp = head;
            head = head->next;
            delete temp;
        }
    }

private:
    // add new vehicle
    void addVehicle(const Vehicle& vehicle) {
        Node* newNode = new Node(vehicle);
        if (!head) {
            head = tail = newNode;
        }
        else {
            newNode->prev = tail;
            tail->next = newNode;
            tail = newNode;
        }
    }

    // find vehicle
    Node* findVehicle(const string& plateNumber) const {
        Node* current = head;
        while (current) {
            if (current->vehicle.plateNumber == plateNumber) {
                return current;
            }
            current = current->next;
        }
        return nullptr;
    }

    // prints all vehicles no matter status
    void printVehicleList(Node* start, bool reservedOnly = false) const {
        Node* current = start;
        while (current) {
            if (!reservedOnly || (reservedOnly && current->vehicle.reserved)) {
                cout << "Plate: " << current->vehicle.plateNumber << ", Model: " << current->vehicle.model;
                if (current->vehicle.reserved) {
                    cout << " (Reserved)";
                }
                cout << endl;
            }
            current = current->next;
        }
    }

    
    void writeVehicleListToFile(Node* start, ofstream& file) const {
        Node* current = start;
        while (current) {
            file << current->vehicle.plateNumber << " " << current->vehicle.model << endl;
            current = current->next;
        }
    }

    // update vehicle info
    void updateFile() const {
        printVehiclesToFile("vehicles.txt");
    }
};