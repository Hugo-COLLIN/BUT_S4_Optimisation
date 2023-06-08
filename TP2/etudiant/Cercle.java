package etudiant;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Cercle {

    /**
     * coordonnees du centre
     */
    private  Point2D centre;

    /**
     * rayon
     */
    private  double rayon;

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }


    public Cercle(double x, double y, double r) {
        this.centre = new Point2D(x, y);
        this.rayon = r;
    }


    public double getX() {
        return this.centre.getX();
    }

    public double getY() {
        return this.centre.getY();
    }

    public double getRayon() {
        return this.rayon;
    }

}
