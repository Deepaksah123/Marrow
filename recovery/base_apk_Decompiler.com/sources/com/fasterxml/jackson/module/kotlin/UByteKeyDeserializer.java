package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.setClientAuthToken;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/UByteKeyDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;", "<init>", "()V", "", "p0", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "p1", "Lo/setClientAuthToken;", "deserializeKey-lj4SQcc", "(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lo/setClientAuthToken;", "deserializeKey"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UByteKeyDeserializer extends StdKeyDeserializer {
    public static final UByteKeyDeserializer INSTANCE = new UByteKeyDeserializer();

    private UByteKeyDeserializer() {
        super(3, setClientAuthToken.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
    /* JADX INFO: renamed from: deserializeKey-lj4SQcc, reason: not valid java name and merged with bridge method [inline-methods] */
    public final setClientAuthToken deserializeKey(String p0, DeserializationContext p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p1, "");
        Object objDeserializeKey = super.deserializeKey(p0, p1);
        if (objDeserializeKey == null) {
            return null;
        }
        setClientAuthToken setclientauthtokenAsUByte = UnsignedNumbersKt.asUByte(((Short) objDeserializeKey).shortValue());
        if (setclientauthtokenAsUByte != null) {
            return setClientAuthToken.AudioAttributesCompatParcelizer(setclientauthtokenAsUByte.getRead());
        }
        StringBuilder sb = new StringBuilder("Numeric value (");
        sb.append((Object) p0);
        sb.append(") out of range of UByte (0 - 255).");
        throw new InputCoercionException(null, sb.toString(), JsonToken.VALUE_NUMBER_INT, setClientAuthToken.class);
    }
}
