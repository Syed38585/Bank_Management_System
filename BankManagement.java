import java.util.*;
class BankManagement{
      public static void main(String[] args) {
      Bank b1 = new Bank();  //object istantiation of the class Bank
      Accounts e1 = new Accounts(); //object instantiation of the class Accounts
      Scanner sc = new Scanner(System.in);
      int EmployeeSalary,CompanyExpense;
      int NewPassword,Amount;
      System.out.println("1.Employee info");
      System.out.println("2.Company info");
      System.out.println("3.Change password");
      System.out.println("4.Employee Mini Statement");
      System.out.println("5.Create Account");
      System.out.println("6.Deposit");
      System.out.println("enter your choice\n");
      int n =sc.nextInt();
      switch(n){
      case 1:System.out.println("enter the salary");
      EmployeeSalary=sc.nextInt();
      System.out.println("money before salary in employee's account " + e1.curramount +"\nmoney in employee account after salary "+e1.getafters(EmployeeSalary));//employee account info //salary of employee is ex:10000
      break;
      case 2:System.out.println("enter the salary of employee 1");
      CompanyExpense=sc.nextInt();
      System.out.println("money in company account before paying salary " + e1.Companycurramount + "\nmoney in company account after paying salary "+ e1.getcompanym(CompanyExpense));//company account info
      break;
      case 3:System.out.println("enter the new Password");
      NewPassword=sc.nextInt();
      System.out.println("the old password is "+b1.Password +"\nthe new password is "+e1.setEmployeePassword(NewPassword));//method to change password
      break;
      case 4:System.out.println("balance is "+e1.getEmployeeMiniStatement());//method to get mini statement of employee
      break;
      case 5:e1.CreateAccount("ABC",7845);//method to create account
      break;
      case 6:System.out.println("enter amount to be deposited"); //getting the amount to be deposited
      Amount = sc.nextInt();
      e1.Deposit(Amount);//method to deposit amount
      break;
      default: System.out.println("select within the 4 options");
      }
      }
         }
      
      class Bank{
          int Password = 1234;
          Bank(){
            this.Password = Password;
          }  
          }
      
          
      
      class Accounts extends Bank{
          String AccountName;
          int DepositMoney;
          int curramount = 3000;
          int Companycurramount = 50000; 
          int salary;
    
    int getafters(int salary){
    curramount += salary;
    return curramount;
    }

    int getcompanym(int salary){
        Companycurramount -= salary;
        return Companycurramount;
    }
   
    int setEmployeePassword(int Password){
          this.Password = Password;
          return Password;
    }

    int getEmployeeMiniStatement(){
        return curramount;
    }

    void CreateAccount(String AccountName,int Password){
    this.AccountName = AccountName;
    this.Password = Password;
    System.out.println("Account has been successfully created");
    System.out.println("Name of Account Holder: "+AccountName+"\nPassword = "+Password);
    }

    void Deposit(int DepositMoney){
    if(DepositMoney<=0){
        System.out.println("please enter amount greater than zero");
    }
    else{
        System.out.println("Balance before depositing is "+curramount);
        curramount += DepositMoney;
        System.out.println("Balance after depositing is "+curramount);
    }
}

    }