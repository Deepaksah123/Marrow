package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0015J \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\f"}, d2 = {"Lo/setExpandActivityOverflowButtonDrawable;", "Lo/setWindowTitle;", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "(I)Z", "p1", "", "read", "()V", "", "write", "(I[I)Z", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "(I)I", "(II)V", "(II)I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setExpandActivityOverflowButtonDrawable extends setWindowTitle {
    public setExpandActivityOverflowButtonDrawable(int i) {
        super(i, null);
    }

    public /* synthetic */ setExpandActivityOverflowButtonDrawable(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final boolean RemoteActionCompatParcelizer(int p0) {
        AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer + 1);
        this.RemoteActionCompatParcelizer[this.AudioAttributesCompatParcelizer] = p0;
        this.AudioAttributesCompatParcelizer++;
        return true;
    }

    public final void read() {
        if (this.AudioAttributesCompatParcelizer < 0) {
            AppCompatImageButton.IconCompatParcelizer("Index must be between 0 and size");
        }
        AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer + 1);
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (this.AudioAttributesCompatParcelizer != 0) {
            getOrderDetails.read(iArr, iArr, 1, 0, this.AudioAttributesCompatParcelizer);
        }
        iArr[0] = 0;
        this.AudioAttributesCompatParcelizer++;
    }

    public final boolean write(int p0, int[] p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 < 0 || p0 > this.AudioAttributesCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("");
        }
        if (p1.length == 0) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer + p1.length);
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (p0 != this.AudioAttributesCompatParcelizer) {
            getOrderDetails.read(iArr, iArr, p1.length + p0, p0, this.AudioAttributesCompatParcelizer);
        }
        getOrderDetails.RemoteActionCompatParcelizer(p1, iArr, p0, 0, 12);
        this.AudioAttributesCompatParcelizer += p1.length;
        return true;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = 0;
    }

    private void AudioAttributesImplBaseParcelizer(int p0) {
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (iArr.length < p0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(p0, (iArr.length * 3) / 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
            this.RemoteActionCompatParcelizer = iArrCopyOf;
        }
    }

    public final boolean IconCompatParcelizer(int p0) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer);
        return true;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int p0) {
        if (p0 < 0 || p0 >= this.AudioAttributesCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("Index must be between 0 and size");
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i = iArr[p0];
        if (p0 != this.AudioAttributesCompatParcelizer - 1) {
            getOrderDetails.read(iArr, iArr, p0, p0 + 1, this.AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer--;
        return i;
    }

    public final void RemoteActionCompatParcelizer(int p0, int p1) {
        if (p0 < 0 || p0 > this.AudioAttributesCompatParcelizer || p1 < 0 || p1 > this.AudioAttributesCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("Index must be between 0 and size");
        }
        if (p1 < p0) {
            AppCompatImageButton.read("The end index must be < start index");
        }
        if (p1 != p0) {
            if (p1 < this.AudioAttributesCompatParcelizer) {
                getOrderDetails.read(this.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, p0, p1, this.AudioAttributesCompatParcelizer);
            }
            this.AudioAttributesCompatParcelizer -= p1 - p0;
        }
    }

    public final int IconCompatParcelizer(int p0, int p1) {
        if (p0 < 0 || p0 >= this.AudioAttributesCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("Index must be between 0 and size");
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i = iArr[p0];
        iArr[p0] = p1;
        return i;
    }

    public final void IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == 0) {
            return;
        }
        getOrderDetails.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public setExpandActivityOverflowButtonDrawable() {
        this(0, 1, null);
    }
}
