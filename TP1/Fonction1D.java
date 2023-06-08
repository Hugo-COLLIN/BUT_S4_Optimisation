public class Fonction1D
{
    public static void main(String[] args) {
        Fonction1D f = new Fonction1D();
        System.out.println(f.calc(-3.8));

//        System.out.println(f.descente_gradient(-3, 0.1, 0.00000000001));
        System.out.println(gradientDescent(new Fonction1D(),2, 0.1));
    }

    double calc(double x)
    {
        return Math.cos(x) * Math.pow(x-1, 2);
    }

    static double gradientDescent(Fonction1D f, double initialX, double stepCoefficient)
    {
        double currentX = initialX;
        double currentY = f.calc(initialX);

//        double previousX = initialX;
        double previousY = currentY;
        currentX += stepCoefficient * previousY;

        int iter = 100;

        while (iter > 0)
        {
            iter --;
            currentY = f.calc(currentX);
            if (currentY > previousY)
                stepCoefficient /= -2;

//            previousX = currentX;
            currentX += stepCoefficient * previousY;

            previousY = currentY;
        }
        return currentX;
    }
















//
//    /*
//    x0 : point de départ
//    alpha : pas d'apprentissage
//    epsilon : précision
//     */
//    double descente_gradient(double x, double alpha, double epsilon)
//    {
//        double x1 = x;
//        double x2 = x1 - alpha * derivee(x1);
//        while (Math.abs(x2 - x1) > epsilon)
//        {
//            x1 = x2;
//            x2 = x1 - alpha * derivee(x1);
//        }
//        return x2;
//    }
//
//    double derivee(double x)
//    {
//        return -2 * Math.cos(x) * (x - 1) - Math.sin(x) * Math.pow(x - 1, 2);
//    }
}
