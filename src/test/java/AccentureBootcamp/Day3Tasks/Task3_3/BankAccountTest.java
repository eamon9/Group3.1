package AccentureBootcamp.Day3Tasks.Task3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    BankAccount ba= new BankAccount();


    @Test
    void printBalance() {
        assertEquals("9", ba.printBalance());
    }
}