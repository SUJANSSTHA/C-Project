// program to sum all integers from 1 to 100 using while loop 
// /*
// #include<stdio.h>
// int main()
// {
//     int sum = 0, i = 1;
//     while (i<=4)
//     {
//         /* code */
//         sum += i;
//         i++;
//     }
//     printf("Sum is %d \n", sum);
    




//     return 0;
// } */
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