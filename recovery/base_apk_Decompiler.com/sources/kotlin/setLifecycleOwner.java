package kotlin;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J'\u0010\u0017\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u0018\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u0019\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J3\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00122\n\u0010\n\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f"}, d2 = {"Lo/setLifecycleOwner;", "Lo/addAbstractTypeResolver;", "Lo/addKeySerializers;", "Lo/Module;", "p0", "Lo/setParentCompositionContext;", "p1", "Lo/getModifier;", "p2", "Lo/getReturnTransition;", "p3", "<init>", "(Lo/Module;Lo/setParentCompositionContext;Lo/getModifier;Lo/getReturnTransition;)V", "Lo/findSerializer;", "", "write", "(Lo/findSerializer;)V", "Lo/findSetterInfo;", "Landroid/widget/EdgeEffect;", "Landroid/graphics/Canvas;", "Lo/read;", "", "(Lo/findSetterInfo;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "", "Lo/getReferencedType;", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lo/setParentCompositionContext;", "Lo/getModifier;", "Lo/getReturnTransition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setLifecycleOwner extends addAbstractTypeResolver implements addKeySerializers {
    private final getReturnTransition AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getModifier read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setParentCompositionContext write;

    public setLifecycleOwner(Module module, setParentCompositionContext setparentcompositioncontext, getModifier getmodifier, getReturnTransition getreturntransition) {
        this.write = setparentcompositioncontext;
        this.read = getmodifier;
        this.AudioAttributesCompatParcelizer = getreturntransition;
        AudioAttributesCompatParcelizer(module);
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        this.write.IconCompatParcelizer(findserializer.MediaBrowserCompatCustomActionResultReceiver());
        if (calloc.MediaBrowserCompatCustomActionResultReceiver(findserializer.MediaBrowserCompatCustomActionResultReceiver())) {
            findserializer.write();
            return;
        }
        findserializer.write();
        this.write.RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
        Canvas canvasRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(findserializer.getIconCompatParcelizer().IconCompatParcelizer());
        getModifier getmodifier = this.read;
        boolean z = false;
        boolean zWrite = getmodifier.MediaBrowserCompatMediaItem() ? write(findserializer, getmodifier.AudioAttributesCompatParcelizer(), canvasRemoteActionCompatParcelizer) : false;
        if (getmodifier.onCustomAction()) {
            zWrite = IconCompatParcelizer(findserializer, getmodifier.AudioAttributesImplApi26Parcelizer(), canvasRemoteActionCompatParcelizer) || zWrite;
        }
        if (getmodifier.onAddQueueItem()) {
            if (AudioAttributesCompatParcelizer(findserializer, getmodifier.AudioAttributesImplApi21Parcelizer(), canvasRemoteActionCompatParcelizer) || zWrite) {
                z = true;
            }
        } else {
            z = zWrite;
        }
        if (getmodifier.MediaBrowserCompatItemReceiver()) {
            if (!read(findserializer, getmodifier.IconCompatParcelizer(), canvasRemoteActionCompatParcelizer) && !z) {
                return;
            }
        } else if (!z) {
            return;
        }
        this.write.AudioAttributesCompatParcelizer();
    }

    private final boolean write(findSetterInfo findsetterinfo, EdgeEffect edgeEffect, Canvas canvas) {
        long j = -1;
        return write(270.0f, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()))) << 32) | (((long) Float.floatToRawIntBits(findsetterinfo.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.read(findsetterinfo.RemoteActionCompatParcelizer())))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), edgeEffect, canvas);
    }

    private final boolean IconCompatParcelizer(findSetterInfo findsetterinfo, EdgeEffect edgeEffect, Canvas canvas) {
        long j = -1;
        return write(BitmapDescriptorFactory.HUE_RED, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(findsetterinfo.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.getRead()))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), edgeEffect, canvas);
    }

    private final boolean AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, EdgeEffect edgeEffect, Canvas canvas) {
        long j = -1;
        return write(90.0f, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits((-getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32)))) + findsetterinfo.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(findsetterinfo.RemoteActionCompatParcelizer())))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32)), edgeEffect, canvas);
    }

    private final boolean read(findSetterInfo findsetterinfo, EdgeEffect edgeEffect, Canvas canvas) {
        float fAudioAttributesCompatParcelizer = findsetterinfo.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
        long j = -1;
        return write(180.0f, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32)))) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver())) + fAudioAttributesCompatParcelizer)))), edgeEffect, canvas);
    }

    private final boolean write(float p0, long p1, EdgeEffect p2, Canvas p3) {
        int iSave = p3.save();
        p3.rotate(p0);
        p3.translate(Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) p1));
        boolean zDraw = p2.draw(p3);
        p3.restoreToCount(iSave);
        return zDraw;
    }
}
