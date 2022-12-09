// read the first number 
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

struct tree // tree node;
{
    int info;
    struct tree*left;
    struct tree*right;
};
struct tree * root = NULL; // ROOT SURU MA NALL HUNXA
struct tree * getnode(int data)
{
    struct tree*ptrnew;
    ptrnew = (struct tree*)malloc(sizeof(struct tree));
    if(ptrnew==NULL)
    {
        printf("Memory allocation failed.");
        //getch();
        return 0;
        exit(0);
    }
    ptrnew->info=data;
    ptrnew->left=ptrnew->right=NULL; // RIGHT AND LEFT VALUE NULL
    return ptrnew;
}




