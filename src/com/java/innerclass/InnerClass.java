package com.java.innerclass;

class Manager{
    //Outer class
    private class Grade{
        //Inner Class
        private char grade;
        private char calculateGrade(String employeeId,int point){
            if(isEmployeeExists(employeeId)){
                if(point<100 && point>=90){
                    grade='A';
                }else if(point<90&&point>=80){
                    grade='B';
                }else{
                    grade='C';
                }
            }
            return grade;
        }

        private boolean isEmployeeExists(String empolyeeId){
            return true;
        }

    }

    public char checkEmployeeID(String employeeId,int point){
        Grade grade=new Grade();
        return grade.calculateGrade(employeeId, point);
    }
}

public class InnerClass {

    public static void main(String[] args) {
        Manager manager=new Manager();
        String employeeId="I1001";
        char gradePoint= manager.checkEmployeeID(employeeId,80);
        System.out.println("The Grade For "+employeeId+" is "+ gradePoint);

    }
}
