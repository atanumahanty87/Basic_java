class A{
void callme()
{
System.out.println("Hello Java Students");
}
}
class B extends A{
void callme(){
System.out.println("Hello Java beginers ");
}
}
class Dispatch
{
public static void main(String args[]){
A a = new A();
B b = new B();
A r;//r is a class type reference
r=a;
r.callme();
r=b;
r.callme();
b.callme();
a.callme();
}
}