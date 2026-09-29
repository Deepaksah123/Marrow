package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00038'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/InputAccessorStd;", "Lo/includeValue;", "Lo/InputAccessor;", "", "p0", "RemoteActionCompatParcelizer", "()Ljava/lang/Long;", "(J)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "()J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InputAccessorStd extends includeValue, InputAccessor<Long> {
    @Override // kotlin.includeValue
    long AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(long j);

    @Override // kotlin.InputAccessor
    /* synthetic */ default void write(Long l) {
        RemoteActionCompatParcelizer(l.longValue());
    }

    @Override // kotlin.includeValue, kotlin.parseDouble
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    default Long read() {
        return Long.valueOf(AudioAttributesCompatParcelizer());
    }

    default void RemoteActionCompatParcelizer(long j) {
        AudioAttributesCompatParcelizer(j);
    }
}
