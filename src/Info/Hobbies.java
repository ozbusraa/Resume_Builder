package Info;

import java.io.BufferedWriter;

public interface Hobbies {

    void setHobbies(String hobbies);
    String getHobbies();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer(BufferedWriter writer);
    void print_1(Hobbies hobbies, BufferedWriter writer);
    void print_2(Hobbies hobbies, BufferedWriter writer);
    void print_3(Hobbies hobbies, BufferedWriter writer);
    void write(BufferedWriter writer,String text);
}
