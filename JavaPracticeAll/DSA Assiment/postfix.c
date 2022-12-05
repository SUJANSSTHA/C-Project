#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<Math.h>
#define Max 100
struct  stack{
    int data[Max];
    int tos;

};
int pushData(struct stack*st,int symb)
{
    if(st->tos==Max-1)
    {
        printf("Stack is full");
        return 0;
        st->data[++st->tos]=symb;


    }

}
int popData(struct stack*st)
{
    if(st->tos=-1){
    printf("The stack is empty");
    return 0;
    }
    return st->data[st->tos--];
}
int main()
{
    struct stack st;
    char symb, st;
    char symb, opnd1, opnd2;
    int value;
    char exp(Max);
    st.tos=-1;
    printf("Enter Expression:\t");
    gets(exp);
    for(int i=0; exp[i]!='\0'; i++)
    {
        symb=exp[i];
        if(symb>=48&&symb<=51)
        {
            pushData(&st,symb-48);
        }
    }
    else {
        opnd2= popData(&st);
        opnd1 = popData(&st);
        switch(symb)
        {
            case '+':
            value= opnd1+opnd2;break;
            case '-':
            value= opnd1-opnd2;break;
            case '/':
            value= opnd1/opnd2;break;
            case '*':
            value= opnd1*opnd2;break;
            case '$':
            value= pow(opnd1,opnd2);break;
        }
        pushData(&st,value);
    }
    printf("The value is: %d", popData(&st));
    return 0;
}