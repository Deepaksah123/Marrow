package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\u00020\u00038'@'X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/hasMoreBytes;", "Lo/filterStartArray;", "Lo/InputAccessor;", "", "p0", "AudioAttributesCompatParcelizer", "()Ljava/lang/Integer;", "a_", "(I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "()I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface hasMoreBytes extends filterStartArray, InputAccessor<Integer> {
    @Override // kotlin.filterStartArray
    int IconCompatParcelizer();

    void read(int i);

    @Override // kotlin.InputAccessor
    /* synthetic */ default void write(Integer num) {
        a_(num.intValue());
    }

    @Override // kotlin.filterStartArray, kotlin.parseDouble
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    default Integer read() {
        return Integer.valueOf(IconCompatParcelizer());
    }

    default void a_(int i) {
        read(i);
    }
}
