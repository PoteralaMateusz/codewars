package bouncing_balls;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        int sawBall = 1;
        double currentH = h;
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h)
            return -1;
        else {
            while (window < currentH * bounce) {
                sawBall += 2;
                currentH *= bounce;
            }

            return sawBall;
        }
    }

    public static void main(String[] args) {

        System.out.println(BouncingBall.bouncingBall(3.0, 0.66, 1.5));
        System.out.println(BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
}
