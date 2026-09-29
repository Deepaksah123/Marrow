package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import kotlin.shouldAdvancePlayingPeriod;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda6 implements onVideoFrameProcessingOffset, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer {
    private final boolean AudioAttributesCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> AudioAttributesImplApi26Parcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> IconCompatParcelizer;
    private final shouldAdvancePlayingPeriod.IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new ArrayList();
    private final String read;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> write;

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
    }

    public ExoPlayerImplComponentListenerExternalSyntheticLambda6(setShuffleModeEnabledInternal setshufflemodeenabledinternal, shouldAdvancePlayingPeriod shouldadvanceplayingperiod) {
        this.read = shouldadvanceplayingperiod.read();
        this.AudioAttributesCompatParcelizer = shouldadvanceplayingperiod.AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatItemReceiver = shouldadvanceplayingperiod.IconCompatParcelizer();
        onCameraMotion oncameramotion = shouldadvanceplayingperiod.write().read();
        this.AudioAttributesImplApi26Parcelizer = oncameramotion;
        onCameraMotion oncameramotion2 = shouldadvanceplayingperiod.AudioAttributesCompatParcelizer().read();
        this.IconCompatParcelizer = oncameramotion2;
        onCameraMotion oncameramotion3 = shouldadvanceplayingperiod.RemoteActionCompatParcelizer().read();
        this.write = oncameramotion3;
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion2);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion3);
        oncameramotion.RemoteActionCompatParcelizer(this);
        oncameramotion2.RemoteActionCompatParcelizer(this);
        oncameramotion3.RemoteActionCompatParcelizer(this);
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            this.RemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    final void read(ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
    }

    final shouldAdvancePlayingPeriod.IconCompatParcelizer AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> write() {
        return this.IconCompatParcelizer;
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> read() {
        return this.write;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }
}
