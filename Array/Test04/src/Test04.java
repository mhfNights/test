//统计字符
//
//        * 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
//        * 定义printCount方法，统计每个字符出现的次数并打印到控制台。
public class Test04 {
    public static void main(String[] args) {
        //  获取长度100的字符数组
        char[] charArray = {'a','l','f','m','f','o','b','b','s','n'};
        //  统计字符数组中字母出现次数
        printCount(charArray);
    }
    public static void printCount(char[] charArray) {
        int[] count= new int[26];
        // 对应保存字母出现的次数
        for (int i = 0; i < charArray.length; i++) {
            int c  = charArray[i];
            count[c- 97]++;
        }
        // 打印字母和次数
        for (int i = 0, ch = 97; i < count.length; i++, ch++) {
            if (count[i] != 0 ) {
                System.out.println((char) ch + "--" + count[i]);
            }
        }
    }
}
