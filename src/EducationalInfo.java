import Info.EducationInfo;
import Info.SchoolInfo;
import Info.UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class EducationalInfo extends JFrame {

        private JPanel panel;

        public EducationalInfo(UserInterface user,EducationInfo eI){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = (JPanel) this.getContentPane();
            panel.setLayout(null);

            JLabel title = new JLabel("Educational Info");
            panel.add(title);
            Dimension size = title.getPreferredSize();
            title.setBounds(140, 0, size.width, size.height);


            JLabel name = new JLabel("School Name:");
            panel.add(name);
            Dimension size2 = name.getPreferredSize();
            name.setBounds(0, 50, size2.width, size2.height);

            JTextField inputSchoolName = new JTextField(15);
            panel.add(inputSchoolName);
            Dimension size8 = inputSchoolName.getPreferredSize();
            inputSchoolName.setBounds(100, 50, size8.width, size8.height);



            JLabel department = new JLabel("Department:");
            panel.add(department);
            Dimension size3 = department.getPreferredSize();
            department.setBounds(0, 100, size3.width, size3.height);

            JTextField inputDepartment = new JTextField(15);
            panel.add(inputDepartment);
            Dimension size9 = inputDepartment.getPreferredSize();
            inputDepartment.setBounds(100, 100, size9.width, size9.height);



            JLabel startDate = new JLabel("Start Date:");
            panel.add(startDate);
            Dimension size4 = startDate.getPreferredSize();
            startDate.setBounds(0, 150, size4.width, size4.height);

            JTextField inputstartDate = new JTextField(15);
            panel.add(inputstartDate);
            Dimension size10 = inputstartDate.getPreferredSize();
            inputstartDate.setBounds(100, 150, size10.width, size10.height);



            JLabel graduationDate = new JLabel("(Expected)Graduation Date:");
            panel.add(graduationDate);
            Dimension size5 = graduationDate.getPreferredSize();
            graduationDate.setBounds(0, 200, size5.width, size5.height);

            JTextField inputgraduationDate = new JTextField(15);
            panel.add(inputgraduationDate);
            Dimension size11 = inputgraduationDate.getPreferredSize();
            inputgraduationDate.setBounds(100, 200, size11.width, size11.height);



            JLabel gpa = new JLabel("GPA:");
            panel.add(gpa);
            Dimension size6 = gpa.getPreferredSize();
            gpa.setBounds(0, 250, size6.width, size6.height);

            JTextField inputGpa = new JTextField(15);
            panel.add(inputGpa);
            Dimension size12 = inputGpa.getPreferredSize();
            inputGpa.setBounds(100, 250, size12.width, size12.height);



            JButton saveButton = new JButton("Save");
            panel.add(saveButton);
            Dimension size7 = saveButton.getPreferredSize();
            saveButton.setBounds(300, 300, size7.width, size7.height);

            JButton buttonAddNew = new JButton("Add New");
            panel.add(buttonAddNew);
            Dimension size13 = buttonAddNew.getPreferredSize();
            buttonAddNew.setBounds(100, 300, size13.width, size13.height);











            this.setSize(400, 400);
            this.setLocationRelativeTo(null);
            this.setVisible(true);




            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    eI.setSchoolName(inputSchoolName.getText());
                    eI.setDepartment(inputDepartment.getText());
                    eI.setFinishDate(inputgraduationDate.getText());
                    eI.setStartDate(inputstartDate.getText());
                    eI.setGpa(inputGpa.getText());
                    eI.setNextEducationInfo(null);

                    //new PersonalInfo().setVisible(true);
                    panel.setVisible(false);
                }
            });

            buttonAddNew.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    EducationInfo u=new SchoolInfo();
                    eI.setSchoolName(inputSchoolName.getText());
                    eI.setDepartment(inputDepartment.getText());
                    eI.setFinishDate(inputgraduationDate.getText());
                    eI.setStartDate(inputstartDate.getText());
                    eI.setGpa(inputGpa.getText());
                    eI.setNextEducationInfo(u);

                    new EducationalInfo(user,u).setVisible(true);
                    panel.setVisible(false);
                }
            });






        }
    }

