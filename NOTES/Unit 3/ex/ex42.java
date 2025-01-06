public void deleteTextExample() 
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
        
        //Now we want to delete the text we just inserted
        //Note that the method returns a new instance of StringBuilder
        builder = builder.delete(index, index + lineToInsert.length());

        System.out.println(builder.toString());
        
}

output :
Line 1
Line 2
Line 3

Line 1
Line 3