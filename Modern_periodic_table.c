#include<stdio.h>

int main()
{
    int n;
    int m;
    int a;
    int Exit;
    int Exi;

    printf("Welcome to Modern Periodic Table\n\n");
    printf("> Enter 1 to know about an element \n\n");
    printf("Enter 2 to close the periodic table\n\n");

    printf("Enter\n");
    scanf("%d", &n);
    if(n==1)
    {
        printf("> Press 3 search the element by atomic number\n\n");
        scanf("%d", &m);
        if(m==3)
        {
            printf("Enter the atomic number of the element to be searched :");
            scanf("%d", &a);

            if(a==1)
            {
                printf("Name: Hydrogen\n");
                printf("Symbol : h\n");
                printf("Electronic configuration : 1s^1\n");
                printf("Dicovered by :Henry Carendish");
                printf("Charge : +1\n");

            }
        }
    }

    else if( n==2)
    {
        printf(" Do You want to exit Yes/NO\n");
        printf("> Press 6 for Yes\n");
        printf(" > Press 7 for No\n");

        printf("ENTER\n");
        scanf("%d", &Exit);

        if(Exit==6)
        {
                printf("Are you sure you want to clode the periodic table? (Yes/No)\n");
                printf("> Press 4 for Yes\n ");
                printf("> Press 5 for No\n");

            printf("ENTER \n");
            scanf("%d", &Exit);

            if(Exi==4)
            {
                printf("The periodic table has closed :");

                }
                else if (Exi == 5)
                {
                    printf("Periodic table has not closed and you can continue to learn more about elements \n\n");

                    printf("Enter the atomic number of the element to be searched : \n\n");
                    scanf("%d", &a);

                    if(a==1)
                    {
                        printf("Name:\n");
                        printf("Symbol : h\n");
                        printf("Electronic configuration : 1s^1\n");
                        printf("Dicovered by :Henry Carendish");
                        printf("Charge : +1\n");

                    }
            }
        }
        else if(Exit ==7)
        {
            printf("Periodic table has not closed and you can to learn more elements \n\n");

            printf("Enter the atomic number of tghe element to be searched :");
            scanf("%d", &a);
            if(a==1)
            {
                 printf("Name: Hydrogen\n");
                printf("Symbol : h\n");
                printf("Electronic configuration : 1s^1\n");
                printf("Dicovered by :Henry Carendish");
                printf("Charge : +1\n");
            }
        }
    }
}