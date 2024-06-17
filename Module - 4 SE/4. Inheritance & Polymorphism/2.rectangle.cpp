// 2. Write a C++ Program to find Area of Rectangle using inheritance

#include<iostream>
using namespace std;

class variables {
	protected:
		int l, b, ans;
		
		void get() {
			cout << "Enter length & breadth: ";
			cin >> l >> b;
		}
};

class area: public variables {
	public: 
		void calculate() {
			get();
			ans = l * b;
			cout << "Area of rectangle: " << ans;
		}
		
};

int main () {
	area obj;
	obj.calculate();
	return 0;
}
