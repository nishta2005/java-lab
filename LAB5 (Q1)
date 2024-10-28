class Gen<T>{
  T Ob;

Gen(T O) {
 Ob = O;
}
T getOb(){
  return Ob;
}

}

class GenDemo1{
   public static void main(String args[]){
     Gen<Integer> iob;
 iob = new Gen<Integer>(88);
 int v= iob.getOb();
 System.out.println("Autounboxed value is"+" "+v);

Gen<Double> dob;
dob = new Gen<Double>(10.0);
double d = dob.getOb();
System.out.println("Autounboxed value is" + " " + d);
}}
