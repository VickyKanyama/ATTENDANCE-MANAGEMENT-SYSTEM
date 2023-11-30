public class Student extends Person {
    private String studentAdmNo;
    private Course courseNo;
    private Unit unitNo;

    public Student(String name, int age, String studentAdmNo, Course courseNo, Unit unitNo) {
        super(name, age);
        this.studentAdmNo = studentAdmNo;
        this.courseNo = courseNo;
        this.unitNo = unitNo;
    }
    private String getStudentAdmNo(){
        return studentAdmNo;
    }
    private void setStudentAdmNo(String studentAdmNo){
        this.studentAdmNo=studentAdmNo;
    }
    private  Course getCourseNo(){
        return courseNo;
    }
    private void setCourseNo(Course courseNo){
        this.courseNo=courseNo;
    }
    private Unit getUnitNo(){
        return unitNo;
    }
    private  void setUnitNo(Unit unitNo){
        this.unitNo=unitNo;
    }
}
