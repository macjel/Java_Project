import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("To jest mój pierwszy projekt");
        System.out.println("Maciej");
        System.out.println("Last name");
        System.out.println("ZST");

        LocalDateTime dataObj = LocalDateTime.now();
        System.out.println("Before Formating: " + dataObj);

        DateTimeFormatter dataObjForm = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String stringDataObjForm = dataObj.format(dataObjForm);
        System.out.println("After Formating: " + stringDataObjForm);
    }
}