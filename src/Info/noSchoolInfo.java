package Info;

public class noSchoolInfo implements EducationInfo{
    String schoolName;
    String department;
    String startDate;
    String finishDate;
    String gpa;
    EducationInfo nextEducationInfo=null;

    @Override
    public void setSchoolName(String schoolName) {
        this.schoolName="";
    }

    @Override
    public void setDepartment(String department) {
        this.department = "";
    }
    @Override
    public void setStartDate(String startDate) {
        this.startDate = "";
    }
    @Override
    public void setFinishDate(String finishDate) {
        this.finishDate = "";
    }
    @Override
    public void setGpa(String gpa) {
        this.gpa ="";
    }

    @Override
    public void setNextEducationInfo(EducationInfo educationInfo) {
        //doNothing
    }

}
