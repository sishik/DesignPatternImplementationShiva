package CreationalDesignPattern.Prototype;
import java.util.HashMap;
public class StudentRegistry {
    private HashMap<String,Student>map;
    public StudentRegistry(){
        this.map=new HashMap<>();
    }
    public void register(String name,Student prototype){
        map.put(name,prototype);
    }
    public Student getPrototype(String name){
        return map.get(name).copy();
    }

}
