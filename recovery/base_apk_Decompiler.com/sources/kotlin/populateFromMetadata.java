package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class populateFromMetadata {
    public static final populateFromMetadata AudioAttributesCompatParcelizer;
    static final boolean AudioAttributesImplApi26Parcelizer;
    public static final populateFromMetadata IconCompatParcelizer;
    public static final populateFromMetadata MediaBrowserCompatCustomActionResultReceiver;
    public static final isRated<populateFromMetadata> MediaBrowserCompatItemReceiver;
    public static final populateFromMetadata RemoteActionCompatParcelizer;
    public static final populateFromMetadata read;
    public static final populateFromMetadata write;

    public enum AudioAttributesImplBaseParcelizer {
        MEMORY,
        QUALITY
    }

    public abstract AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4);

    public abstract float write(int i, int i2, int i3, int i4);

    static {
        new write();
        RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        write = new AudioAttributesCompatParcelizer();
        IconCompatParcelizer = new read();
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        AudioAttributesCompatParcelizer = iconCompatParcelizer;
        MediaBrowserCompatCustomActionResultReceiver = new AudioAttributesImplApi21Parcelizer();
        read = iconCompatParcelizer;
        MediaBrowserCompatItemReceiver = isRated.AudioAttributesCompatParcelizer("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", iconCompatParcelizer);
        AudioAttributesImplApi26Parcelizer = true;
    }

    static class AudioAttributesCompatParcelizer extends populateFromMetadata {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.populateFromMetadata
        public final float write(int i, int i2, int i3, int i4) {
            if (AudioAttributesImplApi26Parcelizer) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r0);
        }

        @Override // kotlin.populateFromMetadata
        public final AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4) {
            if (AudioAttributesImplApi26Parcelizer) {
                return AudioAttributesImplBaseParcelizer.QUALITY;
            }
            return AudioAttributesImplBaseParcelizer.MEMORY;
        }
    }

    static class IconCompatParcelizer extends populateFromMetadata {
        IconCompatParcelizer() {
        }

        @Override // kotlin.populateFromMetadata
        public final float write(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }

        @Override // kotlin.populateFromMetadata
        public final AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4) {
            return AudioAttributesImplBaseParcelizer.QUALITY;
        }
    }

    static class write extends populateFromMetadata {
        write() {
        }

        @Override // kotlin.populateFromMetadata
        public final float write(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r0);
        }

        @Override // kotlin.populateFromMetadata
        public final AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4) {
            return AudioAttributesImplBaseParcelizer.QUALITY;
        }
    }

    static class RemoteActionCompatParcelizer extends populateFromMetadata {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.populateFromMetadata
        public final float write(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r1 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }

        @Override // kotlin.populateFromMetadata
        public final AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4) {
            return AudioAttributesImplBaseParcelizer.MEMORY;
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends populateFromMetadata {
        @Override // kotlin.populateFromMetadata
        public final float write(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // kotlin.populateFromMetadata
        public final AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4) {
            return AudioAttributesImplBaseParcelizer.QUALITY;
        }
    }

    static class read extends populateFromMetadata {
        read() {
        }

        @Override // kotlin.populateFromMetadata
        public final float write(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, write.write(i, i2, i3, i4));
        }

        @Override // kotlin.populateFromMetadata
        public final AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4) {
            if (write(i, i2, i3, i4) == 1.0f) {
                return AudioAttributesImplBaseParcelizer.QUALITY;
            }
            return write.read(i, i2, i3, i4);
        }
    }
}
