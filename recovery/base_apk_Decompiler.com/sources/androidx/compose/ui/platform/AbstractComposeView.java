package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.ConfigOverride;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin._configureGenerator;
import kotlin._handleApos;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._truncate;
import kotlin._validJsonValueList;
import kotlin.convertNumberToLong;
import kotlin.createChildArrayContext;
import kotlin.findContentValueSerializer;
import kotlin.getCreatedOnDateMs;
import kotlin.getIsIgnoredType;
import kotlin.getShowPopup;
import kotlin.multiplyFft;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ7\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J7\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001d\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J!\u0010*\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010,J)\u0010*\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010-J#\u0010*\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010)2\b\u0010\u0005\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b*\u0010/J+\u0010*\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b*\u00100J+\u00101\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b1\u00102J3\u00101\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010.2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b1\u00103J\u000f\u00104\u001a\u00020\u001eH\u0016¢\u0006\u0004\b4\u0010&R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00106R(\u0010\u0019\u001a\u0004\u0018\u0001072\b\u0010\u0003\u001a\u0004\u0018\u0001078\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u00108\"\u0004\b\u0014\u00109R\u0018\u0010\u001d\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010;R(\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b<\u0010=\"\u0004\b\u001d\u0010\rR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0014\u0010@\u001a\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010&R*\u0010A\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R$\u0010I\u001a\u00020E2\u0006\u0010\u0003\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010$R\u0016\u0010<\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u0018\u0010K\u001a\u00020\u001e*\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010JR\u0016\u0010\u0017\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010B"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lo/convertNumberToLong;", "", "setParentCompositionContext", "(Lo/convertNumberToLong;)V", "Lo/withPropertyNamingStrategy;", "setViewCompositionStrategy", "(Lo/withPropertyNamingStrategy;)V", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V", "()V", "read", "AudioAttributesCompatParcelizer", "(Lo/convertNumberToLong;)Lo/convertNumberToLong;", "AudioAttributesImplApi26Parcelizer", "()Lo/convertNumberToLong;", "RemoteActionCompatParcelizer", "onAttachedToWindow", "onMeasure", "(II)V", "write", "", "p3", "p4", "onLayout", "(ZIIII)V", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "addView", "(Landroid/view/View;)V", "(Landroid/view/View;I)V", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "Lo/createChildArrayContext;", "Lo/createChildArrayContext;", "MediaBrowserCompatItemReceiver", "Lo/convertNumberToLong;", "Lkotlin/Function0;", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi21Parcelizer", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "Lo/findContentValueSerializer;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "autoClearFocusBehavior", "(Lo/convertNumberToLong;)Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    private WeakReference<convertNumberToLong> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private IBinder RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private convertNumberToLong IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean showLayoutBounds;
    private createChildArrayContext write;

    public abstract void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i);

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: write */
    protected boolean getAudioAttributesCompatParcelizer() {
        return true;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.read = withPropertyNamingStrategy.INSTANCE.read().RemoteActionCompatParcelizer(this);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void read(IBinder iBinder) {
        if (this.RemoteActionCompatParcelizer != iBinder) {
            this.RemoteActionCompatParcelizer = iBinder;
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    private final void write(convertNumberToLong convertnumbertolong) {
        if (this.IconCompatParcelizer != convertnumbertolong) {
            this.IconCompatParcelizer = convertnumbertolong;
            if (convertnumbertolong != null) {
                this.AudioAttributesCompatParcelizer = null;
            }
            createChildArrayContext createchildarraycontext = this.write;
            if (createchildarraycontext != null) {
                createchildarraycontext.RemoteActionCompatParcelizer();
                this.write = null;
                if (isAttachedToWindow()) {
                    AudioAttributesCompatParcelizer();
                }
            }
        }
    }

    public final void setParentCompositionContext(convertNumberToLong p0) {
        write(p0);
    }

    public final void setViewCompositionStrategy(withPropertyNamingStrategy p0) {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
        this.read = p0.RemoteActionCompatParcelizer(this);
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((_configureGenerator) childAt).setShowLayoutBounds(z);
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m1getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(_handleApos.AudioAttributesCompatParcelizer.auto_clear_focus_behavior_tag);
        findContentValueSerializer findcontentvalueserializer = tag instanceof findContentValueSerializer ? (findContentValueSerializer) tag : null;
        return findcontentvalueserializer != null ? findcontentvalueserializer.getRead() : findContentValueSerializer.INSTANCE.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m2setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(_handleApos.AudioAttributesCompatParcelizer.auto_clear_focus_behavior_tag, findContentValueSerializer.RemoteActionCompatParcelizer(i));
    }

    public final void IconCompatParcelizer() {
        if (this.IconCompatParcelizer == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        AudioAttributesCompatParcelizer();
    }

    private final void read() {
        if (this.MediaBrowserCompatItemReceiver) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot add views to ");
        sb.append(getClass().getSimpleName());
        sb.append("; only Compose content is supported");
        throw new UnsupportedOperationException(sb.toString());
    }

    private final boolean RemoteActionCompatParcelizer(convertNumberToLong convertnumbertolong) {
        return !(convertnumbertolong instanceof _truncate) || ((_truncate) convertnumbertolong).RatingCompat().IconCompatParcelizer().compareTo(_truncate.IconCompatParcelizer.MediaBrowserCompatItemReceiver) > 0;
    }

    private final convertNumberToLong AudioAttributesCompatParcelizer(convertNumberToLong convertnumbertolong) {
        convertNumberToLong convertnumbertolong2 = RemoteActionCompatParcelizer(convertnumbertolong) ? convertnumbertolong : null;
        if (convertnumbertolong2 != null) {
            this.AudioAttributesCompatParcelizer = new WeakReference<>(convertnumbertolong2);
        }
        return convertnumbertolong;
    }

    private final convertNumberToLong AudioAttributesImplApi26Parcelizer() {
        convertNumberToLong convertnumbertolong;
        convertNumberToLong convertnumbertolong2 = this.IconCompatParcelizer;
        if (convertnumbertolong2 != null) {
            return convertnumbertolong2;
        }
        AbstractComposeView abstractComposeView = this;
        convertNumberToLong convertnumbertolongWrite = ConfigOverride.write(abstractComposeView);
        convertNumberToLong convertnumbertolong3 = null;
        convertNumberToLong convertnumbertolongAudioAttributesCompatParcelizer = convertnumbertolongWrite != null ? AudioAttributesCompatParcelizer(convertnumbertolongWrite) : null;
        if (convertnumbertolongAudioAttributesCompatParcelizer != null) {
            return convertnumbertolongAudioAttributesCompatParcelizer;
        }
        WeakReference<convertNumberToLong> weakReference = this.AudioAttributesCompatParcelizer;
        if (weakReference != null && (convertnumbertolong = weakReference.get()) != null && RemoteActionCompatParcelizer(convertnumbertolong)) {
            convertnumbertolong3 = convertnumbertolong;
        }
        return convertnumbertolong3 == null ? AudioAttributesCompatParcelizer(ConfigOverride.AudioAttributesCompatParcelizer(abstractComposeView)) : convertnumbertolong3;
    }

    private final void AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            try {
                this.MediaBrowserCompatItemReceiver = true;
                this.write = getIsIgnoredType.read(this, AudioAttributesImplApi26Parcelizer(), multiplyFft.IconCompatParcelizer(-656146368, true, new AnonymousClass2()));
            } finally {
                this.MediaBrowserCompatItemReceiver = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AbstractComposeView$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:264)");
            }
            AbstractComposeView.this.IconCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2() {
            super(2);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        createChildArrayContext createchildarraycontext = this.write;
        if (createchildarraycontext != null) {
            createchildarraycontext.RemoteActionCompatParcelizer();
        }
        this.write = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        read(getWindowToken());
        if (getAudioAttributesCompatParcelizer()) {
            AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int p0, int p1) {
        AudioAttributesCompatParcelizer();
        write(p0, p1);
    }

    public void write(int p0, int p1) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(p0, p1);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(p0) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(p0)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(p1) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(p1)));
        int measuredWidth = childAt.getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        setMeasuredDimension(measuredWidth + paddingLeft + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        write(p0, p1, p2, p3, p4);
    }

    public void write(boolean p0, int p1, int p2, int p3, int p4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (p3 - p1) - getPaddingRight(), (p4 - p2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int p0) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(p0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.AudioAttributesImplApi26Parcelizer || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean p0) {
        super.setTransitionGroup(p0);
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View p0) {
        read();
        super.addView(p0);
    }

    @Override // android.view.ViewGroup
    public void addView(View p0, int p1) {
        read();
        super.addView(p0, p1);
    }

    @Override // android.view.ViewGroup
    public void addView(View p0, int p1, int p2) {
        read();
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View p0, ViewGroup.LayoutParams p1) {
        read();
        super.addView(p0, p1);
    }

    @Override // android.view.ViewGroup
    public void addView(View p0, int p1, ViewGroup.LayoutParams p2) {
        read();
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View p0, int p1, ViewGroup.LayoutParams p2) {
        read();
        return super.addViewInLayout(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View p0, int p1, ViewGroup.LayoutParams p2, boolean p3) {
        read();
        return super.addViewInLayout(p0, p1, p2, p3);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }
}
