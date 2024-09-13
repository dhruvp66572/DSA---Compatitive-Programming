#include <iostream>
using namespace std;

void printArrowPattern(int n) {
    // Iterate over each row
    for (int i = 0; i < n; i++) {
        // Iterate over each column
        for (int j = 0; j < n; j++) {
            // Print stars for the border and the diagonals
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                cout << "* ";
            } else {
                cout << "  ";
            }
        }
        cout << endl;
    }
}

int main() {
    int n;
    cout << "Enter the size of the pattern: ";
    cin >> n;
    printArrowPattern(n);
    return 0;
}
