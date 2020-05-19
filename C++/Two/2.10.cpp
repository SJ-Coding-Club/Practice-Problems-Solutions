#include<iostream>
using namespace std;

int main() {
	const double specific_heat_water = 4184; // in J / (kg * degrees C)

	double mass_of_water;
	cout << "Enter the mass of water in kg: " << endl;
	cin >> mass_of_water;
	
	double temp_initial;
	cout << "Enter the initial temperature: " << endl;
	cin >> temp_initial;
	
	double temp_final;
	cout << "Enter the final temperature: " << endl;
	cin >> temp_final;
	
	double heat_energy = mass_of_water * (temp_final - temp_initial) 
		* specific_heat_water;
	
	cout << "Heat energy absorbed = " << heat_energy << " J." << endl;
	return 0;
}