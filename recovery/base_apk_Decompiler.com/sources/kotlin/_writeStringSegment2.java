package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0016J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017"}, d2 = {"Lo/_writeStringSegment2;", "Lo/_writeRawSegment;", "Landroid/view/autofill/AutofillManager;", "p0", "<init>", "(Landroid/view/autofill/AutofillManager;)V", "Landroid/view/View;", "", "p1", "Landroid/graphics/Rect;", "p2", "", "RemoteActionCompatParcelizer", "(Landroid/view/View;ILandroid/graphics/Rect;)V", "write", "(Landroid/view/View;I)V", "Landroid/view/autofill/AutofillValue;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V", "", "IconCompatParcelizer", "(Landroid/view/View;IZ)V", "()V", "Landroid/view/autofill/AutofillManager;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeStringSegment2 implements _writeRawSegment {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AutofillManager AudioAttributesCompatParcelizer;

    public _writeStringSegment2(AutofillManager autofillManager) {
        this.AudioAttributesCompatParcelizer = autofillManager;
    }

    @Override // kotlin._writeRawSegment
    public final void RemoteActionCompatParcelizer(View p0, int p1, Rect p2) {
        this.AudioAttributesCompatParcelizer.notifyViewEntered(p0, p1, p2);
    }

    @Override // kotlin._writeRawSegment
    public final void write(View p0, int p1) {
        this.AudioAttributesCompatParcelizer.notifyViewExited(p0, p1);
    }

    @Override // kotlin._writeRawSegment
    public final void AudioAttributesCompatParcelizer(View p0, int p1, AutofillValue p2) {
        this.AudioAttributesCompatParcelizer.notifyValueChanged(p0, p1, p2);
    }

    @Override // kotlin._writeRawSegment
    public final void IconCompatParcelizer(View p0, int p1, boolean p2) {
        getNextChar.INSTANCE.AudioAttributesCompatParcelizer(p0, this.AudioAttributesCompatParcelizer, p1, p2);
    }

    @Override // kotlin._writeRawSegment
    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.commit();
    }

    @Override // kotlin._writeRawSegment
    public final void AudioAttributesCompatParcelizer(View p0, int p1, Rect p2) {
        this.AudioAttributesCompatParcelizer.requestAutofill(p0, p1, p2);
    }
}
