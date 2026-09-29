package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.clearKeyRequestProperty;
import kotlin.getSeekMap;
import kotlin.needsForceWidevineL3Workaround;

/* JADX INFO: loaded from: classes5.dex */
public final class OfflineLicenseHelperExternalSyntheticLambda1 {
    private final BinarySearchSeeker AudioAttributesCompatParcelizer;
    private final Executor AudioAttributesImplApi21Parcelizer;
    private final BinarySearchSeeker AudioAttributesImplApi26Parcelizer;
    private final getMediaSessionPlaybackState AudioAttributesImplBaseParcelizer;
    private final invalidateMediaSessionQueue IconCompatParcelizer;
    private final getSeekMap MediaBrowserCompatItemReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final isCryptoSchemeSupported read;
    private final invalidateMediaSessionMetadata write;

    @setSdkPayload
    public OfflineLicenseHelperExternalSyntheticLambda1(Context context, isCryptoSchemeSupported iscryptoschemesupported, invalidateMediaSessionQueue invalidatemediasessionqueue, getMediaSessionPlaybackState getmediasessionplaybackstate, Executor executor, getSeekMap getseekmap, BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, invalidateMediaSessionMetadata invalidatemediasessionmetadata) {
        this.RemoteActionCompatParcelizer = context;
        this.read = iscryptoschemesupported;
        this.IconCompatParcelizer = invalidatemediasessionqueue;
        this.AudioAttributesImplBaseParcelizer = getmediasessionplaybackstate;
        this.AudioAttributesImplApi21Parcelizer = executor;
        this.MediaBrowserCompatItemReceiver = getseekmap;
        this.AudioAttributesCompatParcelizer = binarySearchSeeker;
        this.AudioAttributesImplApi26Parcelizer = binarySearchSeeker2;
        this.write = invalidatemediasessionmetadata;
    }

    private boolean IconCompatParcelizer() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.RemoteActionCompatParcelizer.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void write(final ExoMediaDrmProvider exoMediaDrmProvider, final int i, final Runnable runnable) {
        this.AudioAttributesImplApi21Parcelizer.execute(new Runnable() { // from class: o.WidevineUtil
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(exoMediaDrmProvider, i, runnable);
            }
        });
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(final ExoMediaDrmProvider exoMediaDrmProvider, final int i, Runnable runnable) {
        try {
            getSeekMap getseekmap = this.MediaBrowserCompatItemReceiver;
            final invalidateMediaSessionQueue invalidatemediasessionqueue = this.IconCompatParcelizer;
            Objects.requireNonNull(invalidatemediasessionqueue);
            getseekmap.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.UnsupportedDrmExceptionReason
                @Override // o.getSeekMap.RemoteActionCompatParcelizer
                public final Object RemoteActionCompatParcelizer() {
                    return Integer.valueOf(invalidatemediasessionqueue.write());
                }
            });
            if (!IconCompatParcelizer()) {
                this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.OfflineLicenseHelperExternalSyntheticLambda4
                    @Override // o.getSeekMap.RemoteActionCompatParcelizer
                    public final Object RemoteActionCompatParcelizer() {
                        return this.write.IconCompatParcelizer(exoMediaDrmProvider, i);
                    }
                });
            } else {
                RemoteActionCompatParcelizer(exoMediaDrmProvider, i);
            }
        } catch (TimelineQueueNavigator unused) {
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(exoMediaDrmProvider, i + 1);
        } finally {
            runnable.run();
        }
    }

    final /* synthetic */ Object IconCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, int i) {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(exoMediaDrmProvider, i + 1);
        return null;
    }

    public final needsForceWidevineL3Workaround RemoteActionCompatParcelizer(final ExoMediaDrmProvider exoMediaDrmProvider, int i) {
        needsForceWidevineL3Workaround needsforcewidevinel3workaroundRemoteActionCompatParcelizer;
        FrameworkMediaDrmApi31 frameworkMediaDrmApi31IconCompatParcelizer = this.read.IconCompatParcelizer(exoMediaDrmProvider.RemoteActionCompatParcelizer());
        long jMax = 0;
        needsForceWidevineL3Workaround needsforcewidevinel3workaround = needsForceWidevineL3Workaround.read(0L);
        while (true) {
            final long j = jMax;
            while (((Boolean) this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.MediaSessionConnector
                @Override // o.getSeekMap.RemoteActionCompatParcelizer
                public final Object RemoteActionCompatParcelizer() {
                    return this.read.IconCompatParcelizer(exoMediaDrmProvider);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.canDispatchMediaButtonEvent
                    @Override // o.getSeekMap.RemoteActionCompatParcelizer
                    public final Object RemoteActionCompatParcelizer() {
                        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(exoMediaDrmProvider);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return needsforcewidevinel3workaround;
                }
                if (frameworkMediaDrmApi31IconCompatParcelizer == null) {
                    executeKeyRequest.read("Uploader", exoMediaDrmProvider);
                    needsforcewidevinel3workaroundRemoteActionCompatParcelizer = needsForceWidevineL3Workaround.IconCompatParcelizer();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((setCustomActionProviders) it.next()).write());
                    }
                    if (exoMediaDrmProvider.IconCompatParcelizer()) {
                        arrayList.add(AudioAttributesCompatParcelizer(frameworkMediaDrmApi31IconCompatParcelizer));
                    }
                    needsforcewidevinel3workaroundRemoteActionCompatParcelizer = frameworkMediaDrmApi31IconCompatParcelizer.RemoteActionCompatParcelizer(newInstance.AudioAttributesCompatParcelizer().write(arrayList).read(exoMediaDrmProvider.write()).AudioAttributesCompatParcelizer());
                }
                needsforcewidevinel3workaround = needsforcewidevinel3workaroundRemoteActionCompatParcelizer;
                if (needsforcewidevinel3workaround.AudioAttributesCompatParcelizer() == needsForceWidevineL3Workaround.write.TRANSIENT_ERROR) {
                    this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.getDurationRemainingSec
                        @Override // o.getSeekMap.RemoteActionCompatParcelizer
                        public final Object RemoteActionCompatParcelizer() {
                            return this.read.RemoteActionCompatParcelizer(iterable, exoMediaDrmProvider, j);
                        }
                    });
                    this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(exoMediaDrmProvider, i + 1, true);
                    return needsforcewidevinel3workaround;
                }
                this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.buildPrepareActions
                    @Override // o.getSeekMap.RemoteActionCompatParcelizer
                    public final Object RemoteActionCompatParcelizer() {
                        return this.read.RemoteActionCompatParcelizer(iterable);
                    }
                });
                if (needsforcewidevinel3workaround.AudioAttributesCompatParcelizer() == needsForceWidevineL3Workaround.write.OK) {
                    jMax = Math.max(j, needsforcewidevinel3workaround.RemoteActionCompatParcelizer());
                    if (exoMediaDrmProvider.IconCompatParcelizer()) {
                        this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.canDispatchSetCaptioningEnabled
                            @Override // o.getSeekMap.RemoteActionCompatParcelizer
                            public final Object RemoteActionCompatParcelizer() {
                                return this.read.read();
                            }
                        });
                    }
                } else if (needsforcewidevinel3workaround.AudioAttributesCompatParcelizer() == needsForceWidevineL3Workaround.write.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strRemoteActionCompatParcelizer = ((setCustomActionProviders) it2.next()).write().RemoteActionCompatParcelizer();
                        if (!map.containsKey(strRemoteActionCompatParcelizer)) {
                            map.put(strRemoteActionCompatParcelizer, 1);
                        } else {
                            map.put(strRemoteActionCompatParcelizer, Integer.valueOf(((Integer) map.get(strRemoteActionCompatParcelizer)).intValue() + 1));
                        }
                    }
                    this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.OfflineLicenseHelper1
                        @Override // o.getSeekMap.RemoteActionCompatParcelizer
                        public final Object RemoteActionCompatParcelizer() {
                            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(map);
                        }
                    });
                }
            }
            this.MediaBrowserCompatItemReceiver.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.UnsupportedDrmException
                @Override // o.getSeekMap.RemoteActionCompatParcelizer
                public final Object RemoteActionCompatParcelizer() {
                    return this.write.IconCompatParcelizer(exoMediaDrmProvider, j);
                }
            });
            return needsforcewidevinel3workaround;
        }
    }

    final /* synthetic */ Boolean IconCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider) {
        return Boolean.valueOf(this.IconCompatParcelizer.write(exoMediaDrmProvider));
    }

    final /* synthetic */ Iterable AudioAttributesCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider) {
        return this.IconCompatParcelizer.IconCompatParcelizer(exoMediaDrmProvider);
    }

    final /* synthetic */ Object RemoteActionCompatParcelizer(Iterable iterable, ExoMediaDrmProvider exoMediaDrmProvider, long j) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iterable);
        this.IconCompatParcelizer.IconCompatParcelizer(exoMediaDrmProvider, this.AudioAttributesCompatParcelizer.IconCompatParcelizer() + j);
        return null;
    }

    final /* synthetic */ Object RemoteActionCompatParcelizer(Iterable iterable) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(iterable);
        return null;
    }

    final /* synthetic */ Object read() {
        this.write.IconCompatParcelizer();
        return null;
    }

    final /* synthetic */ Object AudioAttributesCompatParcelizer(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.write.IconCompatParcelizer(((Integer) r0.getValue()).intValue(), clearKeyRequestProperty.AudioAttributesCompatParcelizer.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    final /* synthetic */ Object IconCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, long j) {
        this.IconCompatParcelizer.IconCompatParcelizer(exoMediaDrmProvider, this.AudioAttributesCompatParcelizer.IconCompatParcelizer() + j);
        return null;
    }

    private ExoMediaDrmOnEventListener AudioAttributesCompatParcelizer(FrameworkMediaDrmApi31 frameworkMediaDrmApi31) {
        getSeekMap getseekmap = this.MediaBrowserCompatItemReceiver;
        final invalidateMediaSessionMetadata invalidatemediasessionmetadata = this.write;
        Objects.requireNonNull(invalidatemediasessionmetadata);
        return frameworkMediaDrmApi31.IconCompatParcelizer(ExoMediaDrmOnEventListener.AudioAttributesImplApi21Parcelizer().write(this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).read("GDT_CLIENT_METRICS").write(new ExoMediaDrmKeyRequest(DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto"), ((setLogSessionIdOnMediaDrmSession) getseekmap.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.buildPlaybackActions
            @Override // o.getSeekMap.RemoteActionCompatParcelizer
            public final Object RemoteActionCompatParcelizer() {
                return invalidatemediasessionmetadata.RemoteActionCompatParcelizer();
            }
        })).MediaBrowserCompatItemReceiver())).AudioAttributesCompatParcelizer());
    }
}
