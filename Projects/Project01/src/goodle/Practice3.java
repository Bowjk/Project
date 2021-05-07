package goodle;
public class Practice3 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        String m = Integer.toBinaryString(60);
        String n = Integer.toHexString(60);
        String p = " ";
        System.out.println(m);
        System.out.println(n);
        System.out.println(n+p+m);
        int i1 = 50;
        int i2 = i1 & 15;
        String j = (i2>9)?(char)(i2-10+'A')+"":i2+"";
        int temp = i1>>>4;
        i2 = temp & 15;
        String k = (i2>9)?(char)(i2-10+'A')+"":i2+"";
        System.out.println(k+""+j);
    }
}