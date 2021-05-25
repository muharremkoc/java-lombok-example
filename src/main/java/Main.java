import lombok.NonNull;
import model.Person;

public class Main {
   static Person person=new Person();
    public static void main(String[] args) {
     noNull();
     getterAndSetter();
     toStringModule();
     equalsToHashcode();
     builders();


    }
     static void noNull(){

        person.setId(1);
        person.setName(null);
        System.out.println(person.getName());
    }

    static void getterAndSetter(){
        person.setId(21);
        person.setName("UserOne");
        System.out.println(person.getName());

    }
    static void toStringModule(){
        person.setName("Muho");
        person.setId(1);
        person.setYears(21);
        System.out.println(person);
    }
    static void equalsToHashcode(){
        Person personOne=new Person();
         Person personTwo=new Person();
        System.out.println("person:"+person.hashCode());
        System.out.println("personOne:"+personOne.hashCode());
        System.out.println("personTwo:"+personTwo.hashCode());
    }
        static void builders(){
        Person personBuild=Person.PersonBuilder()
                .id(2)
                .number(20)
                .years(21)
                .name("Muharrem")
                .build();
            System.out.println(personBuild);
        }
}
