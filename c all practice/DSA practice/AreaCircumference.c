#include<stdio.h>
#define PI 3.14
// global declaration
float r, a, c;

// function defince in compailor
float area();
float circumference();

// main function 
int main()
{
    printf("Radius= ");
    scanf("%f", &r);

    // function call 
    a=area();
    c=circumference();
    printf("Area=%f\n Circumference = %f", a,c);
    return 0;
}

float area()
{
    return PI * r * r;

}
float circumference()
{
    return 2 * PI * r;
}