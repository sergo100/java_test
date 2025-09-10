package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String[] spletedfullName = fullName.split(" ");
        StringBuilder stringbuilder= new StringBuilder();
        for (String Value:spletedfullName){
            stringbuilder.append(Value.charAt(0)).append('.');
        }
        String result=stringbuilder.toString();
        System.out.println(result);

    }
}