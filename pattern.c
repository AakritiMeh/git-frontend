#include <stdio.h>;
int main(){
    int n=5;
    for(int i=0;i<=5;i++){
        for(int j=0;j<=i;j++){
            printf("%d",j);
        }
        printf("\n");
    }
    for(int i=n-1;i>=0;i--){
        for(int j=i;j>=0;j--){
            printf("%d",j);
        }
        printf("\n");
    }
    return 0;
}
