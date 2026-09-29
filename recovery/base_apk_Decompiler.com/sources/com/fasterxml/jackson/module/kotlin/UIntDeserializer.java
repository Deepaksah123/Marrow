package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import kotlin.Metadata;
import kotlin.setCustomerEmail;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/UIntDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lo/setCustomerEmail;", "<init>", "()V", "Lcom/fasterxml/jackson/core/JsonParser;", "p0", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "p1", "deserialize-xfHcF5w", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)I", "deserialize"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UIntDeserializer extends StdDeserializer<setCustomerEmail> {
    public static final UIntDeserializer INSTANCE = new UIntDeserializer();

    private UIntDeserializer() {
        super((Class<?>) setCustomerEmail.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return setCustomerEmail.IconCompatParcelizer(m14deserializexfHcF5w(jsonParser, deserializationContext));
    }

    /* JADX INFO: renamed from: deserialize-xfHcF5w, reason: not valid java name */
    public final int m14deserializexfHcF5w(JsonParser p0, DeserializationContext p1) throws InputCoercionException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        setCustomerEmail setcustomeremailAsUInt = UnsignedNumbersKt.asUInt(p0.getLongValue());
        if (setcustomeremailAsUInt != null) {
            return setcustomeremailAsUInt.getWrite();
        }
        StringBuilder sb = new StringBuilder("Numeric value (");
        sb.append((Object) p0.getText());
        sb.append(") out of range of UInt (0 - 4294967295).");
        throw new InputCoercionException(p0, sb.toString(), JsonToken.VALUE_NUMBER_INT, setCustomerEmail.class);
    }
}
