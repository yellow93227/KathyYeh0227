#include <stdio.h>
#include <stdlib.h>

// Function prototypes
void inputMatrix(int matrix[][100], int rows, int cols);
void printMatrix(int matrix[][100], int rows, int cols);
void transposeMatrix(int matrix[][100], int rows, int cols, int result[][100]);
int multiplyMatrices(int matrixA[][100], int rowsA, int colsA, int matrixB[][100], int rowsB, int colsB, int result[][100]);
void menu();

int main() {
    int matrixA[100][100], matrixB[100][100], result[100][100];
    int rowsA, colsA, rowsB, colsB;
    int choice, validInput;

    // Input dimensions and validate
    do {
        printf("Enter dimensions of Matrix A (rows and columns): ");
        validInput = scanf("%d %d", &rowsA, &colsA);
        if (rowsA <= 0 || colsA <= 0 || validInput != 2) {
            printf("Invalid input. Please enter positive integers.\n");
            while (getchar() != '\n'); // Clear invalid input
        }
    } while (rowsA <= 0 || colsA <= 0 || validInput != 2);

    do {
        printf("Enter dimensions of Matrix B (rows and columns): ");
        validInput = scanf("%d %d", &rowsB, &colsB);
        if (rowsB <= 0 || colsB <= 0 || validInput != 2) {
            printf("Invalid input. Please enter positive integers.\n");
            while (getchar() != '\n'); // Clear invalid input
        }
    } while (rowsB <= 0 || colsB <= 0 || validInput != 2);

    // Input elements for Matrix A
    printf("Enter elements for Matrix A:\n");
    inputMatrix(matrixA, rowsA, colsA);

    // Input elements for Matrix B
    printf("Enter elements for Matrix B:\n");
    inputMatrix(matrixB, rowsB, colsB);

    // Menu-driven system
    do {
        menu();
        printf("Select an operation: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int matrixChoice;
                printf("Select Matrix to Transpose (1 for A, 2 for B): ");
                scanf("%d", &matrixChoice);

                if (matrixChoice == 1) {
                    printf("Transposed Matrix A:\n");
                    transposeMatrix(matrixA, rowsA, colsA, result);
                    printMatrix(result, colsA, rowsA);
                } else if (matrixChoice == 2) {
                    printf("Transposed Matrix B:\n");
                    transposeMatrix(matrixB, rowsB, colsB, result);
                    printMatrix(result, colsB, rowsB);
                } else {
                    printf("Invalid choice. Please select 1 or 2.\n");
                }
                break;
            }
            case 2:
                if (multiplyMatrices(matrixA, rowsA, colsA, matrixB, rowsB, colsB, result)) {
                    printf("Result of Matrix A x Matrix B:\n");
                    printMatrix(result, rowsA, colsB);
                } else {
                    printf("Matrices cannot be multiplied. Please check dimensions.\n");
                }
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

// Function to input matrix elements
void inputMatrix(int matrix[][100], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("Enter element [%d][%d]: ", i + 1, j + 1);
            scanf("%d", &matrix[i][j]);
        }
    }
}

// Function to print a matrix
void printMatrix(int matrix[][100], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}

// Function to transpose a matrix
void transposeMatrix(int matrix[][100], int rows, int cols, int result[][100]) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[j][i] = matrix[i][j];
        }
    }
}

// Function to multiply two matrices
int multiplyMatrices(int matrixA[][100], int rowsA, int colsA, int matrixB[][100], int rowsB, int colsB, int result[][100]) {
    if (colsA != rowsB) {
        return 0; // Return 0 if matrices cannot be multiplied
    }

    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            result[i][j] = 0;
            for (int k = 0; k < colsA; k++) {
                result[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }

    return 1; // Return 1 if multiplication is successful
}

// Function to display menu
void menu() {
    printf("\nMenu:\n");
    printf("1. Transpose a Matrix\n");
    printf("2. Multiply Matrices\n");
    printf("3. Exit\n");
}