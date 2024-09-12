public class Person {
    String name, position, email, telephone;
    int pay, age;

    Person (String a, String b, String c, String d, int e, int i){
        name = a;
        position = b;
        email = c;
        telephone = d;
        pay = e;
        age = i;
    }

    void dataOutput() {
        System.out.println("ФИО сотрудника " + name);
        System.out.println("Должность сотрудника " + position);
        System.out.println("Email сотрудника " + email);
        System.out.println("Телефон сотрудника " + telephone);
        System.out.println("Зарплата сотрудника " + pay);
        System.out.println("Возраст сотрудника " + age);
    }

    int GetAge() {
        return age;
    }
}

public class Age {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov", "Engineer", "ivivan@mailbox.com", "892312312",30000, 30);
        persArray[1] = new Person("Petrov", "Engineer", "petrov@mailbox.com", "895645362", 35000, 41;
        persArray[2] = new Person("Sidorov", "Engineer", "sidorov@mailbox.com", "8456234672", 45000,25);
        persArray[3] = new Person("Pupkin", "Engineer", "pupkin@mailbox.com", "8234567823",650000, 41);
        persArray[4] = new Person("Semenov", "Engineer", "semenov@mailbox.com", "8423567345", 30000,23);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray.GetAge() > 40) {       // не могу понять, почему метод GetAge выделен красным
                persArray.dataOutput();          // не могу понять, почему метод dataOutput выделен красным

            }

        }

    }
}