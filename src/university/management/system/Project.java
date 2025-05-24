package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1580, 0);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1450, 640, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();

        //NewInformation
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.DARK_GRAY);
        mb.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        //Details
        JMenu Details = new JMenu("View Details");
        Details.setForeground(Color.DARK_GRAY);
        mb.add(Details);

        JMenuItem viewFaculty = new JMenuItem("View Faculty Details");
        viewFaculty.setBackground(Color.WHITE);
        viewFaculty.addActionListener(this);
        Details.add(viewFaculty);

        JMenuItem viewStudent = new JMenuItem("View Student Details");
        viewStudent.setBackground(Color.WHITE);
        viewStudent.addActionListener(this);
        Details.add(viewStudent);

        //Leave
        JMenu Leave = new JMenu("Apply Leave");
        Leave.setForeground(Color.DARK_GRAY);
        mb.add(Leave);

        JMenuItem FacultyLeave = new JMenuItem("Faculty Leave");
        FacultyLeave.setBackground(Color.WHITE);
        FacultyLeave.addActionListener(this);
        Leave.add(FacultyLeave);

        JMenuItem StudentLeave = new JMenuItem("Student Leave");
        StudentLeave.setBackground(Color.WHITE);
        StudentLeave.addActionListener(this);
        Leave.add(StudentLeave);

        //Leave Details
        JMenu LeaveDetails = new JMenu("Leave Details");
        LeaveDetails.setForeground(Color.DARK_GRAY);
        mb.add(LeaveDetails);

        JMenuItem FacultyLeavedetails = new JMenuItem("Faculty Leave Details");
        FacultyLeavedetails.setBackground(Color.WHITE);
        FacultyLeavedetails.addActionListener(this);
        LeaveDetails.add(FacultyLeavedetails);

        JMenuItem StudentLeavedetails = new JMenuItem("Student Leave Details");
        StudentLeavedetails.setBackground(Color.WHITE);
        StudentLeavedetails.addActionListener(this);
        LeaveDetails.add(StudentLeavedetails);

        //Exams
        JMenu examDetails = new JMenu("Examination");
        examDetails.setForeground(Color.DARK_GRAY);
        mb.add(examDetails);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Details");
        ExaminationDetails.setBackground(Color.WHITE);
        ExaminationDetails.addActionListener(this);        
        examDetails.add(ExaminationDetails);

        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.WHITE);
        enterMarks.addActionListener(this);        
        examDetails.add(enterMarks);

        //UpdateInfo
        JMenu Update = new JMenu("Update Info");
        Update.setForeground(Color.DARK_GRAY);
        mb.add(Update);

        JMenuItem updateFacultyInfo = new JMenuItem("Faculty Info Update");
        updateFacultyInfo.setBackground(Color.WHITE);
        updateFacultyInfo.addActionListener(this);        
        Update.add(updateFacultyInfo);

        JMenuItem updateStudentInfo = new JMenuItem("Student Info Update");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);        
        Update.add(updateStudentInfo);

        //Fee
        JMenu Fee = new JMenu("Fee Details ");
        Fee.setForeground(Color.DARK_GRAY);
        mb.add(Fee);

        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        Fee.add(feeStructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        Fee.add(feeForm);

        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.DARK_GRAY);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

        //About
        JMenu about = new JMenu("About");
        about.setForeground(Color.DARK_GRAY);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.DARK_GRAY);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception ae) {

            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");

            } catch (Exception ae) {

            }
        } else if (msg.equals("New Faculty Information")) {
             new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        }else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails ();
        }else if (msg.equals("Faculty Info Update")) {
            new UpdateTeacher();
        } else if (msg.equals("Student Info Update")) {
            new UpdateStudent();
        }else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        }else if (msg.equals("Examination Details")) {
            new ExaminationDetails();
        }else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        }else if (msg.equals("About")) {
            new About();
        }else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    } 
    public static void main(String[] args) {
        new Project();
    }
}
