// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.models.PasswordCredentialInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PasswordCredential list operation result. */
@Fluent
public final class PasswordCredentialListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PasswordCredentialListResult.class);

    /*
     * A collection of PasswordCredentials.
     */
    @JsonProperty(value = "value")
    private List<PasswordCredentialInner> value;

    /**
     * Get the value property: A collection of PasswordCredentials.
     *
     * @return the value value.
     */
    public List<PasswordCredentialInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of PasswordCredentials.
     *
     * @param value the value value to set.
     * @return the PasswordCredentialListResult object itself.
     */
    public PasswordCredentialListResult withValue(List<PasswordCredentialInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
