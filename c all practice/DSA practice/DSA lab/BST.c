#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct node{
   int info;
   struct node *left;
   struct node *right;
   struct node *father;
};
struct node * root;
struct node* getnode(int data)
{
   struct node* temp;
   temp=(struct node*)malloc(sizeof(struct node));
   if(temp==NULL)
   {
      printf("Memory allocation failed.");
      getch();
      exit(0);
   }
   temp->info=data;
   temp->father=NULL;
   temp->left=NULL;
   temp->right=NULL;
   return temp;
}
void insertnode(int data)
{
   struct node*ptrnew;
   struct node*parent;
   struct node*current;
   ptrnew=getnode(data);
   parent=NULL;
   current=root;
   while(1)
   {
      if(current==NULL)
      {
	 if(parent==NULL)
	 root=ptrnew;
	 else if(ptrnew->info<parent->info){
	   parent->left=ptrnew;
	   ptrnew->father=parent;
	   }
	 else{
	   parent->right=ptrnew;
	   ptrnew->father=parent;
	   }
	 printf("Node added successfully.");
	 break;
      }
      else if(ptrnew->info<current->info)
      {
	parent=current;
	current=current->left;
      }
      else
      {
	parent=current;
	current=current->right;
      }
   }
}
void preorder(struct node*top)
{
   if(top!=NULL)
   {
     printf("%d  ",top->info);
     preorder(top->left);
     preorder(top->right);
   }
}
void inorder(struct node*top)
{
   if(top!=NULL)
   {
     inorder(top->left);
     printf("%d  ",top->info);
     inorder(top->right);
   }
}
void findnode(int d)
{
  struct node* current;
  current=root;
  while(1)
  {
    if(current==NULL)
    {
      printf("%d does not exist in the list.",d);
      return;
    }
    else if(current->info==d)
    {
      printf("%d found in the tree.",d);
      return;
    }
    else if(d<current->info)
    {
      current=current->left;
    }
    else
    {
      current=current->right;
    }
  }
}
struct node*getmin(struct node*ptrthis)
{
   if(ptrthis->left==NULL)
   return ptrthis;
   else
    getmin(ptrthis->left);
}
void removenode(struct node*ptrthis,int data)
{
    struct node *temp;
    if(ptrthis==NULL)
    {
      printf("Empty tree");
      return;
    }
    if(data<ptrthis->info)
    {
       removenode(ptrthis->left,data);
    }
    else if(data>ptrthis->info)
    {
      removenode(ptrthis->right,data);
    }
    else if(ptrthis->left==NULL && ptrthis->right==NULL)
    {
       if((ptrthis->father)->left==ptrthis)
	  (ptrthis->father)->left=NULL;
       else
	 (ptrthis->father)->right=NULL;
      free(ptrthis);
    }
    else if(ptrthis->right==NULL)
    {
       if((ptrthis->father)->left==ptrthis)
	  (ptrthis->father)->left=ptrthis->left;
       else
	 (ptrthis->father)->right=ptrthis->left;
      free(ptrthis);
    }
    else if(ptrthis->left==NULL)
    {
       if((ptrthis->father)->left==ptrthis)
	  (ptrthis->father)->left=ptrthis->right;
       else
	 (ptrthis->father)->right=ptrthis->right;
      free(ptrthis);
    }
    else
    {
	temp=getmin(ptrthis);
	ptrthis->info=temp->info;
	removenode(temp,temp->info);
    }
}
void main()
{
   int d,choice;
   root=NULL;
   do{
    //  clrscr();
     printf("Select your choice: \n1. Add item\n2. Delete Item \n3. Traversal \n4. Search Item \n5. Exit\n");
     scanf("%d",&choice);
     switch(choice)
     {
       case 1:
	   printf("Enter a number to be added.");
	   scanf("%d",&d);
	   insertnode(d);break;
       case 2:
	  printf("Enter a number to be removed.");
	  scanf("%d",&d);
	  removenode(root,d);
	  break;
       case 3: inorder(root);break;
       case 4:
	   printf("Enter a number to be searched.");
	   scanf("%d",&d);
	   findnode(d);
	   break;
       case 5: exit(0);
     }
     getch();
   }while(1);
}