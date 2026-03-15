package JavaConcepts;

import java.lang.reflect.Field;

public class Reflections {
    JavaCoding obj = new JavaCoding();

    public Reflections() {
        try {
            Class<JavaCoding> clazz = JavaCoding.class;
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields) {
                System.out.println(field.getName());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
