// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for ChangeLease operation.
 */
@JacksonXmlRootElement(localName = "Share-ChangeLease-Headers")
@Fluent
public final class ShareChangeLeaseHeaders {
    /*
     * The ETag contains a value that you can use to perform operations
     * conditionally, in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * Returns the date and time the share was last modified. Any operation
     * that modifies the share or its properties updates the last modified
     * time. Operations on files do not affect the last modified time of the
     * share.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * Uniquely identifies a share's lease
     */
    @JsonProperty(value = "x-ms-lease-id")
    private String leaseId;

    /*
     * If a client request id header is sent in the request, this header will
     * be present in the response with the same value.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String clientRequestId;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: Returns the date and time the share was
     * last modified. Any operation that modifies the share or its properties
     * updates the last modified time. Operations on files do not affect the
     * last modified time of the share.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the share was
     * last modified. Any operation that modifies the share or its properties
     * updates the last modified time. Operations on files do not affect the
     * last modified time of the share.
     *
     * @param lastModified the lastModified value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the leaseId property: Uniquely identifies a share's lease.
     *
     * @return the leaseId value.
     */
    public String getLeaseId() {
        return this.leaseId;
    }

    /**
     * Set the leaseId property: Uniquely identifies a share's lease.
     *
     * @param leaseId the leaseId value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the ShareChangeLeaseHeaders object itself.
     */
    public ShareChangeLeaseHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
