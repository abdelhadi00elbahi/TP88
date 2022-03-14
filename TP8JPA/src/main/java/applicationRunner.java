import Presentation.ClientController;
import javassist.bytecode.ParameterAnnotationsAttribute;
import model.CarteFidelio;
import model.Client;
import model.Facture;
import model.Promotion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;


public class applicationRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) ctx.getBean("ctrl");

        Client client = new Client("OMAR");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");
        client=ctrl.save(client);
        client2=ctrl.save(client2);
        client3=ctrl.save(client3);

        ctrl.getAll().stream()
                .forEach(i-> System.out.println(i));
        System.out.println(ctrl.getOne(1));
        client.setName("Hassan");
        ctrl.modify(client);
        ctrl.remove(2);
        ctrl.getAll().stream()
               .forEach(i-> System.out.println(i));

    }


    }

