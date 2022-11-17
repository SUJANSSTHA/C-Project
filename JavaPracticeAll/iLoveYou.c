#include<stdio.h>
// #include<stdio.h>
#include<conio.h>
#include<dos.h>
int main()
{
    int i;
    textcolor(RED);
    textbackground(WHITE);
    for(i=1;i<100; i++)
    {
        cprintf("I LOVE YOU");
        delay(200);

    }
    return 0;
}