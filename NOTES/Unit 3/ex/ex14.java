class ex14
{
        static String str[]={"Rajkot","Ahmedabad","NewYork","Delhi"};

        public static void main(String args[])
        {
                int size=str.length;
                String temp=null;
                for(int i=0;i<size;i++)
                {
                        for(int j=i+1;j<size;j++)
                        {
                                if(str[j].compareTo(str[i])<0)
                                {
                                        temp=str[i];
                                        str[i]=str[j];
                                        str[j]=temp;
                                }
                        }
                }
                for(int i=0;i<size;i++)
                {
                        System.out.println(str[i]);
                }
        }
}
