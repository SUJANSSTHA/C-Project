// Program to find factoria of an integer number without using recursive function
#include<stdio.h>
int main()
{
    int n;
    long int facto;
    long int factorial(int n);

    printf("Enter value of n:");
    scanf("%d", &n);
    facto=factorial(n);
    printf("%d!=%ld", n, facto);
    return 0;
}
long int factorial(int n)
{
    long int facto =1;
    int i;
    if(n==0)
    return 1;
    else 
    {
        for(i=1;i<=n;i++)
        facto=facto*i;
        return facto;
    }
}