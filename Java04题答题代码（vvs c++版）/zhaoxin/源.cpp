#include<iostream>
using namespace std;

int isrennian (int year) {
	if (year <= 0) {
		cout << "公元前我们不考虑啦！" << endl;
		return 0;
	}
	else if (year % 4) {
		return 2;
	}
	else return 1;
}

void linxing(int n) {
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i > n / 2 + 1) {
				if ((j == -n / 2 + i) || (j == n + n / 2 - i + 1)) {
					cout << "*";
				}
				else {
					cout << " ";
				}
			}
			else {
				if ((j == n / 2 + 2 - i) || (j == n / 2 + i)) {
					cout << "*";
				}
				else {
					cout << " ";
				}
			}
		}
		cout << endl;
	}
}
int main() {
	linxing(31);
	return 0;
}