package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит количество слов в ней.
 * “Мама мыла Милу мылом!” -> 4
 * <p>
 * Подсказка: используйте метод .split() класса String
 */
public class ExC {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        String [] splitedString=input.split(" ");
        for (int i =0;i<=splitedString.length;i++){
            if(i<4){
                continue;
            }
            System.out.println(i);
        }


    }
}