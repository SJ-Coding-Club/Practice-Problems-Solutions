#include <iostream>
using namespace std;

int main() {
	float side = 9.2;
	float area = 1.732 * (side * side) / 4.0;
	cout << "Area = " << area << endl;
	float perimeter = 3.0 * side;
	cout << "Perimeter = " << perimeter << endl;
	return 0;
}