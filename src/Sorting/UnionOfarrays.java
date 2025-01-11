public class UnionOfarrays {
    public void Union(int a[], int b[]){
        int m= a.length;
        int n= b.length;
        int i=0;
        int j=0;
        while(i<m && j<n) {
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue; //if same elements move to next index.
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]< b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else if(b[j]<a[i]){
                System.out.print(b[j]+" ");
                j++;
            }
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
         while(i<m){
             if(i==0 || a[i]!=a[i-1]) {
                 System.out.print(a[i] + " ");

             }
             i++;
         }
         while(j<n){
             if(j==0 || a[j]!=a[j-1]) {
                 System.out.print(b[j] + " ");

             }
             j++;
         }
            }
            public static void main(String args[]){
          UnionOfarrays obj = new UnionOfarrays();
          int a[]= {1,2,4,4,5,6};
          int b[]= {2,4,5,7,8,9};
          obj.Union(a, b);
            }

        }

