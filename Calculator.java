

//@author Nii Quateboye Quartey


public class Calculator {
  
  public static void main (String[] args) {
    double a = 0; 
    
    if (args[0].equalsIgnoreCase("Add")) {
      double c = Double.parseDouble(args[1]);
      double d = Double.parseDouble(args[2]);
      a = c + d; 
      System.out.println(a);
    }
    else if (args[0].equalsIgnoreCase("Subtract")) {
      double x = Double.parseDouble(args[1]);
      double y = Double.parseDouble(args[2]);
      a = x - y;
      System.out.println(a);
    } 
    else if (args[0].equalsIgnoreCase("Multiply")) {
      double m = Double.parseDouble(args[1]);
      double n = Double.parseDouble(args[2]);
      a = m * n;
      System.out.println(a);
    }
    else if (args[0].equalsIgnoreCase("Divide")) {
      double f = Double.parseDouble(args[1]);
      double g = Double.parseDouble(args[2]);
      a = f / g;
      System.out.println(a);
    }
    
  }
}