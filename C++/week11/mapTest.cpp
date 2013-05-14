//insert, erase,swap,clear, find, count from map class
#include <map>
#include <iostream>


using namespace std;

int main(){
	map<char,int> testMap;
	map<char,int> testMap2;
	map<char,int>::iterator itr;
	
	
	testMap['a'] = 100;
	testMap['b'] = 90;
	testMap['c'] = 80;
	testMap['d'] = 70;
	testMap['e'] = 60;
	testMap['f'] = 50;
	
	
	cout<<"testMap's contents"<<endl;
	
	for(itr = testMap.begin(); itr != testMap.end(); ++itr){
		cout<<itr->first << "- > " << itr->second<<endl;
	}
	//insert method
	pair<map<char,int>::iterator,bool> ret;
	
	cout<<endl<<"After inserting g"<<endl;
	
	testMap.insert(testMap.end(), pair<char,int>('g',40));
	
	for(itr = testMap.begin(); itr != testMap.end(); ++itr){
		cout<<itr->first << "- > " << itr->second<<endl;
	}
	//erase method
	
	cout<<endl<<"After erasing 'a' using testMap.erase('a')"<<endl;
	
	testMap.erase('a');
	
	for(itr = testMap.begin(); itr != testMap.end(); ++itr){
		cout<<itr->first << "- > " << itr->second<<endl;
	}
	
	//swap method
	cout<<endl<<"swap method"<<endl;
	map<char,int>::iterator itr2;
	testMap2['x'] = 343;
	testMap2['y'] = 8;
	testMap2['z'] = 45;
	
	cout<<endl<<"testMap2's contents: "<<endl;
	for(itr2 = testMap2.begin(); itr2 != testMap2.end(); ++itr2){
		cout<<itr2->first << "- > " << itr2->second<<endl;
	}
	
	testMap.swap(testMap2);
	
	
	cout<<endl<<"testMap's contents after swap with testMap2: "<<endl;
	for(itr = testMap.begin(); itr != testMap.end(); ++itr){
		cout<<itr->first << "- > " << itr->second<<endl;
	}
	
	//find method
	cout<<endl<<"The find method"<<endl;
	cout<<"The result of testMap.find('y') ->"<< testMap.find('y')->second << endl;
	
	//count method
	cout<<endl<<"The count method"<<endl;
	cout<<"testMap.count('a') returns: "<<testMap.count('b')<<endl;
	cout<<"testMap2.count('a') returns: "<<testMap2.count('b')<<endl;
	
	


}

	