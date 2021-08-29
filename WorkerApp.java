import java.lang.reflect.Field;


public class WorkerApp {

	
	public static void main(String[] args) {
		getAnnotationValue(Worker.class);
		
		
	}
	
	public static void getAnnotationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i]; 
			
			if (field.getAnnotation(WorkerAnnotation.class) instanceof WorkerAnnotation) {
				System.out.print(field.getName() + " ----- ");
				System.out.println(" Annotation value = " + field.getAnnotation(WorkerAnnotation.class).value());
			}
		}
		
	}
}
