public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Bobur";
        student.age = 15;
        student.grade = 9;
        System.out.println("Name:"+student.name+"\n"+"Years old:"+student.age+"\n"+"Какой класс:"+student.grade);
        Student student1 = new Student();
        student1.name = "Azamat";
        student1.age = 14;
        student1.grade = 7;
        System.out.println("Name:"+student1.name+"\n"+"Years old:"+student1.age+"\n"+"Какой класс:"+student1.grade);
        Student student2 = new Student();
        student2.name = "Marsel";
        student2.age = 16;
        student2.grade = 10;
        System.out.println("Name:"+student2.name+"\n"+"Years old:"+student2.age+"\n"+"Какой класс:"+student2.grade);
    }
}