package Info;

public class SchoolInfo implements EducationInfo{
    String SchoolName;
    EducationInfo nextEducationInfo=null;
    @Override
    public void setSchoolName(String SchoolName) {
        this.SchoolName=SchoolName;
    }

    @Override
    public void setNextEducationInfo(EducationInfo educationInfo) {
        nextEducationInfo=educationInfo;
    }


}
