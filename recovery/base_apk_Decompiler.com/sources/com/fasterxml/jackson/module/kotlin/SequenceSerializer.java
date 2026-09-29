package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.getTopRankers;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/SequenceSerializer;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Lo/getTopRankers;", "<init>", "()V", "p0", "Lcom/fasterxml/jackson/core/JsonGenerator;", "p1", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "p2", "", "serialize", "(Lo/getTopRankers;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SequenceSerializer extends StdSerializer<getTopRankers<?>> {
    public static final SequenceSerializer INSTANCE = new SequenceSerializer();

    private SequenceSerializer() {
        super(getTopRankers.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(getTopRankers<?> p0, JsonGenerator p1, SerializerProvider p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        p2.defaultSerializeValue(p0.write(), p1);
    }
}
