import Presentation.ClientController;
import javassist.bytecode.ParameterAnnotationsAttribute;
import model.Client;
import model.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;


public class applicationRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) ctx.getBean("cont1");




    }
}
