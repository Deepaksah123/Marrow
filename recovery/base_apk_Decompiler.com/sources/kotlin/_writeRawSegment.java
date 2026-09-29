package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0013J'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_writeRawSegment;", "", "Landroid/view/View;", "p0", "", "p1", "Landroid/graphics/Rect;", "p2", "", "RemoteActionCompatParcelizer", "(Landroid/view/View;ILandroid/graphics/Rect;)V", "write", "(Landroid/view/View;I)V", "Landroid/view/autofill/AutofillValue;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V", "", "IconCompatParcelizer", "(Landroid/view/View;IZ)V", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _writeRawSegment {
    void AudioAttributesCompatParcelizer(View p0, int p1, Rect p2);

    void AudioAttributesCompatParcelizer(View p0, int p1, AutofillValue p2);

    void IconCompatParcelizer();

    void IconCompatParcelizer(View p0, int p1, boolean p2);

    void RemoteActionCompatParcelizer(View p0, int p1, Rect p2);

    void write(View p0, int p1);
}
