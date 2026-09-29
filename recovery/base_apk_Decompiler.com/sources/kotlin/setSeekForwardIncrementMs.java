package kotlin;

import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
final class setSeekForwardIncrementMs extends isAnnotationBundle {
    private final boolean AudioAttributesCompatParcelizer;
    private final lambdaupdatePlaybackInfo16 AudioAttributesImplApi21Parcelizer;
    private final InputAccessor AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private isAnnotationBundle MediaBrowserCompatCustomActionResultReceiver;
    private final InputAccessor MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatSearchResultReceiver;
    private final InputAccessor RemoteActionCompatParcelizer;
    private final isAnnotationBundle write;

    public setSeekForwardIncrementMs(isAnnotationBundle isannotationbundle, isAnnotationBundle isannotationbundle2, lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(lambdaupdateplaybackinfo16, "");
        this.MediaBrowserCompatCustomActionResultReceiver = isannotationbundle;
        this.write = isannotationbundle2;
        this.AudioAttributesImplApi21Parcelizer = lambdaupdateplaybackinfo16;
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(0, null, 2, null);
        this.MediaBrowserCompatSearchResultReceiver = -1L;
        this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(Float.valueOf(1.0f), null, 2, null);
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int IconCompatParcelizer() {
        return ((Number) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer()).intValue();
    }

    private final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatItemReceiver.write(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float AudioAttributesCompatParcelizer() {
        return ((Number) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()).floatValue();
    }

    private final void write(float f) {
        this.AudioAttributesImplApi26Parcelizer.write(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final switchAndReturnNext RemoteActionCompatParcelizer() {
        return (switchAndReturnNext) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        this.RemoteActionCompatParcelizer.write(switchandreturnnext);
    }

    @Override // kotlin.isAnnotationBundle
    public final long read() {
        return write();
    }

    @Override // kotlin.isAnnotationBundle
    public final void read(findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        if (this.AudioAttributesImplBaseParcelizer) {
            IconCompatParcelizer(findsetterinfo, this.write, AudioAttributesCompatParcelizer());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.MediaBrowserCompatSearchResultReceiver == -1) {
            this.MediaBrowserCompatSearchResultReceiver = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.MediaBrowserCompatSearchResultReceiver) / this.IconCompatParcelizer;
        float fAudioAttributesCompatParcelizer = getQues.read(f, BitmapDescriptorFactory.HUE_RED, 1.0f) * AudioAttributesCompatParcelizer();
        float fAudioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer ? AudioAttributesCompatParcelizer() - fAudioAttributesCompatParcelizer : AudioAttributesCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = ((double) f) >= 1.0d;
        IconCompatParcelizer(findsetterinfo, this.MediaBrowserCompatCustomActionResultReceiver, fAudioAttributesCompatParcelizer2);
        IconCompatParcelizer(findsetterinfo, this.write, fAudioAttributesCompatParcelizer);
        if (this.AudioAttributesImplBaseParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        } else {
            IconCompatParcelizer(IconCompatParcelizer() + 1);
        }
    }

    @Override // kotlin.isAnnotationBundle
    public final boolean read(float f) {
        write(f);
        return true;
    }

    @Override // kotlin.isAnnotationBundle
    public final boolean write(switchAndReturnNext switchandreturnnext) {
        RemoteActionCompatParcelizer(switchandreturnnext);
        return true;
    }

    private final long write() {
        isAnnotationBundle isannotationbundle = this.MediaBrowserCompatCustomActionResultReceiver;
        calloc callocVar = isannotationbundle == null ? null : calloc.read(isannotationbundle.read());
        long jAudioAttributesCompatParcelizer = callocVar == null ? calloc.INSTANCE.AudioAttributesCompatParcelizer() : callocVar.getIconCompatParcelizer();
        isAnnotationBundle isannotationbundle2 = this.write;
        calloc callocVar2 = isannotationbundle2 != null ? calloc.read(isannotationbundle2.read()) : null;
        long jAudioAttributesCompatParcelizer2 = callocVar2 == null ? calloc.INSTANCE.AudioAttributesCompatParcelizer() : callocVar2.getIconCompatParcelizer();
        if (jAudioAttributesCompatParcelizer != calloc.INSTANCE.IconCompatParcelizer() && jAudioAttributesCompatParcelizer2 != calloc.INSTANCE.IconCompatParcelizer()) {
            return allocCharBuffer.IconCompatParcelizer(Math.max(calloc.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer), calloc.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2)), Math.max(calloc.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer), calloc.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer2)));
        }
        return calloc.INSTANCE.IconCompatParcelizer();
    }

    private final void IconCompatParcelizer(findSetterInfo findsetterinfo, isAnnotationBundle isannotationbundle, float f) {
        if (isannotationbundle == null || f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        long jMediaBrowserCompatCustomActionResultReceiver = findsetterinfo.MediaBrowserCompatCustomActionResultReceiver();
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(isannotationbundle.read(), jMediaBrowserCompatCustomActionResultReceiver);
        if (jMediaBrowserCompatCustomActionResultReceiver == calloc.INSTANCE.IconCompatParcelizer() || calloc.MediaBrowserCompatCustomActionResultReceiver(jMediaBrowserCompatCustomActionResultReceiver)) {
            isannotationbundle.write(findsetterinfo, jAudioAttributesCompatParcelizer, f, RemoteActionCompatParcelizer());
            return;
        }
        float fAudioAttributesCompatParcelizer = (calloc.AudioAttributesCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver) - calloc.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer)) / 2.0f;
        float fRemoteActionCompatParcelizer = (calloc.RemoteActionCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver) - calloc.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer)) / 2.0f;
        findsetterinfo.getIconCompatParcelizer().getRemoteActionCompatParcelizer().write(fAudioAttributesCompatParcelizer, fRemoteActionCompatParcelizer, fAudioAttributesCompatParcelizer, fRemoteActionCompatParcelizer);
        isannotationbundle.write(findsetterinfo, jAudioAttributesCompatParcelizer, f, RemoteActionCompatParcelizer());
        findTypeName remoteActionCompatParcelizer = findsetterinfo.getIconCompatParcelizer().getRemoteActionCompatParcelizer();
        float f2 = -fAudioAttributesCompatParcelizer;
        float f3 = -fRemoteActionCompatParcelizer;
        remoteActionCompatParcelizer.write(f2, f3, f2, f3);
    }

    private final long AudioAttributesCompatParcelizer(long j, long j2) {
        if (j == calloc.INSTANCE.IconCompatParcelizer() || calloc.MediaBrowserCompatCustomActionResultReceiver(j) || j2 == calloc.INSTANCE.IconCompatParcelizer() || calloc.MediaBrowserCompatCustomActionResultReceiver(j2)) {
            return j2;
        }
        float fAudioAttributesCompatParcelizer = calloc.AudioAttributesCompatParcelizer(j);
        float fRemoteActionCompatParcelizer = calloc.RemoteActionCompatParcelizer(j);
        ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
        float fRemoteActionCompatParcelizer2 = ExoPlayerBuilderExternalSyntheticLambda22.RemoteActionCompatParcelizer(fAudioAttributesCompatParcelizer, fRemoteActionCompatParcelizer, calloc.AudioAttributesCompatParcelizer(j2), calloc.RemoteActionCompatParcelizer(j2), this.AudioAttributesImplApi21Parcelizer);
        return allocCharBuffer.IconCompatParcelizer(fAudioAttributesCompatParcelizer * fRemoteActionCompatParcelizer2, fRemoteActionCompatParcelizer2 * fRemoteActionCompatParcelizer);
    }
}
