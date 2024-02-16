package ch18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConCurrentReaders {
    public static void main(String[] args) {
        List<Chat> chatHistory = new CopyOnWriteArrayList<>();
//        List<Chat> chatHistory = new ArrayList<>();

        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            for (int i = 5; i > 0; i--) {
                pool.execute(() ->chatHistory.add(new Chat("Hi there!")));
                pool.execute(() -> System.out.println(chatHistory));
                pool.execute(() -> System.out.println(chatHistory));
            }
            pool.shutdown();
        }
    }

    static final class Chat{
        private final String message;
        private final LocalDateTime timestamp;

        public Chat(String message) {
            this.message = message;
            this.timestamp = LocalDateTime.now();
        }

        public String toString() {
            String time = timestamp.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
            return time + " " + message;
        }

    }
}
