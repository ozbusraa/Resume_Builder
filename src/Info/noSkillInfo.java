package Info;

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
}
