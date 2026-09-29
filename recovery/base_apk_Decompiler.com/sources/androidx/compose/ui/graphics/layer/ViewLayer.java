package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.JsonParserDelegate;
import kotlin.Metadata;
import kotlin.bufferMapProperty;
import kotlin.calloc;
import kotlin.charBufferLength;
import kotlin.createFlattened;
import kotlin.findRenameByField;
import kotlin.findSerializationTyping;
import kotlin.findSetterInfo;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.hasAnyGetter;
import kotlin.tryToResolveUnresolved;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ;\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010#\u001a\u00020\u00108\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0012\"\u0004\b%\u0010&R\u0018\u0010 \u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010*\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "Lo/bufferMapProperty;", "p0", "Lo/tryToResolveUnresolved;", "p1", "Lo/hasAnyGetter;", "p2", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "p3", "setDrawParams", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/hasAnyGetter;Lo/getAnswerMap;)V", "invalidate", "()V", "", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "p4", "onLayout", "(ZIIII)V", "forceLayout", "Lo/createFlattened;", "RemoteActionCompatParcelizer", "Lo/createFlattened;", "read", "Lo/findRenameByField;", "IconCompatParcelizer", "Lo/findRenameByField;", "AudioAttributesCompatParcelizer", "isInvalidated", "Z", "setInvalidated", "(Z)V", "Landroid/graphics/Outline;", "AudioAttributesImplApi26Parcelizer", "Landroid/graphics/Outline;", "canUseCompositingLayer", "getCanUseCompositingLayer$ui_graphics", "setCanUseCompositingLayer$ui_graphics", "MediaBrowserCompatItemReceiver", "Lo/bufferMapProperty;", "write", "MediaBrowserCompatCustomActionResultReceiver", "Lo/tryToResolveUnresolved;", "AudioAttributesImplBaseParcelizer", "Lo/getAnswerMap;", "AudioAttributesImplApi21Parcelizer", "Lo/hasAnyGetter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewLayer extends View {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private hasAnyGetter MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Outline IconCompatParcelizer;
    private getAnswerMap<? super findSetterInfo, getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final findRenameByField AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private tryToResolveUnresolved RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private bufferMapProperty write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final createFlattened read;
    private boolean canUseCompositingLayer;
    private boolean isInvalidated;
    public static final int write = 8;
    private static final ViewOutlineProvider AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }

    /* JADX INFO: renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setDrawParams(bufferMapProperty p0, tryToResolveUnresolved p1, hasAnyGetter p2, getAnswerMap<? super findSetterInfo, getShowPopup> p3) {
        this.write = p0;
        this.RemoteActionCompatParcelizer = p1;
        this.AudioAttributesImplBaseParcelizer = p3;
        this.MediaBrowserCompatCustomActionResultReceiver = p2;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas p0) {
        createFlattened createflattened = this.read;
        Canvas canvas = createflattened.getIconCompatParcelizer().getRead();
        createflattened.getIconCompatParcelizer().write(p0);
        charBufferLength charbufferlength = createflattened.getIconCompatParcelizer();
        findRenameByField findrenamebyfield = this.AudioAttributesCompatParcelizer;
        bufferMapProperty buffermapproperty = this.write;
        tryToResolveUnresolved trytoresolveunresolved = this.RemoteActionCompatParcelizer;
        long j = -1;
        long jWrite = calloc.write((((long) Float.floatToRawIntBits(getHeight())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(getWidth())) << 32));
        hasAnyGetter hasanygetter = this.MediaBrowserCompatCustomActionResultReceiver;
        getAnswerMap<? super findSetterInfo, getShowPopup> getanswermap = this.AudioAttributesImplBaseParcelizer;
        bufferMapProperty buffermapproperty2 = findrenamebyfield.getIconCompatParcelizer().read();
        tryToResolveUnresolved trytoresolveunresolvedWrite = findrenamebyfield.getIconCompatParcelizer().write();
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findrenamebyfield.getIconCompatParcelizer().IconCompatParcelizer();
        long jAudioAttributesCompatParcelizer = findrenamebyfield.getIconCompatParcelizer().AudioAttributesCompatParcelizer();
        hasAnyGetter hasanygetterRemoteActionCompatParcelizer = findrenamebyfield.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
        findSerializationTyping findserializationtyping = findrenamebyfield.getIconCompatParcelizer();
        findserializationtyping.AudioAttributesCompatParcelizer(buffermapproperty);
        findserializationtyping.AudioAttributesCompatParcelizer(trytoresolveunresolved);
        findserializationtyping.AudioAttributesCompatParcelizer(charbufferlength);
        findserializationtyping.IconCompatParcelizer(jWrite);
        findserializationtyping.write(hasanygetter);
        charbufferlength.IconCompatParcelizer();
        try {
            getanswermap.invoke(findrenamebyfield);
            charbufferlength.AudioAttributesCompatParcelizer();
            findSerializationTyping findserializationtyping2 = findrenamebyfield.getIconCompatParcelizer();
            findserializationtyping2.AudioAttributesCompatParcelizer(buffermapproperty2);
            findserializationtyping2.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
            findserializationtyping2.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
            findserializationtyping2.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            findserializationtyping2.write(hasanygetterRemoteActionCompatParcelizer);
            createflattened.getIconCompatParcelizer().write(canvas);
            this.isInvalidated = false;
        } catch (Throwable th) {
            charbufferlength.AudioAttributesCompatParcelizer();
            findSerializationTyping findserializationtyping3 = findrenamebyfield.getIconCompatParcelizer();
            findserializationtyping3.AudioAttributesCompatParcelizer(buffermapproperty2);
            findserializationtyping3.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
            findserializationtyping3.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
            findserializationtyping3.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            findserializationtyping3.write(hasanygetterRemoteActionCompatParcelizer);
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer$RemoteActionCompatParcelizer;", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "p0", "Landroid/graphics/Outline;", "p1", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends ViewOutlineProvider {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View p0, Outline p1) {
            Outline outline;
            if (!(p0 instanceof ViewLayer) || (outline = ((ViewLayer) p0).IconCompatParcelizer) == null) {
                return;
            }
            p1.set(outline);
        }
    }
}
