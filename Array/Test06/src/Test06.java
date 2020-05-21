//定义sym方法，判断数组中的元素值是否对称.
public class Test06 {
    public static void main(String[] args) {
        int arr1 []={1,2,3,4,5,4,3,2,1};
        int arr2 []={2,3,45,6,6,45,3,2,2,};
        System.out.println("数组arr1是否两端对称："+sym(arr1));
        System.out.println("数组arr1是否两端对称："+sym(arr2));
    }
    public static boolean sym(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        for (start = 0; start < end; start++ , end--){
            if (arr[start] != arr[end]){
                return false;
            }
        }
        return true;
    }
}
