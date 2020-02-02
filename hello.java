//Simple Java File to print out Hello World
class User
{
  private String fname, lname;
  private int age;
  
  User(String fname, String lname, int age)
  {
    this.fname = fname;
    this.lname = lname;
    this.age = age;
  }
  
  public String getName(){return fname+" "+lname;}
  public String getFirstName(){return fname;}
  public String getLastName(){return lname;}
  public String getAge(){return age;}
  public void display()
  {
    System.out.println(getName());
    System.out.println(getAge());
  }
  
}

class Hello
{
  public static void main(String args)
  {
    System.out.println("Hello World");
  }
}
