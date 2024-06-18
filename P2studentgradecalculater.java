import java.util.Scanner;

public class P2studentgradecalculater {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter marks in Math: ");
    int mathMarks = sc.nextInt();

    System.out.print("Enter marks in Science: ");
    int scienceMarks = sc.nextInt();

    System.out.print("Enter marks in English: ");
    int englishMarks = sc.nextInt();

    int totalMarks = mathMarks + scienceMarks + englishMarks;
    double averagePercentage = (totalMarks / 3.0) * 100;

    String grade;
    if (averagePercentage >= 90) {
      grade = "A";
    } else if (averagePercentage >= 80) {
      grade = "B";
    } else if (averagePercentage >= 70) {
      grade = "C";
    } else if (averagePercentage >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }

    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + averagePercentage + "%");
    System.out.println("Grade: " + grade);
  }
}