import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseInfo extends JFrame {
    JPanel panel;

    public ChooseInfo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Choose Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 50, size.width, size.height);


        JCheckBox education = new JCheckBox("Education");
        education.setBounds(50,100, 150,25);
        JCheckBox job = new JCheckBox("Job");
        job.setBounds(50,125, 50,25);
        JCheckBox skills = new JCheckBox("Skills");
        skills.setBounds(50,150, 75,25);
        JCheckBox projects = new JCheckBox("Projects");
        projects.setBounds(50,175, 100,25);
        JCheckBox hobbies = new JCheckBox("Hobbies");
        hobbies.setBounds(50,200, 150,25);
        JCheckBox volunteer = new JCheckBox("Volunteer Works");
        volunteer.setBounds(50,225, 250,25);
        JCheckBox certificate = new JCheckBox("Certificates");
        certificate.setBounds(50,250, 150,25);
        JCheckBox reference = new JCheckBox("References");
        reference.setBounds(50,275, 150,25);
        JButton next = new JButton("Next");
        next.setBounds(250,290,100,25);
        this.add(education);
        this.add(job);
        this.add(skills);
        this.add(projects);
        this.add(hobbies);
        this.add(volunteer);
        this.add(certificate);
        this.add(reference);
        this.add(next);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }
}
