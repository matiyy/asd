public class bakteriePD {

    public static void main(String[] args) {
        System.out.println(bakt(8));
    }

    static int bakt(int czas){
        int[] tab = new int[czas + 1];
        if (czas == 0) return 0;
        else if (czas == 1) return 1;

        tab[1] = 1;
        tab[2] = 2;
        for (int i = 3; i < tab.length; i++) {
            tab[i] = 2 * tab[i - 2];
        }

        return tab[tab.length - 1];
    }
}