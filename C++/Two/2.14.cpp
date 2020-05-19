#include <iostream>
#include <cmath>
using namespace std;

int main() {
	double weight; // lbs
	cout << "Enter weight in lb: " << endl;
	cin >> weight;
	weight *= 0.45359237; // convert to kg

	double height; // in
	cout << "Enter height in in: " << endl;
	cin >> height;
	height *= 0.0254; // convert to meter

	double bmi = weight / pow(height, 2);
	cout << "BMI = " << bmi;
	return 0;
}