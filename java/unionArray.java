class unionArray {
    public static int findUnion(int a[], int b[]) {
        int m=a.length;
        int n=b.length;
        int temp[]=new int[m+n];
        
        for(int i=0;i<m;i++){
            temp[i]=a[i];
        }
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                temp[k]=a[i];
                i--;
            }
            else{
                temp[k]=b[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            temp[k]=b[j];
            k--;
            j--;
        }
       Arrays.sort(temp);
       int count=1;
       for(int x=1;x<temp.length;x++){
           if(temp[x]!=temp[x-1]){
               count++;
           }
       }
       return count;
    }
}