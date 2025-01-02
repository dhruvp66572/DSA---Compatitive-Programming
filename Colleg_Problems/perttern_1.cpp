#include <iostream>
using namespace std;

void printPattern(int n) {
    for (int i = 0; i < n; i++) {
        // Print increasing characters
        for (int j = 0; j < n - i; j++) {
            cout << char('A' + j);
        }
        
        // Print spaces
        for (int j = 0; j < 2 * i; j++) {
            cout << ' ';
        }

        // Print decreasing characters
        for (int j = n - i - 1; j >= 0; j--) {
            cout << char('A' + j);
        }
        
        cout << endl;
    }
}

int main() {
    int n;
    cout << "Enter number of rows: ";
    cin >> n;
    printPattern(n);
    return 0;
}
