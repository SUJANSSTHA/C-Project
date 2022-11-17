#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<string.h>


void push(int);
int tos();

int main()
{
    int i, res, len, o1, op2, value[100];
    char postfix[100], ch;

    printf("enter a valid postfix\n ");
    gets(postfix);
    len= strlen(postfix);
    for(i=0;i<=len-1;i++)
    {
        if(isalpha(postfix[i]))
        {
            printf("Enter value of %c", postfix[i]);
            scanf("%d", &value[i]);
            push(value[i]);
        }else
        {
            ch = postfix[i];
            op2=pop();
            op1 = pop();
            switch(ch)
            {
                case '+':
                push(op1 + op2);
                break;
                case '-':
                push(op1 - op2);
                break;
                case '*':
                push(op1 * op2);
                break;
                case '/':
                push(op1 / op2);
                break;
                case '$':
                push(pow(op1 , op2));
                break;
                case '%':
                push(op1 % op2);
                break;
            }

        }
    }
    printf("The result is:");
    res=pop();
    printf("%d", res);
    return 0;
}

// insertion function
void push(int val)
{
    vstack[++tos]=val;
}

// deletion function
int pop()
{
    int n;
    n=vstack[tos--];
    return(n);
}