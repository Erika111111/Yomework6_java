// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package HW6;

import java.util.HashSet;
import java.util.Set;

public class Task {
    public static void main(String[] args) {

        Set<Notebook> notebooksize = new HashSet<Notebook>();
        notebooksize.add(new Notebook("Apple", "grey", 100000, "MacOS"));
        notebooksize.add(new Notebook("Toshiba", "black", 80000, "Windows10"));
        notebooksize.add(new Notebook("HP", "dark grey", 85000, "Windows10"));
    
        for(var Notebook : notebooksize){
            System.out.println(Notebook.getBrand());
            System.out.println(Notebook.color());
            System.out.println(Notebook.price());
            System.out.println(Notebook.os());
        }

        
    }
}
