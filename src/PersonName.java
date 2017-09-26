public class PersonName {
        public static void main(String[] args) {

//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName()));
//            System.out.println(person1 == person2);

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2);

            Person person1 = new Person("Art");
            Person person2 = person1;
            System.out.println(person1.getName());
            System.out.println(person2.getName());
            person2.setName("jane");
            System.out.println(person1.getName());
            System.out.println(person2.getName());

        }

    }

