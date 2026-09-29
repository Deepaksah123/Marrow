package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/StreamWriteException;", "T", "Lo/CharacterEscapes;", "Lo/quoteAsUTF8;", "p0", "Lkotlin/Function0;", "p1", "<init>", "(Lo/quoteAsUTF8;Lo/getCreatedOnDateMs;)V", "Lo/ContentReference;", "write", "(Ljava/lang/Object;)Lo/ContentReference;", "RemoteActionCompatParcelizer", "Lo/quoteAsUTF8;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamWriteException<T> extends CharacterEscapes<T> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final quoteAsUTF8<T> write;

    public StreamWriteException(quoteAsUTF8<T> quoteasutf8, getCreatedOnDateMs<? extends T> getcreatedondatems) {
        super(getcreatedondatems);
        this.write = quoteasutf8;
    }

    @Override // kotlin.CharacterEscapes
    public final ContentReference<T> write(T p0) {
        return new ContentReference<>(this, p0, p0 == null, this.write, null, null, true);
    }
}
