package week2.homework;

import week2.homework.factory.Cooker;
import week2.homework.factory.ElectricDevice;
import week2.homework.factory.Manufacturer;
import week2.homework.factory.WashingMachine;

public class Main {


    public static void main(String[] args) {
        // Хардкоднати данни:
        // Производител: "ElDevMan", който НЕ осигурява удължена гаранция (false)
        // Минимален период на гаранция: 3 месеца
        // За готварска печка: газова (true)
        // За пералня: има функция за сушене (true)
        Manufacturer manufacturer = new Manufacturer("ElDevMan", false);
        int minWarranty = 3;

        // Създаваме обект от тип ElectricDevice
        ElectricDevice ed = new ElectricDevice(manufacturer, minWarranty);
        System.out.println(ed.warranty());  // Очакван резултат: 6 (3 * 2, защото няма удължена гаранция)

        // Създаваме обект от тип Cooker (готварска печка), която е газова
        ed = new Cooker(manufacturer.getName(), manufacturer.isHaveExtendedWarranty(), minWarranty, true);
        System.out.println(ed.warranty());  // Очакван резултат: 18 (6 + 12)

        // Създаваме обект от тип WashingMachine (пералня) с функция за сушене
        ed = new WashingMachine(manufacturer.getName(), manufacturer.isHaveExtendedWarranty(), minWarranty, true);
        System.out.println(ed.warranty());  // Очакван резултат: 9 (6 + 3)
    }

}
