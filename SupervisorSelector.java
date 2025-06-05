import java.util.Scanner;

public class SupervisorSelector {
    public static void main(String[] args) {
        String[] supervisors = {
            "Vacant",
            "Heidi Wegleitner",
            "Analiese Eicher",
            "Matt Veldran",
            "Henry Fries",
            "Yogesh Chawla",
            "Erin Welsh",
            "Jeffrey Glazer",
            "Steven Peters",
            "Keith Furman",
            "Richelle Andrae",
            "Tommy Rylander",
            "Jay Brower",
            "Anthony Gray",
            "April Kigeya (Vice Chair)",
            "Rick Rose",
            "Dan Blazewicz",
            "Michele Ritt",
            "Brenda Yang",
            "Jeff Weigand",
            "Jeffrey Kroning",
            "Maureen McCarville",
            "Chuck Erickson",
            "Sarah Smith",
            "David Boetcher",
            "Lisa Jackson",
            "Kierstin Huelsemann",
            "Michele Doolan",
            "Don Postler",
            "Patrick Downing",
            "Jerry Bollig",
            "Chad Kemp (Vice Chair)",
            "Randy Udell",
            "Patrick Miles (Board Chair)",
            "Michael Engelberger",
            "David Peterson",
            "Kerry Marren"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dane County Board Supervisors:");
        for (int i = 0; i < supervisors.length; i++) {
            System.out.println("District " + (i + 1) + ": " + supervisors[i]);
        }

        System.out.print("\nEnter the district number of the supervisor you want to select: ");
        int district = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (district < 1 || district > supervisors.length) {
            System.out.println("Invalid district number.");
            return;
        }

        String selectedSupervisor = supervisors[district - 1];
        System.out.println("\nYou selected: " + selectedSupervisor + " (District " + district + ")");

        // Fill out a template letter
        System.out.print("\nEnter your name: ");
        String yourName = scanner.nextLine();

        System.out.println("\n----- REQUEST FOR LEGISLATIVE DRAFTING ASSISTANCE -----");
        System.out.println("Subject: Request for Legislative Drafting Assistance - [Your Topic]");
        System.out.println("Dear Corporation Counsel Pabellón,");
        System.out.println("I am working with Supervisor " + selectedSupervisor + " from District " + district +
                " to draft a [ordinance/resolution] regarding [brief description of issue].\n");
        System.out.println("The proposed legislation would:");
        System.out.println(" - [Key provision 1]");
        System.out.println(" - [Key provision 2]");
        System.out.println(" - [Key provision 3]\n");
        System.out.println("We would appreciate your assistance in drafting this legislation to ensure it meets all legal requirements and is properly formatted for consideration by the County Board.\n");
        System.out.println("Please let me know what additional information you need and when we might schedule a meeting to discuss this further.\n");
        System.out.println("Thank you,\n" + yourName);
    }
}
