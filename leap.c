#include<stdio.h>
int main()
{
    int yrs;
    printf("Leap yrs starting from 1900 to 200:\n");
    for(yrs=2022; yrs<=2050; yrs++)
    if(yrs % 400 == 0 || (yrs % 100!=0 && yrs % 4 ==0))
    printf("%d\t", yrs);

    return 0;
}