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

    public String getSchoolName() {
        return schoolName;
    }

    public String getDepartment() {
        return department;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public String getGpa() {
        return gpa;
    }

    public EducationInfo getNextEducationInfo() {
        return nextEducationInfo;
    }

    @Override
    public void print_1(EducationInfo e) {

        String text="<h2>Education</h2>	<ul>		<li>"+e.getSchoolName()+" ,"+e.getDepartment()+ " ,"+ e.getStartDate()+" - "+ e.getFinishDate()+" , "+ e.getGpa()+"</li>	</ul>";
        System.out.println(text);
    }

    @Override
    public void printEducationInfo_Header1() {
        String header="<h2>Education</h2>";
    }


}
