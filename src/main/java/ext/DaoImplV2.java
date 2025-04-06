package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("ext")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 41;
    }
}
