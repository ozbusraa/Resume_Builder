package Info;

import java.io.BufferedWriter;
import java.io.IOException;

public class HobbiesInfo implements Hobbies {
    String hobbies;

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getHobbies() {
        return hobbies;
    }

    @Override
    public void print_Header1(BufferedWriter writer) {
        String text="<h2>Hobbies</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>Hobbies</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>Hobbies</h2>";
        write(writer,text);
    }

    @Override
    public void print_Closer(BufferedWriter writer) {
        String text="</div>";
        write(writer,text);
    }

    @Override
    public void print_1(Hobbies hobbies, BufferedWriter writer) {
        String text="<ul>\n" +
                "\t\t<li>"+hobbies.getHobbies()+"</li>\n" +
                "\t</ul>";
        write(writer,text);
    }

    @Override
    public void print_2(Hobbies hobbies, BufferedWriter writer) {
        String text="<ul>\n" +
                "\t\t\t\t<li>"+hobbies.getHobbies()+"</li>\n" +
                "\t\t\t</ul>";
        write(writer,text);
    }

    @Override
    public void print_3(Hobbies hobbies, BufferedWriter writer) {
        String text="<div class=\"content\">\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>"+hobbies.getHobbies()+"</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>";
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
