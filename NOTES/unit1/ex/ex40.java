public void capacityExample() 
{
        
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(0);
        StringBuilder builder3 = new StringBuilder(100);
        
        System.out.println(builder1.capacity());
        System.out.println(builder2.capacity());
        System.out.println(builder3.capacity());
        
}

output :
16
0
100