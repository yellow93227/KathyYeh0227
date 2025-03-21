#include<stdio.h>

// Declare the print_pyramid function
void print_pyramid(int height);

int main() {
    int height;
    
    // Ask user to enter pyramid height
    printf("Please enter the height of the pyramid (1-9): ");
    scanf("%d", &height);

    // Check if input is valid (between 1 and 9)
    if (height <= 0 || height > 9) {  
        printf("Error: Height must be a positive integer between 1 and 9.\n");
    } else {  
        // Print the pyramid
        print_pyramid(height);
    }

    return 0;
}

// Function to print the pyramid
void print_pyramid(int height) {
    // Loop for each level of the pyramid
    for (int i = 1; i <= height; i++) {  
        // Print spaces before numbers
        for (int j = 1; j <= height - i; j++) {  
            printf(" ");
        }
        // Print numbers for current level
        for (int k = 1; k <= (2 * i - 1); k++) {  
            printf("%d", i);
        }
        printf("\n");  // New line after each level
    }
}


