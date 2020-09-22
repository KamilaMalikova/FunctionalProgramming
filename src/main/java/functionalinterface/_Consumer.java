package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Marry", "99999999");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
        greetCustomerConsumerV2.accept(customer, true);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) ->
            System.out.println(customer+" "+showPhone);

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(customer);

    static void greetCustomer(Customer customer){
        System.out.println(customer);
    }

    static class Customer{
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
