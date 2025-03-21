#include <stdio.h> 
#include <stdlib.h> 
#include <time.h> 

#define MIN_SIZE 3
#define MAX_SIZE 10

// Function prototypes
void printMatrix(int size, int matrix[size][size]);
void fillMatrixWithRandomNumbers(int size, int matrix[size][size]);
int flattenArray(int size, int matrix[size][size], int arr1D[size * size]);
void findDuplicates(int size, int arr1D[size * size]);
void menu();

int main() {
    int size, choice;
    
    srand(time(NULL));

    // 輸入矩陣尺寸
    do {
        printf("Please enter the dimension of matrix (size between %d and %d): ", MIN_SIZE, MAX_SIZE);
        scanf("%d", &size);
        if (size < MIN_SIZE || size > MAX_SIZE) {
            printf("Invalid size. Please enter again.\n");
        }
    } while (size < MIN_SIZE || size > MAX_SIZE);

    int matrix[size][size];

    // 填充矩陣並顯示
    fillMatrixWithRandomNumbers(size, matrix);
    printf("\nGenerated %d X %d matrix:\n", size, size);
    printMatrix(size, matrix);

    // 選單系統
    do {
        menu();
        printf("Enter your option: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int arr1D[size * size];
                flattenArray(size, matrix, arr1D);
                findDuplicates(size, arr1D);
                break;
            }
            case 2:
                printf("Compress Matrix option not implemented yet.\n");
                break;
            case 3:
                printf("Program exited.\n");
                break;
            default:
                printf("Invalid choice. Please select from the menu.\n");
        }
    } while (choice != 3);

    return 0;
}

void printMatrix(int size, int matrix[size][size]) {
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            printf("%3d ", matrix[i][j]);
        }
        printf("\n");
    }
}

void fillMatrixWithRandomNumbers(int size, int matrix[size][size]) {
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            matrix[i][j] = rand() % 99 + 1;
        }
    }
}

int flattenArray(int size, int matrix[size][size], int arr1D[size * size]) {
    int index = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            arr1D[index++] = matrix[i][j];
            printf("%d ", arr1D[index - 1]);
        }
    }
    printf("\n");
    return 0;
}

void findDuplicates(int size, int arr1D[size * size]) {
    int length = size * size;
    printf("Duplicate elements in the matrix:\n");
    int foundDuplicate = 0;
    for (int i = 0; i < length - 1; i++) {
        for (int j = i + 1; j < length; j++) {
            if (arr1D[i] == arr1D[j]) {
                printf("%d\n", arr1D[i]);
                foundDuplicate = 1;
                break;
            }
        }
    }
    if (!foundDuplicate) {
        printf("No duplicates found.\n");
    }
}

void menu() {
    printf("\nMenu:\n");
    printf("1. Flatten Matrix and Find Duplicates\n");
    printf("2. Compress Matrix\n");
    printf("3. Exit\n");
}
