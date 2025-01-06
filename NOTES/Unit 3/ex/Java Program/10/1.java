class Main {
  public static void main(String[] argv) {
    StringBuffer sb = new StringBuffer();
    sb.append(true);
    sb.append("java2s.comababababababababababbababababa");
    sb.append(1.2);
    sb.append('a');
    sb.insert(0,'K');
    System.out.println(sb.toString());
    System.out.println(sb.length());

    System.out.println(sb.capacity());

    String s;
    int a = 42;
    char[] ch={'A','B','C','D','E','F','G','H','I','J','K'};
    StringBuffer sb1 = new StringBuffer(40);
    s = sb1.append("a = ").append(a).append("!").append(ch,2,3).toString();
    System.out.println(s);

    String t1 = "To be or not to be, that is the question.";
    String t2 = "To be or not to be, that is the question.";
    String t3=t1.replace(' ', '/');     // Modify the string text
    
    System.out.println(t3);
  }
}