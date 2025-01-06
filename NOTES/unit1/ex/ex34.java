class ex34
{
  int  a;
  int  b;

  void setA(int a) 
  {
    a = a; //here, the local variable has closer scope than the instance 
          // variable, so the expression set parameter equal to itself
    this.a = a; // this is the correct way to set the parameter to the 
           //instance variable.
  }

  void setB(int b) 
  {
    this.b = b;
  }
}