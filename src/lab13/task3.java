package lab13;

import java.util.StringTokenizer;

public class task3 {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Метод для разбора адреса с запятой в качестве разделителя
    public void parseAddressUsingComma(String address) {
        String[] parts = address.split(","); // разбиваем строку по запятой
        if(parts.length >= 6) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            if(parts.length > 6) {
                apartment = parts[6].trim();
            } else {
                apartment = "";
            }
        }
    }

    // Метод для разбора адреса с любым из указанных разделителей
    public void parseAddressUsingStringTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        if(tokenizer.countTokens() >= 6) {
            country = tokenizer.nextToken().trim();
            region = tokenizer.nextToken().trim();
            city = tokenizer.nextToken().trim();
            street = tokenizer.nextToken().trim();
            house = tokenizer.nextToken().trim();
            building = tokenizer.nextToken().trim();
            apartment = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        }
    }

    // Геттеры
    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return String.format("Country: %s, Region: %s, City: %s, Street: %s, House: %s, Building: %s, Apartment: %s",
                country, region, city, street, house, building, apartment);
    }

    public static void main(String[] args) {
        // Проверочный класс с несколькими адресными строками
        task3 address1 = new task3();
        address1.parseAddressUsingComma("Россия, Москва, Москва, Тверская, 1, 1, 101");
        System.out.println(address1);

        task3 address2 = new task3();
        address2.parseAddressUsingStringTokenizer("США; Калифорния; Лос-Анджелес; Холливудская; 123; 2; 45");
        System.out.println(address2);

        task3 address3 = new task3();
        address3.parseAddressUsingComma("Франция, Иль-де-Франс, Париж, Шанз-Элисей, 40, 1");
        System.out.println(address3);

        task3 address4 = new task3();
        address4.parseAddressUsingStringTokenizer("Германия. Бавария. Мюнхен. Мариенплац. 8. 2. 12");
        System.out.println(address4);
    }
}