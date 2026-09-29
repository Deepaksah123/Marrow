package kotlin;

import java.text.CharacterIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d"}, d2 = {"Lo/addBackReferenceProperty;", "", "Ljava/text/CharacterIterator;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/CharSequence;II)V", "", "first", "()C", "last", "current", "next", "previous", "setIndex", "(I)C", "getBeginIndex", "()I", "getEndIndex", "getIndex", "clone", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Ljava/lang/CharSequence;", "write", "read", "I", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addBackReferenceProperty implements CharacterIterator {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final CharSequence write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public addBackReferenceProperty(CharSequence charSequence, int i, int i2) {
        this.write = charSequence;
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.IconCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        if (i == i2) {
            this.RemoteActionCompatParcelizer = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.RemoteActionCompatParcelizer = i3;
        return this.write.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == this.AudioAttributesCompatParcelizer) {
            return (char) 65535;
        }
        return this.write.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.RemoteActionCompatParcelizer + 1;
        this.RemoteActionCompatParcelizer = i;
        int i2 = this.AudioAttributesCompatParcelizer;
        if (i >= i2) {
            this.RemoteActionCompatParcelizer = i2;
            return (char) 65535;
        }
        return this.write.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.RemoteActionCompatParcelizer;
        if (i <= this.IconCompatParcelizer) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.RemoteActionCompatParcelizer = i2;
        return this.write.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int p0) {
        int i = this.IconCompatParcelizer;
        if (p0 <= this.AudioAttributesCompatParcelizer && i <= p0) {
            this.RemoteActionCompatParcelizer = p0;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.IconCompatParcelizer;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }
}
