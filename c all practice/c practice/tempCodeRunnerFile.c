#include<stdio.h>
int main()
{
    int i;
    float arr[10];
    printf("Enter marks 10 numbers:\n");
    for(i=0; i<10; i++)
    {
        scanf("%f", &arr[i]);
    }
    printf("\n The entered numbers are:\n");
    for(i=0;i<10;i++)
    {
        printf("\n arr[%d] = %f", i, arr[i]);
    }
    return 0;
}