#include <stdio.h>
#include <stdlib.h>


/* typedef struct Node {
    int data;
    struct Node* next;
} Node;

Node* head = NULL; */

struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;

struct Node* createNode(int value) {
    struct Node* newnode = (struct Node*)malloc(sizeof(struct Node));
    newnode->data = value;
    newnode->next = NULL;
    return newnode;
}

void InsertFront(int value) {
    struct Node* newnode = createNode(value);
    newnode->next = head;
    head = newnode;
}

void InsertEnd(int value) {
    struct Node* newnode = createNode(value);
    struct Node* temp = head;
    if (head == NULL) {
        head = newnode;
        return;
    }
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newnode;
}

void InsertMiddle(int value, int position) {
    struct Node* newnode = createNode(value);
    struct Node* temp = head;
    if (position == 1) {
        newnode->next = head;
        head = newnode;
        return;
    }
    for (int i = 1; i < position - 1 && temp != NULL; i++) {
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Position out of range\n");
        free(newnode);
        return;
    }
    newnode->next = temp->next;
    temp->next = newnode;
}

void InsertBasedOnValue(int value, int key) {
    struct Node* temp = head;
    struct Node* newnode = createNode(value);
    while (temp != NULL) {
        if (temp->data == key) {
            newnode->next = temp->next;
            temp->next = newnode;
            return;
        }
        temp = temp->next;
    }
    printf("Value not found\n");
    free(newnode);
}

void DeleteByValue(int value) {
    struct Node* temp = head;
    struct Node* prev = NULL;
    if (temp != NULL && temp->data == value) {
        head = temp->next;
        free(temp);
        return;
    }
    while (temp != NULL && temp->data != value) {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Value not found\n");
        return;
    }
    prev->next = temp->next;
    free(temp);
}

void DeleteByPosition(int position) {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct Node* temp = head;
    if (position == 1) {
        head = temp->next;
        free(temp);
        return;
    }
    struct Node* prev = NULL;
    for (int i = 1; i < position && temp != NULL; i++) {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Position out of range\n");
        return;
    }
    prev->next = temp->next;
    free(temp);
}

void SearchElement(int value) {
    struct Node* temp = head;
    int position = 1;
    while (temp != NULL) {
        if (temp->data == value) {
            printf("Element %d found at position %d\n", value, position);
            return;
        }
        temp = temp->next;
        position++;
    }
    printf("Element %d not found\n", value);
}

int CountNodes() {
    struct Node* temp = head;
    int count = 0;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}

void DisplayList() {
    struct Node* temp = head;
    if (temp == NULL) {
        printf("List is empty\n");
        return;
    }
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    int choice, value, position;
    
    while (1) {
        printf("\nMenu:\n");
        printf("1. Insert at First\n");
        printf("2. Insert at End\n");
        printf("3. Insert at Middle\n");
        printf("4. Insert after Value\n");
        printf("5. Delete by Value\n");
        printf("6. Delete by Position\n");
        printf("7. Search Element\n");
        printf("8. Count Nodes\n");
        printf("9. Display List\n");
        printf("10. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        
        switch (choice) {
            case 1:
                printf("Enter value to insert at first: ");
                scanf("%d", &value);
                InsertFront(value);
                break;
            case 2:
                printf("Enter value to insert at end: ");
                scanf("%d", &value);
                InsertEnd(value);
                break;
            case 3:
                printf("Enter value and position to insert at middle: ");
                scanf("%d %d", &value, &position);
                InsertMiddle(value, position);
                break;
            case 4:
                printf("Enter value to insert and the value to search after: ");
                scanf("%d %d", &value, &position);
                InsertBasedOnValue(value, position);
                break;
            case 5:
                printf("Enter value to delete: ");
                scanf("%d", &value);
                DeleteByValue(value);
                break;
            case 6:
                printf("Enter position to delete: ");
                scanf("%d", &position);
                DeleteByPosition(position);
                break;
            case 7:
                printf("Enter value to search: ");
                scanf("%d", &value);
                SearchElement(value);
                break;
            case 8:
                printf("Total nodes: %d\n", CountNodes());
                break;
            case 9:
                DisplayList();
                break;
            case 10:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }
    
    return 0;
}
