package Info;

import java.io.BufferedWriter;

public interface Reference {

    void setName(String name);
    void setLastname(String lastname);
    void setTelNo(String telNo);
    void setMailAddress(String mailAddress);
    void setNextReferenceInfo(Reference nextReferenceInfo);

    String getName();
    String getLastname();
    String getTelNo();
    String getMailAddress();
    Reference getNextReferenceInfo();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer(BufferedWriter writer);
    void print_1(Reference reference, BufferedWriter writer);
    void print_2(Reference reference, BufferedWriter writer);
    void print_3(Reference reference, BufferedWriter writer);
    void write(BufferedWriter writer,String text);
}
