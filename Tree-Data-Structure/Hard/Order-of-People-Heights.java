public class Solution {
    
    class Person{
        
        int height, infront;
        
        Person(int height, int infront){
            this.height = height;
            this.infront = infront;
        }
    }
    public ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        ArrayList<Person> persons = new ArrayList<Person>();
       
       for(int i = 0; i < A.size();i++){
           Person person = new Person(Integer.valueOf(A.get(i)), Integer.valueOf(B.get(i)));
           persons.add(person);
       }
       
       Collections.sort(persons, new Comparator<Person>(){
         public int compare(Person p1, Person p2){
             
             if(p1.height < p2.height){
                 return -1;
             }
             
             else if(p1.height == p2.height){
                 if(p1.infront < p2.infront){
                     return -1;
                 }
                 else{
                     return 1;
                 }
             }
             else{
                 return 1;
             }
         } 
       }
       );
       
       ArrayList<Integer> result = new ArrayList<Integer>();
       
       for(int i= 0; i < A.size(); i++){
           result.add(-1);
       }
       
       int currmax = 0;
       for(int i = 0; i < persons.size(); i++){
           
         Person person = persons.get(i);
         int count = Integer.valueOf(person.infront);
         
         for(int j = 0; j < result.size();j++){
             
             if(count == 0 && result.get(j).equals(-1)){
                 result.set(j, person.height);
                 break;
             }
             else if(count ==0 && !result.get(j).equals(-1)){
             }
             else{
                 if(result.get(j).equals(-1)){
                     count--;
                 }
             }
         }
       }
       
       return result;
        
    }
}
