public class ex19
{
        enum Days
        {
                Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
        }
        public static void main(String args[])
        {
                for(Days d:Days.values())
                {
                        weekend(d);
                }
        }
        private static void weekend(Days d)
        {
                if(d.equals(Days.Sunday))
                {
                        System.out.println(d+" is a holiday");
                }
                else
                {
                        System.out.println(d+" is a working day");
                }
        }
}
