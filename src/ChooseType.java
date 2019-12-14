import javax.swing.*;
import Info.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChooseType extends JFrame {
    private JPanel panel;

    public ChooseType(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p, Certificates c, Reference r, Hobbies h, Boolean[] array){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Choose CV Type");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);

        JCheckBox masters = new JCheckBox("Masters Application");
        masters.setBounds(50,100, 150,25);
        JCheckBox internship = new JCheckBox("Internship Application");
        internship.setBounds(50,125, 150,25);
        JCheckBox job = new JCheckBox("Job Application");
        job.setBounds(50,150, 150,25);

        panel.add(masters);
        panel.add(internship);
        panel.add(job);

        JButton saveButton = new JButton("Next");
        panel.add(saveButton);
        Dimension size1 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size1.width, size1.height);


        JButton goBackButton = new JButton("Go Back");
        panel.add(goBackButton);
        Dimension size2 = goBackButton.getPreferredSize();
        goBackButton.setBounds(200, 300, size2.width, size2.height);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
