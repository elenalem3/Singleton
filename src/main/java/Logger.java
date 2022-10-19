import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger; // В этом поле храним ссылку на тот единственный объект этого класса, который будем отдавать пользователям
    private SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public void log(String msg) {
        System.out.println("[" + date.format(new Date()) + " " + num++ + "] " + msg);
    }

    private Logger() {
    } // Запрещаем пользователям пользоваться конструктором нашего класса


    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
