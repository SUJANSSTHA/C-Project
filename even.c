// #include<stdio.h>
// int main()
// {
//     int n, i,j=2,sum=0;
//     printf("/n enter no: ");
//     scanf("%d", &n);
//     for(i=0;i<n;i++)
//     {
//         sum = sum+j;
//         // j=j+2;

//     }
//     printf("\n sum even num %d terms = %d", n,sum);
    
//     return 0;

//     }

// #include <stdio.h>  
// int main()  
// {  
//     int i, n, sum=0;  
//     printf("Enter any number: ");  
//     scanf("%d", &n);  
//     for(i=2; i<=n; i+=2)  
//     {  
//         sum += i;  
//     }  
//     printf("Sum of all even numbers from 1 to %d: %d", n, sum);  
//     return 0;  
// }  

/* C Program to Print Sum of all Even Numbers from 1 to N */
 
#include<stdio.h>
 
int main()
{
  int i, number, Sum = 0;
 
  printf("\n Please Enter the Maximum Limit Value : ");
  scanf("%d", &number);
  
  printf("\n Even Numbers between 0 and %d are : ", number);
  for(i = 1; i <= number; i++)
  {
    if ( i%2 == 0 ) //Check whether remainder is 0 or not
    {
  	printf("%d  ", i);
        Sum = Sum + i;
    }
  }
  printf("\n The Sum of All Even Numbers upto %d  = %d", number, Sum);

  return 0;
}