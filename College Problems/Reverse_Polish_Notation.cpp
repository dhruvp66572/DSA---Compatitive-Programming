#include <iostream>
#include <stack>
#include <string>

using namespace std;

// Function to get precedence of operators
int precedence(char op)
{
    if (op == '+' || op == '-')
    {
        return 1;
    }
    if (op == '*' || op == '/')
    {
        return 2;
    }
    if (op == '^')
    {
        return 3;
    }
    return 0;
}

// Function to convert infix expression to postfix (RPN)
string infixToPostfix(string expression)
{
    stack<char> operators; // Stack to store operators
    string output;         // String to store the RPN expression

    for (char ch : expression)
    {
        while (!operators.empty() && precedence(operators.top()) >= precedence(ch))
        {
            // Handle right-associative '^' operator
            if (ch == '^' && operators.top() == '^')
            {
                break;
            }
            output += operators.top();
            operators.pop();
        }
        operators.push(ch);
    }

    // Pop all the remaining operators in the stack
    while (!operators.empty())
    {
        output += operators.top();
        operators.pop();
    }

    return output;
}

int main()
{
    int t;
    cin >> t; // Number of test cases
    while (t--)
    {
        string expression;
        cin >> expression;                          // Read each expression
        cout << infixToPostfix(expression) << endl; // Convert and print RPN form
    }

    return 0;
}
