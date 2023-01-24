import javax.swing.*;
public class AIUSystem {  

    public static void main(String[] args) {
        registration(); 
    }// making a main method incase this file wants to run itself without FileThree
    static String[] Students = new String[500]; //up to 500 names
    static int[] mark1 = new int[500];// up to 500 numbers
    static int[] mark2 = new int[500];// up to 500 numbers
    static int[] total = new int[500];// up to 500 numbers

    static int i = 1, summark1 = 0, summark2 = 0, Deleted = 0;
    // the above is initializtion and its static
    public static void registration(){
        String[] operation = {"Add a Student", "Delete a Student", "List Latest Students", "Exit"};//options to the user
        int interfaceList = JOptionPane.showOptionDialog(null, "Welcome to AIU System. \nYou are now capable of Adding, Deleting or Listing Students from the system.",
                "AIU Students Database",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operation, operation[0]);//interface and welcoming
        switch (interfaceList) {
            case 0: //if button 1 clicked
                addStudent();// to add a studenta
                registration(); //get back to main page
                break;
            case 1://if button 2 clicked
                delStudent();// to delete a student
                registration();//get back to main page
                break;
            case 2://if button 3 clicked
                listStudent(); // to list latest student
                registration();//get back to main page
                break;
            case 3://if button 4 clicked
            System.exit(0);//exit with 0 errors
            JOptionPane.showMessageDialog(null,"Thank you for using AIU Students System, if you have any issues please contact me via email:  \n -saifalmajd.almassri@student.aiu.edu.- \nThank you");          

            default:
            JOptionPane.showMessageDialog(null,"An Error has Occurred"); // error handeling- if error has occurred
                break;
        }
    }

        public static void addStudent() 
        {
            if (Students[i] == null){ // to not initialize to initialized spaces
                Students[i] = JOptionPane.showInputDialog("What is the student name number " + i +"?");
                mark1[i] = Integer.parseInt(JOptionPane.showInputDialog("What is the student Mark 1?"));
                mark2[i] = Integer.parseInt(JOptionPane.showInputDialog("What is the student Mark 2?"));
                summark1 = summark1 + mark1[i];//total of marks 1 
                summark2 = summark2 + mark2[i];//total of marks 2
                total[i] = mark1[i] + mark2[i];
            }else { 
                i++;// to not initialize to initialized spaces
                Students[i] = JOptionPane.showInputDialog("What is the student name number " + i +"?");
                mark1[i] = Integer.parseInt(JOptionPane.showInputDialog("What is the student Mark 1?"));
                mark2[i] = Integer.parseInt(JOptionPane.showInputDialog("What is the student Mark 2?"));
                summark1 = summark1 + mark1[i];//total of marks 1 
                summark2 = summark2 + mark2[i];//total of marks 2
                total[i] = mark1[i] + mark2[i];

            }
    }

        public static void delStudent()
        {
 
                String name = JOptionPane.showInputDialog( "what is the student name you want to delete?");
                for(i = 1; i<=mark1[i]; i++){
                if (name.equals(Students[i]) || name == Students[i]){// looks for student with same names
                    JOptionPane.showMessageDialog(null,"Student named: "+ name + " found! and Deleted.");
                    Students[i] = null;
                    mark1[i] = 0;
                    mark2[i] = 0;
                    Deleted = 1;
                }
                }
                if (Deleted == 0) {   // looks for student with same names
                    JOptionPane.showMessageDialog(null,"Student named: "+ name +" not found!"); // error handeling - not found
                } 
          } 


        public static void listStudent()
        {
                if (Students[i] != null){   // to not print out empty values
                    Object rows[][] = {     // object for rows and because this is an object we can modify or make a loop
                        {1,Students[1], mark1[1], mark2[1], total[1]}, //student list number 1 ...........
                        {2,Students[2], mark1[2], mark2[2], total[2]},
                        {3,Students[3], mark1[3], mark2[3], total[3]},
                        {4,Students[4], mark1[4], mark2[4], total[4]},
                        {5,Students[5], mark1[5], mark2[5], total[5]},
                        {6,Students[6], mark1[6], mark2[6], total[6]},
                        {7,Students[7], mark1[7], mark2[7], total[7]},
                        {8,Students[8], mark1[8], mark2[8], total[8]},
                        {9,Students[9], mark1[9], mark2[9], total[9]},
                        {10,Students[10], mark1[10], mark2[10], total[10]},
                        {11,Students[11], mark1[11], mark2[11], total[11]},
                        {12,Students[12], mark1[12], mark2[12], total[12]},
                        {13,Students[13], mark1[13], mark2[13], total[13]},
                        {14,Students[14], mark1[14], mark2[14], total[14]},
                        {15,Students[15], mark1[15], mark2[15], total[15]},
                        {16,Students[16], mark1[16], mark2[16], total[16]},
                        {17,Students[17], mark1[17], mark2[17], total[17]},
                        {18,Students[18], mark1[18], mark2[18], total[18]},
                        {19,Students[19], mark1[19], mark2[19], total[19]},
                        {20,Students[20], mark1[20], mark2[20], total[20]},
                        {"", "", "", "", ""},
                        {"---------------","Total Grades (All):" , summark1, summark2,"---------------"} // total sum of marks 1 and marks 2 
                };
                    Object[] cols = {
                        "Student Number", "Student Name","Mark 1", "Mark 2", "Total"
                    }; // object for columns
                    JTable table = new JTable(rows, cols); //Jtable object with rows and cols
                    JOptionPane.showMessageDialog(null, new JScrollPane(table)); //prints out the JTable
                }
            }
        }// end of AIU System Program