package CreationalDesignPattern.Prototype;

public class Student {
    private String batchName;
    private double avgBatchPsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currentModule;
    private String name;
    private String phoneNumber;
    private String email;
    public Student copy() {

        Student student = new Student();
        student.batchName = this.batchName;
        student.avgBatchPsp = this.avgBatchPsp;
        student.instructorName = this.instructorName;
        student.monthOfEnrollment = this.monthOfEnrollment;
        student.currentModule = this.currentModule;
        return student;
        //return new Student(batchName, avgBatchPsp, instructorName, monthOfEnrollment, currentModule, name, phoneNumber, email);
    }
    public Student() {
    }

    public Student(String batchName, double avgBatchPsp, String instructorName, String monthOfEnrollment, String currentModule, String name, String phoneNumber, String email) {
        this.batchName = batchName;
        this.avgBatchPsp = avgBatchPsp;
        this.instructorName = instructorName;
        this.monthOfEnrollment = monthOfEnrollment;
        this.currentModule = currentModule;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }

    public void setCurrentModule(String currentModule) {
        this.currentModule = currentModule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchName() {
        return batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public String getCurrentModule() {
        return currentModule;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batchName='" + batchName + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                ", instructorName='" + instructorName + '\'' +
                ", monthOfEnrollment='" + monthOfEnrollment + '\'' +
                ", currentModule='" + currentModule + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
