#include<stdio.h>
int main()
{
    long int num, rev=0;
    int digit;
    printf("\n Enter the number : ");
    scanf("%d", &num);
    while (num!=0)
    {
        /* code */
        digit = num%10;
        rev = rev*10+digit;
        num = num/10;
    }
    printf("the rev %ld", rev);
    return 0;
    
}