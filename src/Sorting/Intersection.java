public class Intersection {
    void Intersection(int a[], int b[], int m, int n) {
        int i=0;
        int j=0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
                if (a[i] < b[j]) {
                    i++;
                } else if (a[i] > b[j]) {
                    j++;
                } else {
                    System.out.print(a[i] + " ");
                    i++;
                    j++;
                }
            }
    }
    public static void main(String args[]){
        Intersection inter = new Intersection();
        int a[]={1,2,3,4,5};
        int b[]={1,2,2,10};
        int m=5;
        int n=4;
        inter.Intersection(a, b, m, n);
    }

}
