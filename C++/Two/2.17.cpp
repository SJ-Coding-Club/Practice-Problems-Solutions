#include <iostream>
#include <cmath>
using namespace std;

int main() {
	double temperature;
	cout << "Enter temperature in Fahrenheit" << endl;
	cin >> temperature;

	double wind_speed;
	cout << "Enter wind speed in miles per hour" << endl;
	cin >> wind_speed;

	double chill_index = 35.74 + (0.6215 * temperature)
		- (35.75 * pow(wind_speed, 0.16)) + (0.4275 * temperature * 
			pow(wind_speed, 0.16));
	cout << "Wind chill index = " << chill_index << endl;
	return 0;
}