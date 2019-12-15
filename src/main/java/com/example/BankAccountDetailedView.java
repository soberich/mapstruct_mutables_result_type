package com.example;

import java.time.Month;
import javax.annotation.Nullable;

public interface BankAccountDetailedView {
    Long getId();
    @Nullable
    String getBranchCode();
    String getBankCode();
    String getAccountNumber();
    String getAccountHolderName();
    Long getOwnerId();
    Month getStatus();
}
