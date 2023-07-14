package step.learning;

import step.learning.control.ControlDemo;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        /*
         System.out.println( "Hello World!" );
         do {
             new step.learning.control.MultiplicationTable().run();
         } while (true);
        */
        //new ControlDemo().run();
        new step.learning.oop.Library().showCatalog();
    }

}

/*
Java Вступ

Java - ООП мова програмування, на сьогодні курується Oracle
Мова типу "транслятор" - компілюється у байт-код (проміжний
код), який виконується спеціальною платформою (JRE -
Java Runtime Environment) або JVM (Virtual Machine)
Ця платформа встановлюється як окреме ПЗ. Для перевірки
можна виконати у терміналі команду
java -version

У Java гарна "зворотна" сумісність - старші платформи нормально
виконують код, створений ранніми платформами
Є визначна версія - Java8 (1.8), яка оновлюється, але не
модифікується. На ній працює більшість програмних комплексів
типу ЕЕ

Java SE (Standard Edition) - базовий набір
Java EE (Enterprise Edition) - базовий набір + розширені засоби

Для створення програм необхідний додатковий пакет - JDK (Java
Development Kit)

Після встановлення JRE, JDK встановлюємо IDE (Intellij Idea)
Створюємо новий проєкт.
Як правило, проєкти базуються на шаблонах, орієнтованих на
простоту збирання проєкту - підключення додаткових модулів,
формування команд компілятору та виконавцю, тощо
Поширені системи - Maven, Gradle, Ant, Idea
При створенні нового проєкту - вибираємо Maven Archetype
тип - org.apache.maven.archetypes:maven-archetype-quickstart

Після створення проєкту конфігуруємо запуск (від початку
налаштовано запуск Current File) - Edit Configuration -
- Create new - Application -- вводимо назву (Арр) та
вибираємо головний клас - Арр
 */

/*
Java - інтерпретована мова програмування, яка файли .java (вихідний код)
компілює у байт-код (файли .class), які виконуються JVM (Java Virtual Machine)
> java.exe step.learning.App
На відміну від Студії - окреме вікно консолі не створюється,
виведення (та введення) проводиться через вікно IDE - Run

У Java сувора прив'язка до структури файлів та папок
- папка це пакет (package) аналог namespace
    назва папки один-одному відповідає назві пакету
    Прийнято lowercase для назви пакетів
- файл - це клас. Обмеження - один файл - один public клас
    зауваження: в одному файлі може бути декілька класів,
    але тільки один public
    а також є внутрішні класи (inner class)
    Назва файлу відповідає назві класу
    Для імен класів прийнято використовувати CamelCase
    (перша буква велика)

 */