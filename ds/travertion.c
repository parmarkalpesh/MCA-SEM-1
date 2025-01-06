void preorderTraversal(struct Node* root) {
    if (root == NULL)return;
    printf("%d ", root->data);       // Visit the root node
    preorderTraversal(root->left);    // Traverse the left subtree
    preorderTraversal(root->right);   // Traverse the right subtree
}