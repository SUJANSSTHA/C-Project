#include<stdio.h>
int main()
{
        int num, digit, sum=0;
        int temp;
        printf("\n Enter number to be checked: \t");
    scanf("%d", &num);
    temp = num;
    while (num!=0)
    {
        /* code */
        digit = num % 10;
        sum += digit*digit*digit;
        num /=10;

    }
    if (temp==sum)
    printf("\n Armstrong Number.");
    else
    printf("Not Armstrong Number.");

return 0;

}