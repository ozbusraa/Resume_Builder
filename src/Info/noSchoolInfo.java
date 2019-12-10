package Info;

public class noSchoolInfo implements EducationInfo{
    String SchoolName;
    EducationInfo nextEducationInfo=null;
    @Override
    public void setSchoolName(String highSchoolName) {
        this.SchoolName="";
    }

    @Override
    public void setNextEducationInfo(EducationInfo educationInfo) {
        //doNothing
    }

}
