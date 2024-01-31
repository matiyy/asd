public class zad1 {
    public static void main(String[] args) {
        System.out.println(ryby(2681));
    }

    public static double ryby(int minuty){

        if(minuty == 1)return 1000;
     else{
         return ryby(minuty - 1) * Math.pow(Math.PI, 0.002)*0.996;
     }
    }
}
