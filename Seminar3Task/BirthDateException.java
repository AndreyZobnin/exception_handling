package seminar3Task;

public class BirthDateException extends Exception {

    String data;

    public BirthDateException(String inputData) {
        this.data = inputData;
    }

    @Override
    public String getMessage() {
        return "ВНИМАНИЕ! Ошибка ввода даты: '" + data + "'.\n" +
                "Формат ввода даты рождения: 'дд.мм.гггг'.\n";
    }
}
