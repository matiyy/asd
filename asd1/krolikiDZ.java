public class krolikiDZ {
    public static void main(String[] args) {
        final int N = 12;
        System.out.println(2*krolik(N));//2* ile jest któlików po N miesiacach
    }
    static int krolik(int n){
        if(n==0)
        {
            return 0;
        }
        if(n == 1 || n==2)
        {
            return 1;
        }
        else
        {
            return krolik(n-1)+krolik(n-2);
        }
    }
}
