package kotlin;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\r\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J#\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J+\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00132\n\u0010\b\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u0012\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010 "}, d2 = {"Lo/setInteractionEnabled;", "Lo/addAbstractTypeResolver;", "Lo/addKeySerializers;", "Lo/Module;", "p0", "Lo/setParentCompositionContext;", "p1", "Lo/getModifier;", "p2", "<init>", "(Lo/Module;Lo/setParentCompositionContext;Lo/getModifier;)V", "Lo/findSerializer;", "", "write", "(Lo/findSerializer;)V", "", "AudioAttributesImplApi26Parcelizer", "()Z", "read", "Landroid/widget/EdgeEffect;", "Landroid/graphics/Canvas;", "Lo/read;", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "", "IconCompatParcelizer", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lo/setParentCompositionContext;", "Lo/getModifier;", "Landroid/graphics/RenderNode;", "Landroid/graphics/RenderNode;", "()Landroid/graphics/RenderNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setInteractionEnabled extends addAbstractTypeResolver implements addKeySerializers {
    private final setParentCompositionContext IconCompatParcelizer;
    private RenderNode RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getModifier AudioAttributesCompatParcelizer;

    public setInteractionEnabled(Module module, setParentCompositionContext setparentcompositioncontext, getModifier getmodifier) {
        this.IconCompatParcelizer = setparentcompositioncontext;
        this.AudioAttributesCompatParcelizer = getmodifier;
        AudioAttributesCompatParcelizer(module);
    }

    private final RenderNode write() {
        RenderNode renderNode = this.RemoteActionCompatParcelizer;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.RemoteActionCompatParcelizer = renderNode2;
        return renderNode2;
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        boolean zWrite;
        this.IconCompatParcelizer.IconCompatParcelizer(findserializer.MediaBrowserCompatCustomActionResultReceiver());
        Canvas canvasRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(findserializer.getIconCompatParcelizer().IconCompatParcelizer());
        this.IconCompatParcelizer.RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
        if (calloc.MediaBrowserCompatCustomActionResultReceiver(findserializer.MediaBrowserCompatCustomActionResultReceiver())) {
            findserializer.write();
            return;
        }
        if (!canvasRemoteActionCompatParcelizer.isHardwareAccelerated()) {
            this.AudioAttributesCompatParcelizer.read();
            findserializer.write();
            return;
        }
        float fAudioAttributesCompatParcelizer = findserializer.AudioAttributesCompatParcelizer(isFrameRateFromParent.read());
        getModifier getmodifier = this.AudioAttributesCompatParcelizer;
        boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        boolean z = read();
        if (zAudioAttributesImplApi26Parcelizer && z) {
            write().setPosition(0, 0, canvasRemoteActionCompatParcelizer.getWidth(), canvasRemoteActionCompatParcelizer.getHeight());
        } else if (zAudioAttributesImplApi26Parcelizer) {
            write().setPosition(0, 0, canvasRemoteActionCompatParcelizer.getWidth() + (getOnline.RemoteActionCompatParcelizer(fAudioAttributesCompatParcelizer) << 1), canvasRemoteActionCompatParcelizer.getHeight());
        } else if (z) {
            write().setPosition(0, 0, canvasRemoteActionCompatParcelizer.getWidth(), canvasRemoteActionCompatParcelizer.getHeight() + (getOnline.RemoteActionCompatParcelizer(fAudioAttributesCompatParcelizer) << 1));
        } else {
            findserializer.write();
            return;
        }
        RecordingCanvas recordingCanvasBeginRecording = write().beginRecording();
        if (getmodifier.MediaDescriptionCompat()) {
            EdgeEffect edgeEffectRemoteActionCompatParcelizer = getmodifier.RemoteActionCompatParcelizer();
            read(edgeEffectRemoteActionCompatParcelizer, recordingCanvasBeginRecording);
            edgeEffectRemoteActionCompatParcelizer.finish();
        }
        if (getmodifier.MediaBrowserCompatMediaItem()) {
            EdgeEffect edgeEffectAudioAttributesCompatParcelizer = getmodifier.AudioAttributesCompatParcelizer();
            zWrite = write(edgeEffectAudioAttributesCompatParcelizer, recordingCanvasBeginRecording);
            if (getmodifier.MediaBrowserCompatSearchResultReceiver()) {
                getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(getmodifier.RemoteActionCompatParcelizer(), getLifecycleOwner.INSTANCE.write(edgeEffectAudioAttributesCompatParcelizer), 1.0f - Float.intBitsToFloat((int) this.IconCompatParcelizer.write()));
            }
        } else {
            zWrite = false;
        }
        if (getmodifier.handleMediaPlayPauseIfPendingOnHandler()) {
            EdgeEffect edgeEffectAudioAttributesImplBaseParcelizer = getmodifier.AudioAttributesImplBaseParcelizer();
            AudioAttributesCompatParcelizer(edgeEffectAudioAttributesImplBaseParcelizer, recordingCanvasBeginRecording);
            edgeEffectAudioAttributesImplBaseParcelizer.finish();
        }
        if (getmodifier.onCustomAction()) {
            EdgeEffect edgeEffectAudioAttributesImplApi26Parcelizer = getmodifier.AudioAttributesImplApi26Parcelizer();
            zWrite = RemoteActionCompatParcelizer(edgeEffectAudioAttributesImplApi26Parcelizer, recordingCanvasBeginRecording) || zWrite;
            if (getmodifier.onMediaButtonEvent()) {
                getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(getmodifier.AudioAttributesImplBaseParcelizer(), getLifecycleOwner.INSTANCE.write(edgeEffectAudioAttributesImplApi26Parcelizer), Float.intBitsToFloat((int) (this.IconCompatParcelizer.write() >> 32)));
            }
        }
        if (getmodifier.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            EdgeEffect edgeEffectMediaBrowserCompatCustomActionResultReceiver = getmodifier.MediaBrowserCompatCustomActionResultReceiver();
            write(edgeEffectMediaBrowserCompatCustomActionResultReceiver, recordingCanvasBeginRecording);
            edgeEffectMediaBrowserCompatCustomActionResultReceiver.finish();
        }
        if (getmodifier.onAddQueueItem()) {
            EdgeEffect edgeEffectAudioAttributesImplApi21Parcelizer = getmodifier.AudioAttributesImplApi21Parcelizer();
            zWrite = read(edgeEffectAudioAttributesImplApi21Parcelizer, recordingCanvasBeginRecording) || zWrite;
            if (getmodifier.onCommand()) {
                getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(getmodifier.MediaBrowserCompatCustomActionResultReceiver(), getLifecycleOwner.INSTANCE.write(edgeEffectAudioAttributesImplApi21Parcelizer), Float.intBitsToFloat((int) this.IconCompatParcelizer.write()));
            }
        }
        if (getmodifier.MediaMetadataCompat()) {
            EdgeEffect edgeEffectWrite = getmodifier.write();
            RemoteActionCompatParcelizer(edgeEffectWrite, recordingCanvasBeginRecording);
            edgeEffectWrite.finish();
        }
        if (getmodifier.MediaBrowserCompatItemReceiver()) {
            EdgeEffect edgeEffectIconCompatParcelizer = getmodifier.IconCompatParcelizer();
            boolean z2 = AudioAttributesCompatParcelizer(edgeEffectIconCompatParcelizer, recordingCanvasBeginRecording) || zWrite;
            if (getmodifier.RatingCompat()) {
                getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(getmodifier.write(), getLifecycleOwner.INSTANCE.write(edgeEffectIconCompatParcelizer), 1.0f - Float.intBitsToFloat((int) (this.IconCompatParcelizer.write() >> 32)));
            }
            zWrite = z2;
        }
        if (zWrite) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        float f = z ? 0.0f : fAudioAttributesCompatParcelizer;
        if (zAudioAttributesImplApi26Parcelizer) {
            fAudioAttributesCompatParcelizer = 0.0f;
        }
        findSerializer findserializer2 = findserializer;
        tryToResolveUnresolved trytoresolveunresolvedRemoteActionCompatParcelizer = findserializer.RemoteActionCompatParcelizer();
        JsonParserDelegate jsonParserDelegateRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(recordingCanvasBeginRecording);
        long jMediaBrowserCompatCustomActionResultReceiver = findserializer.MediaBrowserCompatCustomActionResultReceiver();
        bufferMapProperty buffermapproperty = findserializer2.getIconCompatParcelizer().read();
        tryToResolveUnresolved trytoresolveunresolvedWrite = findserializer2.getIconCompatParcelizer().write();
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findserializer2.getIconCompatParcelizer().IconCompatParcelizer();
        long jAudioAttributesCompatParcelizer = findserializer2.getIconCompatParcelizer().AudioAttributesCompatParcelizer();
        hasAnyGetter audioAttributesImplApi26Parcelizer = findserializer2.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
        findSerializationTyping iconCompatParcelizer = findserializer2.getIconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer(findserializer);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(trytoresolveunresolvedRemoteActionCompatParcelizer);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(jsonParserDelegateRemoteActionCompatParcelizer);
        iconCompatParcelizer.IconCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver);
        iconCompatParcelizer.write(null);
        jsonParserDelegateRemoteActionCompatParcelizer.IconCompatParcelizer();
        try {
            findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(f, fAudioAttributesCompatParcelizer);
            try {
                findserializer.write();
                float f2 = -f;
                float f3 = -fAudioAttributesCompatParcelizer;
                findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(f2, f3);
                jsonParserDelegateRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                findSerializationTyping iconCompatParcelizer2 = findserializer2.getIconCompatParcelizer();
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(buffermapproperty);
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
                iconCompatParcelizer2.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
                iconCompatParcelizer2.write(audioAttributesImplApi26Parcelizer);
                write().endRecording();
                int iSave = canvasRemoteActionCompatParcelizer.save();
                canvasRemoteActionCompatParcelizer.translate(f2, f3);
                canvasRemoteActionCompatParcelizer.drawRenderNode(write());
                canvasRemoteActionCompatParcelizer.restoreToCount(iSave);
            } catch (Throwable th) {
                findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(-f, -fAudioAttributesCompatParcelizer);
                throw th;
            }
        } catch (Throwable th2) {
            jsonParserDelegateRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            findSerializationTyping iconCompatParcelizer3 = findserializer2.getIconCompatParcelizer();
            iconCompatParcelizer3.AudioAttributesCompatParcelizer(buffermapproperty);
            iconCompatParcelizer3.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
            iconCompatParcelizer3.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
            iconCompatParcelizer3.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            iconCompatParcelizer3.write(audioAttributesImplApi26Parcelizer);
            throw th2;
        }
    }

    private final boolean AudioAttributesImplApi26Parcelizer() {
        getModifier getmodifier = this.AudioAttributesCompatParcelizer;
        return getmodifier.onCustomAction() || getmodifier.handleMediaPlayPauseIfPendingOnHandler() || getmodifier.MediaBrowserCompatItemReceiver() || getmodifier.MediaMetadataCompat();
    }

    private final boolean read() {
        getModifier getmodifier = this.AudioAttributesCompatParcelizer;
        return getmodifier.MediaBrowserCompatMediaItem() || getmodifier.MediaDescriptionCompat() || getmodifier.onAddQueueItem() || getmodifier.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private final boolean write(EdgeEffect p0, Canvas p1) {
        return IconCompatParcelizer(270.0f, p0, p1);
    }

    private final boolean RemoteActionCompatParcelizer(EdgeEffect p0, Canvas p1) {
        return IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, p0, p1);
    }

    private final boolean read(EdgeEffect p0, Canvas p1) {
        return IconCompatParcelizer(90.0f, p0, p1);
    }

    private final boolean AudioAttributesCompatParcelizer(EdgeEffect p0, Canvas p1) {
        return IconCompatParcelizer(180.0f, p0, p1);
    }

    private final boolean IconCompatParcelizer(float p0, EdgeEffect p1, Canvas p2) {
        if (p0 == BitmapDescriptorFactory.HUE_RED) {
            return p1.draw(p2);
        }
        int iSave = p2.save();
        p2.rotate(p0);
        boolean zDraw = p1.draw(p2);
        p2.restoreToCount(iSave);
        return zDraw;
    }
}
