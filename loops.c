// #include<stdio.h>
// int main()
// {
//     int i,j;
//     for(i=1;i<=5;i++)
//     {
//         for(j=1;j<=i;j++)
//         {
//             printf("%d\t",1);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// #include<stdio.h>
// int main()
// {
//     int i=1,number=0;
//     printf("Enter a number: ");
//     scanf("%d",&number);
//     for(i=1;i<=10;i++){
//     printf("%d \n",(number*i));
//     }
// }

#include<stdio.h>
int main(int argc, char const *argv[])
{
    int i, j;
    // printf("Enter the value of i:\n ");
    // scanf("%d", &n);
    for (i=0; i<5;i++)
    {
        for(j=0;j<=i;j++)
        {
            printf("$");
        }
        printf("\n");
        
    }
    
    /* code */
    return 0;
}
