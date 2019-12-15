package com.example;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.immutables.value.Value;

@Value.Immutable
public interface BankAccountUpdateCommand extends BankAccountCommand {

    @NotNull
    @Min(1L)
    Long getId();
}
