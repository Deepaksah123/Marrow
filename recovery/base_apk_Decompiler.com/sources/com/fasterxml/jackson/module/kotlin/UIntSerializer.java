package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.setCustomerEmail;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/UIntSerializer;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Lo/setCustomerEmail;", "<init>", "()V", "p0", "Lcom/fasterxml/jackson/core/JsonGenerator;", "p1", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "p2", "", "serialize-OzbTU-A", "(ILcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "serialize"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UIntSerializer extends StdSerializer<setCustomerEmail> {
    public static final UIntSerializer INSTANCE = new UIntSerializer();

    private UIntSerializer() {
        super(setCustomerEmail.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        m16serializeOzbTUA(((setCustomerEmail) obj).getWrite(), jsonGenerator, serializerProvider);
    }

    /* JADX INFO: renamed from: serialize-OzbTU-A, reason: not valid java name */
    public final void m16serializeOzbTUA(int p0, JsonGenerator p1, SerializerProvider p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        long j = -1;
        p1.writeNumber(((long) p0) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
    }
}
