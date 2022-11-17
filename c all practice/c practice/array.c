// An array is a collection of elements of the same data type placed in contiguous (consecutively) memory location and can be access individually using index to a unique given name.

// Accessing Data Fron An Array 

// Program that reads 10 float numbers from user and displays the entered numbers in the screen.

// #include<stdio.h>
// int main()
// {
//     int i;
//     float arr[10];
//     printf("Enter marks 10 numbers:\n");
//     for(i=0; i<10; i++)
//     {
//         scanf("%f", &arr[i]);
//     }
//     printf("\n The entered numbers are:\n");
//     for(i=0;i<10;i++)
//     {
//         printf("\n arr[%d] = %f", i, arr[i]);
//     }
//     return 0;
// }

//  again 

// #include<stdio.h>
// int main()
// {
//     int i;
//     float arr[10];
//     printf("Enter the 10 numbers \n");
//     for(i=0;i<10;i++)
//     {
//         scanf("%f", &arr[i]);
//     }
//     printf("\n The entered numbers are:\n");
//     for(i=0;i<10;i++)
//     {
//         printf("\n arr[%d] = %f", i, arr[i]);
//     }
//     return 0;
// }

// Program that accepts marks for 5 subjects from the keyboard and finds sum and average.

#include<stdio.h>
int main()
{
    int marks [5]; // Declaration of array of elements marks 
    int i, sum = 0;
    float avg; // Agerage
    for(i=0;i<5;i++)
    {
        printf("Enter marks for subject %d:\t", i+1);
        scanf("%d", &marks[i]);

    }
    for(i=0;i<5;i++)
    {
        sum = sum + marks[i];
    }
    avg = sum/5.0;
    printf("Average:  %.2f and sum: %d", avg, sum);
    return 0;
}