package com.example;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG;
import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;
import static org.mapstruct.ReportingPolicy.ERROR;
import static org.mapstruct.ReportingPolicy.WARN;

@org.mapstruct.MapperConfig(
        injectionStrategy                 = CONSTRUCTOR,
        mappingInheritanceStrategy        = AUTO_INHERIT_ALL_FROM_CONFIG,
        nullValueCheckStrategy            = ALWAYS,
        nullValuePropertyMappingStrategy  = IGNORE,
        typeConversionPolicy              = ERROR,
        unmappedSourcePolicy              = WARN,
        unmappedTargetPolicy              = ERROR)
public interface MapperConfig {
}
