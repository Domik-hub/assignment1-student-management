public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ali Khan", "S001", "Computer Science");
        Student s2 = new Student("Dusenbai Damir", "S002", "Software Engineering");
        Student s3 = new Student("Murat Nur", "S003", "Business");
        Student s4 = new Student("Aisha Berik", "S004", "IT");
        Student s5 = new Student("David Gattouz", "S005", "Math");

        s1.updateGPA(3.8); s1.addCredits(90);
        s2.updateGPA(3.2); s2.addCredits(70);
        s3.updateGPA(3.9); s3.addCredits(110);
        s4.updateGPA(2.9); s4.addCredits(60);
        s5.updateGPA(3.6); s5.addCredits(100);

        Course course = new Course("OOP", "Aidana Aidynkyz", 5);
        course.addStudent(s1, 0);
        course.addStudent(s2, 1);
        course.addStudent(s3, 2);
        course.addStudent(s4, 3);
        course.addStudent(s5, 4);

        System.out.println("\nHighest Credit Student:");
        System.out.println(course.highestCreditStudent().getName());

        System.out.printf("\nAverage GPA:\n%.2f\n", course.courseAverageGPA());

        Student[] arr = {s1, s2, s3, s4, s5};

        System.out.println("\nTop GPA Student:");
        System.out.println(getTopStudent(arr).getName());

        System.out.println("\nNumber of Honors Students:");
        System.out.println(countHonors(arr));

        System.out.println("\nTotal Credits:");
        System.out.println(totalCredits(arr));
    }

    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];

        for (Student s : arr) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            total += s.getCredits();
        }
        return total;
    }
}
