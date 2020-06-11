public class StudentGrade {
    private String name;
    private String surname;
    private int[] studentScore = new int[5];


    public StudentGrade(){

    }
    public StudentGrade(String name, String lName){
        this.name= name;
        surname = lname;
    }
    public StudentGrade(String name,String surname,int[] studentScore){
        this.name = name;
        this.surname = surname;
        this.studentScore = studentScore;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int[] studentScore) {
        this.studentScore = studentScore;
    }
}

