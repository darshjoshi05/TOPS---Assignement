// W.A.J.P to create a class Student with attributes roll no, name, age and
// course. Initialize values through parameterized constructor. If age of
// student is not in between 15 and 21 then generate user defined exception
// "AgeNotWithinRangeException". If name contains numbers or special symbols
// raise exception "NameNotValidException". Define the two exception classes.

class forty {

    public static void main(String[] args) {
        try {
            Student student = new Student(1, "Darsh", 14, "CSE");
            System.out.println("Student details: " + student.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
    }

    public Student(int rollNo, String name, int age, String course)
            throws NameNotValidException, AgeNotWithinRangeException {
        validate(rollNo, name, age, course);

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private void validate(int rollNo2, String name2, int age2, String course2)
            throws NameNotValidException, AgeNotWithinRangeException {
        if (age2 < 15 || age2 > 21) {
            throw new AgeNotWithinRangeException("Age not within range");
        }
        if (!name2.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name not valid");
        }
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}