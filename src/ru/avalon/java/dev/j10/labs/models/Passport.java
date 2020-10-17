package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
	private int documentNumber;
	private int documentSeries;
	private String name;
	private String surname;
	private String patronymic;
	private String secondName;
	private LocalDate birthday;
	private LocalDate dateOfIssue;
	private String issuingAuthority;
	
	public Passport(int documentNumber, int documentSeries, String name, String surname, String patronymic,
			String secondName, String birthday, String dateOfIssue, String issuingAuthority) {
		this(birthday,dateOfIssue);
		this.documentNumber = documentNumber;
		this.documentSeries = documentSeries;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.secondName = secondName;
		this.issuingAuthority = issuingAuthority;
	}
	
	public Passport(int documentNumber, int documentSeries, String name, String surname, String secondName,
			String birthday, String dateOfIssue, String issuingAuthority) {
		this(birthday, dateOfIssue);
		this.documentNumber = documentNumber;
		this.documentSeries = documentSeries;
		this.name = name;
		this.surname = surname;
		this.secondName = secondName;
		this.issuingAuthority = issuingAuthority;
	}

	private Passport(String birthday, String dateOfIssue) {
		this.birthday = LocalDate.parse(birthday);
		this.dateOfIssue = LocalDate.parse(dateOfIssue);	
	}

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public int getDocumentSeries() {
		return documentSeries;
	}

	public void setDocumentSeries(int documentSeries) {
		this.documentSeries = documentSeries;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getBirthday() {
		return birthday.toString();
	}

	public void setBirthday(String birthday) {
		this.birthday = LocalDate.parse(birthday);
	}

	public String getDateOfIssue() {
		return dateOfIssue.toString();
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = LocalDate.parse(dateOfIssue);
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}	
}