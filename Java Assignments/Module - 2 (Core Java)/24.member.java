// Create a class named 'Member' having the following members: Data members, Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary' which prints the salary of the members.

class twentyFour {

    public static void main(String[] args) {

        Member member = new Member();

        member.printSalary(50000);
    }
}

class Member {

    String name;
    int age;
    long phoneNumber;
    String address;
    int salary;

    public void printSalary(int salary) {
        System.out.println("Salary: " + salary);
    }
}