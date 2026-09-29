package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/unwrappingSerializer;", "T", "Lo/JsonSerializable;", "Lkotlin/Function0;", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class unwrappingSerializer<T> extends JsonSerializable<T> {
    public unwrappingSerializer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        super(getcreatedondatems, null);
    }
}
