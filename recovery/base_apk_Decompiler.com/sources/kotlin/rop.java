package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f"}, d2 = {"Lo/rop;", "", "", "Lo/SnapshotIdArray;", "p0", "<init>", "([J)V", "", "Lo/SnapshotId;", "", "AudioAttributesCompatParcelizer", "(J)V", "RemoteActionCompatParcelizer", "()[J", "Lo/AppCompatAutoCompleteTextView;", "Lo/AppCompatAutoCompleteTextView;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rop {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final AppCompatAutoCompleteTextView write;

    public rop(long[] jArr) {
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            appCompatAutoCompleteTextView = new AppCompatAutoCompleteTextView(jArrCopyOf.length);
            appCompatAutoCompleteTextView.AudioAttributesCompatParcelizer(appCompatAutoCompleteTextView.IconCompatParcelizer, jArrCopyOf);
        } else {
            appCompatAutoCompleteTextView = new AppCompatAutoCompleteTextView(0, 1, null);
        }
        this.write = appCompatAutoCompleteTextView;
    }

    public final void AudioAttributesCompatParcelizer(long p0) {
        this.write.read(p0);
    }

    public final long[] RemoteActionCompatParcelizer() {
        int i = this.write.IconCompatParcelizer;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.write;
        long[] jArr2 = appCompatAutoCompleteTextView.read;
        int i2 = appCompatAutoCompleteTextView.IconCompatParcelizer;
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = jArr2[i3];
        }
        return jArr;
    }
}
