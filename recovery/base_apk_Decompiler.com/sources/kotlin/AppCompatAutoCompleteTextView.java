package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/AppCompatAutoCompleteTextView;", "Lo/setMenuCallbacks;", "", "p0", "<init>", "(I)V", "", "", "read", "(J)Z", "", "p1", "AudioAttributesCompatParcelizer", "(I[J)Z", "", "()V", "IconCompatParcelizer", "write", "(I)J", "RemoteActionCompatParcelizer", "(II)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppCompatAutoCompleteTextView extends setMenuCallbacks {
    public AppCompatAutoCompleteTextView(int i) {
        super(i, null);
    }

    public /* synthetic */ AppCompatAutoCompleteTextView(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final boolean read(long p0) {
        IconCompatParcelizer(this.IconCompatParcelizer + 1);
        this.read[this.IconCompatParcelizer] = p0;
        this.IconCompatParcelizer++;
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(int p0, long[] p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 < 0 || p0 > this.IconCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("");
        }
        if (p1.length == 0) {
            return false;
        }
        IconCompatParcelizer(this.IconCompatParcelizer + p1.length);
        long[] jArr = this.read;
        if (p0 != this.IconCompatParcelizer) {
            getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArr, p1.length + p0, p0, this.IconCompatParcelizer);
        }
        getOrderDetails.AudioAttributesCompatParcelizer(p1, jArr, p0, 0, p1.length);
        this.IconCompatParcelizer += p1.length;
        return true;
    }

    public final void read() {
        this.IconCompatParcelizer = 0;
    }

    private void IconCompatParcelizer(int p0) {
        long[] jArr = this.read;
        if (jArr.length < p0) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(p0, (jArr.length * 3) / 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
            this.read = jArrCopyOf;
        }
    }

    public final long write(int p0) {
        if (p0 < 0 || p0 >= this.IconCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("Index must be between 0 and size");
        }
        long[] jArr = this.read;
        long j = jArr[p0];
        if (p0 != this.IconCompatParcelizer - 1) {
            getOrderDetails.AudioAttributesCompatParcelizer(jArr, jArr, p0, p0 + 1, this.IconCompatParcelizer);
        }
        this.IconCompatParcelizer--;
        return j;
    }

    public final void RemoteActionCompatParcelizer(int p0, int p1) {
        if (p0 < 0 || p0 > this.IconCompatParcelizer || p1 < 0 || p1 > this.IconCompatParcelizer) {
            AppCompatImageButton.IconCompatParcelizer("Index must be between 0 and size");
        }
        if (p1 < p0) {
            AppCompatImageButton.read("The end index must be < start index");
        }
        if (p1 != p0) {
            if (p1 < this.IconCompatParcelizer) {
                getOrderDetails.AudioAttributesCompatParcelizer(this.read, this.read, p0, p1, this.IconCompatParcelizer);
            }
            this.IconCompatParcelizer -= p1 - p0;
        }
    }

    public AppCompatAutoCompleteTextView() {
        this(0, 1, null);
    }
}
