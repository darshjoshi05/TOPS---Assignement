// 6. Write a C++ program to implement a class called Employee that has
// private member variables for name, employee ID, and salary. Include
// member functions to calculate and set salary based on employee
// performance. Using of constructor

#include<iostream>
using namespace std;

class employee {
	string name;
	int id, salary, perf;
	
	public:
		employee() {
			cout << "Enter your name, id & salary: ";
			cin >> name >> id >> salary;
			
			cout << "\n1. Above Average\n2. Average\n3. Below Average\nEnter your performance: ";
			cin >> perf;
			
			if (perf == 1) {
				cout << "Your revised salary is " << salary * 1.5;
			} else if (perf == 2) {
				cout << "Your revised salary is " << salary;
			} else {
				cout << "Your revised salary is " << salary * 0.5;
			}
		}
};

int main() {
	employee obj;
	return 0;
}
