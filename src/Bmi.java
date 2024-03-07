import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bmi {
    public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program will calculate your BMI ");

    // Get user input for height and weight
            System.out.println("Enter your height: ");
            float heightOrnella=Float.parseFloat(br.readLine())/100;

            System.out.println("Enter your weight: ");
            float weightOrnella=Float.parseFloat(br.readLine());
        float bmi = calculateBMI(heightOrnella, weightOrnella);

        String category;

        if (bmi < 16.00) {
            category = "Starvation";
        } else if (bmi >= 16.00 && bmi <= 16.99) {
            category = "Emaciation";
        } else if (bmi >= 17.00 && bmi <= 18.49) {
            category = "Underweight";
        } else if (bmi >= 18.50 && bmi <= 22.99) {
            category = "Normal, Low Range";
        } else if (bmi >= 23.00 && bmi <= 24.99) {
            category = "Normal, High Range";
        } else if (bmi >= 25.00 && bmi <= 27.49) {
            category = "Overweight, Low Range";
        } else if (bmi >= 27.50 && bmi <= 29.99) {
            category = "Overweight, High Range";
        } else if (bmi >= 30.00 && bmi <= 34.9) {
            category = "1st Degree Obesity";
        } else if (bmi >= 35.00 && bmi <= 39.9) {
            category = "2nd Degree Obesity";
        } else {
            category = "3rd Degree Obesity";
        }

        System.out.println("Your BMI: " + bmi);
        System.out.println("Category: " + category);
    }
    private static float calculateBMI(float height, float weight) {
        return weight / (float) Math.pow(height, 2);
    }
}