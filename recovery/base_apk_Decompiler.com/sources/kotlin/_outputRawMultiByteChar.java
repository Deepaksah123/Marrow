package kotlin;

import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f"}, d2 = {"Lo/_outputRawMultiByteChar;", "Lo/_writeStringSegment;", "Landroid/view/autofill/AutofillValue;", "p0", "<init>", "(Landroid/view/autofill/AutofillValue;)V", "write", "Landroid/view/autofill/AutofillValue;", "read", "()Landroid/view/autofill/AutofillValue;", "RemoteActionCompatParcelizer", "", "()Ljava/lang/CharSequence;", "AudioAttributesCompatParcelizer", "", "()Ljava/lang/Boolean;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _outputRawMultiByteChar implements _writeStringSegment {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AutofillValue RemoteActionCompatParcelizer;

    public _outputRawMultiByteChar(AutofillValue autofillValue) {
        this.RemoteActionCompatParcelizer = autofillValue;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final AutofillValue getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin._writeStringSegment
    public final CharSequence write() {
        if (this.RemoteActionCompatParcelizer.isText()) {
            return this.RemoteActionCompatParcelizer.getTextValue();
        }
        return null;
    }

    @Override // kotlin._writeStringSegment
    public final Boolean RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.isToggle()) {
            return Boolean.valueOf(this.RemoteActionCompatParcelizer.getToggleValue());
        }
        return null;
    }
}
