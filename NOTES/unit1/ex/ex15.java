class ex15
{
        public static void main(String args[])
        {
                StringBuffer str=new StringBuffer("Object Language");

                System.out.println("Original String = "+str);

                System.out.println("Length of the string = "+str.length());

                for(int i=0;i<str.length();i++)
                {
                        int p=i+1;
                        System.out.println("Character At Position "+p+" is "+str.charAt(i));
                }
                String str1=new String(str.toString());

                int pos=str1.indexOf("Language");
                str.insert(pos,"Oriented ");

                System.out.println("Modified String = "+str);

                str.setCharAt(6,'-');

                System.out.println("New String = "+str);

                str.append(" Inprove Security");

                System.out.println("Append String = "+str);
        }
}
