package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ \u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fR$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018"}, d2 = {"Lo/reportTrailingTokens;", "", "<init>", "()V", "", "p0", "Lo/findClass;", "RemoteActionCompatParcelizer", "(I)J", "", "", "write", "(J)Z", "IconCompatParcelizer", "(I)Z", "()Z", "p1", "", "(IJ)V", "", "AudioAttributesCompatParcelizer", "(I)[J", "I", "()I", "[J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class reportTrailingTokens {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long[] write = new long[2];

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long RemoteActionCompatParcelizer(int p0) {
        return findClass.RemoteActionCompatParcelizer(this.write[p0]);
    }

    public final boolean write(long p0) {
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = 0;
        while (i2 < i) {
            if (p0 == this.write[i2]) {
                int i3 = this.AudioAttributesCompatParcelizer;
                while (i2 < i3 - 1) {
                    long[] jArr = this.write;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.AudioAttributesCompatParcelizer--;
                return true;
            }
            i2++;
        }
        return false;
    }

    public final boolean IconCompatParcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (p0 >= i) {
            return false;
        }
        while (p0 < i - 1) {
            long[] jArr = this.write;
            int i2 = p0 + 1;
            jArr[p0] = jArr[i2];
            p0 = i2;
        }
        this.AudioAttributesCompatParcelizer--;
        return true;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer == 0;
    }

    public final boolean IconCompatParcelizer(long p0) {
        if (RemoteActionCompatParcelizer(p0)) {
            return false;
        }
        RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
        return true;
    }

    public final void RemoteActionCompatParcelizer(int p0, long p1) {
        long[] jArrAudioAttributesCompatParcelizer = this.write;
        if (p0 >= jArrAudioAttributesCompatParcelizer.length) {
            jArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0 + 1);
        }
        jArrAudioAttributesCompatParcelizer[p0] = p1;
        if (p0 >= this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = p0 + 1;
        }
    }

    private final long[] AudioAttributesCompatParcelizer(int p0) {
        long[] jArr = this.write;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(p0, jArr.length << 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
        this.write = jArrCopyOf;
        return jArrCopyOf;
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final boolean RemoteActionCompatParcelizer(long p0) {
        int i = this.AudioAttributesCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.write[i2] == p0) {
                return true;
            }
        }
        return false;
    }
}
