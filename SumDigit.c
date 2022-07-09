#include<stdio.h>
int main()
{
    int n, sum = 0, rem;
    printf("Enter the sumber:");
    scanf("%d", &n);
    while (n>0)

    {
        /* code */
        rem=n%10;
        sum+=rem;
        n/=10;

    }
    printf("sum of digits = %d \n", sum);
    return 0;
    
}