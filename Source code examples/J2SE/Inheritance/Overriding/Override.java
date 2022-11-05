class A {
int i, j;
A(int a, int b) {
i = a;
j = b;
}

void show() {System.out.println("i and j: " + i + " " + j);}
}

class B extends A {
int k;
B(int a, int b, int c) {
super(a, b);
k = c;
}

void show()
{
	super.show(); // this calls show() in Super class (A)
	System.out.println("k: " + k);}
}


class Override {
public static void main(String args[]) {
B subOb = new B(1, 2, 3);
A supOb = new A(1, 2);

subOb.show(); // this calls show() in B class

supOb.show(); // this calls show() in A class

}

}

