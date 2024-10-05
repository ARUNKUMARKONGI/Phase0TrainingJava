package StringBasics;

public class ToStringExample {
    public static void main(String[] args) {
        Student st = new Student("Hello", 42);

        String result = String.valueOf(st);
       // String result=st.toString();
        System.out.println("Student Data: " + result);
    }

    static class Student {
        private String name;
        private int rollNo;

        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }
    }
}
