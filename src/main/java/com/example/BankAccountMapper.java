package com.example;

import java.io.Serializable;

import org.mapstruct.BeanMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public abstract class BankAccountMapper extends GenericMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    @BeanMapping(resultType = ModifiableBankAccount.class)
    public abstract /*Modifiable*/BankAccount toEntity(BankAccountCreateCommand source);

    @Mapping(target = "status", ignore = true)
//    @BeanMapping(resultType = ModifiableBankAccount.class)
    public abstract /*Modifiable*/BankAccount toEntity(@Context Serializable pk, BankAccountUpdateCommand source);

    public abstract BankAccountCreateView toCreateView(BankAccount source);

    public abstract BankAccountUpdateView toUpdateView(BankAccount source);
}
