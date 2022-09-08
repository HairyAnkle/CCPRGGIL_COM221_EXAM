public class Student {
    
    //Properties:
    String surname;
    String firstName;
    char middleInitial;
    int month;
    int day;
    int year;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    //Constructor:

    public Student(String sn, String fn, char mI, int m, int d, int y, int stuN, String sEA, boolean amI) {

    surname = sn;
    firstName = fn;
    middleInitial = mI;
    month = m;
    day = d;
    year = y;
    studentNumber = stuN;
    studentEmailAddress = sEA;
    iAmAwesome = amI;
    
    }

    public void sayMyStudentNumber() {
        System.out.println("studentNumber: " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("studentEmailAddress: " + studentEmailAddress);
    }

    public void amIAwesome() {
        System.out.println("iAmAwesome: " + iAmAwesome);
    }

}
