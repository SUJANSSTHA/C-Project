// Program for creation of a list and  inserting data items to given list

#include<stdio.h>
int main()
{
    int a[100], i, n;
    printf("Enter no of elements to be inserted \n ");
    scanf("%d",&n);
    printf("Enter any %d elements of given list\t", n);
    for(i=1 ;i<n;i++)
    {
        scanf("%d\t", &a[i]);
    }
    return 0;
}