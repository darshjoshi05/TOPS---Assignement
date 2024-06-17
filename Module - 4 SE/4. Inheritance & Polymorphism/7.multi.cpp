// 7. Write a C++ Program to illustrates the use of Constructors in multilevel
// inheritance

#include<iostream>
using namespace std;

class one {
	public:
		int one;
		
		void getOne() {
			cout << "Enter value of Number 1: ";
			cin >> one;
		}
};

class two : public one {
	public:
		int two;
		
		void getTwo() {
			getOne();
			cout << "Enter value of Number 2: ";
			cin >> two;
		}
};

class three : public two {
	public:
		int threeN;
		
		three() {
			getTwo();
			cout << "Enter value of Number 3: ";
			cin >> threeN;
			cout << "Number 1: " << one << "\nNumber 2: " << two << "\nNumber 3: " << threeN;
		}
};

int main() {
	three obj;
	return 0;
}
