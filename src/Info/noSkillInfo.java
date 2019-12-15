package Info;

import java.io.BufferedWriter;

public class noSkillInfo implements SkillsInfo {
    String languages="";
    String programKnowledge="";
    String other="";

    public void setOther(String other) {    }
    public void setLanguages(String languages) {}
    public void setProgramKnowledge(String programKnowledge) {    }

    public String getLanguages() {
        return languages;
    }
    public String getProgramKnowledge() {
        return programKnowledge;
    }
    public String getOther() {
        return other;
    }

    @Override
    public void print_Header1(BufferedWriter writer) {

    }

    @Override
    public void print_Header2(BufferedWriter writer) {

    }

    @Override
    public void print_Header3(BufferedWriter writer) {

    }

    @Override
    public void print_Closer(BufferedWriter writer) {

    }

    @Override
    public void print_1(SkillsInfo skillsInfo, BufferedWriter writer) {

    }

    @Override
    public void print_2(SkillsInfo skillsInfo, BufferedWriter writer) {

    }

    @Override
    public void print_3(SkillsInfo skillsInfo, BufferedWriter writer) {

    }

    @Override
    public void write(BufferedWriter writer, String text) {

    }
}
