package compinator;

import java.time.LocalDate;
import static compinator.CustomerRegistrationValidator.*;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+098910000000",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidator().isValid(customer));

        ValidationResult validationResult = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(validationResult);
        if (validationResult != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(validationResult.name());
        }
    }
}
