package com.udpp.app.adapter.input.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashSet;

public class Embedded {
    @JsonProperty("metadata")
    private MetaDataDto metaData;

    @JsonProperty("metadata")
    private LinkedHashSet<MetaDataDto> lstMetaData;

    public Embedded() {
    }

    public Embedded(MetaDataDto metaDataDto) {
        this.metaData = metaDataDto;
    }

    public Embedded(LinkedHashSet<MetaDataDto> lstMetaData) {
        this.lstMetaData = lstMetaData;
    }

    public MetaDataDto getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataDto metaData) {
        this.metaData = metaData;
    }

}