package com.ld1995.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BasePersistenceDTO implements IEditDTO, IPersistenceDTO {

    @JsonIgnore
    private Long id;

    @JsonIgnore
    @Override
    public boolean isEdit() {
        return id != null;
    }

    @JsonIgnore
    @Override
    public boolean isNotEdit() {
        return !isEdit();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
