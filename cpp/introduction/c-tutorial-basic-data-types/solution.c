#include <stdio.h>

int main() {
    int i;
    long l;    
    char ch;
    float f;
    double d;
    
    scanf("%d %ld %c %f %lf", &i, &l, &ch, &f, &d);
    printf("%d\n%ld\n%c\n%.3f\n%.9lf\n", i, l, ch, f, d);
    
    return 0;
}
