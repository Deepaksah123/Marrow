package kotlin;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class setSelectionFlags {
    private final isLastInTimeline AudioAttributesCompatParcelizer;
    private final setMinPlaybackSpeed AudioAttributesImplApi21Parcelizer;
    private final getBufferedPositionUs AudioAttributesImplApi26Parcelizer;
    private final rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> AudioAttributesImplBaseParcelizer;
    private final getMediaPeriodInfoForAd IconCompatParcelizer;
    private final isLastInWindow MediaBrowserCompatItemReceiver;
    private final hasServerSideInsertedAds RemoteActionCompatParcelizer;
    private final toBundleIncludeLocalConfiguration read;
    private final resolveMediaPeriodIdForAds MediaBrowserCompatCustomActionResultReceiver = new resolveMediaPeriodIdForAds();
    private final getMediaPeriodInfoForContent write = new getMediaPeriodInfoForContent();

    public setSelectionFlags() {
        rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer = isPrepared.read();
        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = new setMinPlaybackSpeed(iconCompatParcelizer);
        this.IconCompatParcelizer = new getMediaPeriodInfoForAd();
        this.AudioAttributesCompatParcelizer = new isLastInTimeline();
        this.MediaBrowserCompatItemReceiver = new isLastInWindow();
        this.read = new toBundleIncludeLocalConfiguration();
        this.AudioAttributesImplApi26Parcelizer = new getBufferedPositionUs();
        this.RemoteActionCompatParcelizer = new hasServerSideInsertedAds();
        RemoteActionCompatParcelizer(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public final <Data> setSelectionFlags AudioAttributesCompatParcelizer(Class<Data> cls, onShuffleModeEnabledChanged<Data> onshufflemodeenabledchanged) {
        this.IconCompatParcelizer.IconCompatParcelizer(cls, onshufflemodeenabledchanged);
        return this;
    }

    public final <Data, TResource> setSelectionFlags write(Class<Data> cls, Class<TResource> cls2, IllegalSeekPositionException<Data, TResource> illegalSeekPositionException) {
        RemoteActionCompatParcelizer("legacy_append", cls, cls2, illegalSeekPositionException);
        return this;
    }

    public final <Data, TResource> setSelectionFlags RemoteActionCompatParcelizer(String str, Class<Data> cls, Class<TResource> cls2, IllegalSeekPositionException<Data, TResource> illegalSeekPositionException) {
        this.AudioAttributesCompatParcelizer.write(str, illegalSeekPositionException, cls, cls2);
        return this;
    }

    private setSelectionFlags RemoteActionCompatParcelizer(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(arrayList);
        return this;
    }

    public final <TResource> setSelectionFlags read(Class<TResource> cls, LoadControl<TResource> loadControl) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(cls, loadControl);
        return this;
    }

    public final setSelectionFlags IconCompatParcelizer(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer) {
        this.read.read(remoteActionCompatParcelizer);
        return this;
    }

    public final <TResource, Transcode> setSelectionFlags AudioAttributesCompatParcelizer(Class<TResource> cls, Class<Transcode> cls2, releaseMediaPeriod<TResource, Transcode> releasemediaperiod) {
        this.AudioAttributesImplApi26Parcelizer.read(cls, cls2, releasemediaperiod);
        return this;
    }

    public final setSelectionFlags IconCompatParcelizer(ImageHeaderParser imageHeaderParser) {
        this.RemoteActionCompatParcelizer.read(imageHeaderParser);
        return this;
    }

    public final <Model, Data> setSelectionFlags AudioAttributesCompatParcelizer(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<Model, Data> settargetoffsetms) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(cls, cls2, settargetoffsetms);
        return this;
    }

    public final <Model, Data> setSelectionFlags read(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
        this.AudioAttributesImplApi21Parcelizer.read(cls, cls2, settargetoffsetms);
        return this;
    }

    public final <Data, TResource, Transcode> setRequestMetadata<Data, TResource, Transcode> read(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        setRequestMetadata<Data, TResource, Transcode> setrequestmetadataIconCompatParcelizer = this.write.IconCompatParcelizer(cls, cls2, cls3);
        if (getMediaPeriodInfoForContent.AudioAttributesCompatParcelizer(setrequestmetadataIconCompatParcelizer)) {
            return null;
        }
        if (setrequestmetadataIconCompatParcelizer != null) {
            return setrequestmetadataIconCompatParcelizer;
        }
        List<setDrmMultiSession<Data, TResource, Transcode>> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls, cls2, cls3);
        setRequestMetadata<Data, TResource, Transcode> setrequestmetadata = listRemoteActionCompatParcelizer.isEmpty() ? null : new setRequestMetadata<>(cls, cls2, cls3, listRemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
        this.write.AudioAttributesCompatParcelizer(cls, cls2, cls3, setrequestmetadata);
        return setrequestmetadata;
    }

    private <Data, TResource, Transcode> List<setDrmMultiSession<Data, TResource, Transcode>> RemoteActionCompatParcelizer(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(cls, cls2)) {
            for (Class cls5 : this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(cls4, cls3)) {
                arrayList.add(new setDrmMultiSession(cls, cls4, cls5, this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(cls, cls4), this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(cls4, cls5), this.AudioAttributesImplBaseParcelizer));
            }
        }
        return arrayList;
    }

    public final <Model, TResource, Transcode> List<Class<?>> AudioAttributesCompatParcelizer(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(cls, cls2, cls3);
        if (listIconCompatParcelizer == null) {
            listIconCompatParcelizer = new ArrayList<>();
            Iterator<Class<?>> it = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer((Class<?>) cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(it.next(), cls2)) {
                    if (!this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(cls4, cls3).isEmpty() && !listIconCompatParcelizer.contains(cls4)) {
                        listIconCompatParcelizer.add(cls4);
                    }
                }
            }
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(cls, cls2, cls3, Collections.unmodifiableList(listIconCompatParcelizer));
        }
        return listIconCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer(setMimeType<?> setmimetype) {
        return this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(setmimetype.read()) != null;
    }

    public final <X> LoadControl<X> IconCompatParcelizer(setMimeType<X> setmimetype) throws write {
        LoadControl<X> loadControlIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(setmimetype.read());
        if (loadControlIconCompatParcelizer != null) {
            return loadControlIconCompatParcelizer;
        }
        throw new write(setmimetype.read());
    }

    public final <X> onShuffleModeEnabledChanged<X> RemoteActionCompatParcelizer(X x) throws read {
        onShuffleModeEnabledChanged<X> onshufflemodeenabledchangedIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(x.getClass());
        if (onshufflemodeenabledchangedIconCompatParcelizer != null) {
            return onshufflemodeenabledchangedIconCompatParcelizer;
        }
        throw new read(x.getClass());
    }

    public final <X> r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<X> write(X x) {
        return this.read.write(x);
    }

    public final <Model> List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>> IconCompatParcelizer(Model model) {
        return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(model);
    }

    public final List<ImageHeaderParser> write() {
        List<ImageHeaderParser> listAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            throw new IconCompatParcelizer();
        }
        return listAudioAttributesCompatParcelizer;
    }

    public static class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
        public RemoteActionCompatParcelizer(Object obj) {
            StringBuilder sb = new StringBuilder("Failed to find any ModelLoaders registered for model class: ");
            sb.append(obj.getClass());
            super(sb.toString());
        }

        public <M> RemoteActionCompatParcelizer(M m, List<MediaItemLocalConfigurationExternalSyntheticLambda0<M, ?>> list) {
            StringBuilder sb = new StringBuilder("Found ModelLoaders for model class: ");
            sb.append(list);
            sb.append(", but none that handle this specific model instance: ");
            sb.append(m);
            super(sb.toString());
        }

        public RemoteActionCompatParcelizer(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder("Failed to find any ModelLoaders for model: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }
    }

    public static class write extends AudioAttributesCompatParcelizer {
        public write(Class<?> cls) {
            StringBuilder sb = new StringBuilder("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }

    public static class read extends AudioAttributesCompatParcelizer {
        public read(Class<?> cls) {
            super("Failed to find source encoder for data class: ".concat(String.valueOf(cls)));
        }
    }

    public static class AudioAttributesCompatParcelizer extends RuntimeException {
        public AudioAttributesCompatParcelizer(String str) {
            super(str);
        }
    }

    public static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
        public IconCompatParcelizer() {
            super("Failed to find image header parser.");
        }
    }
}
