public class PrefixPostix {
    public static void main(String[] args) {
        int prefixValue = 10;
        /*note that the value changes in same line */
        System.out.println(++prefixValue);
        System.out.println(prefixValue);
        int postfix =20;
        /*note that the value doesnot change in same line */
        System.out.println(postfix++);
        System.out.println(postfix);
    }
}
