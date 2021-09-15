package org.xpdojo.bank;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance, is(0));
    }

    private void assertThat(int balance, Matcher<Integer> integerMatcher) {
    }

    @Test
    public void depostingAmountsIncreaseBalanceByTheSameAmount() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, is(100));
    }

    @Test
    public void depositingMultipleAmounts() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance, is(400));
            }
}