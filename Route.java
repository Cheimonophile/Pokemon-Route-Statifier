import java.util.ArrayList;

public class Route{
  
  private ArrayList<String> pkmn = new ArrayList<String>();
  private ArrayList<String> difPkmn = new ArrayList<String>();
  private int numPkmn = 0;
  
  //creates a new route
  public Route(){
  }
  
  //adds a pokemon to the route
  public void add(String p){
    p = p.toLowerCase();
    pkmn.add(p);
    numPkmn++;
    boolean found = false;
    
    for(String x: difPkmn){
      if(x.equals(p)){
        found = true;
        break;
      }
    }
    
    if(!found){
      difPkmn.add(p);
    }
  }
  
  //returns num of pokemon
  public int num(){
    return numPkmn;
  }
  
  //tostring method
  public String toString(){
    String temp = "";
    
    for(String x: difPkmn){
      int num = 0;
      
      for(String y: pkmn){
        if(x.equals(y)){
          num++;
        }
      }
      
      int percent = (num*100)/numPkmn;
      temp += x + ": " + percent + "%\n";
    }

    return temp;
  }
  
}