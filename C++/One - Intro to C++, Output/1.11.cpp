#include <iostream>
using namespace std;

int main() {
	// one birth every 7 s
	// one death every 13 s
	// one new immigrant every 13 s
	// find population after each year
	int current_population = 312032486;
	// seconds in a year
	int secs_per_year = 365 * 24 * 60 * 60;
	int births = secs_per_year / 7;
	int deaths = secs_per_year / 13;
	int immigrants = secs_per_year / 45;
	current_population = (current_population + births + immigrants - deaths);
	cout << "1 year  = " << current_population << endl;
	current_population = (current_population + births + immigrants - deaths);
	cout << "2 years = " << current_population << endl;
	current_population = (current_population + births + immigrants - deaths);
	cout << "3 years = " << current_population << endl;
	current_population = (current_population + births + immigrants - deaths);
	cout << "4 years = " << current_population << endl;
	current_population = (current_population + births + immigrants - deaths);
	cout << "5 years = " << current_population << endl;

	return 0;
}