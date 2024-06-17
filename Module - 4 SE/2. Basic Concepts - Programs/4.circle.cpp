// 4. Write a C++ program to implement a class called Circle that has private
// member variables for radius. Include member functions to calculate the
// circle's area and circumference.

#include<iostream>
using namespace std;

class Circle {
	int r;
	
	public:
		void setRadius(int radius) {
			r = radius;
		}
		
		void area() {
			cout << "Area: " << 3.14 * r * r;
		}
		
		void circum() {
			cout << "\nCircumference: " << 2 * 3.14 * r;
		}
};

int main() {
	int r;
	Circle obj;
	
	cout << "Enter radius of the circle: ";
	cin >> r;
	
	obj.setRadius(r);
	obj.area();
	obj.circum();
	
	return 0;
}
