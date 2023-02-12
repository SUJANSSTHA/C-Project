// complete porgram in c to convert an expression from infix to postfix 
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<string.h>
int i, otos=-1, ptos=-1;len, length;
int precedency(char ch)
{
    switch(ch)
    {
        case '$': return(4);
        case '*': return(3);
        case '/': return(2);
        case '-':
        case '+': return(1);
        default: return (1);
    }

}

void main()
{
    char infix[100], poststack[100],opstack[100];
    printf("\nEnter a valid infix\n");
    gets(infix);
    length=strlen(infix);
    len=length;
    for(i=0;i<=length-1;i++)
    {
        if(infix[i]=='(')
        {
            opstack[++otos]=infix[i];
            len++;
        }
        else if(isalpha(infix[i]))
        {
            poststack[++ptos]=infix[i];

        }
        else if(infix[i]==')')
        {
            len++;
            while(opstack[otos]!='(');
            {
                poststack[++ptos]=opstack[otos];
                
            }
            otos--;
        }
        else{
            if(precedency(opstack[otos])>=precedency(infix[i]))
            {
                poststack[++ptos]=opstack[otos--];
                opstack[++otos]=infix[i];
            }
            opstack[++otos]=infix[i];

        }
    }
    while(otos!=-1)
    {
        poststack[++ptos]=opstack[otos];
        otos--;
    }
    for(i=0;i<len;i++)
    {
        printf("%c", poststack[i]);
    }
    getch();
}