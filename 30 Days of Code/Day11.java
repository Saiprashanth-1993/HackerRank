//this is part of working code.
//If you want to run the code please visit,
//https://www.hackerrank.com/challenges/30-2d-arrays

int sum[] = new int[16];
int h = 0;
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                + arr[i+2][j+2];
        h++;
    }
}
Arrays.sort(sum);
System.out.println(sum[15]);

