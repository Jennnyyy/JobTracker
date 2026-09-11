import java.util.ArrayList;
import java.util.Scanner;

void main() {

  Scanner Scanner = new Scanner(System.in);
  ArrayList<JobApplication> Applications = new ArrayList<>();

  while (true) {
    System.out.println("====Job Tracker====");
    System.out.println("1. Add Application");
    System.out.println("2. View Application");
    System.out.println("3. Exit");

    int userChoice = Integer.parseInt(Scanner.nextLine());

    //The information needed:
    // Today's Date--Formatted 00/00/0000,
    // Company Name,
    // Position Title,
    // Status: Applied, In Progress or Denied
    if (userChoice == 1) {
      System.out.println("Today's Date 00/00/0000");
      String Date = Scanner.nextLine();

      System.out.println("Name of Company");
      String Companies = Scanner.nextLine();

      System.out.println("Can you write the job title/position you are looking into?");
      String JobTitles = Scanner.nextLine();

      System.out.println("Applied or In Progress or Denied");
      String PresentStatus = Scanner.nextLine();

      //Create new Application object

      JobApplication application = new JobApplication();
      application.date = Date;
      application.position = JobTitles;
      application.company = Companies;
      application.status = PresentStatus;

      Applications.add(application);

    } else if (userChoice == 2) {

      if (Applications.size() != 0) {

        for (int i = 0; i < Applications.size(); i++) {
          System.out.println("I applied to "+ Applications.get(i).company + "on this date:" +  Applications.get(i).date + " for this position" +  Applications.get(i).position +" and the status of this application is " +  Applications.get(i).status);
        }
      } else {
        System.out.print("I have not applied to anything yet...");
      }

    } else if (userChoice == 3) {
      System.out.println("You ended this. It was not me. It was you.");
      break;

    }
    System.out.println("Do you want to add anymore applications you are working on?");
  }
}

class JobApplication {
  String date;
  String company;
  String position;
  String status;
}