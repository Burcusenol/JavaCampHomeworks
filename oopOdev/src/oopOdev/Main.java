package oopOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"C#","Engin Demiroğ","Nitelikli Yazılımcı Kampı");
		
		Course course2=new Course();
		course2.id=2;
		course2.name="Java";
		course2.instructorName="Engin Demiroğ";
		course2.courseDetail="Nitelikli Yazılım Kampı"; 

		
        Course[] courses= {course1,course2};
		
		for(Course course:courses)
		{
			System.out.println("------KURS ADI------");
			System.out.println(course.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.Add(course2);
		courseManager.Update(course1);
	}

}
