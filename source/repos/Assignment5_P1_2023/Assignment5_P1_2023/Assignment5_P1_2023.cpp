// Assignment5_P1_2023.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<stack>
#include<fstream>
#include<string>
#include<sstream>
using namespace std; 

int main()
{
	stack<string> lineList;
	stack<string> lineList2;
	
	ifstream file;
	file.open("text.txt");
	string line;

	if (file.is_open()) {
		while (getline(file, line)) {
			lineList.push(line);
			cout << lineList.top() << endl;
		}
		file.close();
	}

	string word;
	int count = 1;
	string tmp;
	string tmp2;
	while(!lineList.empty()){
		stringstream s(lineList.top());
		while (s >> word) {
			if (count % 2 == 1) {
				for (int i = word.size() - 1; i >= 0; --i)
					tmp += word[i];
				word = tmp;
				tmp.clear();
			}
			//cout << word << endl;
			count++;
			tmp2 += word+" ";
		}
		
		lineList2.push(tmp2);
		tmp2.clear();
		cout << lineList2.top() << endl;
		count = 1;
		lineList.pop();
	}
}
