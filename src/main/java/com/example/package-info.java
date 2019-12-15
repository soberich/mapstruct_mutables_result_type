@Value.Style(
        allParameters = true,
        create = "new",
        jacksonIntegration = false,
        jdkOnly = true,
        of = "new",
        //    overshadowImplementation = true,
        validationMethod = NONE // Remove this line to execute simple validation at runtime, after data integrity guaranteed on db level (non-null constraints)
)
package com.example;

import org.immutables.value.Value;

import static org.immutables.value.Value.Style.ValidationMethod.NONE;
