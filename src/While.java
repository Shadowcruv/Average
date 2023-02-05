import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        While yes = new While();
        //
        // yes.getHCF();
        System.out.print("The highest Common Factor is " + yes.getSum());
    }

    public double getSum() {
        double avg = 0.0;
        double score, cnt = 0;
        double sum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            score = scanner.nextInt();
            if (score < 0) break;
            sum = +score;
            cnt++;
            if (cnt > 0)
                avg = sum / cnt;
            else {
            }
        }
        return avg;
    }
}