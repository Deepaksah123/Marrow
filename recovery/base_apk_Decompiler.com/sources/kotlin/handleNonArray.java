package kotlin;

import android.R;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import kotlin.Metadata;
import kotlin._handleApos;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001c\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001eJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u001fR\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001c\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010\u0017\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010/"}, d2 = {"Lo/handleNonArray;", "Lo/onFastForward;", "Lo/CoercionConfigs;", "Lkotlin/Function0;", "", "p0", "Lo/CollectionDeserializerCollectionReferring;", "p1", "Landroid/view/View;", "p2", "Lo/tryToResolveUnresolved;", "p3", "Lo/bufferMapProperty;", "p4", "Ljava/util/UUID;", "p5", "<init>", "(Lo/getCreatedOnDateMs;Lo/CollectionDeserializerCollectionReferring;Landroid/view/View;Lo/tryToResolveUnresolved;Lo/bufferMapProperty;Ljava/util/UUID;)V", "", "Landroid/view/KeyEvent;", "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "read", "(Lo/tryToResolveUnresolved;)V", "Lo/convertNumberToLong;", "(Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)V", "Lo/_deserializeAltString;", "write", "(Lo/_deserializeAltString;)V", "(Lo/getCreatedOnDateMs;Lo/CollectionDeserializerCollectionReferring;Lo/tryToResolveUnresolved;)V", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "IconCompatParcelizer", "Lo/getCreatedOnDateMs;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/CollectionDeserializerCollectionReferring;", "RemoteActionCompatParcelizer", "Landroid/view/View;", "Lo/CollectionDeserializerCollectionReferringAccumulator;", "Lo/CollectionDeserializerCollectionReferringAccumulator;", "Lo/assignParameter;", "F", "Z", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class handleNonArray extends onFastForward implements CoercionConfigs {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private CollectionDeserializerCollectionReferring RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final View IconCompatParcelizer;
    private final float read;
    private final CollectionDeserializerCollectionReferringAccumulator write;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            try {
                iArr[tryToResolveUnresolved.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public handleNonArray(getCreatedOnDateMs<getShowPopup> getcreatedondatems, CollectionDeserializerCollectionReferring collectionDeserializerCollectionReferring, View view, tryToResolveUnresolved trytoresolveunresolved, bufferMapProperty buffermapproperty, UUID uuid) {
        int i;
        Context context = view.getContext();
        if (collectionDeserializerCollectionReferring.getRemoteActionCompatParcelizer()) {
            i = _handleApos.RemoteActionCompatParcelizer.DialogWindowTheme;
        } else {
            i = _handleApos.RemoteActionCompatParcelizer.FloatingDialogWindowTheme;
        }
        super(new ContextThemeWrapper(context, i), 0, 2, null);
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.RemoteActionCompatParcelizer = collectionDeserializerCollectionReferring;
        this.IconCompatParcelizer = view;
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
        this.read = fIconCompatParcelizer;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        _IsXOfY.write(window, this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
        window.setGravity(17);
        if (!this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            _handleDuplicateField.INSTANCE.write(attributes);
            if (Build.VERSION.SDK_INT >= 30) {
                _deserializeFromString.INSTANCE.IconCompatParcelizer(attributes, 0);
                _deserializeFromString.INSTANCE.AudioAttributesCompatParcelizer(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        CollectionDeserializerCollectionReferringAccumulator collectionDeserializerCollectionReferringAccumulator = new CollectionDeserializerCollectionReferringAccumulator(getContext(), window);
        setTitle(this.RemoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver());
        collectionDeserializerCollectionReferringAccumulator.setTag(_handleApos.AudioAttributesCompatParcelizer.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        collectionDeserializerCollectionReferringAccumulator.setClipChildren(false);
        collectionDeserializerCollectionReferringAccumulator.setElevation(buffermapproperty.AudioAttributesCompatParcelizer(fIconCompatParcelizer));
        collectionDeserializerCollectionReferringAccumulator.setOutlineProvider(new RemoteActionCompatParcelizer());
        this.write = collectionDeserializerCollectionReferringAccumulator;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            read(viewGroup);
        }
        CollectionDeserializerCollectionReferringAccumulator collectionDeserializerCollectionReferringAccumulator2 = collectionDeserializerCollectionReferringAccumulator;
        setContentView(collectionDeserializerCollectionReferringAccumulator2);
        isCreatorVisible.IconCompatParcelizer(collectionDeserializerCollectionReferringAccumulator2, isCreatorVisible.write(view));
        isFieldVisible.AudioAttributesCompatParcelizer(collectionDeserializerCollectionReferringAccumulator2, isFieldVisible.write(view));
        setCenterTextRadiusPercent.read(collectionDeserializerCollectionReferringAccumulator2, setCenterTextRadiusPercent.IconCompatParcelizer(view));
        write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, trytoresolveunresolved);
        onSetRepeatMode.IconCompatParcelizer(getIconCompatParcelizer(), this, false, new AnonymousClass2(), 2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/handleNonArray$RemoteActionCompatParcelizer;", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "p0", "Landroid/graphics/Outline;", "p1", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends ViewOutlineProvider {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View p0, Outline p1) {
            p1.setRect(0, 0, p0.getWidth(), p0.getHeight());
            p1.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    private static final void read(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof CollectionDeserializerCollectionReferringAccumulator) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                read(viewGroup2);
            }
        }
    }

    /* JADX INFO: renamed from: o.handleNonArray$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onRemoveQueueItemAt;", "", "read", "(Lo/onRemoveQueueItemAt;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<onRemoveQueueItemAt, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(onRemoveQueueItemAt onremovequeueitemat) {
            read(onremovequeueitemat);
            return getShowPopup.INSTANCE;
        }

        public final void read(onRemoveQueueItemAt onremovequeueitemat) {
            if (handleNonArray.this.RemoteActionCompatParcelizer.getWrite()) {
                handleNonArray.this.AudioAttributesCompatParcelizer.invoke();
            }
        }

        AnonymousClass2() {
            super(1);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int p0, KeyEvent p1) {
        if (this.RemoteActionCompatParcelizer.getWrite() && p1.isTracking() && !p1.isCanceled() && p0 == 111) {
            this.AudioAttributesCompatParcelizer.invoke();
            return true;
        }
        return super.onKeyUp(p0, p1);
    }

    private final void read(tryToResolveUnresolved p0) {
        CollectionDeserializerCollectionReferringAccumulator collectionDeserializerCollectionReferringAccumulator = this.write;
        int i = WhenMappings.write[p0.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new RenewEligibleCreator();
        }
        collectionDeserializerCollectionReferringAccumulator.setLayoutDirection(i2);
    }

    public final void read(convertNumberToLong p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        this.write.setContent(p0, p1);
    }

    private final void write(_deserializeAltString p0) {
        boolean zWrite = _parseDate.write(p0, popOrNull.IconCompatParcelizer(this.IconCompatParcelizer));
        Window window = getWindow();
        toMagicModuleMetaRepoModel.write(window);
        window.setFlags(zWrite ? 8192 : -8193, 8192);
    }

    public final void write(getCreatedOnDateMs<getShowPopup> p0, CollectionDeserializerCollectionReferring p1, tryToResolveUnresolved p2) {
        int i;
        this.AudioAttributesCompatParcelizer = p0;
        this.RemoteActionCompatParcelizer = p1;
        write(p1.getAudioAttributesCompatParcelizer());
        read(p2);
        boolean remoteActionCompatParcelizer = p1.getRemoteActionCompatParcelizer();
        this.write.read(p1.getIconCompatParcelizer(), remoteActionCompatParcelizer);
        setCanceledOnTouchOutside(p1.getRead());
        Window window = getWindow();
        if (window != null) {
            if (remoteActionCompatParcelizer) {
                i = 0;
            } else {
                i = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window.setSoftInputMode(i);
        }
    }

    public final void write() {
        this.write.RemoteActionCompatParcelizer();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent p0) {
        boolean zOnTouchEvent = super.onTouchEvent(p0);
        if (this.RemoteActionCompatParcelizer.getRead() && !this.write.AudioAttributesCompatParcelizer(p0)) {
            int actionMasked = p0.getActionMasked();
            if (actionMasked == 0) {
                this.AudioAttributesImplBaseParcelizer = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.AudioAttributesImplBaseParcelizer = false;
                    return zOnTouchEvent;
                }
            } else if (this.AudioAttributesImplBaseParcelizer) {
                this.AudioAttributesCompatParcelizer.invoke();
                this.AudioAttributesImplBaseParcelizer = false;
                return true;
            }
        } else {
            int actionMasked2 = p0.getActionMasked();
            if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
                this.AudioAttributesImplBaseParcelizer = false;
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }
}
