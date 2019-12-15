package Resume;

import Info.User;
import Info.UserInterface;

import java.io.BufferedWriter;
import java.io.IOException;

public class Layout3 extends Layout{
    @Override
    protected void putCertificatesInfo(UserInterface user, BufferedWriter writer) {
        user.printCertificateInfo3(writer);
    }

    @Override
    protected void putVolunteerInfo(UserInterface user, BufferedWriter writer) {
        user.printVolunteerInfo3(writer);
    }

    @Override
    protected void putHobbiesInfo(UserInterface user, BufferedWriter writer) {
        user.printHobbyInfo3(writer);
    }

    @Override
    protected void putReferencesInfo(UserInterface user, BufferedWriter writer) {
        user.printReferenceInfo3(writer);
    }

    @Override
    protected void putPersonalInfo(UserInterface user, BufferedWriter writer) {
        user.printPersonalInfo3(writer);
    }

    @Override
    protected void putProjectInfo(UserInterface user, BufferedWriter writer) {
        user.printProjectInfo3(writer);
    }

    @Override
    protected void putSkillInfo(UserInterface user, BufferedWriter writer) {
            user.printSkillInfo3(writer);
    }

    @Override
    protected void putWorkInfo(UserInterface user, BufferedWriter writer) {
            user.printWorkInfo3(writer);
    }

    @Override
    protected void putEducationInfo(UserInterface user, BufferedWriter writer) {
            user.printEducationInfo3(writer);
    }

    @Override
    protected void printLayoutHeader(BufferedWriter writer) {

        String text="</script><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n" +
                "\t\n" +
                "\t<title>Resume | First Last</title>\n" +
                "\t<meta name=\"robots\" content=\"noindex, nofollow\">\n" +
                "\t<style type=\"text/css\" media=\"all\">\n" +
                "\t\thtml{\n" +
                "\t\t\tbackground-color:#FFF;\n" +
                "\t\t\tpadding:0 1em;\n" +
                "\t\t\t}\n" +
                "\t\tbody {\n" +
                "\t\t\tbackground-color:#FFF;\n" +
                "\t\t\tfont-family:\"Trebuchet MS\";\n" +
                "\t\t\tpadding:1em;\n" +
                "\t\t\tmargin:1em auto;\n" +
                "\t\t\tmax-width: 50em;\n" +
                "\t\t\t}\n" +
                "\t\t#address{\n" +
                "\t\t\theight:5em;\n" +
                "\t\t\twidth:48em;\n" +
                "\t\t\tpadding:1em;\n" +
                "\t\t\t}\n" +
                "\t\t#address div{\n" +
                "\t\t\twidth:16em;\n" +
                "\t\t\tfloat:left;\n" +
                "\t\t\t}\n" +
                "\t\t#address h3{\n" +
                "\t\t\tborder-bottom: none;\n" +
                "\t\t\tfont-variant: small-caps;\n" +
                "\t\t\tmargin-top: 0;\n" +
                "\t\t\t}\t\n" +
                "\t\t.date {\n" +
                "\t\t\tfloat:right;\n" +
                "\t\t\tfont-size:.8em;\n" +
                "\t\t\tmargin-top:.4em;\n" +
                "\t\t\ttext-align:right;\n" +
                "\t\t\t}\n" +
                "\t\tabbr, acronym{\n" +
                "\t\t\tborder-bottom:1px dotted #333;\n" +
                "\t\t\tcursor:help;\n" +
                "\t\t\t}\t\n" +
                "\t\taddress{\n" +
                "\t\t\tfont-style:italic;\n" +
                "\t\t\tcolor:#333;\n" +
                "\t\t\tfont-size:.9em;\n" +
                "\t\t\t}\n" +
                "\t\t.content{\n" +
                "\t\t\twidth:32em;\n" +
                "\t\t\tmargin:0 0 0 16em;\n" +
                "\t\t\t}\t\n" +
                "\t\t.section{\n" +
                "\t\t\tborder-top:1px solid #ccc;\n" +
                "\t\t\tmargin:1em 0;\n" +
                "\t\t\tpadding:1em;\n" +
                "\t\t\t}\n" +
                "\t\tul{\n" +
                "\t\t\tpadding-left:.5em;\n" +
                "\t\t\tmargin-left:.5em;\n" +
                "\t\t\t}\n" +
                "\t\th1{\n" +
                "\t\t\tmargin:1em 0 1em 9.5em;\n" +
                "\t\t\tfont-size:1.75em;\n" +
                "\t\t\t}\n" +
                "\t\th2 {\n" +
                "\t\t\twidth:14em;\n" +
                "\t\t\tfloat:left;\n" +
                "\t\t\tfont-size:1em;\n" +
                "\t\t\tfont-variant: small-caps;\n" +
                "\t\t\tletter-spacing: .06em;\n" +
                "\t\t\t}\n" +
                "\t\th3 {margin-bottom: 0;}\n" +
                "\t</style>\n" +
                "\t<style type=\"text/css\" media=\"print\">\n" +
                "\t\tbody {\n" +
                "\t\t\tbackground-color:#FFF;\n" +
                "\t\t\tborder-width:0 0 0 0;\n" +
                "\t\t\tmargin:0;\n" +
                "\t\t\twidth:100%\n" +
                "\t\t\t}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "<body>";

        try {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
