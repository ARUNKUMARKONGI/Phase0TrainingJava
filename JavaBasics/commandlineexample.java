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
  