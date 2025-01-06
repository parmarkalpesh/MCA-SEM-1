class ex38
{
    static int x = 1;
    public static void main(String[] args) 
    {
        int x = 10;
        //--- prints local, not class variable.
        System.out.println("main  : x = " + x);
        //--- prints class, not local variable.
        System.out.println("main  : Shadow.x = " + Shadow.x);
        printa();
        printb(100);
        
    }//end main
    
    static void printa() 
    {
        //--- prints x in enclosing scope, not x in caller.
        System.out.println("printa: x = " + x);
    }//end printa
    
    static void printb(int x) 
    {
        //--- Parameters are like local variables.
        System.out.println("printb: x = " + x);
    }//end printb
}//end class Shadow
