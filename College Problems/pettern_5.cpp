#include <iostream>
using namespace std;

void printPattern(int n) {
    // Top part
    for (int i = 0; i < n; i++) {
        // Print increasing numbers
        for (int j = 1; j <= n - i; j++) {
            cout << j;
        }
        // Print asterisks
        for (int j = 0; j < 2 * i; j++) {
            cout << "*";
        }
        // Print decreasing numbers
        for (int j = n - i; j >= 1; j--) {
            cout << j;
        }
        cout << endl;
    }
    
    // Bottom part (mirror image of the top part)
    for (int i = n - 1; i >= 0; i--) {
        // Print increasing numbers
        for (int j = 1; j <= n - i; j++) {
            cout << j;
        }
        // Print asterisks
        for (int j = 0; j < 2 * i; j++) {
            cout << "*";
        }
        // Print decreasing numbers
        for (int j = n - i; j >= 1; j--) {
            cout << j;
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
