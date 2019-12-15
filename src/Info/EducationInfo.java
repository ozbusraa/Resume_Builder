package Info;

public interface EducationInfo {

        void setSchoolName(String highSchoolName);
        void setDepartment(String department);
        void setStartDate(String startDate);
        void setFinishDate(String finishDate);
        void setGpa(String gpa);

        void setNextEducationInfo(EducationInfo educationInfo);

        String getSchoolName() ;

        String getDepartment() ;

        String getStartDate() ;

        String getFinishDate() ;

        String getGpa() ;

        EducationInfo getNextEducationInfo();

        void print_1(EducationInfo educationInfo);
        void printEducationInfo_Header1();
}