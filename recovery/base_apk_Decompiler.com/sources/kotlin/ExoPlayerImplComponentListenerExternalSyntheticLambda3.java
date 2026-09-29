package kotlin;

import android.graphics.Path;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda3 implements ExoPlayerImplComponentListenerExternalSyntheticLambda0, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged {
    private final boolean AudioAttributesCompatParcelizer;
    private final disableRenderer AudioAttributesImplBaseParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda6 IconCompatParcelizer;
    private final String read;
    private boolean write;
    private final Path RemoteActionCompatParcelizer = new Path();
    private final onSurfaceTextureUpdated AudioAttributesImplApi21Parcelizer = new onSurfaceTextureUpdated();

    public ExoPlayerImplComponentListenerExternalSyntheticLambda3(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setPlaybackParametersInternal setplaybackparametersinternal) {
        this.read = setplaybackparametersinternal.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = setplaybackparametersinternal.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = exoPlayerImplExternalSyntheticLambda6;
        disableRenderer disablerenderer = setplaybackparametersinternal.write().read();
        this.AudioAttributesImplBaseParcelizer = disablerenderer;
        setshufflemodeenabledinternal.IconCompatParcelizer(disablerenderer);
        disablerenderer.RemoteActionCompatParcelizer(this);
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        this.write = false;
        this.IconCompatParcelizer.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // kotlin.onVideoFrameProcessingOffset
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(java.util.List<kotlin.onVideoFrameProcessingOffset> r6, java.util.List<kotlin.onVideoFrameProcessingOffset> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L3c
            java.lang.Object r1 = r6.get(r0)
            o.onVideoFrameProcessingOffset r1 = (kotlin.onVideoFrameProcessingOffset) r1
            boolean r2 = r1 instanceof kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6
            if (r2 == 0) goto L26
            r2 = r1
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda6 r2 = (kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6) r2
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r3 = r2.AudioAttributesImplBaseParcelizer()
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r4 = o.shouldAdvancePlayingPeriod.IconCompatParcelizer.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            o.onSurfaceTextureUpdated r1 = r5.AudioAttributesImplApi21Parcelizer
            r1.read(r2)
            r2.read(r5)
            goto L39
        L26:
            boolean r2 = r1 instanceof kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda4
            if (r2 == 0) goto L39
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda4 r1 = (kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda4) r1
            r1.read(r5)
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            o.disableRenderer r5 = r5.AudioAttributesImplBaseParcelizer
            r5.AudioAttributesCompatParcelizer(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda3.write(java.util.List, java.util.List):void");
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        if (this.write && !this.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer()) {
            return this.RemoteActionCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer.reset();
        if (this.AudioAttributesCompatParcelizer) {
            this.write = true;
            return this.RemoteActionCompatParcelizer;
        }
        Path pathAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
        if (pathAudioAttributesImplApi26Parcelizer == null) {
            return this.RemoteActionCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer.set(pathAudioAttributesImplApi26Parcelizer);
        this.RemoteActionCompatParcelizer.setFillType(Path.FillType.EVEN_ODD);
        this.AudioAttributesImplApi21Parcelizer.read(this.RemoteActionCompatParcelizer);
        this.write = true;
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.MediaBrowserCompatSearchResultReceiver) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(setdrminitdata);
        }
    }
}
