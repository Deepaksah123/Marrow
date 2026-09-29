package kotlin;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0015J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\f\u0010\u0017R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u0011\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u0014\u0010\f\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d"}, d2 = {"Lo/constructForMethod;", "Lo/getClassName;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "", "read", "()Z", "", "write", "()V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "", "Landroid/view/inputmethod/ExtractedText;", "p1", "AudioAttributesCompatParcelizer", "(ILandroid/view/inputmethod/ExtractedText;)V", "p2", "p3", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lo/RenewEligible;", "()Landroid/view/inputmethod/InputMethodManager;", "Lo/finishRootObject;", "Lo/finishRootObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class constructForMethod implements getClassName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final View write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5());

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final finishRootObject IconCompatParcelizer;

    public constructForMethod(View view) {
        this.write = view;
        this.IconCompatParcelizer = new finishRootObject(view);
    }

    /* JADX INFO: renamed from: o.constructForMethod$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "write", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<InputMethodManager> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = constructForMethod.this.write.getContext().getSystemService("input_method");
            toMagicModuleMetaRepoModel.read(systemService, "");
            return (InputMethodManager) systemService;
        }

        AnonymousClass5() {
            super(0);
        }
    }

    private final InputMethodManager AudioAttributesCompatParcelizer() {
        return (InputMethodManager) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getClassName
    public final boolean read() {
        return AudioAttributesCompatParcelizer().isActive(this.write);
    }

    @Override // kotlin.getClassName
    public final void write() {
        AudioAttributesCompatParcelizer().restartInput(this.write);
    }

    @Override // kotlin.getClassName
    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.read();
    }

    @Override // kotlin.getClassName
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getClassName
    public final void AudioAttributesCompatParcelizer(int p0, ExtractedText p1) {
        AudioAttributesCompatParcelizer().updateExtractedText(this.write, p0, p1);
    }

    @Override // kotlin.getClassName
    public final void RemoteActionCompatParcelizer(int p0, int p1, int p2, int p3) {
        AudioAttributesCompatParcelizer().updateSelection(this.write, p0, p1, p2, p3);
    }

    @Override // kotlin.getClassName
    public final void IconCompatParcelizer(CursorAnchorInfo p0) {
        AudioAttributesCompatParcelizer().updateCursorAnchorInfo(this.write, p0);
    }
}
