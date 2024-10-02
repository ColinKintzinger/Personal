#include "Header.h"
void fillArray(int* a, int len) {
	srand(time(nullptr));
	for (int i = 0; i < len; ++i)
		a[i] = rand() % 1001;
}
void sortArray(int* a, int len) {
	for (int i = 0; i < len; ++i)
		for (int j = i + 1; j < len; ++j)
			if (a[j] < a[i]) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
}
void printArray(int* a, int len) {
	for (int i = 0; i < len; ++i)
		cout << a[i] << endl;
}
bool printArrayToFile(int* a, int len) {
	ofstream outFile;
	outFile.open("sortedIntegers.txt");
	if (outFile.fail()) exit(1);
	for (int i = 0; i < len; ++i) {
		outFile << a[i] << endl;
	}
	outFile.close();
	return true;
}