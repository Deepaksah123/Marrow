package kotlin;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0006\u0010\fJ/\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/ViewPagerSavedState;", "", "", "IconCompatParcelizer", "()Z", "", "AudioAttributesCompatParcelizer", "()V", "", "p0", "Landroid/view/inputmethod/ExtractedText;", "p1", "(ILandroid/view/inputmethod/ExtractedText;)V", "p2", "p3", "read", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "RemoteActionCompatParcelizer", "(Landroid/view/inputmethod/CursorAnchorInfo;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ViewPagerSavedState {
    void AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(int p0, ExtractedText p1);

    boolean IconCompatParcelizer();

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(CursorAnchorInfo p0);

    void read(int p0, int p1, int p2, int p3);
}
