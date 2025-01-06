class Program 
{
   String name = "Instance Var."; 
   void someMethod() 
   { 
     String name ="Local Var."; 
     System.out.println(name);   //Local Var.
     System.out.println(this.name); //Instance Var. 
   } 
}