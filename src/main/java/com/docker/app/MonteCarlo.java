package com.docker.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class MonteCarlo {

    private int inCircle = 0;
    private int outCircle = 0;
    private final BigDecimal pi = new BigDecimal("3.141592653589793238462643");
    private final BigDecimal epsilon = new BigDecimal("0.00001");
    private final Random random = new Random();

    private BigDecimal calcPi() { return BigDecimal.valueOf(4.0 * ((double) inCircle / ((double) inCircle + (double) outCircle))); }

    private String print(int n) {
        DecimalFormat df = new DecimalFormat("#.####");
        return " { Monte Carlo simulation has started with n  = " + n + " | Points: in = " + inCircle + ", out = " + outCircle +
                " | Pi calculated: " + df.format(calcPi()) + " | In+out = " + (outCircle + inCircle) + " | Difference: Pi calculated (" +
                df.format(calcPi()) + ") - Pi (" + df.format(pi.setScale(10, RoundingMode.CEILING))   + ") = " +
                df.format(calcPi().subtract(pi).abs().setScale(10, RoundingMode.CEILING)) + " } ";
    }

    private void setZeroPoints() { inCircle = 0; outCircle = 0;}

    public String showCals(int n) {
        setZeroPoints();
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) inCircle++;
            else outCircle++;
        }
        return print(n);
    }

    public String calcEpsilon() {
        setZeroPoints();
        BigDecimal piCalc = BigDecimal.valueOf(0.0);
        boolean done = false;
        while (!done) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) inCircle++;
            else  outCircle++;
            piCalc = calcPi();
            BigDecimal dec = piCalc.subtract(pi).abs();
            int error = dec.compareTo(epsilon);
            if (error < 0) done = true;
            if ((inCircle + outCircle) > 100000000) break;
        }
        return "{ Error (" + pi.subtract(piCalc).abs().setScale(15, RoundingMode.CEILING)  + ") < epsilon (" +
                epsilon.setScale(10, RoundingMode.CEILING) + ") ==> is less than epsilon = " + done + " < then > " + print(inCircle + outCircle) + " } ";
    }
}