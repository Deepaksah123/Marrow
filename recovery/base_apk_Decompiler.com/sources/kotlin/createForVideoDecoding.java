package kotlin;

import kotlin.MediaCodecAdapterFactory;
import kotlin.forceEnableAsynchronous;

/* JADX INFO: loaded from: classes5.dex */
public abstract class createForVideoDecoding {

    public static abstract class AudioAttributesCompatParcelizer {
        public abstract AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write writeVar);

        public abstract createForVideoDecoding AudioAttributesCompatParcelizer();

        public abstract AudioAttributesCompatParcelizer IconCompatParcelizer(String str);

        public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(long j);

        public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str);

        public abstract AudioAttributesCompatParcelizer read(String str);

        public abstract AudioAttributesCompatParcelizer write(long j);

        public abstract AudioAttributesCompatParcelizer write(String str);
    }

    public abstract long AudioAttributesCompatParcelizer();

    public abstract long AudioAttributesImplApi21Parcelizer();

    public abstract AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer();

    public abstract MediaCodecAdapterFactory.write AudioAttributesImplBaseParcelizer();

    public abstract String IconCompatParcelizer();

    public abstract String RemoteActionCompatParcelizer();

    public abstract String read();

    public abstract String write();

    static {
        MediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer();
    }

    public final boolean MediaDescriptionCompat() {
        return AudioAttributesImplBaseParcelizer() == MediaCodecAdapterFactory.write.REGISTERED;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return AudioAttributesImplBaseParcelizer() == MediaCodecAdapterFactory.write.REGISTER_ERROR;
    }

    public final boolean RatingCompat() {
        return AudioAttributesImplBaseParcelizer() == MediaCodecAdapterFactory.write.UNREGISTERED;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return AudioAttributesImplBaseParcelizer() == MediaCodecAdapterFactory.write.NOT_GENERATED || AudioAttributesImplBaseParcelizer() == MediaCodecAdapterFactory.write.ATTEMPT_MIGRATION;
    }

    public final boolean MediaMetadataCompat() {
        return AudioAttributesImplBaseParcelizer() == MediaCodecAdapterFactory.write.ATTEMPT_MIGRATION;
    }

    public final createForVideoDecoding IconCompatParcelizer(String str) {
        return AudioAttributesImplApi26Parcelizer().read(str).AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write.UNREGISTERED).AudioAttributesCompatParcelizer();
    }

    public final createForVideoDecoding AudioAttributesCompatParcelizer(String str, String str2, long j, String str3, long j2) {
        return AudioAttributesImplApi26Parcelizer().read(str).AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write.REGISTERED).IconCompatParcelizer(str3).write(str2).write(j2).RemoteActionCompatParcelizer(j).AudioAttributesCompatParcelizer();
    }

    public final createForVideoDecoding write(String str) {
        return AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(str).AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write.REGISTER_ERROR).AudioAttributesCompatParcelizer();
    }

    public final createForVideoDecoding MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write.NOT_GENERATED).AudioAttributesCompatParcelizer();
    }

    public final createForVideoDecoding IconCompatParcelizer(String str, long j, long j2) {
        return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(str).write(j).RemoteActionCompatParcelizer(j2).AudioAttributesCompatParcelizer();
    }

    public final createForVideoDecoding MediaBrowserCompatMediaItem() {
        return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(null).AudioAttributesCompatParcelizer();
    }

    public static AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
        return new forceEnableAsynchronous.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(0L).AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write.ATTEMPT_MIGRATION).write(0L);
    }
}
