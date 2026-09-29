package kotlin;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;
import kotlin.setDrmLicenseRequestHeaders;

/* JADX INFO: loaded from: classes2.dex */
final class setUri implements setDrmLicenseRequestHeaders, setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer {
    private volatile int AudioAttributesCompatParcelizer;
    private volatile setClipStartPositionMs AudioAttributesImplApi26Parcelizer;
    private volatile setDrmKeySetId AudioAttributesImplBaseParcelizer;
    private final setDrmForceDefaultLicenseUri<?> IconCompatParcelizer;
    private volatile MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> RemoteActionCompatParcelizer;
    private volatile Object read;
    private final setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer write;

    setUri(setDrmForceDefaultLicenseUri<?> setdrmforcedefaultlicenseuri, setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.IconCompatParcelizer = setdrmforcedefaultlicenseuri;
        this.write = remoteActionCompatParcelizer;
    }

    @Override // kotlin.setDrmLicenseRequestHeaders
    public final boolean RemoteActionCompatParcelizer() {
        if (this.read != null) {
            Object obj = this.read;
            this.read = null;
            try {
                if (!AudioAttributesCompatParcelizer(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.AudioAttributesImplApi26Parcelizer != null && this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer()) {
            return true;
        }
        this.AudioAttributesImplApi26Parcelizer = null;
        this.RemoteActionCompatParcelizer = null;
        boolean z = false;
        while (!z && write()) {
            List<MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?>> listMediaBrowserCompatCustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            int i = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = i + 1;
            this.RemoteActionCompatParcelizer = listMediaBrowserCompatCustomActionResultReceiver.get(i);
            if (this.RemoteActionCompatParcelizer != null && (this.IconCompatParcelizer.read().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer()) || this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write()))) {
                write(this.RemoteActionCompatParcelizer);
                z = true;
            }
        }
        return z;
    }

    private void write(final MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(), new fromUri.AudioAttributesCompatParcelizer<Object>() { // from class: o.setUri.5
            @Override // o.fromUri.AudioAttributesCompatParcelizer
            public final void write(Object obj) {
                if (setUri.this.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer)) {
                    setUri.this.IconCompatParcelizer(remoteActionCompatParcelizer, obj);
                }
            }

            @Override // o.fromUri.AudioAttributesCompatParcelizer
            public final void IconCompatParcelizer(Exception exc) {
                if (setUri.this.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer)) {
                    setUri.this.read(remoteActionCompatParcelizer, exc);
                }
            }
        });
    }

    final boolean AudioAttributesCompatParcelizer(MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer) {
        MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer2 = this.RemoteActionCompatParcelizer;
        return remoteActionCompatParcelizer2 != null && remoteActionCompatParcelizer2 == remoteActionCompatParcelizer;
    }

    private boolean write() {
        return this.AudioAttributesCompatParcelizer < this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().size();
    }

    private boolean AudioAttributesCompatParcelizer(Object obj) throws Throwable {
        long jRemoteActionCompatParcelizer = createTimeline.RemoteActionCompatParcelizer();
        boolean z = false;
        try {
            r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T> r8lambdas__qvsutfc117zapgt_kkjakcryWrite = this.IconCompatParcelizer.write(obj);
            Object objIconCompatParcelizer = r8lambdas__qvsutfc117zapgt_kkjakcryWrite.IconCompatParcelizer();
            onShuffleModeEnabledChanged<X> onshufflemodeenabledchangedAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(objIconCompatParcelizer);
            setDrmLicenseUri setdrmlicenseuri = new setDrmLicenseUri(onshufflemodeenabledchangedAudioAttributesCompatParcelizer, objIconCompatParcelizer, this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer());
            setDrmKeySetId setdrmkeysetid = new setDrmKeySetId(this.RemoteActionCompatParcelizer.read, this.IconCompatParcelizer.MediaMetadataCompat());
            MediaItemClippingProperties mediaItemClippingPropertiesWrite = this.IconCompatParcelizer.write();
            mediaItemClippingPropertiesWrite.write(setdrmkeysetid, setdrmlicenseuri);
            if (Log.isLoggable("SourceGenerator", 2)) {
                setdrmkeysetid.toString();
                Objects.toString(obj);
                Objects.toString(onshufflemodeenabledchangedAudioAttributesCompatParcelizer);
                createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
            }
            if (mediaItemClippingPropertiesWrite.RemoteActionCompatParcelizer(setdrmkeysetid) != null) {
                this.AudioAttributesImplBaseParcelizer = setdrmkeysetid;
                this.AudioAttributesImplApi26Parcelizer = new setClipStartPositionMs(Collections.singletonList(this.RemoteActionCompatParcelizer.read), this.IconCompatParcelizer, this);
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.read();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.AudioAttributesImplBaseParcelizer);
                Objects.toString(obj);
            }
            try {
                this.write.read(this.RemoteActionCompatParcelizer.read, r8lambdas__qvsutfc117zapgt_kkjakcryWrite.IconCompatParcelizer(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(), this.RemoteActionCompatParcelizer.read);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.read();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.setDrmLicenseRequestHeaders
    public final void IconCompatParcelizer() {
        MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    final void IconCompatParcelizer(MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, Object obj) {
        setDrmSessionForClearTypes setdrmsessionforcleartypes = this.IconCompatParcelizer.read();
        if (obj != null && setdrmsessionforcleartypes.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer())) {
            this.read = obj;
            this.write.read();
        } else {
            this.write.read(remoteActionCompatParcelizer.read, obj, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(), this.AudioAttributesImplBaseParcelizer);
        }
    }

    final void read(MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, Exception exc) {
        this.write.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, exc, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer());
    }

    @Override // o.setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer
    public final void read() {
        throw new UnsupportedOperationException();
    }

    @Override // o.setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer
    public final void read(onVolumeChanged onvolumechanged, Object obj, fromUri<?> fromuri, onTracksChanged ontrackschanged, onVolumeChanged onvolumechanged2) {
        this.write.read(onvolumechanged, obj, fromuri, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(), onvolumechanged);
    }

    @Override // o.setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, Exception exc, fromUri<?> fromuri, onTracksChanged ontrackschanged) {
        this.write.RemoteActionCompatParcelizer(onvolumechanged, exc, fromuri, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer());
    }
}
