#include <stdio.h>
#include <conio.h>

struct Node{
    int data;
    struct node* left;
    struct node* right;
};
struct Node* createNode(int data)
{
    struct Node* newnode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = newNode->right =NULL;
    return newNode;
}

void preorder(struct Node* node)
{
    if(node == NULL) return;
    printf("%d",node->data);
    preorder(node->left);
    preorder(node->right);
}

int main()
{
    struct Node* root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->left->right = createNode(5);
    printf("Preorder traversal: ");
    preorder(root);
}