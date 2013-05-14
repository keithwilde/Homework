//

#include <iostream>
#include <string>

using namespace std;

int main() {
	
	
	string str("Theese are a group of words");
	
	cout << "the string str is: " << str << endl<<endl;
	
	cout<<"Size method"<<endl;
	cout<<"str.size() ="<<str.size()<<endl;
	
	cout<<"Length method"<<endl;
	cout<<"str.length() = "<<str.length()<<endl<<endl;
	
	cout<<"Replace method"<<endl;
	str.replace(8,13," ");
	cout<<"str.replace(8,13, " ") results in:  " << str<<endl<<endl;
	
	cout<<"Erase method"<<endl;
	str.erase(str.begin()+2, str.end()-3);
	cout<<"str.erase(str.begin()+2, str.end()-3) results in: "<<str<<endl<<endl;
	
	
	string str2("This is a sentence of words");
	cout<<"str2 is : "<<str2<<endl<<endl;
	cout<<"find method"<<endl;
	cout<<"Using str2.find(\"sentence\") returns: "<<str2.find("sentence")<<endl;
	
	cout<<endl<<"substr method"<<endl;
	cout<<"After str2.substr(10)"<<endl;
	str2 = str2.substr(10);
	cout<<str2<<endl;
	
	cout<<"compare method"<<endl;
	
	cout<<"str2.compare(0,8 , \"sentence\") returns: "<<str2.compare(0,8, "sentence")<<" meaming there is a match"<<endl;
	cout<<"str2.compare(0,5) returns: "<<str2.compare(0,8, "the")<<" Meaning there is no match"<<endl;
	
}

