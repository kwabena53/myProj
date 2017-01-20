public class Tester2{

  public static void main(String args[]){
    int ans=0;
      if(args[0].equalsIgnoreCase("add")){
      ans=Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
      }
    System.out.print(ans);
  }
}
