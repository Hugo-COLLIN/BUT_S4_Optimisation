public class Fonction2D
{
    public static void main(String[] args) {
        // Question 1.3
        System.out.println(gradientDescent(new Fonction2D(),0, 0, 0.01, 0.01));

        //Question 1.4
        System.out.println(gradientDescent(new Fonction2D(),4, -1, 0.01, 0.01));

        //Question 1.5
            System.out.println(gradientDescent(new Fonction2D(),4, -1, 0.1, 0.01)); // return NaN (Not a Number)
    }

    double calc(double x, double y)
    {
        return Math.pow(Math.pow(x, 2) + y - 11, 2) + Math.pow(x + Math.pow(y, 2) - 7, 2);
    }

    static double gradientDescent(Fonction2D f, double initialX, double initialY, double stepCoefficientX, double stepCoefficientY)
    {
        double currentX = initialX;
        double currentY = initialY;
        double currentZ = f.calc(initialX, initialY);

//        double previousX = initialX;
        double previousZ = currentZ;
        currentX += stepCoefficientX * previousZ;

        int iter = 100;

        while (iter > 0)
        {
            // X
            iter --;
            currentZ = f.calc(currentX, currentY);
            if (currentZ > previousZ)
                stepCoefficientX /= -2;

//            previousX = currentX;
            currentX += stepCoefficientX * previousZ;

            previousZ = currentZ;

            // Y
            currentZ = f.calc(currentX, currentY);
            if (currentZ > previousZ)
                stepCoefficientY /= -2;

//            previousY = currentY;
            currentY += stepCoefficientY * previousZ;

            previousZ = currentZ;
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
