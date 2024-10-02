#include "header.h"

//Function that allows the data from the file to be printed out in the window
void printingList(player* info) {
	for (int i = 0; i < 4; ++i)
		cout << "Name  :" << info[i].fullName << "\nteam  :" << info[i].team << "\nRating: " << info[i].rating << "\nJersey: number: " << info[i].jNumber << "\nGoals : " << info[i].goals << "\n----------------------------------" << endl;
}
//Function that sorts the players by number of goals score from greatest to least
void sortingplayers(player* info) {
	for (int i = 0; i < 4; ++i) {

		for (int j = i + 1; j < 4; ++j)

			if (info[j].goals > info[i].goals) {
				player tmpRecord = info[i];
				info[i] = info[j];
				info[j] = tmpRecord;
			}
	}
}
