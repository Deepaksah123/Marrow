package kotlin;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NioPathSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010!R\u0011\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010\u0011\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u001c\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00100,8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001c\u00100R\u001a\u0010(\u001a\u0002018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b\u0011\u00103R&\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b\u000b\u00108R \u0010*\u001a\b\u0012\u0004\u0012\u00020;0:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b\u0017\u0010="}, d2 = {"Lo/hasContentType;", "Lo/NioPathSerializer$read;", "Ljava/lang/Runnable;", "Lo/finishBranchObject;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Lo/NioPathSerializer;", "", "write", "(Lo/NioPathSerializer;)V", "Lo/NioPathSerializer$RemoteActionCompatParcelizer;", "p1", "(Lo/NioPathSerializer;Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;", "Lo/JsonNodeOverwriteMode;", "read", "(Lo/JsonNodeOverwriteMode;Lo/NioPathSerializer;)V", "Landroidx/core/view/WindowInsetsCompat;", "", "AudioAttributesCompatParcelizer", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "IconCompatParcelizer", "(Lo/JsonNodeOverwriteMode;)V", "Landroid/view/View;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "RemoteActionCompatParcelizer", "(Landroidx/core/view/WindowInsetsCompat;)V", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/compose/ui/platform/AndroidComposeView;", "", "MediaBrowserCompatItemReceiver", "Z", "", "AudioAttributesImplBaseParcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "Landroidx/core/view/WindowInsetsCompat;", "Lo/AppCompatButton;", "", "AudioAttributesImplApi26Parcelizer", "Lo/AppCompatButton;", "()Lo/AppCompatButton;", "Lo/hasMoreBytes;", "Lo/hasMoreBytes;", "()Lo/hasMoreBytes;", "Lo/setDropDownBackgroundResource;", "Lo/InputAccessor;", "Landroid/graphics/Rect;", "Lo/setDropDownBackgroundResource;", "()Lo/setDropDownBackgroundResource;", "AudioAttributesImplApi21Parcelizer", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lo/wrapWithPath;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasContentType extends NioPathSerializer.read implements Runnable, finishBranchObject, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<InputAccessor<Rect>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final AppCompatButton<Object, JsonNodeOverwriteMode> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final hasMoreBytes AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private WindowInsetsCompat IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final SnapshotStateList<wrapWithPath> MediaBrowserCompatCustomActionResultReceiver;
    private final AndroidComposeView write;

    public hasContentType(AndroidComposeView androidComposeView) {
        super(1);
        this.write = androidComposeView;
        setKeyListener setkeylistener = new setKeyListener(9);
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.IconCompatParcelizer(), new JsonNodeOverwriteMode("caption bar"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.RemoteActionCompatParcelizer(), new JsonNodeOverwriteMode("display cutout"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.AudioAttributesCompatParcelizer(), new JsonNodeOverwriteMode("ime"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.read(), new JsonNodeOverwriteMode("mandatory system gestures"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.write(), new JsonNodeOverwriteMode("navigation bars"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.AudioAttributesImplBaseParcelizer(), new JsonNodeOverwriteMode("status bars"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.MediaBrowserCompatItemReceiver(), new JsonNodeOverwriteMode("system gestures"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.AudioAttributesImplApi26Parcelizer(), new JsonNodeOverwriteMode("tappable element"));
        setkeylistener.RemoteActionCompatParcelizer(isObject.INSTANCE.AudioAttributesImplApi21Parcelizer(), new JsonNodeOverwriteMode("waterfall"));
        this.AudioAttributesCompatParcelizer = setkeylistener;
        this.AudioAttributesImplBaseParcelizer = _appendByte.RemoteActionCompatParcelizer(0);
        this.AudioAttributesImplApi21Parcelizer = new setDropDownBackgroundResource<>(4);
        this.MediaBrowserCompatCustomActionResultReceiver = _qbuf.write();
    }

    public final AppCompatButton<Object, JsonNodeOverwriteMode> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final hasMoreBytes getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setDropDownBackgroundResource<InputAccessor<Rect>> write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final SnapshotStateList<wrapWithPath> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // o.NioPathSerializer.read
    public final void write(NioPathSerializer p0) {
        this.read = true;
        super.write(p0);
    }

    @Override // o.NioPathSerializer.read
    public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer p0, NioPathSerializer.RemoteActionCompatParcelizer p1) {
        WindowInsetsCompat windowInsetsCompat = this.IconCompatParcelizer;
        this.read = false;
        this.IconCompatParcelizer = null;
        if (p0.write() > 0 && windowInsetsCompat != null) {
            int iIconCompatParcelizer = p0.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer |= iIconCompatParcelizer;
            isObject isobject = (isObject) serialize.IconCompatParcelizer.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
            if (isobject != null) {
                JsonNodeOverwriteMode jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(isobject);
                toMagicModuleMetaRepoModel.write(jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer);
                JsonNodeOverwriteMode jsonNodeOverwriteMode = jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer;
                _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(iIconCompatParcelizer);
                long j = intValue.read(((long) _verifyendarrayforsingle.AudioAttributesCompatParcelizer) | (((long) _verifyendarrayforsingle.read) << 48) | (((long) _verifyendarrayforsingle.write) << 32) | (((long) _verifyendarrayforsingle.IconCompatParcelizer) << 16));
                long audioAttributesImplBaseParcelizer = jsonNodeOverwriteMode.getAudioAttributesImplBaseParcelizer();
                if (!intValue.write(j, audioAttributesImplBaseParcelizer)) {
                    jsonNodeOverwriteMode.IconCompatParcelizer(audioAttributesImplBaseParcelizer);
                    jsonNodeOverwriteMode.write(j);
                    jsonNodeOverwriteMode.RemoteActionCompatParcelizer(true);
                    read(jsonNodeOverwriteMode, p0);
                    hasMoreBytes hasmorebytes = this.AudioAttributesImplBaseParcelizer;
                    hasmorebytes.read(hasmorebytes.IconCompatParcelizer() + 1);
                    parseDigitsRecursive.INSTANCE.read();
                }
            }
        }
        return super.write(p0, p1);
    }

    private final void read(JsonNodeOverwriteMode p0, NioPathSerializer p1) {
        p0.read(p1.AudioAttributesCompatParcelizer());
        p0.AudioAttributesCompatParcelizer(p1.RemoteActionCompatParcelizer());
        p0.read(p1.write());
    }

    @Override // o.NioPathSerializer.read
    public final void IconCompatParcelizer(NioPathSerializer p0) {
        this.read = false;
        int iIconCompatParcelizer = p0.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer &= ~iIconCompatParcelizer;
        this.IconCompatParcelizer = null;
        isObject isobject = (isObject) serialize.IconCompatParcelizer.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
        if (isobject != null) {
            JsonNodeOverwriteMode jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(isobject);
            toMagicModuleMetaRepoModel.write(jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer);
            JsonNodeOverwriteMode jsonNodeOverwriteMode = jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer;
            jsonNodeOverwriteMode.read(BitmapDescriptorFactory.HUE_RED);
            jsonNodeOverwriteMode.AudioAttributesCompatParcelizer(1.0f);
            jsonNodeOverwriteMode.read(0L);
            jsonNodeOverwriteMode.read(BitmapDescriptorFactory.HUE_RED);
            AudioAttributesCompatParcelizer(jsonNodeOverwriteMode);
            hasMoreBytes hasmorebytes = this.AudioAttributesImplBaseParcelizer;
            hasmorebytes.read(hasmorebytes.IconCompatParcelizer() + 1);
            parseDigitsRecursive.INSTANCE.read();
        }
        super.IconCompatParcelizer(p0);
    }

    private final void AudioAttributesCompatParcelizer(JsonNodeOverwriteMode p0) {
        p0.RemoteActionCompatParcelizer(false);
        p0.IconCompatParcelizer(isContainerNode.read());
        p0.write(isContainerNode.read());
    }

    @Override // kotlin.finishBranchObject
    public final WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        if (this.read) {
            this.IconCompatParcelizer = p1;
            if (Build.VERSION.SDK_INT == 30) {
                p0.post(this);
                return p1;
            }
        } else if (this.RemoteActionCompatParcelizer == 0) {
            RemoteActionCompatParcelizer(p1);
        }
        return p1;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01b4 A[PHI: r14
      0x01b4: PHI (r14v4 boolean) = (r14v3 boolean), (r14v2 boolean) binds: [B:64:0x025b, B:47:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(androidx.core.view.WindowInsetsCompat r29) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasContentType.RemoteActionCompatParcelizer(androidx.core.view.WindowInsetsCompat):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.read) {
            this.RemoteActionCompatParcelizer = 0;
            this.read = false;
            WindowInsetsCompat windowInsetsCompat = this.IconCompatParcelizer;
            if (windowInsetsCompat != null) {
                RemoteActionCompatParcelizer(windowInsetsCompat);
                this.IconCompatParcelizer = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        Object parent = p0.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            p0 = view;
        }
        InvalidTypeIdException.read(p0, this);
        InvalidTypeIdException.IconCompatParcelizer(p0, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        Object parent = p0.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            p0 = view;
        }
        InvalidTypeIdException.read(p0, (finishBranchObject) null);
        InvalidTypeIdException.IconCompatParcelizer(p0, (NioPathSerializer.read) null);
    }

    @Override // o.NioPathSerializer.read
    public final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat p0, List<NioPathSerializer> p1) {
        int size = p1.size();
        for (int i = 0; i < size; i++) {
            NioPathSerializer nioPathSerializer = p1.get(i);
            isObject isobject = (isObject) serialize.IconCompatParcelizer.AudioAttributesCompatParcelizer(nioPathSerializer.IconCompatParcelizer());
            if (isobject != null) {
                JsonNodeOverwriteMode jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(isobject);
                toMagicModuleMetaRepoModel.write(jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer);
                JsonNodeOverwriteMode jsonNodeOverwriteMode = jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer;
                if (jsonNodeOverwriteMode.AudioAttributesImplApi21Parcelizer()) {
                    read(jsonNodeOverwriteMode, nioPathSerializer);
                }
            }
        }
        RemoteActionCompatParcelizer(p0);
        return p0;
    }
}
