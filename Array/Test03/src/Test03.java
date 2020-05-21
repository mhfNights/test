//模拟在一副牌中，抽取第1张，第5张，第50张扑克牌。
public class Test03 {
    public static void main(String[] args) {
        printPoker(poker());
    }
    public static String[] poker(){
        String arrSuit[]={"红桃","黑桃","方块","梅花"};
        String arrLetter[]=
                {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String arrKing[]={"大王","小王"};
        String arrPoker []=new String [54];
        int index=0;
        for (int i = 0;i < 4;i++){
            for (int j =0; j < 13; j++){
                arrPoker[index]=arrSuit[i]+arrLetter[j];
                index++;
            }
        }
        arrPoker[52]=arrKing[0];
        arrPoker[53]=arrKing[1];
        return arrPoker;
    }
    public static void printPoker(String[] arr){
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr[49]);
    }

}
