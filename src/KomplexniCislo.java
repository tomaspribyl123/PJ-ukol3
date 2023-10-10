public class KomplexniCislo {
    private double real;
    private double imag;

    public KomplexniCislo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public KomplexniCislo secti(KomplexniCislo other) {
        double realSecti = this.real + other.real;
        double imagSecti = this.imag + other.imag;
        return new KomplexniCislo(realSecti, imagSecti);
    }

    public KomplexniCislo odecti(KomplexniCislo other) {
        double realOdecti = this.real - other.real;
        double imagOdecti = this.imag - other.imag;
        return new KomplexniCislo(realOdecti, imagOdecti);
    }

    public KomplexniCislo vynasob(KomplexniCislo other) {
        double realVynasob = (this.real * other.real) - (this.imag * other.imag);
        double imagVynasob = (this.real * other.imag) + (this.imag * other.real);
        return new KomplexniCislo(realVynasob, imagVynasob);
    }


    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + Math.abs(imag) + "i";
        }
    }

    public static void main(String[] args) {
        KomplexniCislo cislo1 = new KomplexniCislo(4, 2);
        KomplexniCislo cislo2 = new KomplexniCislo(1, 7);

        KomplexniCislo soucet = cislo1.secti(cislo2);
        KomplexniCislo rozdil = cislo1.odecti(cislo2);
        KomplexniCislo produkt = cislo1.vynasob(cislo2);

        System.out.println("Součet: " + soucet);
        System.out.println("Rozdíl: " + rozdil);
        System.out.println("Součin: " + produkt);
    }
}
