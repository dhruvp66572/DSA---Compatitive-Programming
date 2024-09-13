#include <iostream>
using namespace std;

// Function to print Pascal's Triangle
void printPascalsTriangle(int n) {
    for (int line = 0; line < n; line++) {
        int value = 1;  // The first value in a line is always 1
        for (int i = 0; i <= line; i++) {
            cout << value << " ";
            value = value * (line - i) / (i + 1);
        }
        cout << endl;
    }
}

int main() {
    int n;
    cout << "Enter number of rows: ";
    cin >> n;
    printPascalsTriangle(n);
    return 0;
}
