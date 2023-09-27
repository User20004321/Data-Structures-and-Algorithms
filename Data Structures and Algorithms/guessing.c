/* guessing.c
* homework Systems and PDC
* gcc guessing.c
* ./a.out
*/

#include <stdio.h>
#include <stdlib.h>

int main() {
    int guess1 = 0, guess2 = 0;
    int rand1 = rand() % 10 + 1;
    int rand2 = rand() % 10 + 1;

    printf("%d  %d\n", rand1, rand2);

    // fill in the code below
    int val = 0;
    printf("Please enter 2 integers from 1 to 10: ");
    scanf("%d %d", &guess1, &guess2);

    printf("%d %d \n", guess1, guess2);


    if (guess1 == rand1 && guess2 == rand2) {
        val += 100;
        printf("Points: %d \n", val);

    }

    else if (guess1 == rand2 && guess2 == rand1) {
        val += 50;
        printf("Points: %d \n", val);

    }

    else if (guess1 == rand1 && guess2 != rand2) {
        val += 25;
        printf("Points: %d \n", val);

    }

    else if (guess1 != rand1 && guess2 == rand2) {
        val += 25;
        printf("Points: %d \n", val);

    }

    else if (guess1 != rand2 && guess2 == rand1) {
        val += 10;
        printf("Points: %d \n", val);

    }

    else if (guess1 == rand2 && guess2 != rand1) {
        val += 10;
        printf("Points: %d \n", val);

    } else {
        printf("Points: %d \n", val);
    }



    return 0;
}
