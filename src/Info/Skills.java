package Info;

import java.io.BufferedWriter;
import java.io.IOException;

public class Skills implements SkillsInfo {
    String languages="";
    String programKnowledge="";
    String other="";

    public void setOther(String other) {
        this.other = other;
    }
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    public void setProgramKnowledge(String programKnowledge) {
        this.programKnowledge = programKnowledge;
    }

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
        String text ="<h2>Skills</h2>";

        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {
        String text ="<div class=\"section\">\n" +
                "\t\t<h2>Skills</h2>";

        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        String text ="<div class=\"section\">\n" +
                "\t\t<h2>Skills</h2>\n" +
                "\t\t<div class=\"content\">";

        write(writer,text);
    }

    @Override
    public void print_Closer(BufferedWriter writer) {
        String text ="\t\t</div>\n" +
                "\t</div>\n";

        write(writer,text);
    }

    @Override
    public void print_1(SkillsInfo skillsInfo, BufferedWriter writer) {
        String text ="<ul>\n" +
                "\t\t<li>Known Languages: "+skillsInfo.getLanguages()+"</li>\n" +
                "\t\t<li>Known Programs: "+skillsInfo.getProgramKnowledge()+"</li>\n" +
                "\t\t<li>Others: "+skillsInfo.getOther()+"</li>\n" +
                "\t</ul>";

        write(writer,text);
    }

    @Override
    public void print_2(SkillsInfo skillsInfo, BufferedWriter writer) {
        String text ="<div class=\"content\">\n" +
                "\t\t\t<span class=\"date\">Known Languages: "+skillsInfo.getLanguages()+" </span>\n" +
                "\t\t\t<address>language</address>\t\t\t\n" +
                "\t\t\t<span class=\"date\">Known Programs: "+skillsInfo.getProgramKnowledge()+"</span>\t\n" +
                "\t\t\t<address>programs</address>\n" +
                "\t\t\t<span class=\"date\">Others: "+skillsInfo.getOther()+"</span>\n" +
                "\t\t\t<address>others</address>";

        write(writer,text);
    }

    @Override
    public void print_3(SkillsInfo skillsInfo, BufferedWriter writer) {
        String text ="<ul>\n" +
                "\t\t\t\t<li>Known Languages:"+skillsInfo.getLanguages()+"</li>\n" +
                "\t\t\t\t\t<address>languages</address>\n" +
                "\t\t\t\t<li>Known Programs:"+skillsInfo.getProgramKnowledge()+"</li>\n" +
                "\t\t\t\t\t<address>hobbies</address>\n" +
                "\t\t\t\t<li>Others:"+skillsInfo.getOther()+"</li>\n" +
                "\t\t\t\t\t<address>others</address>\n" +
                "\t\t\t</ul>";

        write(writer,text);
    }

    @Override
    public void write(BufferedWriter writer, String text) {
        try {
            writer.write(text);
            writer.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
