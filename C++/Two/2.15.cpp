#include<iostream>
#include <cmath>
using namespace std;

int main() {
	double x1, y1;
	cout << "Enter x1 and y1 " << endl;
	cin >> x1;
	cin >> y1;

	double x2, y2;
	cout << "Enter x2 and y2 " << endl;
	cin >> x2;
	cin >> y2;

	double distance = pow(pow(x2 - x1, 2) + pow(y2 - y1, 2), 0.5);
	cout << "The distance between the two points is " << distance << endl;
	return 0;
}