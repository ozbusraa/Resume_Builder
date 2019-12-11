package Info;

public class SchoolInfo implements EducationInfo{

    String schoolName;
    String department;
    String startDate;
    String finishDate;
    String gpa;
    EducationInfo nextEducationInfo=null;
    @Override
    public void setSchoolName(String schoolName) {
        this.schoolName=schoolName;
    }
    @Override
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    @Override
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
    @Override
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public void setNextEducationInfo(EducationInfo educationInfo) {
        nextEducationInfo=educationInfo;
    }


}
