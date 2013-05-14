//
#include <map>
#include <string>
#include <iostream>

using namespace std;

int main() {
	map<string, int> grade;		//
	
	grade["John"] = 95;
	grade["Mary"] = 85;
	grade["Susan"] = 75;
	grade["Kurt"] = 65;
	
	cout << "Susan's grade is "<< grade["Susan"] << endl;
	cout << "Jonh's grade is "<< grade["Susan"] << endl;
	
	map<string,int>::iterator itr;
	itr = grade.find("John");
	cout << "John's grade is: "<< itr->second<<endl;
	
	itr = grade.begin();
	
	cout<<itr->first << "s grade is " << itr->second<<endl;
	
	for(itr = grade.begin(); itr != grade.end(); ++itr) {
		cout<<itr->first << "s grade is " << itr->second<<endl;
	}
	}
	