// 5. Write a C++ program to create a class called Rectangle that has private
// member variables for length and width. Implement member functions to
// calculate the rectangle's area and perimeter.

#include<iostream>
using namespace std;

class Rectangle {
	int l, w;
	
	public:
		void set(int length, int width) {
			l = length;
			w = width;
		}
		
		void area() {
			cout << "Area: " << l * w;
		}
		
		void perimeter() {
			cout << "\nPerimeter: " << 2 * (l + w);
		}
};

int main() {
	int l, w;
	Rectangle obj;
	
	cout << "Enter length & width of the rectangle: ";
	cin >> l >> w;
	
	obj.set(l, w);
	obj.area();
	obj.perimeter();
	
	return 0;
}
