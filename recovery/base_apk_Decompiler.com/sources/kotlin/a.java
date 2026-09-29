package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends ValueClassBoxConverterdelegatingSerializer2 {
    Object AudioAttributesCompatParcelizer(SampleVideos<? super Boolean> sampleVideos);

    <R> Object write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleSubmissionRequestBody<? super setDrawValueAboveBar<R>, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/a$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private static final /* synthetic */ AudioAttributesCompatParcelizer[] read;
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer("DEFERRED", 0);
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer("IMMEDIATE", 1);
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer("EXCLUSIVE", 2);

        private AudioAttributesCompatParcelizer(String str, int i) {
        }

        static {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArrWrite = write();
            read = audioAttributesCompatParcelizerArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(audioAttributesCompatParcelizerArrWrite);
        }

        public static AudioAttributesCompatParcelizer valueOf(String str) {
            return (AudioAttributesCompatParcelizer) Enum.valueOf(AudioAttributesCompatParcelizer.class, str);
        }

        public static AudioAttributesCompatParcelizer[] values() {
            return (AudioAttributesCompatParcelizer[]) read.clone();
        }

        private static final /* synthetic */ AudioAttributesCompatParcelizer[] write() {
            return new AudioAttributesCompatParcelizer[]{write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
        }
    }
}
