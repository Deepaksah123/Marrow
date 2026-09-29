package kotlin;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\n\u0010\u000fJ/\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001b\u0010\u0012\u001a\u00020\u00198CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d"}, d2 = {"Lo/ViewPagerLayoutParams;", "Lo/ViewPagerSavedState;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "", "IconCompatParcelizer", "()Z", "", "AudioAttributesCompatParcelizer", "()V", "", "Landroid/view/inputmethod/ExtractedText;", "p1", "(ILandroid/view/inputmethod/ExtractedText;)V", "p2", "p3", "read", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "RemoteActionCompatParcelizer", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "write", "Landroid/view/inputmethod/InputMethodManager;", "Lo/RenewEligible;", "()Landroid/view/inputmethod/InputMethodManager;", "Lo/finishRootObject;", "Lo/finishRootObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewPagerLayoutParams implements ViewPagerSavedState {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final finishRootObject IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final View write;
    private final RenewEligible read = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o.setUserInputEnabled
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return ViewPagerLayoutParams.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        }
    });

    public ViewPagerLayoutParams(View view) {
        this.write = view;
        this.IconCompatParcelizer = new finishRootObject(view);
    }

    private final InputMethodManager read() {
        return (InputMethodManager) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputMethodManager AudioAttributesCompatParcelizer(ViewPagerLayoutParams viewPagerLayoutParams) {
        Object systemService = viewPagerLayoutParams.write.getContext().getSystemService("input_method");
        toMagicModuleMetaRepoModel.read(systemService, "");
        return (InputMethodManager) systemService;
    }

    @Override // kotlin.ViewPagerSavedState
    public final boolean IconCompatParcelizer() {
        return read().isActive(this.write);
    }

    @Override // kotlin.ViewPagerSavedState
    public final void AudioAttributesCompatParcelizer() {
        read().restartInput(this.write);
    }

    @Override // kotlin.ViewPagerSavedState
    public final void AudioAttributesCompatParcelizer(int p0, ExtractedText p1) {
        read().updateExtractedText(this.write, p0, p1);
    }

    @Override // kotlin.ViewPagerSavedState
    public final void read(int p0, int p1, int p2, int p3) {
        read().updateSelection(this.write, p0, p1, p2, p3);
    }

    @Override // kotlin.ViewPagerSavedState
    public final void RemoteActionCompatParcelizer(CursorAnchorInfo p0) {
        read().updateCursorAnchorInfo(this.write, p0);
    }

    @Override // kotlin.ViewPagerSavedState
    public final void RemoteActionCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 34) {
            setTranslateX.INSTANCE.RemoteActionCompatParcelizer(read(), this.write);
        }
    }
}
