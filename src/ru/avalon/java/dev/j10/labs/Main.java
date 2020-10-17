package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.common.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {

        Passport passportIvanov = new Passport(1234, 123456, "Иван", "Иванов", "Иванович",
        		null, "1970-01-01","1986-01-01","01 отд. милиции");
        Address addressIvanov = new Address("Россия", "Санкт-Петербург", "Цветочная", 12, 123, 123456);
        
        Passport passportJohn = new Passport(1243, 456908, "John", "Kennedy", "Fitzgerald",
        		"1917-05-29", "1933-01-01", "U.S. Department of State");
    	Address addressJohn = new Address("USA", "Brooklyn", "Cadman Plaza", 123, 25, 112);
    	
    	Person ivanov = new Person(passportIvanov,addressIvanov);
        Person john = new Person(passportJohn, addressJohn);
        
        String fullNameIvanov = ivanov.getFullName();
        String fullNameJohn = john.getFullName();
        
        String getAddressIvanov = ivanov.getAddress();
        String getAddressJohn = john.getAddress();
        
        
        
        System.out.println(fullNameIvanov);
        System.out.println(ivanov.getDateOfBirth());
        System.out.println(getAddressIvanov);
        System.out.println();
        System.out.println(fullNameJohn);
        System.out.println(john.getDateOfBirth());
        System.out.println(getAddressJohn);

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
