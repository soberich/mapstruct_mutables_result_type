package com.example;

import javax.annotation.Nullable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public interface BankAccountCommand {

    @Nullable
    @Pattern(regexp = "\\d{0,30}", message = "{error.bankaccount.branchcode.digits}")
    String getBranchCode();

    @NotNull
    @Pattern(regexp = "\\d{1,10}", message = "{error.bankaccount.bankcode.digits}")
    String getBankCode();

    @NotNull
    @Pattern(regexp = "\\d{1,30}", message = "{error.bankaccount.accountnumber.digits}")
    String getAccountNumber();

    @NotBlank
    @Size(max = 255)
    String getAccountHolderName();

    @NotNull
    @Min(1L)
    Long getOwnerId();
}
