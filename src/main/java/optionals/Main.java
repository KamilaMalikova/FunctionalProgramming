package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending to "+email),
                        () -> System.out.println("Cannot send email"));
               // .ifPresent(email -> System.out.println("Sending to "+email));
//                .orElseThrow(()
//                        -> new IllegalStateException("exception"));
//                .orElseGet(() -> "default value");
        //System.out.println(object);
    }
}
