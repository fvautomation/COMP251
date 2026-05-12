Output:

C’s is 3
B’s is 2
A’s is 4

Explanation:

When the object C c = new C(); is created, each class has its own instance variable x.

A.x = 1
B.x = 2
C.x = 3

The statement:

c.superDuperSetIt(4);

calls the method:

super.superSetIt(4);

Inside class C, super refers to class B. Therefore, B’s method superSetIt(4) is executed:

public void superSetIt(int y) { super.x = y; }

In class B, super.x refers to A’s variable x. Therefore:

A.x = 4

After execution, the values become:

A.x = 4
B.x = 2
C.x = 3

Now the print statements execute:

c.getIt()
returns C.x = 3

c.superGetIt()
returns B.x = 2

c.superDuperGetIt()
returns A.x = 4

Therefore, the final output is:

C’s is 3
B’s is 2
A’s is 4
