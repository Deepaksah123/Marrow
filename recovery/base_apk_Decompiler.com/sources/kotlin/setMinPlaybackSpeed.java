package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.rewrapCtorProblem;
import kotlin.setSelectionFlags;

/* JADX INFO: loaded from: classes2.dex */
public final class setMinPlaybackSpeed {
    private final read AudioAttributesCompatParcelizer;
    private final MediaItemRequestMetadataExternalSyntheticLambda0 IconCompatParcelizer;

    public setMinPlaybackSpeed(rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
        this(new MediaItemRequestMetadataExternalSyntheticLambda0(iconCompatParcelizer));
    }

    private setMinPlaybackSpeed(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
        this.AudioAttributesCompatParcelizer = new read();
        this.IconCompatParcelizer = mediaItemRequestMetadataExternalSyntheticLambda0;
    }

    public final <Model, Data> void AudioAttributesCompatParcelizer(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
        synchronized (this) {
            this.IconCompatParcelizer.write(cls, cls2, settargetoffsetms);
            this.AudioAttributesCompatParcelizer.write();
        }
    }

    public final <Model, Data> void read(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
        synchronized (this) {
            RemoteActionCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(cls, cls2, settargetoffsetms));
            this.AudioAttributesCompatParcelizer.write();
        }
    }

    private static <Model, Data> void RemoteActionCompatParcelizer(List<setTargetOffsetMs<? extends Model, ? extends Data>> list) {
        Iterator<setTargetOffsetMs<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().read();
        }
    }

    public final <A> List<MediaItemLocalConfigurationExternalSyntheticLambda0<A, ?>> IconCompatParcelizer(A a) {
        List<MediaItemLocalConfigurationExternalSyntheticLambda0<A, ?>> listWrite = write((Class) write(a));
        if (listWrite.isEmpty()) {
            throw new setSelectionFlags.RemoteActionCompatParcelizer(a);
        }
        int size = listWrite.size();
        List<MediaItemLocalConfigurationExternalSyntheticLambda0<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            MediaItemLocalConfigurationExternalSyntheticLambda0<A, ?> mediaItemLocalConfigurationExternalSyntheticLambda0 = listWrite.get(i);
            if (mediaItemLocalConfigurationExternalSyntheticLambda0.read(a)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(mediaItemLocalConfigurationExternalSyntheticLambda0);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new setSelectionFlags.RemoteActionCompatParcelizer(a, listWrite);
        }
        return listEmptyList;
    }

    public final List<Class<?>> RemoteActionCompatParcelizer(Class<?> cls) {
        List<Class<?>> listIconCompatParcelizer;
        synchronized (this) {
            listIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(cls);
        }
        return listIconCompatParcelizer;
    }

    private <A> List<MediaItemLocalConfigurationExternalSyntheticLambda0<A, ?>> write(Class<A> cls) {
        List<MediaItemLocalConfigurationExternalSyntheticLambda0<A, ?>> listIconCompatParcelizer;
        synchronized (this) {
            listIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(cls);
            if (listIconCompatParcelizer == null) {
                listIconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer.RemoteActionCompatParcelizer(cls));
                this.AudioAttributesCompatParcelizer.write(cls, listIconCompatParcelizer);
            }
        }
        return listIconCompatParcelizer;
    }

    private static <A> Class<A> write(A a) {
        return (Class<A>) a.getClass();
    }

    static class read {
        private final Map<Class<?>, AudioAttributesCompatParcelizer<?>> read = new HashMap();

        read() {
        }

        public final void write() {
            this.read.clear();
        }

        public final <Model> void write(Class<Model> cls, List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>> list) {
            if (this.read.put(cls, new AudioAttributesCompatParcelizer<>(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(cls)));
            }
        }

        public final <Model> List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>> IconCompatParcelizer(Class<Model> cls) {
            AudioAttributesCompatParcelizer<?> audioAttributesCompatParcelizer = this.read.get(cls);
            if (audioAttributesCompatParcelizer == null) {
                return null;
            }
            return (List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>>) audioAttributesCompatParcelizer.IconCompatParcelizer;
        }

        static class AudioAttributesCompatParcelizer<Model> {
            final List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>> IconCompatParcelizer;

            public AudioAttributesCompatParcelizer(List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>> list) {
                this.IconCompatParcelizer = list;
            }
        }
    }
}
