#include <iostream>
#include <cmath>
using namespace std;

int main() {
	double s;
	cout << "Enter side length: " << endl;
	cin >> s;

	double area = ((3 * pow(3, 0.5)) / 2) * pow(s, 2);
	cout << "Area of the hexagon = " << area << endl;
	return 0;
}