package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "TClients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long id ;
    public String name;
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
