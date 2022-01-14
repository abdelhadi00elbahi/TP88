import Presentation.ClientController;
import javassist.bytecode.ParameterAnnotationsAttribute;
import model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class applicationRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) ctx.getBean("cont1");


        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));

        ctrl.removeById(1L);

    }
}
