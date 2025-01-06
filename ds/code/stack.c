#include <stdio.h>
#define MAX 100 // Maximum size of the stack

// Stack structure
typedef struct Stack {
    int arr[MAX]; // Array to store elements
    int top;      // Tracks the top index
} Stack;

// Function to initialize the stack
void initStack(Stack* stack) {
    stack->top = -1; // Indicates an empty stack
}

// Function to check if the stack is full
int isFull(Stack* stack) {
    return stack->top == MAX - 1;
}

// Function to push an element onto the stack
void push(Stack* stack, int value) {
    if (isFull(stack)) {
        printf("Stack Overflow! Cannot push %d\n", value);
        return;
    }
    stack->arr[++stack->top] = value; // Increment top and insert value
    printf("Pushed %d onto the stack.\n", value);
}

// Function to display the stack
void display(Stack* stack) {
    if (stack->top == -1) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Stack elements: ");
    for (int i = stack->top; i >= 0; i--) {
        printf("%d ", stack->arr[i]);
    }
    printf("\n");
}

// Main function
int main() {
    Stack stack;
    initStack(&stack);

    push(&stack, 10);
    push(&stack, 20);
    push(&stack, 30);

    display(&stack);

    return 0;
}
