package com.example;

import java.time.Month;

import org.immutables.value.Value;

@Value.Modifiable
public abstract class BankAccount {

    public abstract Long getId();

    public abstract String getBranchCode();

    public abstract String getBankCode();

    public abstract String getAccountNumber();

    public abstract String getAccountHolderName();

    public abstract Long getOwnerId();

    public abstract Month getStatus();
}
