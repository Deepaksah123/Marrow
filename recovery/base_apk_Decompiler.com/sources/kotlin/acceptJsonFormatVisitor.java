package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Function0;", "p0", "Lo/unwrappingSerializer;", "read", "(Lo/getCreatedOnDateMs;)Lo/unwrappingSerializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class acceptJsonFormatVisitor {
    public static final <T> unwrappingSerializer<T> read(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        return new unwrappingSerializer<>(getcreatedondatems);
    }
}
