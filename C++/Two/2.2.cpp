#include <iostream>
using namespace std;

int main() {
	const double PI = 3.14159;

	double radius;
	cout << "Enter radius: " << endl;
	cin >> radius;

	double length;
	cout << "Enter length: " << endl;
	cin >> length;

	double area = radius * radius * PI;
	cout << "Area = " << area << endl;
	double volume = area * length;
	cout << "Volume = " << volume << endl;

	return 0;
}