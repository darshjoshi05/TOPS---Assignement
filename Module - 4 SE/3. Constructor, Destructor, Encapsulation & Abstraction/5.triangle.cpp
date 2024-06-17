//5. Write a C++ program to create a class called Triangle that has private
// member variables for the lengths of its three sides. Implement member
// functions to determine if the triangle is equilateral, isosceles, or scalene.

#include<iostream>
using namespace std;

class triangle {
	int s1, s2, s3;
	
	public:
		void get() {
			cout << "Enter 3 sides of the triangle: ";
			cin >> s1 >> s2 >> s3;
		}
		
		void check() {
			if (s1 == s2 && s1 == s3) {
				cout << "Triangle is equilateral.";
			} else if ((s1 == s2 && s1 != s3) || (s2 == s3 && s2 != s1) || (s3 == s1 && s3 != s2)) {
				cout << "Triangle is isosceles.";
			} else {
				cout << "Triangle is scalene.";
			}
		}
};

int main() {
	triangle obj;
	
	obj.get();
	obj.check();
	return 0;
}
