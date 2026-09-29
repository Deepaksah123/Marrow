package kotlin;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020-2\b\u0010\u0003\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b0\u0010+J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u0010+J\u0019\u00105\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109J\u0011\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010+J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b@\u0010AJ#\u0010D\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010B2\b\u0010\u0005\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bD\u0010EJ)\u0010G\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u0016\u0010\u0012\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010LR$\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0000@AX\u0081\u000e¢\u0006\f\n\u0004\bM\u0010N\"\u0004\bI\u0010OR\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010LR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010KR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010RR\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010K"}, d2 = {"Lo/assignIndex;", "Landroid/view/inputmethod/InputConnection;", "Lo/hasValueTypeDeserializer;", "p0", "Lo/_throwAsIOE;", "p1", "", "p2", "<init>", "(Lo/hasValueTypeDeserializer;Lo/_throwAsIOE;Z)V", "Lo/getClassName;", "", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/getClassName;)V", "Lo/findBeanDeserializer;", "(Lo/findBeanDeserializer;)V", "beginBatchEdit", "()Z", "read", "endBatchEdit", "AudioAttributesCompatParcelizer", "closeConnection", "()V", "", "", "commitText", "(Ljava/lang/CharSequence;I)Z", "setComposingRegion", "(II)Z", "setComposingText", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "performContextMenuAction", "write", "(I)V", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "clearMetaKeyStates", "reportFullscreenMode", "(Z)Z", "getCursorCapsMode", "(I)I", "", "Landroid/os/Bundle;", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "IconCompatParcelizer", "Lo/_throwAsIOE;", "Z", "I", "MediaBrowserCompatItemReceiver", "Lo/hasValueTypeDeserializer;", "(Lo/hasValueTypeDeserializer;)V", "AudioAttributesImplApi21Parcelizer", "", "Ljava/util/List;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class assignIndex implements InputConnection {
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;
    private final _throwAsIOE IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private hasValueTypeDeserializer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<findBeanDeserializer> AudioAttributesImplApi21Parcelizer = new ArrayList();
    private boolean AudioAttributesImplBaseParcelizer = true;

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean p0) {
        return false;
    }

    public assignIndex(hasValueTypeDeserializer hasvaluetypedeserializer, _throwAsIOE _throwasioe, boolean z) {
        this.IconCompatParcelizer = _throwasioe;
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = hasvaluetypedeserializer;
    }

    public final void IconCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer) {
        this.RemoteActionCompatParcelizer = hasvaluetypedeserializer;
    }

    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, getClassName p1) {
        if (this.AudioAttributesImplBaseParcelizer) {
            IconCompatParcelizer(p0);
            if (this.MediaBrowserCompatItemReceiver) {
                p1.AudioAttributesCompatParcelizer(this.write, constructForMapField.write(p0));
            }
            findProperty iconCompatParcelizer = p0.getIconCompatParcelizer();
            int iMediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer != null ? findProperty.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.getIconCompatParcelizer()) : -1;
            findProperty iconCompatParcelizer2 = p0.getIconCompatParcelizer();
            p1.RemoteActionCompatParcelizer(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0.getAudioAttributesCompatParcelizer()), findProperty.AudioAttributesImplApi26Parcelizer(p0.getAudioAttributesCompatParcelizer()), iMediaBrowserCompatCustomActionResultReceiver, iconCompatParcelizer2 != null ? findProperty.AudioAttributesImplApi26Parcelizer(iconCompatParcelizer2.getIconCompatParcelizer()) : -1);
        }
    }

    private final void RemoteActionCompatParcelizer(findBeanDeserializer p0) {
        read();
        try {
            this.AudioAttributesImplApi21Parcelizer.add(p0);
        } finally {
            AudioAttributesCompatParcelizer();
        }
    }

    private final boolean read() {
        this.read++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return AudioAttributesCompatParcelizer();
    }

    private final boolean AudioAttributesCompatParcelizer() {
        int i = this.read - 1;
        this.read = i;
        if (i == 0 && !this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.AudioAttributesImplApi21Parcelizer));
            this.AudioAttributesImplApi21Parcelizer.clear();
        }
        return this.read > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.AudioAttributesImplApi21Parcelizer.clear();
        this.read = 0;
        this.AudioAttributesImplBaseParcelizer = false;
        this.IconCompatParcelizer.read(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int p0, int p1) {
        return _with.read(this.RemoteActionCompatParcelizer, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int p0, int p1) {
        return _with.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int p0) {
        if (findProperty.write(this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer())) {
            return null;
        }
        return _with.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest p0, int p1) {
        boolean z = (p1 & 1) != 0;
        this.MediaBrowserCompatItemReceiver = z;
        if (z) {
            this.write = p0 != null ? p0.token : 0;
        }
        return constructForMapField.write(this.RemoteActionCompatParcelizer);
    }

    private final void write(int p0) {
        sendKeyEvent(new KeyEvent(0, p0));
        sendKeyEvent(new KeyEvent(1, p0));
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int p0) {
        return TextUtils.getCapsMode(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), findProperty.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()), p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        return z ? read() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence p0, int p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            RemoteActionCompatParcelizer(new Deserializers(String.valueOf(p0), p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int p0, int p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            RemoteActionCompatParcelizer(new getDeclaringClass(p0, p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence p0, int p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            RemoteActionCompatParcelizer(new getValueTypeDeserializer(String.valueOf(p0), p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (!z) {
            return z;
        }
        RemoteActionCompatParcelizer(new findEnumDeserializer(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int p0, int p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (!z) {
            return z;
        }
        RemoteActionCompatParcelizer(new findArrayDeserializer(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int p0, int p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (!z) {
            return z;
        }
        RemoteActionCompatParcelizer(new hasViews(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (!z) {
            return z;
        }
        RemoteActionCompatParcelizer(new findTreeNodeDeserializer());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent p0) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (!z) {
            return z;
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int p0) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.AudioAttributesImplBaseParcelizer;
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
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(z7, z8, z3, z4, z, z2);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int p0) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            z = false;
            switch (p0) {
                case R.id.selectAll:
                    RemoteActionCompatParcelizer(new hasViews(0, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().length()));
                    break;
                case R.id.cut:
                    write(277);
                    break;
                case R.id.copy:
                    write(278);
                    break;
                case R.id.paste:
                    write(279);
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
            boolean r0 = r1.AudioAttributesImplBaseParcelizer
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
            o._throwAsIOE r1 = r1.IconCompatParcelizer
            r1.read(r2)
            r1 = 1
            return r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assignIndex.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo p0) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo p0) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        return z ? this.AudioAttributesCompatParcelizer : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int p0) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String p0, Bundle p1) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        if (z) {
            return false;
        }
        return z;
    }
}
