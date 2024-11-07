package CollectionsBasicsIntro.ArrayList;

import java.util.ArrayList;
class students
 {
    String name;
    int age;

    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class arraylistexample {
    public static void main(String[] args) {
        ArrayList<students> st = new ArrayList<>();
        students s1 = new students("a", 45);
        students s2 = new students("b", 34);
        students s3 = new students("c", 23);
        st.add(s1);
        st.add(s2);
        st.add(s3);

        for (students s : st) {
            System.out.println("Student Name: " + s.name);
            System.out.println("Student age: " + s.age);
        }
            System.out.println("\nSize of Student List: " + st.size());
            System.out.println("Is Student List empty? " + st.isEmpty());

          // st.set(1, "virat kohli");
            students s4= new students("virat kohli",35);
            st.set(1,s4);

            st.remove(2);

            System.out.println("List of Students: ");
            for (int i = 0; i < st.size(); i++) {
                students s=st.get(i);
                System.out.println(s.name+" "+ s.age);
            }


















/*class college {
    String name;

    college(String name) {
        this.name = name;
    }
}
        CollectionsBasicsIntro.ArrayList<college> cl=new CollectionsBasicsIntro.ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=2;i++)
        {
            System.out.println("Enter college"+i+" name: ");
            String name=sc.nextLine();
            college c1=new college(name);
            cl.add(c1);
        }
        for (college c:cl)
        {
            System.out.println("college name: "+c.name);

        }*/

    }
}