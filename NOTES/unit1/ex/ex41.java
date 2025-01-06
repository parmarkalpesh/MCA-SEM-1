public void insertTextExample() 
{
        
        //Create the StringBuilder
        StringBuilder builder = new StringBuilder("Line 1\n");
        
        //Append text to the end of the buffer
        builder.append("Line 3\n");
        
        //Now we want to add text in between line 1 and line 3
        String lineToInsert = "Line 2\n";
        int index = builder.indexOf("Line 3");
        builder.insert(index, lineToInsert);
        
        System.out.println(builder.toString());
        
}

Output :
Line 1
Line 2
Line 3