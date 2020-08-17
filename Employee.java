import java.util.Scanner;

    class Employee
    {
        String Name;
        long YearofJoining;
        String Address;

        void GetData()           // Defining GetData()
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();

            System.out.print("\n\tEnter Employee Year of Joining : ");
            YearofJoining = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Address : ");
            Address = sc.nextLine();

        }

        void PutData()           // Defining PutData()
        {
            System.out.print("\n\t" + Name + "\t" +YearofJoining + "\t" +Address);
        }

        public static void main(String args[])
        {

            Employee[] Emp = new Employee[3];
            int i;

            for(i=0;i<3;i++)
                Emp[i] =  new Employee();   // Allocating memory to each object

            for(i=0;i<3;i++)
            {
                System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
                Emp[i].GetData();
            }

            System.out.print("\nDetails of Employees\n");
            for(i=0;i<3;i++)
                Emp[i].PutData();

        }
    }