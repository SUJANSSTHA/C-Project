// using while loop prime number


// #include <stdio.h>
// int main ()
// {
//     int i=2,j=3, n;
//     printf("Enter to check the prime or not\t");
//     scanf("%d", &n);
//     while(i<n)
//     {
//         if(n%i!= 1 && n%j!=0)
//         printf("%d is not a prime num",n);
    
//         else
//         {
//             printf("%d is prime num", n);
//          i++;}
//         break;
//     }
//     return 0;
// }
#include <stdio.h>
int main()
{
   int n, i=2, count = 0;
 
    printf("Enter number to check prime number or not ");
    scanf("%d",&n);
    
    while( i<=n/2)
    {
        // check for non prime number
        if(n%i==0)
        {
            count=1;
            break;
        }
        i++;
    }
 
    if (count==0)
        printf("%d is a prime number.",n);
    else
        printf("%d is not a prime number.",n);
 
    return 0;
    
}
