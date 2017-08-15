package com.mageets.learningjava.calcengine;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100,50);
        equations[1] = new MathEquation('a',25,92);
        equations[2] = new MathEquation('s',225,17);
        equations[3] = new MathEquation('m',11,3);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println(equation.getResult());
        }

        System.out.println("\n---Using Overloads---");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("result=" + equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.println("result=" + equationOverload.getResult());

        // the system will pick the (double,double) as the leftVal double cannot
        // be implicity converted to an int as this would be narrowing
        equationOverload.execute((double)leftInt, rightInt);
        System.out.println("result=" + equationOverload.getResult());

    }
}
