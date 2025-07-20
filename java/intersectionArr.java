import java.util.*;
class intersectionArr{
    public static void main(String[] args){
        int[] a={1,2,2,3,4};
        int[] b={2,2};
        System.out.print(Arrays.toString(intersect(a,b)));
    }
    static int[] intersect(int[] a, int[] b){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> main=new HashSet<>();

        for(int i:a){
            set1.add(i);
        }
        for(int i:b){
            set2.add(i);
        }
        for(Integer i:set1){
            if(set2.contains(i)){
                main.add(i);
            }
        }

        int k=0;
        int res[]=new int[main.size()];
        for(int arr : main){
            res[k]=arr;
            k++;
        }
        return res;
    }
}