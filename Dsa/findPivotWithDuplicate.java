public class findPivotWithDuplicate{
    public static void main(String[] args){
        int[] arr = {2 ,9 ,2 ,2 ,2};
        System.out.print(findPivotDupli(arr));
    }
    static int findPivotDupli(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end - start)/2;
        while(start < end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(start > start+1){
                    return start;
                }
                start++;
                if(end < end-1){
                    return end;
                }
                end++;
            }
            else if(arr[start]<arr[mid]|| arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
} {
    
}
public class findPivotWithDuplicate{
    public static void main(String[] args){
        int[] arr = {2 ,9 ,2 ,2 ,2};
        System.out.print(findPivotDupli(arr));
    }
    static int findPivotDupli(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end - start)/2;
        while(start < end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(start > start+1){
                    return start;
                }
                start++;
                if(end < end-1){
                    return end;
                }
                end++;
            }
            else if(arr[start]<arr[mid]|| arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
} {
    
}
public class findPivotWithDuplicate{
    public static void main(String[] args){
        int[] arr = {2 ,9 ,2 ,2 ,2};
        System.out.print(findPivotDupli(arr));
    }
    static int findPivotDupli(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end - start)/2;
        while(start < end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(start > start+1){
                    return start;
                }
                start++;
                if(end < end-1){
                    return end;
                }
                end++;
            }
            else if(arr[start]<arr[mid]|| arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
} {
    
}
public class findPivotWithDuplicate{
    public static void main(String[] args){
        int[] arr = {2 ,9 ,2 ,2 ,2};
        System.out.print(findPivotDupli(arr));
    }
    static int findPivotDupli(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end - start)/2;
        while(start < end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(start > start+1){
                    return start;
                }
                start++;
                if(end < end-1){
                    return end;
                }
                end++;
            }
            else if(arr[start]<arr[mid]|| arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
} {
    
}
public class findPivotWithDuplicate{
    public static void main(String[] args){
        int[] arr = {2 ,9 ,2 ,2 ,2};
        System.out.print(findPivotDupli(arr));
    }
    static int findPivotDupli(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end - start)/2;
        while(start < end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(start > start+1){
                    return start;
                }
                start++;
                if(end < end-1){
                    return end;
                }
                end++;
            }
            else if(arr[start]<arr[mid]|| arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
} {
    
}
