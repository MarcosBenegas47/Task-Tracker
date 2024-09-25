import java.util.ArrayList;
import java.util.List;

public class taskCli {

    public static void main(String[] args){


        String comand = args[0];
        switch (comand){
            case "add":
                System.out.println("ingreso add " );
                TaskClass.IngresarTask(args[1]);

                break;
            case "update":
                System.out.println("ingreso Update");
                break;
            case "list":
                TaskClass.listTask();
        }

    }
}
