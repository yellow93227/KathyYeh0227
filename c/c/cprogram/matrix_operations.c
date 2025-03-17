#include <stdio.h> 
#include <stdlib.h> 
#include <time.h> 
#define MIN_SIZE 3 // define minimum size of matrix
#define MAX_SIZE 10 // define maximum size of matrix

// Function prototypes
void printMatrix(int size, int matrix[size][size]);
void fillMatrixWithRandomNumbers(int size, int matrix[size][size]);
int flattenArray(int size,int matrix[size][size], int arr1D[size * size]);
void findDuplicates(int size,int arr1D[size*size]);
void menu();


int main() {
    int size;
    int rows, cols;
    int choice, validInput;


    srand(time(NULL));

    //tell user to enter the dimension of matrix
    do {
        printf("Please enter the dimension of matrix (size between %d and %d): ", MIN_SIZE, MAX_SIZE);
        scanf("%d", &size);

        if (size < MIN_SIZE || size > MAX_SIZE) {
            printf("Invalid size. Please enter again.\n"); // remind user to enter agaim
        }
    } while (size < MIN_SIZE || size > MAX_SIZE);

    int matrix[size][size]; 


    // fill the matrix with random number
    fillMatrixWithRandomNumbers(size, matrix);
    printf("\nGenerated %d X %d matrix:\n",&size,&size);
    printArray(size, matrix);


   // Menu-driven system
    do {
        menu();
        printf("Enter your option: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                    int arr1D[size * size];
                    flattenArray(size, matrix, arr1D);
                    findDuplicates(size,arr1D);
                    
                break;
            }
            case 2:
            
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
    // output a matrix
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
            matrix[i][j] = rand() % 99 + 1; // the random number between1~99
        }
    }
}


// Function to flatten matrix
int flattenArray(int size,int matrix[size][size], int arr1D[size * size]) {

        int *AP_1D = (int *) matrix;
        for (int ni =0; ni < size * size; )
            printf ("%d ", AP_1D[ni++]);

        printf ("\n");
        return 0;
}

// Function to find duplicates in matrix 
void findDuplicates(int size,int arr1D[size*size]) {    
        
    //Calculate length of array 
    int length = sizeof(arr1D)/sizeof(arr1D[0]);    
        
    printf("Duplicate elements in given matrix: \n");    
    //Searches for duplicate element    
    for(int i = 0; i < length; i++) {    
        for(int j = i + 1; j < length; j++) {    
            if(arr1D[i] == arr1D[j])    
                printf("%d\n",arr1D[j]);    
        }    
    }    

}

// Function to display menu
void menu() {
    printf("\nMenu:\n");
    printf("1. Flatten Matrix\n");
    printf("2. Compress Matrix\n");
    printf("3. Exit\n");
}



