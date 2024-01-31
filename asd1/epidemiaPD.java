public class epidemiaPD {
    public static void main(String[] args) {
        final int dni = 5;
//        System.out.println("zdrowych: " + (10000 - epidemia(dni))
//                + ", chorych: " + epidemia(dni));
        System.out.println(epidemia(3));
    }

    static int epidemia(int dni) {
        int[] tab = new int[dni + 1];

        if (dni == 0)
            return 0;
        if (dni == 1)
            return 10;

        tab[1] = 10;

        for (int i = 2; i < tab.length; i++) {
            if (i < 8)
                tab[i] = 3 * tab[i - 1];
            else if (i == 8) {
                tab[i] = 3 * tab[i - 1] - tab[i - 7];
            }
            else tab[i] = 3 * tab[i - 1] - 2*tab[i - 8];
        }
        return tab[tab.length - 1];
    }
}
