public class FernFlower {
    public String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {

        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


        if (r1 >= r2 && distanciaCentros + r2 <= r1) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }
}
