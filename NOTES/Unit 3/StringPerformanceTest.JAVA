public class StringPerformanceTest {
    public static void main(String[] args) {


        int iterations = 100000;
    
        long startTime = System.nanoTime();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World";
        }

        long endTime = System.nanoTime();

        long durationString = endTime - startTime;

        System.out.println("Time taken by String: " + durationString + " ns");
        
       
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(" World");
        }

        endTime = System.nanoTime();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + durationStringBuilder + " ns");
        
        
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(" World");
        }

        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + durationStringBuffer + " ns");
    }
}
