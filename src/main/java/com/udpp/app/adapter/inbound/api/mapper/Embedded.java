package com.udpp.app.adapter.inbound.api.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Embedded {
    @JsonProperty("metadata")
    private MetaDataDto metaDataDto;

    public Embedded() {
    }

    public Embedded(MetaDataDto metaDataDto) {
        this.metaDataDto = metaDataDto;
    }

    public MetaDataDto getMetaDataDto() {
        return metaDataDto;
    }

    public void setMetaDataDto(MetaDataDto metaDataDto) {
        this.metaDataDto = metaDataDto;
    }
}