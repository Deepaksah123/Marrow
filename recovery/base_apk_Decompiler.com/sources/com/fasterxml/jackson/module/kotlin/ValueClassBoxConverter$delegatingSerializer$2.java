package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getCreatedOnDateMs;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "D", "Lcom/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer;", "invoke", "()Lcom/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class ValueClassBoxConverter$delegatingSerializer$2 extends MagicModuleUseCase implements getCreatedOnDateMs<StdDelegatingSerializer> {
    final /* synthetic */ ValueClassBoxConverter<S, D> this$0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.getCreatedOnDateMs
    public final StdDelegatingSerializer invoke() {
        return new StdDelegatingSerializer(this.this$0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValueClassBoxConverter$delegatingSerializer$2(ValueClassBoxConverter<S, D> valueClassBoxConverter) {
        super(0);
        this.this$0 = valueClassBoxConverter;
    }
}
