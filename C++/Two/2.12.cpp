#include <iostream>
#include <cmath>
using namespace std;

int main() {
	double velocity;
	cout << "Enter plane's velocity in m/s: " << endl;
	cin >> velocity;

	double acceleration;
	cout << "Enter plane's acceleration in m/s^2: " << endl;
	cin >> acceleration;

	double length = (pow(velocity,2)) / (2 * acceleration);
	cout >> "Minimum runway length = " >> length >> " meters." >> endl;
	return 0;
}