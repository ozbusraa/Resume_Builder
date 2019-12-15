package Info;

import java.io.BufferedWriter;

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

        void print_Header1(BufferedWriter writer);
        void print_Header2(BufferedWriter writer);
        void print_Closer2(BufferedWriter writer);
        void print_Header3(BufferedWriter writer);
        void print_Closer3(BufferedWriter writer);
        void print_1(EducationInfo educationInfo, BufferedWriter writer);
        void print_2(EducationInfo educationInfo, BufferedWriter writer);
        void print_3(EducationInfo educationInfo, BufferedWriter writer);
        void write(BufferedWriter writer,String text);
}