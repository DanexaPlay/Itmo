class Main {
    public static void prarr(double[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                System.out.print(String.format("%.5f ", w[i][j]));
            }
            System.out.println();
        }
    }

    public static void arr2d (short [] l1, float [] l2) {
        double[][] w1 = new double[11][18];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 18; j++) {
                if (l1[i] == 3) {
                    w1[i][j] = Math.atan(Math.sin(Math.log(Math.pow(Math.sin(l2[j]), 2))));
                    }
                else if (l1[i] == 7 || l1[i] == 9 || l1[i] == 13 || l1[i] == 17 || l1[i] == 19) {
                    w1[i][j] = Math.cos(Math.log(Math.abs(l2[j])));
                    }
                else {
                    w1[i][j] = Math.atan(0.1 * Math.sin(Math.sin(Math.exp(l2[j]))));
                    }
                }
            }
        prarr(w1);
        }

    public static void main(String[] args) {
        short[] w = new short[(23 - 3) / 2 + 1];
        int j = 0;
        for (short i = 3; i <= 23; i++) {
            w[j] = i;
            j++;;
            i++;
        };
        float[] x = new float[18];
        for (int i = 0; i < 18; i++) {
            if (Math.random() > 0.5) {
                x[i] = (float) Math.random() * 15;
            }
            else {
                x[i] = - (float) Math.random() * 5;
            }
        }
    arr2d(w, x);
    }
}