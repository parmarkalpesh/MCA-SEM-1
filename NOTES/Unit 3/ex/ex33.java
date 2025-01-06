class ex33
{
    static int[] arrVal = new int[10];
    // Class Initialization block
    static
    {
        System.out.println("In initialization block\n");
        for(int i=0; i<arrVal.length; i++)
        {
            arrVal[i] = (int)(100.0*Math.random());
        }
    }

    void Display()
    {
        System.out.println("Start display\n");
        for(int i=0; i<arrVal.length; i++)
        {
            System.out.println("  " + arrVal[i]);
        }
        System.out.println("End display\n");
    }

    public static void main(String[] args)
    {
        ex33 ib1 = new ex33();
        System.out.println("First object is created");
        ib1.Display();

        ex33 ib2 = new ex33();
        System.out.println("Second object is created");
        ib2.Display();
    }
}
