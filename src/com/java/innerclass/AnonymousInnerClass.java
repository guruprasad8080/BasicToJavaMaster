package com.java.innerclass;

interface GradeAnony{
    char calculateGrade(String employeeID,int point);
    boolean isEmployeeExists(String employeeID);

}

class ManagerAnony {
    GradeAnony gradeAnony=new GradeAnony() {
        //Represents Anonymous Class
        private char grade;
        public char calculateGrade(String employeeID, int point) {
            if(point<100 && point>=90){
                grade='A';
            }else if(point<90&&point>=80){
                grade='B';
            }else{
                grade='C';
            }
            return grade;
        }

        public boolean isEmployeeExists(String employeeId){
            return true;
        }
    };

    public char checkEmployeeID(String employeeID, int point){
        return gradeAnony.calculateGrade(employeeID,point);
    }

}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        ManagerAnony managerAnony=new ManagerAnony();
        String employeeId="I1001";
        char gradePoint= managerAnony.checkEmployeeID(employeeId,90);
        System.out.println("The Grade For "+employeeId+" is "+ gradePoint);
    }

}
