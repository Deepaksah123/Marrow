package kotlin;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class surfaceCreated implements ExoPlayerImplComponentListenerExternalSyntheticLambda4, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer {
    private setMediaItemsInternal AudioAttributesCompatParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda6 IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> write;

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
    }

    public surfaceCreated(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setPlayWhenReadyInternal setplaywhenreadyinternal) {
        this.IconCompatParcelizer = exoPlayerImplExternalSyntheticLambda6;
        this.RemoteActionCompatParcelizer = setplaywhenreadyinternal.RemoteActionCompatParcelizer();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5 = setplaywhenreadyinternal.IconCompatParcelizer().read();
        this.write = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.invalidateSelf();
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> write() {
        return this.write;
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda4
    public final void read(ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.write.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.setMediaItemsInternal write(kotlin.setMediaItemsInternal r20) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.surfaceCreated.write(o.setMediaItemsInternal):o.setMediaItemsInternal");
    }

    private setMediaItemsInternal IconCompatParcelizer(setMediaItemsInternal setmediaitemsinternal) {
        List<isLoadingPossible> listAudioAttributesCompatParcelizer = setmediaitemsinternal.AudioAttributesCompatParcelizer();
        boolean zWrite = setmediaitemsinternal.write();
        int size = listAudioAttributesCompatParcelizer.size() - 1;
        int i = 0;
        while (size >= 0) {
            isLoadingPossible isloadingpossible = listAudioAttributesCompatParcelizer.get(size);
            isLoadingPossible isloadingpossible2 = listAudioAttributesCompatParcelizer.get(write(size - 1, listAudioAttributesCompatParcelizer.size()));
            PointF pointFRemoteActionCompatParcelizer = (size != 0 || zWrite) ? isloadingpossible2.read() : setmediaitemsinternal.RemoteActionCompatParcelizer();
            i = (((size != 0 || zWrite) ? isloadingpossible2.AudioAttributesCompatParcelizer() : pointFRemoteActionCompatParcelizer).equals(pointFRemoteActionCompatParcelizer) && isloadingpossible.IconCompatParcelizer().equals(pointFRemoteActionCompatParcelizer) && !(!setmediaitemsinternal.write() && (size == 0 || size == listAudioAttributesCompatParcelizer.size() - 1))) ? i + 2 : i + 1;
            size--;
        }
        setMediaItemsInternal setmediaitemsinternal2 = this.AudioAttributesCompatParcelizer;
        if (setmediaitemsinternal2 == null || setmediaitemsinternal2.AudioAttributesCompatParcelizer().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new isLoadingPossible());
            }
            this.AudioAttributesCompatParcelizer = new setMediaItemsInternal(new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), false, arrayList);
        }
        this.AudioAttributesCompatParcelizer.read(zWrite);
        return this.AudioAttributesCompatParcelizer;
    }

    private static int write(int i, int i2) {
        return i - (AudioAttributesCompatParcelizer(i, i2) * i2);
    }

    private static int AudioAttributesCompatParcelizer(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
