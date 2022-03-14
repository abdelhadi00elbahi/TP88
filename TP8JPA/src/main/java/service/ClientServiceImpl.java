package service;

import dao.Clientdao;
import dao.ClientdaoImpl;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientService service;
    @Override
    public Client save(Client clt) {
        return service.save(clt);
    }

    @Override
    public Client modify(Client clt) {
        return service.modify(clt);

    }

    @Override
    public void remove(long idClt) {
        service.remove(idClt);

    }

    @Override
    public Client getOne(long idClt) {
        return service.getOne(idClt);
    }

    @Override
    public List<Client> getAll() {
        return service.getAll();
    }
}
