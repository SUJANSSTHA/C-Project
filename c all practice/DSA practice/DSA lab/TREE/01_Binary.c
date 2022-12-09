// read the first number RR

we can visit in three way

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

void insert(struct tree *ptrthis, int data)
{
    if(ptrthis==NULL)
    root =getnode(data);
    else if(ptrthis->info==data)
    printf("Duplicate empty");
    else if (data<ptrthis->info) //  if data is less the info
    {
        if(ptrthis->left==NULL) // IF current node has no left son then make new node as its left son
        ptrthis->left=getnode(data);
        else
        insert(ptrthis->left,data); // data pass to left

    }
    else {

        // if(ptrthis->info==data)
        //  printf("Duplicate empty");
    // else if (data<ptrthis->info) //  if data is less the info



        if(ptrthis->right==NULL) // if current node has no right son
        ptrthis->right=getnode(data); // then make new node as its right son
        else
        insert (ptrthis->right,data); // data pass to right
    }


}
void inorder(struct tree *ptrthis)
{
    if(ptrthis!=NULL)
    {
        inorder(ptrthis->left);
        printf("\n%d\t", ptrthis->info);
        inorder(ptrthis->right);
    }

}

int main()
{
    int i, n;
    for(i=0;i<10;i++)
    {
        printf("Enter a number");
        scanf("%d", &n);
        insert (root,n); // first put data in 'n' and send 
    }
    printf("Tree constructed . \n the binary search tree is \n");
    inorder(root);
    return 0;
    // getch();
}


