/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the disk image base class.
 */
public class GalleryDiskImage {
    /**
     * This property indicates the size of the VHD to be created.
     */
    @JsonProperty(value = "sizeInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sizeInGB;

    /**
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and
     * 'ReadWrite'. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     */
    @JsonProperty(value = "hostCaching")
    private HostCaching hostCaching;

    /**
     * The source property.
     */
    @JsonProperty(value = "source")
    private GalleryArtifactVersionSource source;

    /**
     * Get this property indicates the size of the VHD to be created.
     *
     * @return the sizeInGB value
     */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * Get the host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @return the hostCaching value
     */
    public HostCaching hostCaching() {
        return this.hostCaching;
    }

    /**
     * Set the host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @param hostCaching the hostCaching value to set
     * @return the GalleryDiskImage object itself.
     */
    public GalleryDiskImage withHostCaching(HostCaching hostCaching) {
        this.hostCaching = hostCaching;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public GalleryArtifactVersionSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryDiskImage object itself.
     */
    public GalleryDiskImage withSource(GalleryArtifactVersionSource source) {
        this.source = source;
        return this;
    }

}
