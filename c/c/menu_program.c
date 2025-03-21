#include <stdio.h>
#include <math.h>

// Function prototypes
void menu(); // Show menu
void displayMatrix(int rows, int cols, int matrix[rows][cols]); 
void DiamondStars(int layers);
double calculate_mean(int x1, int x2, int x3);
double calculate_stddev(int x1, int x2, int x3, double mean);

int main() {
    int iMenuOptions;

    do {
        menu(); // Show menu options
        printf("Please choose which option you want to do: ");
        scanf("%d", &iMenuOptions);

        switch (iMenuOptions) {
            case 1: { // Square pattern    
                int rows, cols;
                printf("Please enter the number of rows: ");
                scanf("%d", &rows);
                printf("Please enter the number of columns: ");
                scanf("%d", &cols);
                
                int mat[rows][cols]; // Declare matrix after getting dimensions
                printf("Rectangle Pattern:\n");
                displayMatrix(rows, cols, mat);
                break;
            }
            
            case 2: { // Diamond pattern with stars
                int layers;
                printf("Please enter the number of layers for the diamond (positive odd number): ");
                scanf("%d", &layers);
                
                if (layers <= 0 || layers % 2 == 0) { 
                    printf("Error: Layers must be a positive odd number.\n");
                } else {
                    printf("Diamond pattern with stars:\n");
                    DiamondStars(layers);
                }
                break;
            }

            case 3: { // Standardize three numbers
                int x1, x2, x3;
                printf("Please enter three integers separated by spaces: ");
                scanf("%d %d %d", &x1, &x2, &x3);
                
                double mean = calculate_mean(x1, x2, x3);
                double stddev = calculate_stddev(x1, x2, x3, mean);
                
                if (stddev == 0) {
                    printf("Standard deviation is zero, cannot compute Z-scores.\n");
                } else {
                    printf("Mean = %.3f\n", mean);
                    printf("Standard Deviation = %.3f\n", stddev);
                    printf("Z1 = %.3f\n", (x1 - mean) / stddev);
                    printf("Z2 = %.3f\n", (x2 - mean) / stddev);
                    printf("Z3 = %.3f\n", (x3 - mean) / stddev);
                }
                break;
            }

            case 4: // Exit program
                printf("Exiting the program. Goodbye!\n");
                break;

            default:
                printf("Invalid choice. Please select an option between 1 and 4.\n");
        }
    } while (iMenuOptions != 4);

    return 0;
}

void menu() {
    printf("\nMenu:\n");
    printf("1: Square pattern\n");
    printf("2: Diamond pattern with stars\n");
    printf("3: Standardize three numbers\n");
    printf("4: End program\n");
}

void displayMatrix(int rows, int cols, int matrix[rows][cols]) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("1");
        }
        printf("\n");
    }
}

void DiamondStars(int layers) {
    int mid = layers / 2;
    
    for (int i = 0; i <= mid; i++) { // Upper part of diamond
        for (int space = 0; space < mid - i; space++) {
            printf(" ");
        }
        for (int star = 0; star < (2 * i + 1); star++) {
            printf("*");
        }
        printf("\n");
    }
    
    for (int i = mid - 1; i >= 0; i--) { // Lower part of diamond
        for (int space = 0; space < mid - i; space++) {
            printf(" ");
        }
        for (int star = 0; star < (2 * i + 1); star++) {
            printf("*");
        }
        printf("\n");
    }
}

double calculate_mean(int x1, int x2, int x3) {
    return (x1 + x2 + x3) / 3.0; // Ensure floating-point division
}

double calculate_stddev(int x1, int x2, int x3, double mean) {
    double variance = ((x1 - mean) * (x1 - mean) + 
                       (x2 - mean) * (x2 - mean) + 
                       (x3 - mean) * (x3 - mean)) / 3.0;
                       
    return sqrt(variance); // Return the standard deviation (sqrt of variance)
}
