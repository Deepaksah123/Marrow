package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\nj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lo/lambdaupdateStateAndInformListeners41;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "onCommand", "Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "onCustomAction", "RatingCompat", "MediaBrowserCompatCustomActionResultReceiver", "MediaMetadataCompat", "IconCompatParcelizer", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "AudioAttributesImplBaseParcelizer", "read", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners41 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final /* synthetic */ lambdaupdateStateAndInformListeners41[] onAddQueueItem;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final String write;
    public static final lambdaupdateStateAndInformListeners41 AudioAttributesImplApi26Parcelizer = new lambdaupdateStateAndInformListeners41("CTInAppTypeHTML", 0, "html");
    public static final lambdaupdateStateAndInformListeners41 RemoteActionCompatParcelizer = new lambdaupdateStateAndInformListeners41("CTInAppTypeCoverHTML", 1, "coverHtml");
    public static final lambdaupdateStateAndInformListeners41 onCustomAction = new lambdaupdateStateAndInformListeners41("CTInAppTypeInterstitialHTML", 2, "interstitialHtml");
    public static final lambdaupdateStateAndInformListeners41 RatingCompat = new lambdaupdateStateAndInformListeners41("CTInAppTypeHeaderHTML", 3, "headerHtml");
    public static final lambdaupdateStateAndInformListeners41 MediaBrowserCompatCustomActionResultReceiver = new lambdaupdateStateAndInformListeners41("CTInAppTypeFooterHTML", 4, "footerHtml");
    public static final lambdaupdateStateAndInformListeners41 MediaMetadataCompat = new lambdaupdateStateAndInformListeners41("CTInAppTypeHalfInterstitialHTML", 5, "halfInterstitialHtml");
    public static final lambdaupdateStateAndInformListeners41 IconCompatParcelizer = new lambdaupdateStateAndInformListeners41("CTInAppTypeCover", 6, "cover");
    public static final lambdaupdateStateAndInformListeners41 MediaDescriptionCompat = new lambdaupdateStateAndInformListeners41("CTInAppTypeInterstitial", 7, "interstitial");
    public static final lambdaupdateStateAndInformListeners41 MediaBrowserCompatItemReceiver = new lambdaupdateStateAndInformListeners41("CTInAppTypeHalfInterstitial", 8, "half-interstitial");
    public static final lambdaupdateStateAndInformListeners41 MediaBrowserCompatMediaItem = new lambdaupdateStateAndInformListeners41("CTInAppTypeHeader", 9, "header-template");
    public static final lambdaupdateStateAndInformListeners41 AudioAttributesImplBaseParcelizer = new lambdaupdateStateAndInformListeners41("CTInAppTypeFooter", 10, "footer-template");
    public static final lambdaupdateStateAndInformListeners41 write = new lambdaupdateStateAndInformListeners41("CTInAppTypeAlert", 11, "alert-template");
    public static final lambdaupdateStateAndInformListeners41 read = new lambdaupdateStateAndInformListeners41("CTInAppTypeCoverImageOnly", 12, "cover-image");
    public static final lambdaupdateStateAndInformListeners41 handleMediaPlayPauseIfPendingOnHandler = new lambdaupdateStateAndInformListeners41("CTInAppTypeInterstitialImageOnly", 13, "interstitial-image");
    public static final lambdaupdateStateAndInformListeners41 MediaBrowserCompatSearchResultReceiver = new lambdaupdateStateAndInformListeners41("CTInAppTypeHalfInterstitialImageOnly", 14, "half-interstitial-image");
    public static final lambdaupdateStateAndInformListeners41 AudioAttributesImplApi21Parcelizer = new lambdaupdateStateAndInformListeners41("CTInAppTypeCustomCodeTemplate", 15, "custom-code");
    public static final lambdaupdateStateAndInformListeners41 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new lambdaupdateStateAndInformListeners41("UNKNOWN", 16, "");

    private lambdaupdateStateAndInformListeners41(String str, int i, String str2) {
        this.write = str2;
    }

    static {
        lambdaupdateStateAndInformListeners41[] lambdaupdatestateandinformlisteners41Arr = read();
        onAddQueueItem = lambdaupdatestateandinformlisteners41Arr;
        getMagicModuleTimeline.IconCompatParcelizer(lambdaupdatestateandinformlisteners41Arr);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.write;
    }

    /* JADX INFO: renamed from: o.lambdaupdateStateAndInformListeners41$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lambdaupdateStateAndInformListeners41$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/lambdaupdateStateAndInformListeners41;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/lambdaupdateStateAndInformListeners41;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static lambdaupdateStateAndInformListeners41 AudioAttributesCompatParcelizer(String p0) {
            if (p0 != null) {
                switch (p0.hashCode()) {
                    case -1824210231:
                        if (p0.equals("custom-code")) {
                            return lambdaupdateStateAndInformListeners41.AudioAttributesImplApi21Parcelizer;
                        }
                        break;
                    case -1698613420:
                        if (p0.equals("half-interstitial-image")) {
                            return lambdaupdateStateAndInformListeners41.MediaBrowserCompatSearchResultReceiver;
                        }
                        break;
                    case -1258935355:
                        if (p0.equals("cover-image")) {
                            return lambdaupdateStateAndInformListeners41.read;
                        }
                        break;
                    case -1160074422:
                        if (p0.equals("halfInterstitialHtml")) {
                            return lambdaupdateStateAndInformListeners41.MediaMetadataCompat;
                        }
                        break;
                    case -1141304454:
                        if (p0.equals("interstitial-image")) {
                            return lambdaupdateStateAndInformListeners41.handleMediaPlayPauseIfPendingOnHandler;
                        }
                        break;
                    case -728863497:
                        if (p0.equals("interstitialHtml")) {
                            return lambdaupdateStateAndInformListeners41.onCustomAction;
                        }
                        break;
                    case -334055316:
                        if (p0.equals("footer-template")) {
                            return lambdaupdateStateAndInformListeners41.AudioAttributesImplBaseParcelizer;
                        }
                        break;
                    case -37253685:
                        if (p0.equals("alert-template")) {
                            return lambdaupdateStateAndInformListeners41.write;
                        }
                        break;
                    case 3213227:
                        if (p0.equals("html")) {
                            return lambdaupdateStateAndInformListeners41.AudioAttributesImplApi26Parcelizer;
                        }
                        break;
                    case 94852023:
                        if (p0.equals("cover")) {
                            return lambdaupdateStateAndInformListeners41.IconCompatParcelizer;
                        }
                        break;
                    case 604727084:
                        if (p0.equals("interstitial")) {
                            return lambdaupdateStateAndInformListeners41.MediaDescriptionCompat;
                        }
                        break;
                    case 894039686:
                        if (p0.equals("half-interstitial")) {
                            return lambdaupdateStateAndInformListeners41.MediaBrowserCompatItemReceiver;
                        }
                        break;
                    case 1189018554:
                        if (p0.equals("header-template")) {
                            return lambdaupdateStateAndInformListeners41.MediaBrowserCompatMediaItem;
                        }
                        break;
                    case 1420225510:
                        if (p0.equals("footerHtml")) {
                            return lambdaupdateStateAndInformListeners41.MediaBrowserCompatCustomActionResultReceiver;
                        }
                        break;
                    case 1977176024:
                        if (p0.equals("headerHtml")) {
                            return lambdaupdateStateAndInformListeners41.RatingCompat;
                        }
                        break;
                    case 1979390978:
                        if (p0.equals("coverHtml")) {
                            return lambdaupdateStateAndInformListeners41.RemoteActionCompatParcelizer;
                        }
                        break;
                }
            }
            return lambdaupdateStateAndInformListeners41.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static lambdaupdateStateAndInformListeners41 valueOf(String str) {
        return (lambdaupdateStateAndInformListeners41) Enum.valueOf(lambdaupdateStateAndInformListeners41.class, str);
    }

    public static lambdaupdateStateAndInformListeners41[] values() {
        return (lambdaupdateStateAndInformListeners41[]) onAddQueueItem.clone();
    }

    private static final /* synthetic */ lambdaupdateStateAndInformListeners41[] read() {
        return new lambdaupdateStateAndInformListeners41[]{AudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer, onCustomAction, RatingCompat, MediaBrowserCompatCustomActionResultReceiver, MediaMetadataCompat, IconCompatParcelizer, MediaDescriptionCompat, MediaBrowserCompatItemReceiver, MediaBrowserCompatMediaItem, AudioAttributesImplBaseParcelizer, write, read, handleMediaPlayPauseIfPendingOnHandler, MediaBrowserCompatSearchResultReceiver, AudioAttributesImplApi21Parcelizer, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver};
    }
}
