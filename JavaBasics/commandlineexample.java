public class commandlineexample
 {
    public static void main(String[] args) {
      System.out.println("Command-Line arguments are");
  
      for(String str: args) {
        System.out.println(str);
      }
  /*    
     for(int i=0;i<=args.length;i++)
      {
        System.out.println(args[i]);
      }  */
    }
  }
  

  //to run cmd line args programs in vs code, use the following steps:  
  //1. right click on the file in the explorer and open integrated terminal.
  //2. compile using javac filename.java
  //3. run using java filename arg1 arg2 arg3 (where arg1,
  //arg2, arg3 are the command line arguments you want to pass)