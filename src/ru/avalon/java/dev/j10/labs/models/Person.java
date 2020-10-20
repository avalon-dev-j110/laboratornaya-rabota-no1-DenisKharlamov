package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.common.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
	
	Passport passport;
	Address address;
	
	

    public Person(Passport passport, Address address) {
		this.passport = passport;
		this.address = address;
	}

	/**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
    	String str = "";
        if (passport.getPatronymic() != null) str = passport.getSurname() + " "
         + passport.getName() + " " + passport.getPatronymic();
        else if (passport.getSecondName() != null) str = passport.getName() + " "
         + (passport.getSecondName()).substring(0, 1) + "." + " " + passport.getSurname();
        else if ((passport.getPatronymic() == null) && (passport.getSecondName() == null))
        str = passport.getName() + " " + passport.getSecondName();
        return str;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return "Residence address:" + "\n" + "Country: " + address.getCountry() + " " + "City: " + address.getCity() + " "
        		+ "Street: " + address.getStreet() + " " + "House number: " + address.getHouseNumber() + " "
        		+ "Apartment number: " + address.getApartmentNumber() + " " + "Index: " + address.getIndex();
    }
    
    public String getDateOfBirth() {
    	return "Date of birth(yyyy-mm-dd): " + passport.getBirthday();
    }
}