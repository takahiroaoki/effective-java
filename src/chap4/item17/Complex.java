package chap4.item17;

final class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(this.re + c.re, this.im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(this.re - c.re, this.im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(this.re * c.re - this.im * c.im, this.im * c.re + this.re * c.im);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((this.re * c.re + this.im * c.im) / tmp, (this.im * c.re - this.re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Complex)) {
            return false;
        }

        Complex c = (Complex) o;
        return Double.compare(this.re, c.re) == 0 && Double.compare(this.im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(re)
                .append(" + ")
                .append(im)
                .append("*i");
        return sb.toString();
    }
}
