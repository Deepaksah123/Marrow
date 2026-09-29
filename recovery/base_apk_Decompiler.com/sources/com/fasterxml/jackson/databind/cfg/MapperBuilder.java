package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapperBuilder<M extends ObjectMapper, B extends MapperBuilder<M, B>> {
    protected final M _mapper;

    protected final B _this() {
        return this;
    }

    public MapperBuilder(M m) {
        this._mapper = m;
    }

    public M build() {
        return this._mapper;
    }

    public B addModule(Module module) {
        this._mapper.registerModule(module);
        return (B) _this();
    }
}
