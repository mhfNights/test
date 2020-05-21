//定义equals方法，比较数组内容是否完全一致
public class Test07 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7,8,9};
        int [] arr2={1,2,3,4,5,6,7,8,9};
        int [] arr3={1,2,3,4,5,6,5,8,9,1};
        int [] arr4={1,2,3,4,3,6,7,8,9,11};
        System.out.println("arr1和arr2是否完全一致："+equals(arr1,arr2));
        System.out.println("arr2和arr3是否完全一致："+equals(arr2,arr3));
        System.out.println("arr3和arr4是否完全一致："+equals(arr3,arr4));
        System.out.println("arr1和arr4是否完全一致："+equals(arr1,arr4));
        System.out.println("arr1和arr3是否完全一致："+equals(arr1,arr3));
        System.out.println("arr2和arr4是否完全一致："+equals(arr2,arr4));
    }
    public static boolean equals(int [] arr1, int [] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++){
            if (arr1 [i] != arr2 [i]){
                return false;
            }
        }
        return true;
    }
}
