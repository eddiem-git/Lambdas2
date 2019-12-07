

import java.util.ArrayList;
import java.util.List;

public class SocialNetworking{
    List<Person> network;

    public SocialNetworking(){
        this.network = new ArrayList<>();
    }

    public SocialNetworking(Person person){
        this.network = new ArrayList<>();
        this.network.add(person);
    }

    public void add(Person person){
        this.network.add(person);
    }

    public List<Person> get(){
        return network;
    }



}