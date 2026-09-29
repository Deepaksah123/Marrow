package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/constructParser;", "Lo/tryMatch;", "<init>", "()V", "Lo/DoubleToDecimal;", "p0", "", "RemoteActionCompatParcelizer", "(I)V", "", "IconCompatParcelizer", "(I)Z", "Lo/splitFloor16;", "write", "Lo/splitFloor16;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class constructParser implements tryMatch {
    private final splitFloor16 write = new splitFloor16(0);

    public final void RemoteActionCompatParcelizer(int p0) {
        int iAudioAttributesCompatParcelizer;
        do {
            iAudioAttributesCompatParcelizer = DoubleToDecimal.AudioAttributesCompatParcelizer(this.write.get());
            if ((iAudioAttributesCompatParcelizer & p0) != 0) {
                return;
            }
        } while (!this.write.compareAndSet(iAudioAttributesCompatParcelizer, DoubleToDecimal.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer | p0)));
    }

    public final boolean IconCompatParcelizer(int p0) {
        return (DoubleToDecimal.AudioAttributesCompatParcelizer(this.write.get()) & p0) != 0;
    }
}
