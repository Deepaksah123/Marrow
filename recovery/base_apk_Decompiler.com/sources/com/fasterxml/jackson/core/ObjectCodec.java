package com.fasterxml.jackson.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectCodec extends TreeCodec {
    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonFactory getFactory() {
        return getJsonFactory();
    }
}
