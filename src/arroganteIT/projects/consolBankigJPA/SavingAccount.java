package arroganteIT.projects.consolBankigJPA;

import java.util.Date;

public interface SavingAccount {
    void deposit(double amount, Date date);

    void withdraw(double amount, Date date);
}
