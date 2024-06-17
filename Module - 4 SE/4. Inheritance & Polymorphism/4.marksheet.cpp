// 4. Write a C++ Program display Student Mark sheet using Multiple inheritance

#include<iostream>
using namespace std;

class details {
	protected:
		int id;
		char name[50];
	
		
		void get() {
			cout << "Enter your ID & Name: ";
			cin >> id >> name;
		}
};

class marks {
	protected:
			int maths, physics, philosophy, total, percent;

			void calculate() {
				cout << "Enter marks of maths, physics & philosophy(/100): ";
				cin >> maths >> physics >> philosophy;
				total = maths + physics + philosophy;
				percent = total * 100 / 300;
			}
};

class marksheet: public details, public marks {
	public:
		void display() {
			get();
			calculate();
			cout << "\nName: " << name << "\nID: " << id;
			cout << "\nTotal: " << total << "\nPercentage: " << percent;
		}		
};

int main() {
	marksheet obj;
	obj.display();
	return 0;
}

