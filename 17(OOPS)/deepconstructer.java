public class deepconstructer {
    public static void main(String args[]){
        Student s1= new Student();
        s1.marks[0]=10;
        s1.marks[1]=20;
        s1.marks[2]=30;
        Student s2= new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
    
}
class Student
{   
 int marks[];

//shallow constructer
Student(){
    marks=new int[3];
}
//deep construter
 Student(Student s1){
    marks= new int [3];
    for(int i=0;i<3;i++){
        this.marks[i]=s1.marks[i];
    }

}

}