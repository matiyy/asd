public class InsectPopulationSimulation {

    private double males;
    private double females;
    private double total;

    public InsectPopulationSimulation(double initialMales, double initialFemales) {
        this.males = initialMales;
        this.females = initialFemales;
        this.total = initialMales + initialFemales;
    }

    public void reproduce() {
        double newMales = 0.15 * females * 0.47;
        double newFemales = 0.15 * females * 0.53;

        males += newMales;
        females += newFemales;
        total += newMales + newFemales;

        females *= 0.95; // 5% mortality rate for females
        males *= 0.98;   // 2% mortality rate for males
    }

    public void simulateWeeks(int weeks) {
        for (int i = 0; i < weeks; i++) {
            reproduce();
        }
    }

    public double getMales() {
        return males;
    }

    public double getFemales() {
        return females;
    }

    public double getTotal() {
        return total;
    }

    public static void main(String[] args) {
        InsectPopulationSimulation population = new InsectPopulationSimulation(450, 550);

        int weeksToCheck = 0;
        while (population.getMales() < population.getFemales()) {
            population.simulateWeeks(1);
            weeksToCheck++;
        }

        System.out.println("Po " + weeksToCheck + " tygodniach liczba samców zrówna się lub przekroczy liczbę samic.");
        System.out.println("Liczba wszystkich osobników: " + population.getTotal());
    }
}
