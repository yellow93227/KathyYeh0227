#include <stdio.h>

int main(void) {
    int iScore1, iScore2, iScore3;
    int iAverage;
    int iNumber1 = 0, iNumber2 = 0, iNumber3 = 0, iNumber4 = 0, iNumber5 = 0;

    puts("Please enter the scores of three students:"); // Prompt user to input scores
    scanf("%d %d %d", &iScore1, &iScore2, &iScore3); // Store scores in separate variables

    // Check if all scores are between 0 and 100
    if ((iScore1 >= 0 && iScore1 <= 100) &&
        (iScore2 >= 0 && iScore2 <= 100) &&
        (iScore3 >= 0 && iScore3 <= 100)) {

        int scores[3] = {iScore1, iScore2, iScore3};

        // Count grades
        for (int i = 0; i < 3; i++) {
            int grade = scores[i] / 10;
            if (grade == 10 || grade == 9) {
                iNumber1++; // Grade A
            } else if (grade == 8) {
                iNumber2++; // Grade B
            } else if (grade == 7) {
                iNumber3++; // Grade C
            } else if (grade == 6) {
                iNumber4++; // Grade D
            } else {
                iNumber5++; // Grade F
            }
        }

        // Output grade distribution
        printf("Grade Distribution:\n");
        printf("A (90 and above): %d student(s)\n", iNumber1);
        printf("B (80-89): %d student(s)\n", iNumber2);
        printf("C (70-79): %d student(s)\n", iNumber3);
        printf("D (60-69): %d student(s)\n", iNumber4);
        printf("F (Below 60): %d student(s)\n", iNumber5);

    } else {
        printf("Sorry, all scores must be between 0 and 100.\n");
    }

    return 0;
}
