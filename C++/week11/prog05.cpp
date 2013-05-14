//list

#include <iostream>
#include <list>
#include <string>

using namespace std;

typedef list<string> List;
typedef List::iterator It;		
void print(List &);		
int main() {
	List myList;
	myList.push_back("one");
	myList.push_back("two");
	myList.push_back("three");
	print(myList);
	myList.sort();
	print(myList);
	myList.reverse();
	print(myList);
	
	}		
	
void print(List& Lst){
	cout<< "\n";
	for(It it = Lst.begin(); it != Lst.end(); it++){
		cout<< *it<<endl;
	}
}