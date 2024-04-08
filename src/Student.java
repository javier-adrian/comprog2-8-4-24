public class Student {
    private String student_id;
    private String name;
    private String address;
    private String gender;
    private String course;
    private int year_level;
    private float math_grade;
    private float english_grade;
    private float science_grade;
    private float computer_grade;

    public Student(
            String student_id,
            String name,
            String address,
            String gender,
            String course,
            int year_level
                   ) {
        this.student_id = student_id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.course = course;
        this.year_level = year_level;
    }

    public float getMath_grade() {
        return math_grade;
    }

    public void setMath_grade(float math_grade) {
        this.math_grade = math_grade;
    }

    public float getEnglish_grade() {
        return english_grade;
    }

    public void setEnglish_grade(float english_grade) {
        this.english_grade = english_grade;
    }

    public float getScience_grade() {
        return science_grade;
    }

    public void setScience_grade(float science_grade) {
        this.science_grade = science_grade;
    }

    public float getComputer_grade() {
        return computer_grade;
    }

    public void setComputer_grade(float computer_grade) {
        this.computer_grade = computer_grade;
    }

    public float getAverage_grade(){
        return (math_grade + english_grade + science_grade + computer_grade) / 4;
    }

    public int getYear_level() {
        return year_level;
    }

    public String getCourse() {
        return course;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + student_id);
        System.out.println("Name: " + name);
        System.out.println("Year Level: " + year_level);
        System.out.println("Course: " + course);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println();
        System.out.println("Math: " + math_grade);
        System.out.println("English: " + english_grade);
        System.out.println("Science: " + science_grade);
        System.out.println("Computer: " + computer_grade);
        System.out.println("Average: " + getAverage_grade());
    }

    public void displayStudentGrades() {
    }
}
