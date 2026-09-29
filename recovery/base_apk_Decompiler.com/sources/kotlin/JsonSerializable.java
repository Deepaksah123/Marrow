package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0001\u0001\t"}, d2 = {"Lo/JsonSerializable;", "T", "", "Lkotlin/Function0;", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "read", "Lo/getCreatedOnDateMs;", "Lo/unwrappingSerializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JsonSerializable<T> {
    private final getCreatedOnDateMs<T> read;

    /* JADX WARN: Multi-variable type inference failed */
    private JsonSerializable(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        this.read = getcreatedondatems;
    }

    public /* synthetic */ JsonSerializable(getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getcreatedondatems);
    }
}
