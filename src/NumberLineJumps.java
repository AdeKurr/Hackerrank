public class NumberLineJumps {
    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        String result = "";

        if (v1>v2&&(x2-x1)%(v1-v2)==0)
        System.out.println("YES");
        else
        System.out.println("NO");
        
        System.out.println(result);
    }   
}
