package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "TClients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private List<Facture> factures;
    public long id ;
    public String name;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Promotion> promotions;

    public Client() {
    }

    public  Client(String name)
    {
        this.id=id;
        this.name=name;

    }
    public  Client(long l, String siham)
    {

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
