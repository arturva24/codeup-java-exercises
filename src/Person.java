public class Person {

        private String name;

        public Person(String aName){
            name = aName;
        }

        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;

        }
        public void sayHello() {
            System.out.println(name);

        }

}


