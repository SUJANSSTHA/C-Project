// CREATING OF A LIST
// program for creation of a list and inserting data items to given list

#include<stdio.h>
#include<conio.h>
void main()
{
    int a[100], i, n;
    printf("\nEnter no. of elements to be inserted.\n");
    scanf("%d", &n);
    printf("Enter any %d elements of list\n", n);
    
    for(i=0;i<n;i++)
    {
        scanf("\n%d",&a[i]);
    }
     printf("\n You have inserted elements are as follows\n");
    for(i=0;i<n;i++)
    {
       
         printf("%d\t", a[i]);
        
    }
     printf("\n Thank You for Creating A list\n");
    getch();
}