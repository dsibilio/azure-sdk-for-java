// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines how the Suggest API should apply to a group of fields in the index. */
@Fluent
public final class Suggester {
    /*
     * The name of the suggester.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A value indicating the capabilities of the suggester.
     */
    @JsonProperty(value = "searchMode", required = true)
    private String searchMode;

    /*
     * The list of field names to which the suggester applies. Each field must
     * be searchable.
     */
    @JsonProperty(value = "sourceFields", required = true)
    private List<String> sourceFields;

    /**
     * Creates an instance of Suggester class.
     *
     * @param name the name value to set.
     * @param searchMode the searchMode value to set.
     * @param sourceFields the sourceFields value to set.
     */
    @JsonCreator
    public Suggester(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "searchMode", required = true) String searchMode,
            @JsonProperty(value = "sourceFields", required = true) List<String> sourceFields) {
        searchMode = "analyzingInfixMatching";
        this.name = name;
        this.searchMode = searchMode;
        this.sourceFields = sourceFields;
    }

    /**
     * Get the name property: The name of the suggester.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the searchMode property: A value indicating the capabilities of the suggester.
     *
     * @return the searchMode value.
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * Get the sourceFields property: The list of field names to which the suggester applies. Each field must be
     * searchable.
     *
     * @return the sourceFields value.
     */
    public List<String> getSourceFields() {
        return this.sourceFields;
    }
}
