package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\u00020\u00038'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/isStartHandled;", "Lo/_nextBuffered;", "Lo/InputAccessor;", "", "p0", "AudioAttributesCompatParcelizer", "()Ljava/lang/Double;", "RemoteActionCompatParcelizer", "(D)V", "()D", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isStartHandled extends _nextBuffered, InputAccessor<Double> {
    void IconCompatParcelizer(double d);

    @Override // kotlin._nextBuffered
    double RemoteActionCompatParcelizer();

    @Override // kotlin.InputAccessor
    /* synthetic */ default void write(Double d) {
        RemoteActionCompatParcelizer(d.doubleValue());
    }

    @Override // kotlin._nextBuffered, kotlin.parseDouble
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    default Double read() {
        return Double.valueOf(RemoteActionCompatParcelizer());
    }

    default void RemoteActionCompatParcelizer(double d) {
        IconCompatParcelizer(d);
    }
}
