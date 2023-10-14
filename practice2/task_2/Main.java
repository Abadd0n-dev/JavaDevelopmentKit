package task_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new ChatWindow(new ConsoleServerListener(), new Server(new LogServerListener("ServerLogfile")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
