//统计高于平均分的分数有多少个。
//
//        * 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
//        * 定义getAvg方法，获取一个数组中的平均数
public class Test05 {
    public static void main(String[] args) {
        int count = 0;
        int arr []={95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        for (int i =0; i < arr.length; i++){
            if(arr [i]>getAvg(arr)){
                count++;
            }
        }
        System.out.println("数组的平均数为："+getAvg(arr)+" 大于平均数的有"+count+"个");

    }
    public  static int getAvg(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr [i];
        }
        int num=sum / arr.length;
        return num;
    }
}
