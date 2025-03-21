#include <stdio.h>

int main() {
    char seats[4][5];  // total seat is 4*5
    int row, col;
    char confirm = 'n';

    // set the seat as *
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            seats[i][j] = '*';
        }
    }  // end for

    // while:when user conform the seat will end
    while (confirm != 'y') {
        // the orginal seat table
        printf("\n    C1 C2 C3 C4 C5\n");
        for (int i = 0; i < 4; i++) {
            printf("R%d  ", i + 1);
            for (int j = 0; j < 5; j++) {
                printf(" %c ", seats[i][j]);
            }
            printf("\n");
        }

        // to remind user enter their seat
        printf("\nEnter your seat row number (1-4): ");
        scanf("%d", &row);
        printf("Enter your seat column number (1-5): ");
        scanf("%d", &col);

        // check the number is vaild
        if (row < 1 || row > 4 || col < 1 || col > 5) {
            printf("Invalid seat selection. Please try again.\n");
            continue;
        }

        // mark user's seat
        seats[row - 1][col - 1] = 'X';

        // print the new seat table
        printf("\n    C1 C2 C3 C4 C5\n");
        for (int i = 0; i < 4; i++) {
            printf("R%d  ", i + 1);
            for (int j = 0; j < 5; j++) {
                printf(" %c ", seats[i][j]);
            }
            printf("\n");
        }  //end for

        // to tell user confirm their seat 
        printf("\nX = Your seat\n");
        printf("Confirm seat [y/n]: ");
        scanf(" %c", &confirm);

        // if not confirm , select again
        if (confirm != 'y') {
            seats[row - 1][col - 1] = '*';
            printf("Seat not confirmed. Please select again.\n");
        }
    }  //end while

    // check
    printf("\nThank you for booking your seat.\n");

    return 0;
} // end main
