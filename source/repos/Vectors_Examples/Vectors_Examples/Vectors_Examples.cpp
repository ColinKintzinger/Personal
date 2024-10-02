// Vectors_Examples.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<vector>
#include<ctime>
#include<algorithm>
using namespace std;
void printVectors(vector<int> v) {
	/*for (int i = 0; i < v.size(); ++i)
		 cout << v[i] << " " << endl;*/
	vector<int>::iterator itr;
	for (itr = v.begin(); itr != v.end(); ++itr)
		cout << *itr  << " " << endl;	
}

int main(){
	srand(time(nullptr));
	vector<int> v;
	for (int c=0; c <= 10; ++c)
		v.push_back(rand()%1001);

	sort(v.begin(), v.end());

	printVectors(v);
	cout << *(v.begin())<<endl;

}
