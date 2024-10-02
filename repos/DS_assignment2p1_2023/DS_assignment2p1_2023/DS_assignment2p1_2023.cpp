// DS_assignment2p1_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <math.h>
using namespace std;
class Player {
public:
    Player(string _fullName, int _numberOfGoals, int _numberOfAssists, int _numberOfEffectiveTouches, int _runningDistanceKM) {
        fullName = _fullName;
        numberOfGoals = _numberOfGoals;
        numberOfAssists = _numberOfAssists;
        numberOfEffectiveTouches = _numberOfEffectiveTouches;
        runningDistanceKM = _runningDistanceKM;
    }
    void printInfo() {
        cout << endl << fullName << endl;
        cout << numberOfGoals << endl;
        cout << numberOfAssists << endl;
        cout << numberOfEffectiveTouches << endl;
        cout << runningDistanceKM << endl;
    }

    string fullName;
    //my code
     friend bool operator>(const Player& amount1, const Player& amount2) {
         // if nunmGoals1 +numAssists2 = numGoals2 + numAssists2
            // if
         return ((amount1.numberOfGoals+amount1.numberOfAssists > amount2.numberOfGoals+amount2.numberOfAssists) ||
             (amount1.numberOfGoals + amount1.numberOfAssists == amount2.numberOfGoals + amount2.numberOfAssists) && amount1.numberOfAssists > amount2.numberOfAssists
             || (amount1.numberOfEffectiveTouches==amount2.numberOfEffectiveTouches) && (amount1.runningDistanceKM>amount2.runningDistanceKM));
    }
    

private:
    int numberOfGoals;
    int numberOfAssists;
    int numberOfEffectiveTouches;
    int runningDistanceKM;
    
};

int main()
{
    Player player1("Cristiano Ronaldo dos Santos", 4, 7, 32, 17);
    Player player2("Lionel Andrés Messi", 2, 9, 32, 13);
    Player player3("Gareth Frank Bale", 1, 10, 32, 17);
    //binary 'operator' : 'type' does not define this operator or a conversion to a type acceptable to the predefined operator
    if (player1 > player2 && player1 > player3)
        cout << "Player of The game is " << player1.fullName << endl;
    else if (player2 > player1 && player2 > player3)
        cout << "Player of The game is " << player2.fullName << endl;
    else
        cout << "Player of The game is " << player3.fullName << endl;
    return 0;
}
