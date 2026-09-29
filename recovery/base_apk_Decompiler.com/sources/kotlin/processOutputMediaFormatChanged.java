package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class processOutputMediaFormatChanged {
    private final long AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final long MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private final write MediaMetadataCompat;
    private final int RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final long read;
    private final String write;

    static {
        new read().read();
    }

    processOutputMediaFormatChanged(long j, String str, String str2, IconCompatParcelizer iconCompatParcelizer, write writeVar, String str3, String str4, int i, int i2, String str5, long j2, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str6, long j3, String str7) {
        this.MediaBrowserCompatMediaItem = j;
        this.AudioAttributesImplApi21Parcelizer = str;
        this.MediaBrowserCompatItemReceiver = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
        this.MediaMetadataCompat = writeVar;
        this.AudioAttributesImplApi26Parcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.MediaDescriptionCompat = i;
        this.RatingCompat = i2;
        this.MediaBrowserCompatSearchResultReceiver = str5;
        this.read = j2;
        this.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = str6;
        this.AudioAttributesCompatParcelizer = j3;
        this.write = str7;
    }

    public static read write() {
        return new read();
    }

    public final long MediaMetadataCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final write MediaBrowserCompatSearchResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final String MediaDescriptionCompat() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.RatingCompat;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public static final class read {
        private long MediaBrowserCompatMediaItem = 0;
        private String AudioAttributesImplApi21Parcelizer = "";
        private String AudioAttributesImplBaseParcelizer = "";
        private IconCompatParcelizer AudioAttributesImplApi26Parcelizer = IconCompatParcelizer.UNKNOWN;
        private write RatingCompat = write.UNKNOWN_OS;
        private String MediaBrowserCompatCustomActionResultReceiver = "";
        private String AudioAttributesCompatParcelizer = "";
        private int MediaMetadataCompat = 0;
        private int MediaBrowserCompatSearchResultReceiver = 0;
        private String MediaDescriptionCompat = "";
        private long read = 0;
        private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer.UNKNOWN_EVENT;
        private String write = "";
        private long RemoteActionCompatParcelizer = 0;
        private String IconCompatParcelizer = "";

        read() {
        }

        public final processOutputMediaFormatChanged read() {
            return new processOutputMediaFormatChanged(this.MediaBrowserCompatMediaItem, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RatingCompat, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatItemReceiver, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        }

        public final read RemoteActionCompatParcelizer(long j) {
            this.MediaBrowserCompatMediaItem = j;
            return this;
        }

        public final read RemoteActionCompatParcelizer(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        public final read write(String str) {
            this.AudioAttributesImplBaseParcelizer = str;
            return this;
        }

        public final read AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
            return this;
        }

        public final read IconCompatParcelizer(write writeVar) {
            this.RatingCompat = writeVar;
            return this;
        }

        public final read MediaBrowserCompatCustomActionResultReceiver(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            return this;
        }

        public final read AudioAttributesCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        public final read read(int i) {
            this.MediaBrowserCompatSearchResultReceiver = i;
            return this;
        }

        public final read AudioAttributesImplApi26Parcelizer(String str) {
            this.MediaDescriptionCompat = str;
            return this;
        }

        public final read RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer;
            return this;
        }

        public final read IconCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        public final read read(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }
    }

    public enum IconCompatParcelizer implements AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int RemoteActionCompatParcelizer;

        IconCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1
        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public enum write implements AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1 {
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);

        private final int RemoteActionCompatParcelizer;

        write(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1
        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public enum AudioAttributesCompatParcelizer implements AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);

        private final int read;

        AudioAttributesCompatParcelizer(int i) {
            this.read = i;
        }

        @Override // kotlin.AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1
        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }
    }
}
