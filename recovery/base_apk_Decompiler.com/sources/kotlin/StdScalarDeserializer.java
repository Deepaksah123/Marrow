package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StdScalarDeserializer {

    public static class write {
        public void AudioAttributesCompatParcelizer(int i) {
        }

        public void read(Typeface typeface) {
        }
    }

    public static Typeface read(Context context, List<StdKeyDeserializersExternalSyntheticLambda0> list, int i, boolean z, int i2, Handler handler, write writeVar) {
        constructEnumKeyDeserializer constructenumkeydeserializer = new constructEnumKeyDeserializer(writeVar, configureFromBigDecimalCreator.read(handler));
        if (z) {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            return StdValueInstantiator.RemoteActionCompatParcelizer(context, list.get(0), constructenumkeydeserializer, i, i2);
        }
        return StdValueInstantiator.write(context, list, i, constructenumkeydeserializer);
    }

    public static class AudioAttributesCompatParcelizer {
        private final Uri AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        @Deprecated
        public AudioAttributesCompatParcelizer(Uri uri, int i, int i2, boolean z, int i3) {
            this.AudioAttributesCompatParcelizer = (Uri) StringCollectionDeserializer.RemoteActionCompatParcelizer(uri);
            this.read = i;
            this.RemoteActionCompatParcelizer = i2;
            this.IconCompatParcelizer = z;
            this.write = i3;
        }

        static AudioAttributesCompatParcelizer read(Uri uri, int i, int i2, boolean z, int i3) {
            return new AudioAttributesCompatParcelizer(uri, i, i2, z, i3);
        }

        public Uri IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public int RemoteActionCompatParcelizer() {
            return this.read;
        }

        public int read() {
            return this.RemoteActionCompatParcelizer;
        }

        public boolean AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public int write() {
            return this.write;
        }
    }

    public static class IconCompatParcelizer {
        private final List<AudioAttributesCompatParcelizer[]> AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;

        @Deprecated
        public IconCompatParcelizer(int i, AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = Collections.singletonList(audioAttributesCompatParcelizerArr);
        }

        IconCompatParcelizer(int i, List<AudioAttributesCompatParcelizer[]> list) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = list;
        }

        public int read() {
            return this.IconCompatParcelizer;
        }

        public AudioAttributesCompatParcelizer[] RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.get(0);
        }

        boolean write() {
            return this.AudioAttributesCompatParcelizer.size() > 1;
        }

        public List<AudioAttributesCompatParcelizer[]> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        static IconCompatParcelizer write(int i, AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr) {
            return new IconCompatParcelizer(i, audioAttributesCompatParcelizerArr);
        }

        static IconCompatParcelizer AudioAttributesCompatParcelizer(int i, List<AudioAttributesCompatParcelizer[]> list) {
            return new IconCompatParcelizer(i, list);
        }
    }
}
