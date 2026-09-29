package kotlin;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class setRelativeToLiveWindow implements setSubtitleConfigurations {
    private int AudioAttributesCompatParcelizer;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> AudioAttributesImplApi21Parcelizer;
    private final access3800<AudioAttributesCompatParcelizer, Object> IconCompatParcelizer;
    private final Map<Class<?>, MediaItemClippingConfiguration<?>> RemoteActionCompatParcelizer;
    private final int read;
    private final RemoteActionCompatParcelizer write;

    public setRelativeToLiveWindow() {
        this.IconCompatParcelizer = new access3800<>();
        this.write = new RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = new HashMap();
        this.RemoteActionCompatParcelizer = new HashMap();
        this.read = 4194304;
    }

    public setRelativeToLiveWindow(int i) {
        this.IconCompatParcelizer = new access3800<>();
        this.write = new RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = new HashMap();
        this.RemoteActionCompatParcelizer = new HashMap();
        this.read = i;
    }

    @Override // kotlin.setSubtitleConfigurations
    public final <T> void read(T t) {
        synchronized (this) {
            Class<?> cls = t.getClass();
            MediaItemClippingConfiguration<T> mediaItemClippingConfiguration = read((Class) cls);
            int iIconCompatParcelizer = mediaItemClippingConfiguration.IconCompatParcelizer(t);
            int iRemoteActionCompatParcelizer = mediaItemClippingConfiguration.RemoteActionCompatParcelizer() * iIconCompatParcelizer;
            if (AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer)) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(iIconCompatParcelizer, cls);
                this.IconCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer, t);
                NavigableMap<Integer, Integer> navigableMapIconCompatParcelizer = IconCompatParcelizer(cls);
                Integer num = (Integer) navigableMapIconCompatParcelizer.get(Integer.valueOf(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.read));
                navigableMapIconCompatParcelizer.put(Integer.valueOf(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.read), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                this.AudioAttributesCompatParcelizer += iRemoteActionCompatParcelizer;
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // kotlin.setSubtitleConfigurations
    public final <T> T write(Class<T> cls) {
        T t;
        synchronized (this) {
            t = (T) AudioAttributesCompatParcelizer(this.write.RemoteActionCompatParcelizer(8, cls), cls);
        }
        return t;
    }

    @Override // kotlin.setSubtitleConfigurations
    public final <T> T IconCompatParcelizer(int i, Class<T> cls) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer;
        T t;
        synchronized (this) {
            Integer numCeilingKey = IconCompatParcelizer((Class<?>) cls).ceilingKey(Integer.valueOf(i));
            if (IconCompatParcelizer(i, numCeilingKey)) {
                audioAttributesCompatParcelizerRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(numCeilingKey.intValue(), cls);
            } else {
                audioAttributesCompatParcelizerRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(i, cls);
            }
            t = (T) AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer, cls);
        }
        return t;
    }

    private <T> T AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Class<T> cls) {
        MediaItemClippingConfiguration<T> mediaItemClippingConfiguration = read((Class) cls);
        T t = (T) AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        if (t != null) {
            this.AudioAttributesCompatParcelizer -= mediaItemClippingConfiguration.IconCompatParcelizer(t) * mediaItemClippingConfiguration.RemoteActionCompatParcelizer();
            read(mediaItemClippingConfiguration.IconCompatParcelizer(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(mediaItemClippingConfiguration.AudioAttributesCompatParcelizer(), 2)) {
            mediaItemClippingConfiguration.AudioAttributesCompatParcelizer();
            int i = audioAttributesCompatParcelizer.read;
        }
        return mediaItemClippingConfiguration.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.read);
    }

    private <T> T AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return (T) this.IconCompatParcelizer.read(audioAttributesCompatParcelizer);
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        return i <= this.read / 2;
    }

    private boolean IconCompatParcelizer(int i, Integer num) {
        if (num != null) {
            return read() || num.intValue() <= (i << 3);
        }
        return false;
    }

    private boolean read() {
        int i = this.AudioAttributesCompatParcelizer;
        return i == 0 || this.read / i >= 2;
    }

    @Override // kotlin.setSubtitleConfigurations
    public final void write() {
        synchronized (this) {
            IconCompatParcelizer(0);
        }
    }

    @Override // kotlin.setSubtitleConfigurations
    public final void write(int i) {
        synchronized (this) {
            try {
                if (i >= 40) {
                    write();
                } else if (i >= 20 || i == 15) {
                    IconCompatParcelizer(this.read / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        IconCompatParcelizer(this.read);
    }

    private void IconCompatParcelizer(int i) {
        while (this.AudioAttributesCompatParcelizer > i) {
            Object obj = this.IconCompatParcelizer.read();
            moveMediaSource.AudioAttributesCompatParcelizer(obj);
            MediaItemClippingConfiguration mediaItemClippingConfigurationAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(obj);
            this.AudioAttributesCompatParcelizer -= mediaItemClippingConfigurationAudioAttributesCompatParcelizer.IconCompatParcelizer(obj) * mediaItemClippingConfigurationAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            read(mediaItemClippingConfigurationAudioAttributesCompatParcelizer.IconCompatParcelizer(obj), obj.getClass());
            if (Log.isLoggable(mediaItemClippingConfigurationAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), 2)) {
                mediaItemClippingConfigurationAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                mediaItemClippingConfigurationAudioAttributesCompatParcelizer.IconCompatParcelizer(obj);
            }
        }
    }

    private void read(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapIconCompatParcelizer = IconCompatParcelizer(cls);
        Integer num = (Integer) navigableMapIconCompatParcelizer.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        }
        if (num.intValue() == 1) {
            navigableMapIconCompatParcelizer.remove(Integer.valueOf(i));
        } else {
            navigableMapIconCompatParcelizer.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> IconCompatParcelizer(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.AudioAttributesImplApi21Parcelizer.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.AudioAttributesImplApi21Parcelizer.put(cls, treeMap);
        return treeMap;
    }

    private <T> MediaItemClippingConfiguration<T> AudioAttributesCompatParcelizer(T t) {
        return read((Class) t.getClass());
    }

    private <T> MediaItemClippingConfiguration<T> read(Class<T> cls) {
        MediaItemClippingConfiguration<T> access4100Var;
        MediaItemClippingConfiguration<T> mediaItemClippingConfiguration = (MediaItemClippingConfiguration) this.RemoteActionCompatParcelizer.get(cls);
        if (mediaItemClippingConfiguration != null) {
            return mediaItemClippingConfiguration;
        }
        if (cls.equals(int[].class)) {
            access4100Var = new buildClippingProperties();
        } else if (cls.equals(byte[].class)) {
            access4100Var = new access4100();
        } else {
            StringBuilder sb = new StringBuilder("No array pool found for: ");
            sb.append(cls.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
        this.RemoteActionCompatParcelizer.put(cls, access4100Var);
        return access4100Var;
    }

    static final class RemoteActionCompatParcelizer extends access4000<AudioAttributesCompatParcelizer> {
        RemoteActionCompatParcelizer() {
        }

        final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, Class<?> cls) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write();
            audioAttributesCompatParcelizerWrite.RemoteActionCompatParcelizer(i, cls);
            return audioAttributesCompatParcelizerWrite;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.access4000
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer read() {
            return new AudioAttributesCompatParcelizer(this);
        }
    }

    static final class AudioAttributesCompatParcelizer implements setRelativeToDefaultPosition {
        private Class<?> AudioAttributesCompatParcelizer;
        int read;
        private final RemoteActionCompatParcelizer write;

        AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.write = remoteActionCompatParcelizer;
        }

        final void RemoteActionCompatParcelizer(int i, Class<?> cls) {
            this.read = i;
            this.AudioAttributesCompatParcelizer = cls;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.read == audioAttributesCompatParcelizer.read && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key{size=");
            sb.append(this.read);
            sb.append("array=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }

        @Override // kotlin.setRelativeToDefaultPosition
        public final void RemoteActionCompatParcelizer() {
            this.write.read(this);
        }

        public final int hashCode() {
            int i = this.read;
            Class<?> cls = this.AudioAttributesCompatParcelizer;
            return (i * 31) + (cls != null ? cls.hashCode() : 0);
        }
    }
}
