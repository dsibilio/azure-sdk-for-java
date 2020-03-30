// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ManagementPolicySchema model.
 */
@Fluent
public final class ManagementPolicySchema {
    /*
     * The Storage Account ManagementPolicies Rules. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ManagementPolicyRule> rules;

    /**
     * Get the rules property: The Storage Account ManagementPolicies Rules.
     * See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     * @return the rules value.
     */
    public List<ManagementPolicyRule> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: The Storage Account ManagementPolicies Rules.
     * See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     * @param rules the rules value to set.
     * @return the ManagementPolicySchema object itself.
     */
    public ManagementPolicySchema setRules(List<ManagementPolicyRule> rules) {
        this.rules = rules;
        return this;
    }
}