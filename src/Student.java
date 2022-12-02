public class Student {
    int age;
    int grade;
    String name;
    boolean isBoarder;
    String eyecolor;
    boolean favclassHumanities;
    public Student () {
       age = 14;
       boolean favclassHumanities = false;
       grade = 4;

    }

    public void print() {
        System.out.println("the student " + name + " is " + age + " years old");
        System.out.println("they are in class " + grade);
        System.out.println("it is " + isBoarder + " that they are a boarder");
        System.out.println("They have " + eyecolor + " eyes");
        System.out.println("It is " + favclassHumanities + " that they are more interested in humanities than STEM");
    }

}
