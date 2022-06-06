public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 50;
        double height = 1.58;
        int myBmi = service.bmi(weight,height);
        System.out.println(myBmi);
    }
}
