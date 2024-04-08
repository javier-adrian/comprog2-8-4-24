public class Main {
    public static void main(String[] args) {
        Student student = new Student(
                "2023-2-000679",
                "Adrian Javier",
                "B45 L34, Carnation St., Mabuhay Homes 2000, Salawag",
                "Male",
                "Information Systems",
                1
                );

        student.setComputer_grade(87);
        student.setEnglish_grade(90);
        student.setScience_grade(88);
        student.setMath_grade(89);

        student.displayStudentInfo();
//        System.out.println();
//        student.displayStudentGrades();


    }
}