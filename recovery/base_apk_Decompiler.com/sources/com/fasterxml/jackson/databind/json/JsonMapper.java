package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class JsonMapper extends ObjectMapper {

    public static class Builder extends MapperBuilder<JsonMapper, Builder> {
        public Builder(JsonMapper jsonMapper) {
            super(jsonMapper);
        }
    }

    public JsonMapper() {
        this(new JsonFactory());
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    public static Builder builder() {
        return new Builder(new JsonMapper());
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }
}
