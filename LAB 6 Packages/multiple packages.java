package p1;
class A{
A(){
System.out.println("Constructor A");
}

void DisplayA(){
System.out.println("method A");
}
}

package pack;
import p1.A;

class TestPack{
public static void main(String args[]){
A a1 = new A();
a1.DisplayA();
}
}

package p1;
class B{
B(){
System.out.println("Constructor B");
}

void DisplayB(){
System.out.println("method B");
}
}

import p1.B;

class TestPackB{
public static void main(String args[]){
B b1 = new B();
b1.DisplayB();
}
}

package p1.p11;
class C{
C(){
System.out.println("Constructor C");
}

void DisplayC(){
System.out.println("method C");
}
}

import p1.p11.C;

class TestPackC{
public static void main(String args[]){
C c1 = new C();
c1.DisplayC();
}
}

package p2;
class D{
D(){
System.out.println("constructor D");
}

void DisplayD(){
System.out.println("method D");
}
}

import p2.D;

class TestPackD{
public static void main(String args[]){
D d1 = new D();
d1.DisplayD();
}
}
