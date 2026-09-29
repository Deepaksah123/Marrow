package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.getTopRankers;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/SequenceDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lo/getTopRankers;", "<init>", "()V", "Lcom/fasterxml/jackson/core/JsonParser;", "p0", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "p1", "deserialize", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lo/getTopRankers;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SequenceDeserializer extends StdDeserializer<getTopRankers<?>> {
    public static final SequenceDeserializer INSTANCE = new SequenceDeserializer();

    private SequenceDeserializer() {
        super((Class<?>) getTopRankers.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final getTopRankers<?> deserialize(JsonParser p0, DeserializationContext p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Object value = p1.readValue(p0, (Class<Object>) List.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
        return IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) value);
    }
}
