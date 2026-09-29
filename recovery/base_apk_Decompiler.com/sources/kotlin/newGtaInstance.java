package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011"}, d2 = {"Lo/newGtaInstance;", "", "", "", "p0", "<init>", "(Ljava/lang/CharSequence;)V", "", "hasNext", "()Z", "write", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/CharSequence;", "read", "", "IconCompatParcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class newGtaInstance implements Iterator<String>, getCurrentAnsweredMcqProgress {
    private static final write write = new write(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final CharSequence read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/newGtaInstance$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public newGtaInstance(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        this.read = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.AudioAttributesCompatParcelizer;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.RemoteActionCompatParcelizer < 0) {
            this.AudioAttributesCompatParcelizer = 2;
            return false;
        }
        int length = this.read.length();
        int length2 = this.read.length();
        for (int i4 = this.write; i4 < length2; i4++) {
            char cCharAt = this.read.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < this.read.length() && this.read.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.AudioAttributesCompatParcelizer = 1;
                this.RemoteActionCompatParcelizer = i;
                this.IconCompatParcelizer = length;
                return true;
            }
        }
        i = -1;
        this.AudioAttributesCompatParcelizer = 1;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = length;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.AudioAttributesCompatParcelizer = 0;
        int i = this.IconCompatParcelizer;
        int i2 = this.write;
        this.write = this.RemoteActionCompatParcelizer + i;
        return this.read.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
