package kotlin;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010!J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010#J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0018J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b1\u00102J!\u00105\u001a\u0002042\b\u0010\u0003\u001a\u0004\u0018\u0001032\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b7\u00102J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0015\u00108J\u0017\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b9\u00102J+\u0010=\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020:2\b\u0010\u0005\u001a\u0004\u0018\u00010;2\b\u0010\u0007\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020?2\b\u0010\u0005\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\bL\u00102J\u0017\u0010M\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010S\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010Q2\b\u0010\u0005\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020U2\u0006\u0010\u0005\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bV\u0010WR\u0011\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\bX\u0010YR\u0011\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010ZR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u0006\n\u0004\b[\u0010\\R\u0013\u0010X\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0006\n\u0004\b]\u0010^R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010]\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010aR$\u0010[\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0000@AX\u0080\u000e¢\u0006\f\n\u0004\bb\u0010c\"\u0004\b\u0012\u0010dR\u0016\u0010e\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010aR\u0016\u0010b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010ZR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00140f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010gR\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010Z"}, d2 = {"Lo/endRearDisplayPresentationSession;", "Landroid/view/inputmethod/InputConnection;", "Lo/hasValueTypeDeserializer;", "p0", "Lo/ViewPager2;", "p1", "", "p2", "Lo/setImageDisplayMode;", "p3", "Lo/Typed3EpoxyController;", "p4", "Lo/CoercionConfig;", "p5", "<init>", "(Lo/hasValueTypeDeserializer;Lo/ViewPager2;ZLo/setImageDisplayMode;Lo/Typed3EpoxyController;Lo/CoercionConfig;)V", "Lo/ViewPagerSavedState;", "", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/ViewPagerSavedState;)V", "Lo/findBeanDeserializer;", "read", "(Lo/findBeanDeserializer;)V", "beginBatchEdit", "()Z", "AudioAttributesCompatParcelizer", "endBatchEdit", "write", "closeConnection", "()V", "", "", "commitText", "(Ljava/lang/CharSequence;I)Z", "setComposingRegion", "(II)Z", "setComposingText", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "performContextMenuAction", "(I)V", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "Ljava/util/concurrent/Executor;", "Ljava/util/function/IntConsumer;", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "clearMetaKeyStates", "reportFullscreenMode", "(Z)Z", "getCursorCapsMode", "(I)I", "", "Landroid/os/Bundle;", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "IconCompatParcelizer", "Lo/ViewPager2;", "Z", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setImageDisplayMode;", "MediaBrowserCompatItemReceiver", "Lo/Typed3EpoxyController;", "MediaBrowserCompatSearchResultReceiver", "Lo/CoercionConfig;", "I", "AudioAttributesImplApi26Parcelizer", "Lo/hasValueTypeDeserializer;", "(Lo/hasValueTypeDeserializer;)V", "AudioAttributesImplBaseParcelizer", "", "Ljava/util/List;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class endRearDisplayPresentationSession implements InputConnection {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<findBeanDeserializer> AudioAttributesImplApi21Parcelizer = new ArrayList();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatSearchResultReceiver = true;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private hasValueTypeDeserializer MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ViewPager2 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setImageDisplayMode AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Typed3EpoxyController IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final CoercionConfig read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;
    private final boolean write;

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean p0) {
        return false;
    }

    public endRearDisplayPresentationSession(hasValueTypeDeserializer hasvaluetypedeserializer, ViewPager2 viewPager2, boolean z, setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController, CoercionConfig coercionConfig) {
        this.RemoteActionCompatParcelizer = viewPager2;
        this.write = z;
        this.AudioAttributesCompatParcelizer = setimagedisplaymode;
        this.IconCompatParcelizer = typed3EpoxyController;
        this.read = coercionConfig;
        this.MediaBrowserCompatCustomActionResultReceiver = hasvaluetypedeserializer;
    }

    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer) {
        this.MediaBrowserCompatCustomActionResultReceiver = hasvaluetypedeserializer;
    }

    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, ViewPagerSavedState p1) {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            RemoteActionCompatParcelizer(p0);
            if (this.AudioAttributesImplApi26Parcelizer) {
                p1.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, getRearDisplayPresentation.write(p0));
            }
            findProperty iconCompatParcelizer = p0.getIconCompatParcelizer();
            int iMediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer != null ? findProperty.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.getIconCompatParcelizer()) : -1;
            findProperty iconCompatParcelizer2 = p0.getIconCompatParcelizer();
            p1.read(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0.getAudioAttributesCompatParcelizer()), findProperty.AudioAttributesImplApi26Parcelizer(p0.getAudioAttributesCompatParcelizer()), iMediaBrowserCompatCustomActionResultReceiver, iconCompatParcelizer2 != null ? findProperty.AudioAttributesImplApi26Parcelizer(iconCompatParcelizer2.getIconCompatParcelizer()) : -1);
        }
    }

    private final void read(findBeanDeserializer p0) {
        AudioAttributesCompatParcelizer();
        try {
            this.AudioAttributesImplApi21Parcelizer.add(p0);
        } finally {
            write();
        }
    }

    private final boolean AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return write();
    }

    private final boolean write() {
        int i = this.MediaBrowserCompatItemReceiver - 1;
        this.MediaBrowserCompatItemReceiver = i;
        if (i == 0 && !this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.AudioAttributesImplApi21Parcelizer));
            this.AudioAttributesImplApi21Parcelizer.clear();
        }
        return this.MediaBrowserCompatItemReceiver > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.AudioAttributesImplApi21Parcelizer.clear();
        this.MediaBrowserCompatItemReceiver = 0;
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int p0, int p1) {
        return _with.read(this.MediaBrowserCompatCustomActionResultReceiver, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int p0, int p1) {
        return _with.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int p0) {
        if (findProperty.write(this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer())) {
            return null;
        }
        return _with.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest p0, int p1) {
        boolean z = (p1 & 1) != 0;
        this.AudioAttributesImplApi26Parcelizer = z;
        if (z) {
            this.AudioAttributesImplBaseParcelizer = p0 != null ? p0.token : 0;
        }
        return getRearDisplayPresentation.write(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private final void read(int p0) {
        sendKeyEvent(new KeyEvent(0, p0));
        sendKeyEvent(new KeyEvent(1, p0));
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture p0, Executor p1, IntConsumer p2) {
        if (Build.VERSION.SDK_INT >= 34) {
            getTranslateX.INSTANCE.bH_(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, p0, this.read, p1, p2, new getAnswerMap() { // from class: o.getRearDisplayMetrics
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return endRearDisplayPresentationSession.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (findBeanDeserializer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(endRearDisplayPresentationSession endreardisplaypresentationsession, findBeanDeserializer findbeandeserializer) {
        endreardisplaypresentationsession.read(findbeandeserializer);
        return getShowPopup.INSTANCE;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture p0, CancellationSignal p1) {
        if (Build.VERSION.SDK_INT >= 34) {
            return getTranslateX.INSTANCE.bI_(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int p0) {
        return TextUtils.getCapsMode(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(), findProperty.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer()), p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        return z ? AudioAttributesCompatParcelizer() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence p0, int p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            read(new Deserializers(String.valueOf(p0), p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int p0, int p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            read(new getDeclaringClass(p0, p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence p0, int p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            read(new getValueTypeDeserializer(String.valueOf(p0), p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (!z) {
            return z;
        }
        read(new findEnumDeserializer(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int p0, int p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (!z) {
            return z;
        }
        read(new findArrayDeserializer(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int p0, int p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (!z) {
            return z;
        }
        read(new hasViews(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (!z) {
            return z;
        }
        read(new findTreeNodeDeserializer());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent p0) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (!z) {
            return z;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(p0);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int p0) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.MediaBrowserCompatSearchResultReceiver;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (p0 & 1) != 0;
        boolean z8 = (p0 & 2) != 0;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = (p0 & 16) != 0;
            boolean z10 = (p0 & 8) != 0;
            boolean z11 = (p0 & 4) != 0;
            if (Build.VERSION.SDK_INT >= 34 && (p0 & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z4 = z10;
                z = z11;
                z3 = z9;
            } else if (Build.VERSION.SDK_INT >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.RemoteActionCompatParcelizer.read(z7, z8, z3, z4, z, z2);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int p0) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            z = false;
            switch (p0) {
                case R.id.selectAll:
                    read(new hasViews(0, this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().length()));
                    break;
                case R.id.cut:
                    read(277);
                    break;
                case R.id.copy:
                    read(278);
                    break;
                case R.id.paste:
                    read(279);
                    break;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performEditorAction(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.MediaBrowserCompatSearchResultReceiver
            if (r0 == 0) goto L41
            if (r2 == 0) goto L34
            switch(r2) {
                case 2: goto L2d;
                case 3: goto L26;
                case 4: goto L1f;
                case 5: goto L18;
                case 6: goto L11;
                case 7: goto La;
                default: goto L9;
            }
        L9:
            goto L34
        La:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.MediaBrowserCompatItemReceiver()
            goto L3a
        L11:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.RemoteActionCompatParcelizer()
            goto L3a
        L18:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.read()
            goto L3a
        L1f:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.AudioAttributesImplApi26Parcelizer()
            goto L3a
        L26:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.AudioAttributesImplBaseParcelizer()
            goto L3a
        L2d:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.write()
            goto L3a
        L34:
            o.ResolvableDeserializer$IconCompatParcelizer r2 = kotlin.ResolvableDeserializer.INSTANCE
            int r2 = r2.IconCompatParcelizer()
        L3a:
            o.ViewPager2 r1 = r1.RemoteActionCompatParcelizer
            r1.AudioAttributesCompatParcelizer(r2)
            r1 = 1
            return r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.endRearDisplayPresentationSession.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo p0) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo p0) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        return z ? this.write : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int p0) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String p0, Bundle p1) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        if (z) {
            return false;
        }
        return z;
    }
}
