// calsulation of the factorial of an integer number using recursive function

#include<stdio.h>
int main()
{
    int n;
    long int facto;
    long int factorial(int n);

    printf("\n\nEnter value of n:\t");
    scanf("%d", &n);
    facto=factorial(n);
    printf("%d!=%ld", n, facto);
    return 0;
}

long int factorial(int n)
{
    if(n==0)
    return 1;
    else 
    return n*factorial(n-1);
}