package kotlin;

import java.io.IOException;
import kotlin._ignorableAnnotation;

/* JADX INFO: loaded from: classes4.dex */
public final class BasicClassIntrospector<K, V> {
    private final V AudioAttributesCompatParcelizer;
    private final AudioAttributesCompatParcelizer<K, V> RemoteActionCompatParcelizer;
    private final K write;

    static class AudioAttributesCompatParcelizer<K, V> {
        public final _ignorableAnnotation.IconCompatParcelizer AudioAttributesCompatParcelizer;
        public final V IconCompatParcelizer;
        public final K RemoteActionCompatParcelizer;
        public final _ignorableAnnotation.IconCompatParcelizer write;

        public AudioAttributesCompatParcelizer(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, K k, _ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer2, V v) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = k;
            this.write = iconCompatParcelizer2;
            this.IconCompatParcelizer = v;
        }
    }

    private BasicClassIntrospector(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, K k, _ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer2, V v) {
        this.RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer<>(iconCompatParcelizer, k, iconCompatParcelizer2, v);
        this.write = k;
        this.AudioAttributesCompatParcelizer = v;
    }

    public static <K, V> BasicClassIntrospector<K, V> write(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, K k, _ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer2, V v) {
        return new BasicClassIntrospector<>(iconCompatParcelizer, k, iconCompatParcelizer2, v);
    }

    static <K, V> void AudioAttributesCompatParcelizer(getParameterAnnotations getparameterannotations, AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, K k, V v) throws IOException {
        isPresent.IconCompatParcelizer(getparameterannotations, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, 1, k);
        isPresent.IconCompatParcelizer(getparameterannotations, audioAttributesCompatParcelizer.write, 2, v);
    }

    static <K, V> int IconCompatParcelizer(AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, K k, V v) {
        return isPresent.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, 1, k) + isPresent.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.write, 2, v);
    }

    public final int AudioAttributesCompatParcelizer(int i, K k, V v) {
        return getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i) + getParameterAnnotations.AudioAttributesImplApi21Parcelizer(IconCompatParcelizer(this.RemoteActionCompatParcelizer, k, v));
    }

    final AudioAttributesCompatParcelizer<K, V> read() {
        return this.RemoteActionCompatParcelizer;
    }
}
