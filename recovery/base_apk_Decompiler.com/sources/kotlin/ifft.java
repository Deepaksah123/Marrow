package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/ifft;", "Lo/allocReadIOBuffer;", "", "p0", "<init>", "(Ljava/util/Set;)V", "", "o_", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Ljava/util/Set;", "Lo/UTF32Reader;", "Lo/constructReadConstrainedTextBuffer;", "write", "Lo/UTF32Reader;", "RemoteActionCompatParcelizer", "()Lo/UTF32Reader;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ifft implements allocReadIOBuffer {
    private final Set<allocReadIOBuffer> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final UTF32Reader<constructReadConstrainedTextBuffer> read = new UTF32Reader<>(new constructReadConstrainedTextBuffer[16], 0);

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
    }

    public ifft(Set<allocReadIOBuffer> set) {
        this.IconCompatParcelizer = set;
    }

    public final UTF32Reader<constructReadConstrainedTextBuffer> RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
        UTF32Reader<constructReadConstrainedTextBuffer> uTF32Reader = this.read;
        constructReadConstrainedTextBuffer[] constructreadconstrainedtextbufferArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            allocReadIOBuffer write = constructreadconstrainedtextbufferArr[i].getWrite();
            this.IconCompatParcelizer.remove(write);
            write.o_();
        }
    }
}
