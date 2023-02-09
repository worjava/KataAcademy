package Other;

import java.util.Objects;

public class HashCode {
    double re;
    double im;

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HashCode hashCode)) return false;
        return Double.compare(hashCode.re, re) == 0 && Double.compare(hashCode.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public HashCode(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static void main(String[] args) {
        HashCode hashCode = new HashCode(2.2, 2.1);
        HashCode hashCode1 = new HashCode(2., 2.2);

        System.out.println();
        System.out.println(Double.compare(hashCode.im,hashCode1.re));
        System.out.println("-----------------------------------------------------------");

        System.out.println( (Double.compare(hashCode.getRe() ,hashCode1.getIm())));


        System.out.println(hashCode.getClass());

    }
}
