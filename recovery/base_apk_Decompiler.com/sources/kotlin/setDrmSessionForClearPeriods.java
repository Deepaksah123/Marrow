package kotlin;

import android.util.Log;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.MediaItemClippingProperties;
import kotlin.getKeySetId;
import kotlin.isPrepared;
import kotlin.rewrapCtorProblem;
import kotlin.setDrmConfiguration;
import kotlin.setLiveMinOffsetMs;

/* JADX INFO: loaded from: classes2.dex */
public final class setDrmSessionForClearPeriods implements setDrmUuid, getKeySetId.IconCompatParcelizer, setLiveMinOffsetMs.IconCompatParcelizer {
    private static final boolean write = Log.isLoggable("Engine", 2);
    private final IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final setLiveMinPlaybackSpeed AudioAttributesImplApi21Parcelizer;
    private final setSubtitles AudioAttributesImplApi26Parcelizer;
    private final setStreamKeys AudioAttributesImplBaseParcelizer;
    private final RemoteActionCompatParcelizer IconCompatParcelizer;
    private final read MediaBrowserCompatItemReceiver;
    private final getKeySetId RemoteActionCompatParcelizer;
    private final setClipStartsAtKeyFrame read;

    public setDrmSessionForClearPeriods(getKeySetId getkeysetid, MediaItemClippingProperties.IconCompatParcelizer iconCompatParcelizer, setForceDefaultLicenseUri setforcedefaultlicenseuri, setForceDefaultLicenseUri setforcedefaultlicenseuri2, setForceDefaultLicenseUri setforcedefaultlicenseuri3, setForceDefaultLicenseUri setforcedefaultlicenseuri4, boolean z) {
        this(getkeysetid, iconCompatParcelizer, setforcedefaultlicenseuri, setforcedefaultlicenseuri2, setforcedefaultlicenseuri3, setforcedefaultlicenseuri4, z, (byte) 0);
    }

    private setDrmSessionForClearPeriods(getKeySetId getkeysetid, MediaItemClippingProperties.IconCompatParcelizer iconCompatParcelizer, setForceDefaultLicenseUri setforcedefaultlicenseuri, setForceDefaultLicenseUri setforcedefaultlicenseuri2, setForceDefaultLicenseUri setforcedefaultlicenseuri3, setForceDefaultLicenseUri setforcedefaultlicenseuri4, boolean z, byte b) {
        this.RemoteActionCompatParcelizer = getkeysetid;
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(iconCompatParcelizer);
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer2;
        setClipStartsAtKeyFrame setclipstartsatkeyframe = new setClipStartsAtKeyFrame(z);
        this.read = setclipstartsatkeyframe;
        setclipstartsatkeyframe.write(this);
        this.AudioAttributesImplApi21Parcelizer = new setLiveMinPlaybackSpeed();
        this.AudioAttributesImplBaseParcelizer = new setStreamKeys();
        this.MediaBrowserCompatItemReceiver = new read(setforcedefaultlicenseuri, setforcedefaultlicenseuri2, setforcedefaultlicenseuri3, setforcedefaultlicenseuri4, this, this);
        this.IconCompatParcelizer = new RemoteActionCompatParcelizer(iconCompatParcelizer2);
        this.AudioAttributesImplApi26Parcelizer = new setSubtitles();
        getkeysetid.RemoteActionCompatParcelizer(this);
    }

    public final <R> AudioAttributesCompatParcelizer read(setRotationDegrees setrotationdegrees, Object obj, onVolumeChanged onvolumechanged, int i, int i2, Class<?> cls, Class<R> cls2, setSampleRate setsamplerate, setDrmSessionForClearTypes setdrmsessionforcleartypes, Map<Class<?>, MediaItem<?>> map, boolean z, boolean z2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, boolean z3, boolean z4, boolean z5, boolean z6, getLoadingPeriod getloadingperiod, Executor executor) {
        long jRemoteActionCompatParcelizer = write ? createTimeline.RemoteActionCompatParcelizer() : 0L;
        setLiveMaxOffsetMs setlivemaxoffsetmsWrite = setLiveMinPlaybackSpeed.write(obj, onvolumechanged, i, i2, map, cls, cls2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        synchronized (this) {
            setLiveMinOffsetMs<?> setliveminoffsetmsWrite = write(setlivemaxoffsetmsWrite, z3, jRemoteActionCompatParcelizer);
            if (setliveminoffsetmsWrite == null) {
                return IconCompatParcelizer(setrotationdegrees, obj, onvolumechanged, i, i2, cls, cls2, setsamplerate, setdrmsessionforcleartypes, map, z, z2, r8lambda_r106e6zya8q8i_ekunqwrolpk, z3, z4, z5, z6, getloadingperiod, executor, setlivemaxoffsetmsWrite, jRemoteActionCompatParcelizer);
            }
            getloadingperiod.AudioAttributesCompatParcelizer(setliveminoffsetmsWrite, onTracksChanged.MEMORY_CACHE, false);
            return null;
        }
    }

    private <R> AudioAttributesCompatParcelizer IconCompatParcelizer(setRotationDegrees setrotationdegrees, Object obj, onVolumeChanged onvolumechanged, int i, int i2, Class<?> cls, Class<R> cls2, setSampleRate setsamplerate, setDrmSessionForClearTypes setdrmsessionforcleartypes, Map<Class<?>, MediaItem<?>> map, boolean z, boolean z2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, boolean z3, boolean z4, boolean z5, boolean z6, getLoadingPeriod getloadingperiod, Executor executor, setLiveMaxOffsetMs setlivemaxoffsetms, long j) {
        setDrmPlayClearContentWithoutKey<?> setdrmplayclearcontentwithoutkeyWrite = this.AudioAttributesImplBaseParcelizer.write(setlivemaxoffsetms, z6);
        if (setdrmplayclearcontentwithoutkeyWrite != null) {
            setdrmplayclearcontentwithoutkeyWrite.write(getloadingperiod, executor);
            if (write) {
                AudioAttributesCompatParcelizer("Added to existing load", j, setlivemaxoffsetms);
            }
            return new AudioAttributesCompatParcelizer(getloadingperiod, setdrmplayclearcontentwithoutkeyWrite);
        }
        setDrmPlayClearContentWithoutKey<R> setdrmplayclearcontentwithoutkeyRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(setlivemaxoffsetms, z3, z4, z5, z6);
        setDrmConfiguration<R> setdrmconfigurationRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(setrotationdegrees, obj, setlivemaxoffsetms, onvolumechanged, i, i2, cls, cls2, setsamplerate, setdrmsessionforcleartypes, map, z, z2, z6, r8lambda_r106e6zya8q8i_ekunqwrolpk, setdrmplayclearcontentwithoutkeyRemoteActionCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(setlivemaxoffsetms, setdrmplayclearcontentwithoutkeyRemoteActionCompatParcelizer);
        setdrmplayclearcontentwithoutkeyRemoteActionCompatParcelizer.write(getloadingperiod, executor);
        setdrmplayclearcontentwithoutkeyRemoteActionCompatParcelizer.IconCompatParcelizer(setdrmconfigurationRemoteActionCompatParcelizer);
        if (write) {
            AudioAttributesCompatParcelizer("Started new load", j, setlivemaxoffsetms);
        }
        return new AudioAttributesCompatParcelizer(getloadingperiod, setdrmplayclearcontentwithoutkeyRemoteActionCompatParcelizer);
    }

    private setLiveMinOffsetMs<?> write(setLiveMaxOffsetMs setlivemaxoffsetms, boolean z, long j) {
        if (!z) {
            return null;
        }
        setLiveMinOffsetMs<?> setliveminoffsetmsWrite = write(setlivemaxoffsetms);
        if (setliveminoffsetmsWrite != null) {
            if (write) {
                AudioAttributesCompatParcelizer("Loaded resource from active resources", j, setlivemaxoffsetms);
            }
            return setliveminoffsetmsWrite;
        }
        setLiveMinOffsetMs<?> setliveminoffsetmsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setlivemaxoffsetms);
        if (setliveminoffsetmsRemoteActionCompatParcelizer == null) {
            return null;
        }
        if (write) {
            AudioAttributesCompatParcelizer("Loaded resource from cache", j, setlivemaxoffsetms);
        }
        return setliveminoffsetmsRemoteActionCompatParcelizer;
    }

    private static void AudioAttributesCompatParcelizer(String str, long j, onVolumeChanged onvolumechanged) {
        createTimeline.AudioAttributesCompatParcelizer(j);
        Objects.toString(onvolumechanged);
    }

    private setLiveMinOffsetMs<?> write(onVolumeChanged onvolumechanged) {
        setLiveMinOffsetMs<?> setliveminoffsetmsIconCompatParcelizer = this.read.IconCompatParcelizer(onvolumechanged);
        if (setliveminoffsetmsIconCompatParcelizer != null) {
            setliveminoffsetmsIconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return setliveminoffsetmsIconCompatParcelizer;
    }

    private setLiveMinOffsetMs<?> RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged) {
        setLiveMinOffsetMs<?> setliveminoffsetmsIconCompatParcelizer = IconCompatParcelizer(onvolumechanged);
        if (setliveminoffsetmsIconCompatParcelizer != null) {
            setliveminoffsetmsIconCompatParcelizer.AudioAttributesCompatParcelizer();
            this.read.IconCompatParcelizer(onvolumechanged, setliveminoffsetmsIconCompatParcelizer);
        }
        return setliveminoffsetmsIconCompatParcelizer;
    }

    private setLiveMinOffsetMs<?> IconCompatParcelizer(onVolumeChanged onvolumechanged) {
        setMimeType<?> setmimetypeAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(onvolumechanged);
        if (setmimetypeAudioAttributesCompatParcelizer == null) {
            return null;
        }
        if (setmimetypeAudioAttributesCompatParcelizer instanceof setLiveMinOffsetMs) {
            return (setLiveMinOffsetMs) setmimetypeAudioAttributesCompatParcelizer;
        }
        return new setLiveMinOffsetMs<>(setmimetypeAudioAttributesCompatParcelizer, true, true, onvolumechanged, this);
    }

    public static void AudioAttributesCompatParcelizer(setMimeType<?> setmimetype) {
        if (setmimetype instanceof setLiveMinOffsetMs) {
            ((setLiveMinOffsetMs) setmimetype).AudioAttributesImplApi26Parcelizer();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // kotlin.setDrmUuid
    public final void IconCompatParcelizer(setDrmPlayClearContentWithoutKey<?> setdrmplayclearcontentwithoutkey, onVolumeChanged onvolumechanged, setLiveMinOffsetMs<?> setliveminoffsetms) {
        synchronized (this) {
            if (setliveminoffsetms != null) {
                if (setliveminoffsetms.AudioAttributesImplApi21Parcelizer()) {
                    this.read.IconCompatParcelizer(onvolumechanged, setliveminoffsetms);
                }
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(onvolumechanged, setdrmplayclearcontentwithoutkey);
            } else {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(onvolumechanged, setdrmplayclearcontentwithoutkey);
            }
        }
    }

    @Override // kotlin.setDrmUuid
    public final void AudioAttributesCompatParcelizer(setDrmPlayClearContentWithoutKey<?> setdrmplayclearcontentwithoutkey, onVolumeChanged onvolumechanged) {
        synchronized (this) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(onvolumechanged, setdrmplayclearcontentwithoutkey);
        }
    }

    @Override // o.getKeySetId.IconCompatParcelizer
    public final void IconCompatParcelizer(setMimeType<?> setmimetype) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(setmimetype, true);
    }

    @Override // o.setLiveMinOffsetMs.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, setLiveMinOffsetMs<?> setliveminoffsetms) {
        this.read.read(onvolumechanged);
        if (setliveminoffsetms.AudioAttributesImplApi21Parcelizer()) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onvolumechanged, setliveminoffsetms);
        } else {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(setliveminoffsetms, false);
        }
    }

    public class AudioAttributesCompatParcelizer {
        private final setDrmPlayClearContentWithoutKey<?> read;
        private final getLoadingPeriod write;

        AudioAttributesCompatParcelizer(getLoadingPeriod getloadingperiod, setDrmPlayClearContentWithoutKey<?> setdrmplayclearcontentwithoutkey) {
            this.write = getloadingperiod;
            this.read = setdrmplayclearcontentwithoutkey;
        }

        public final void read() {
            synchronized (setDrmSessionForClearPeriods.this) {
                this.read.RemoteActionCompatParcelizer(this.write);
            }
        }
    }

    static class IconCompatParcelizer implements setDrmConfiguration.AudioAttributesCompatParcelizer {
        private final MediaItemClippingProperties.IconCompatParcelizer AudioAttributesCompatParcelizer;
        private volatile MediaItemClippingProperties RemoteActionCompatParcelizer;

        IconCompatParcelizer(MediaItemClippingProperties.IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        }

        @Override // o.setDrmConfiguration.AudioAttributesCompatParcelizer
        public final MediaItemClippingProperties AudioAttributesCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer == null) {
                synchronized (this) {
                    if (this.RemoteActionCompatParcelizer == null) {
                        this.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.write();
                    }
                    if (this.RemoteActionCompatParcelizer == null) {
                        this.RemoteActionCompatParcelizer = new setStartPositionMs();
                    }
                }
            }
            return this.RemoteActionCompatParcelizer;
        }
    }

    static class RemoteActionCompatParcelizer {
        final rewrapCtorProblem.IconCompatParcelizer<setDrmConfiguration<?>> RemoteActionCompatParcelizer = isPrepared.read(150, new isPrepared.IconCompatParcelizer<setDrmConfiguration<?>>() { // from class: o.setDrmSessionForClearPeriods.RemoteActionCompatParcelizer.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.isPrepared.IconCompatParcelizer
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public setDrmConfiguration<?> write() {
                return new setDrmConfiguration<>(RemoteActionCompatParcelizer.this.read, RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer);
            }
        });
        final setDrmConfiguration.AudioAttributesCompatParcelizer read;
        private int write;

        RemoteActionCompatParcelizer(setDrmConfiguration.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.read = audioAttributesCompatParcelizer;
        }

        final <R> setDrmConfiguration<R> RemoteActionCompatParcelizer(setRotationDegrees setrotationdegrees, Object obj, setLiveMaxOffsetMs setlivemaxoffsetms, onVolumeChanged onvolumechanged, int i, int i2, Class<?> cls, Class<R> cls2, setSampleRate setsamplerate, setDrmSessionForClearTypes setdrmsessionforcleartypes, Map<Class<?>, MediaItem<?>> map, boolean z, boolean z2, boolean z3, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, setDrmConfiguration.read<R> readVar) {
            setDrmConfiguration setdrmconfiguration = (setDrmConfiguration) moveMediaSource.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            int i3 = this.write;
            this.write = i3 + 1;
            return setdrmconfiguration.AudioAttributesCompatParcelizer(setrotationdegrees, obj, setlivemaxoffsetms, onvolumechanged, i, i2, cls, cls2, setsamplerate, setdrmsessionforcleartypes, map, z, z2, z3, r8lambda_r106e6zya8q8i_ekunqwrolpk, readVar, i3);
        }
    }

    static class read {
        final setDrmUuid AudioAttributesCompatParcelizer;
        final setForceDefaultLicenseUri AudioAttributesImplApi21Parcelizer;
        final setForceDefaultLicenseUri AudioAttributesImplApi26Parcelizer;
        final setForceDefaultLicenseUri IconCompatParcelizer;
        final setForceDefaultLicenseUri RemoteActionCompatParcelizer;
        final rewrapCtorProblem.IconCompatParcelizer<setDrmPlayClearContentWithoutKey<?>> read = isPrepared.read(150, new isPrepared.IconCompatParcelizer<setDrmPlayClearContentWithoutKey<?>>() { // from class: o.setDrmSessionForClearPeriods.read.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.isPrepared.IconCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public setDrmPlayClearContentWithoutKey<?> write() {
                return new setDrmPlayClearContentWithoutKey<>(read.this.RemoteActionCompatParcelizer, read.this.AudioAttributesImplApi21Parcelizer, read.this.AudioAttributesImplApi26Parcelizer, read.this.IconCompatParcelizer, read.this.AudioAttributesCompatParcelizer, read.this.write, read.this.read);
            }
        });
        final setLiveMinOffsetMs.IconCompatParcelizer write;

        read(setForceDefaultLicenseUri setforcedefaultlicenseuri, setForceDefaultLicenseUri setforcedefaultlicenseuri2, setForceDefaultLicenseUri setforcedefaultlicenseuri3, setForceDefaultLicenseUri setforcedefaultlicenseuri4, setDrmUuid setdrmuuid, setLiveMinOffsetMs.IconCompatParcelizer iconCompatParcelizer) {
            this.RemoteActionCompatParcelizer = setforcedefaultlicenseuri;
            this.AudioAttributesImplApi21Parcelizer = setforcedefaultlicenseuri2;
            this.AudioAttributesImplApi26Parcelizer = setforcedefaultlicenseuri3;
            this.IconCompatParcelizer = setforcedefaultlicenseuri4;
            this.AudioAttributesCompatParcelizer = setdrmuuid;
            this.write = iconCompatParcelizer;
        }

        final <R> setDrmPlayClearContentWithoutKey<R> RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((setDrmPlayClearContentWithoutKey) moveMediaSource.AudioAttributesCompatParcelizer(this.read.RemoteActionCompatParcelizer())).AudioAttributesCompatParcelizer(onvolumechanged, z, z2, z3, z4);
        }
    }
}
