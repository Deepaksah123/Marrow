package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u00028\u00008\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/getEscapeSequence;", "T", "Lo/getEscapeCodesForAscii;", "Lo/InputAccessor;", "p0", "Lo/CurrentQuery;", "p1", "<init>", "(Lo/InputAccessor;Lo/CurrentQuery;)V", "IconCompatParcelizer", "Lo/CurrentQuery;", "bj_", "()Lo/CurrentQuery;", "read", "()Ljava/lang/Object;", "write", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getEscapeSequence<T> implements getEscapeCodesForAscii<T> {
    private final /* synthetic */ InputAccessor<T> AudioAttributesCompatParcelizer;
    private final CurrentQuery IconCompatParcelizer;

    public getEscapeSequence(InputAccessor<T> inputAccessor, CurrentQuery currentQuery) {
        this.AudioAttributesCompatParcelizer = inputAccessor;
        this.IconCompatParcelizer = currentQuery;
    }

    @Override // kotlin.TopUserCompanion
    /* JADX INFO: renamed from: bj_, reason: from getter */
    public final CurrentQuery getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.InputAccessor, kotlin.parseDouble
    public final T read() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.InputAccessor
    public final void write(T t) {
        this.AudioAttributesCompatParcelizer.write(t);
    }
}
