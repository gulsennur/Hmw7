public class Gezegen {
    public enum Gezegenler {
        MERKÜR(1, 50, 2425, 58.65),
        VENÜS(2, 100, 2426, 22.26),
        DÜNYA(3, 150, 2426, 22.34),
        MARS(4, 200, 2527, 24.36),
        JÜPİTER(5, 700, 2528, 35.36),
        SATÜRN(6, 1000, 2530, 37.45),
        URANÜS(7, 2000, 3032, 38.39),
        NEPTÜN(8, 4000, 3035, 40.43);

        private int sıraNumarası;
        private int uzaklık;
        private double yarıçap;
        private double dönmeSüresi;

        Gezegenler(int sıraNumarası, int uzaklık, double yarıçap, double dönmeSüresi) {
            this.sıraNumarası = sıraNumarası;
            this.uzaklık = uzaklık;
            this.yarıçap = yarıçap;
            this.dönmeSüresi = dönmeSüresi;
        }

        public int getSıraNumarası() {
            return sıraNumarası;
        }

        public int getUzaklık() {
            return uzaklık;
        }

        public double getYarıçap() {
            return yarıçap;
        }

        public double getDönmeSüresi() {
            return dönmeSüresi;
        }
    }

    public static void main(String[] args) {
        for (Gezegenler gezegen : Gezegenler.values()) {
            System.out.println("Gezegen: " + gezegen + "\n" +
                    "Sıra Numarası: " + gezegen.getSıraNumarası() + "\n" +
                    "Uzaklık: " + gezegen.getUzaklık() + " milyon km\n" +
                    "Yarıçap: " + gezegen.getYarıçap() + " km\n" +
                    "Dönme Süresi: " + gezegen.getDönmeSüresi() + " saat\n");
            System.out.println("--------------------------------------");
        }
    }
}