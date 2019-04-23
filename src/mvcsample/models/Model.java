package mvcsample.models;

public class Model {
    
    private int x;
    
    public Model(){
        x = 0;
    }
    
    public Model(int x){
        this.x = x;
    }
    
    public void incX(){
        x++;
    }
    
    public int getX(){
        return x;
    }
    
    public void sum(int number){
        x = number + x;
    }
}