//打印扑克牌.
public class Test02 {
    public static void main(String[] args) {
        printPoker();
    }
    public static void printPoker(){
        String arrSuit[]={"红桃","黑桃","方块","梅花"};
        String arrLetter[]=
                {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                System.out.print(arrSuit[i]+arrLetter[j]+" ");
            }
            System.out.println();
        }
        System.out.print("大王"+" ");
        System.out.println("小王");
    }
}
