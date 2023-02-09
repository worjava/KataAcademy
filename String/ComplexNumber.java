package String;

public class ComplexNumber {
private double re;
private double im;

public ComplexNumber() {

}

public ComplexNumber(double re, double im) {
    this.re = re;
    this.im = im;
}

public double getRe() {
    return re;
}

public double getIm() {
    return im;
}

@Override
public boolean equals(Object o) {
    if (this == o) {
        return true;
    }
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    ComplexNumber that = (ComplexNumber) o;
    return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
}

@Override
public int hashCode() {
    return (int) (re - im + 10 * re);
}

    public static void main(String[] Любое_слово_подойдет_для_мейна) {
ComplexNumber  A  = new ComplexNumber(1,2);
    }
}
