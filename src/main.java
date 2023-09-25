public class main {
    public static void main(String[] args) {

        int j = 2;

        while (j <= 10) {
            boolean torf = true;
            if (j == 2) {
                System.out.println(j);
            }
            else {
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
                        torf = false;
                    }
                }
            }
            if (torf == true && j!=2) {
                System.out.println(j);
            }
            j++;
        }

    }
}
