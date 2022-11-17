// Complete program in C to convert an expression from infix to postfix

 #include<stdio.h>
 #include<math.h>
 #include<string.h>
 #include<string.h>

 int precedency(char);

int main()
{
    int i, otos = 1, len, length;
    char infix[100], poststack[100], opstack[100];
    printf("Enter a valid infix\n");
    gets(infix);
    length = strlen(infix);
    len= length;
    for(i=0;i<=length-1; i++)
    {
        if(infix[i] =='(')
        {
            opstack[++otos]=infix[i];

        }
        else
        if(isalpha(infix[i]))

        {
            poststack[++ptos]=infix[i];
            
        }
        else
        if(infix[i]==')')
        {
            len++;
            while (opstack[otos]!='(')
            {
                poststack[++ptos]=opstack[otos];
                otos--;
                /* code */
            }
            otos--;
            
        }
        else // operators
        {
            if(presedency(opstack[otos])>=precedency(infix[i]))
            {
                poststack[++ptos]=opstack[otos--];
                opstack[++otos]=infix[i];

            }
            opstack[++otos]=indix[i];

        }
    }
    while(otos!=-1)
    {
        poststack[++ptos]= opstack[otos];
        otos--;
    }
    for(i=0;i<len;i++) // for displaying
    {
        printf("%c", poststack[i]);
    }
    return 0;
}
int precedency(char ch) // precedence fnction
{
    switch (ch)
    {
    case '$'
    return (4);
    /* constant-expression */:
        /* code */
        break;
        case '*':
        case '/':
        return (3);
        case '+':
        case '-'
        return (2);
        default:
        return (1);
    }
}