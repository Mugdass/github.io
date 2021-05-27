

import java.util.Scanner;

    class Employee
    {
        int Id;
        String Name;             //determine if the variable is an int, string, float
        int Age;
        float Salary;

        void GetData()           // defining the method ' GetData()' 
        {

            Scanner sc = new Scanner(System.in);
            
            
            // the method included all the string printed
            
            // with the user input for each variable
            
            System.out.print("\n\tEnter Employee Id : ");
            Id = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();

            System.out.print("\n\tEnter Employee Age : ");
            Age = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Salary : ");
            Salary = sc.nextFloat();

        }

        void PutData()     // Defining 'PutData()' method which is opposite of GetData()
        {
            System.out.println("\n\t" + ">>>" +" " + Id + "\t" +Name + "\t" +Age + "\t" +Salary);
            System.out.println();
        }
            // this will print the string listing the data that's given by the user input
            
        public static void main(String args[])
        {
         // need to put this data so that when we call on GetData()
         
         // it will put the information in this printed sequence.
         
            Employee[] Emp = new Employee[3];      // defining an Emplyee object
            
                           // with the number array [3]
            int i;
                           // representing 3 portions of data
                           
                           // one for each employee.
                           
            for(i=0;i<3;i++)
                Emp[i] =  new Employee();   // defining int i
                
                                    // as assigned to the Employee object

            for(i=0;i<3;i++)
            {
                        // and for every i, meaning for every user input of each Employee
                System.out.println("Hi there!");
                System.out.println();
                System.out.println("Can you please ");
            
                System.out.println("\nEnter details of "+ (i+1) +" Employee\n");
                Emp[i].GetData();
                System.out.println();
                System.out.println();
            }
            
            // these following statement are printed 
            
            // with an Emp[i] object tied with the method GetData()
            
            // so that the user input from GetData() is printed with the the Emp[i]
            // printed data for the three Employees.

            System.out.print("\nDetails of Employees: \n");
            for(i=0;i<3;i++)
                Emp[i].PutData();
                
                // PutData() is called upon, as it displays all the get Data
                // but dusplays it as Emp[i] meaning for three employees.
                
            System.out.println("Thank you for your information!.");
            System.out.println();
            System.out.println("Goodbye.");

               // closing statement at the end of application
        }
    }
