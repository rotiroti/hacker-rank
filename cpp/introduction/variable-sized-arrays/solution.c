#include<stdio.h>
#include<stdlib.h>

int main(void)
{
    int n, q, k, elem, t1, t2;
    int **a = NULL;

    scanf("%d%d\n", &n, &q);

    a = (int **) malloc(n * sizeof(int *));

    for (int i = 0; i < n; i++) {
        scanf("%d", &k);

        a[i] = (int *) malloc(k * sizeof(int));

        for (int j = 0; j < k; j++) {
            scanf("%d", &elem);
            a[i][j] = elem;
        }
    }

    for (int i = 0; i < q; i++) {
        scanf("%d%d\n", &t1, &t2);
        printf("%d\n", a[t1][t2]);
    }

    for (int i = 0; i < n; i ++) {
        free(a[i]);
        a[i] = NULL;
    }

    free(a);
    a = NULL;

    return 0;
}
