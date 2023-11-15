import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOSerialization{
    

    public static void main(String[] args) throws Exception {
        
        Student st = new Student("sandeep",23,"sandeep@gmail");

        FileOutputStream fos = new FileOutputStream("sam.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(st);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("sam.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student st1=(Student) ois.readObject();

        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getEmail());
    }
}
