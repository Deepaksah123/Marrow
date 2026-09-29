package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/copyWithTimeline;", "", "<init>", "()V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class copyWithTimeline {
    private static Map<String, ? extends MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.copyWithTimeline$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u000eR*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/copyWithTimeline$read;", "", "<init>", "()V", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda2;", "p0", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "p1", "Lo/copyWithNewPosition;", "write", "(Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda2;Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;)Lo/copyWithNewPosition;", "", "", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda11;", "(Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;)Ljava/util/Map;", "AudioAttributesCompatParcelizer", "Ljava/util/Map;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.copyWithTimeline$read$read, reason: collision with other inner class name */
        public final /* synthetic */ class C0067read {
            public static final /* synthetic */ int[] read;

            static {
                int[] iArr = new int[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.values().length];
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.write.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.IconCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatItemReceiver.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi21Parcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesCompatParcelizer.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatMediaItem.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                read = iArr;
            }
        }

        private Companion() {
        }

        public static copyWithNewPosition write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2 p0, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            copyWithTimeline.AudioAttributesCompatParcelizer = write(p1);
            Map map = null;
            switch (C0067read.read[p0.ordinal()]) {
                case 1:
                    Map map2 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map2;
                    }
                    return new PlaybackExceptionExternalSyntheticLambda0(map);
                case 2:
                case 3:
                    Map map3 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map3;
                    }
                    return new PlaybackExceptionErrorCode(new PlaybackExceptionExternalSyntheticLambda0(map));
                case 4:
                    Map map4 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map4;
                    }
                    return new copyWithIsLoading(new PlaybackExceptionExternalSyntheticLambda0(map));
                case 5:
                    Map map5 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map5 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map5;
                    }
                    return new getDummyPeriodForEmptyTimeline(map);
                case 6:
                    Map map6 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map6 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map6;
                    }
                    return new copyWithLoadingMediaPeriodId(new PlaybackExceptionExternalSyntheticLambda0(map));
                case 7:
                    Map map7 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map7 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map7;
                    }
                    return new getEstimatedPositionUs(new PlaybackExceptionExternalSyntheticLambda0(map));
                case 8:
                    Map map8 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map8 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map8;
                    }
                    return new copyWithPlayWhenReady(new PlaybackExceptionExternalSyntheticLambda0(map));
                case 9:
                    Map map9 = copyWithTimeline.AudioAttributesCompatParcelizer;
                    if (map9 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        map = map9;
                    }
                    return new PlaybackInfo(new PlaybackExceptionExternalSyntheticLambda0(map));
                default:
                    return null;
            }
        }

        private static Map<String, MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> write(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 p0) {
            HashMap map = new HashMap();
            map.put("PT_TITLE", new MediaSourceListMediaSourceHolder(p0.getIconCompatParcelizer(), "Title is missing or empty"));
            map.put("PT_MSG", new MediaSourceListMediaSourceHolder(p0.getRemoteActionCompatParcelizer(), "Message is missing or empty"));
            map.put("PT_DEEPLINK_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda5(p0.MediaBrowserCompatItemReceiver(), 1, "Deeplink is missing or empty"));
            map.put("PT_IMAGE_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda5(p0.AudioAttributesImplApi21Parcelizer(), 3, "Three required images not present"));
            map.put("PT_RATING_DEFAULT_DL", new MediaSourceListMediaSourceHolder(p0.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), "Default deeplink is missing or empty"));
            map.put("PT_FIVE_DEEPLINK_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda5(p0.MediaBrowserCompatItemReceiver(), 3, "Three required deeplinks not present"));
            map.put("PT_FIVE_IMAGE_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda5(p0.AudioAttributesImplApi21Parcelizer(), 3, "Three required images not present"));
            map.put("PT_PRODUCT_THREE_IMAGE_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda6(p0.AudioAttributesImplApi21Parcelizer(), "Only three images are required"));
            map.put("PT_THREE_DEEPLINK_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda6(p0.MediaBrowserCompatItemReceiver(), "Three required deeplinks not present"));
            map.put("PT_BIG_TEXT_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda6(p0.AudioAttributesImplBaseParcelizer(), "Three required product titles not present"));
            map.put("PT_SMALL_TEXT_LIST", new MediaSourceListForwardingEventListenerExternalSyntheticLambda6(p0.onSkipToNext(), "Three required product descriptions not present"));
            map.put("PT_PRODUCT_DISPLAY_ACTION", new MediaSourceListMediaSourceHolder(p0.getHandleMediaPlayPauseIfPendingOnHandler(), "Button label is missing or empty"));
            map.put("PT_BIG_IMG", new MediaSourceListMediaSourceHolder(p0.getMediaBrowserCompatItemReceiver(), "Display Image is missing or empty"));
            map.put("PT_TIMER_THRESHOLD", new MediaSourceListForwardingEventListenerExternalSyntheticLambda7(p0.getOnFastForward(), "Timer threshold not defined"));
            map.put("PT_TIMER_END", new MediaSourceListForwardingEventListenerExternalSyntheticLambda7(p0.getOnPlayFromUri(), "Not rendering notification Timer End value lesser than threshold (10 seconds) from current time"));
            map.put("PT_INPUT_FEEDBACK", new MediaSourceListMediaSourceHolder(p0.getOnPrepare(), "Feedback Text or Actions is missing or empty"));
            map.put("PT_ACTIONS", new MediaSourceListForwardingEventListenerExternalSyntheticLambda8(p0.getOnSkipToPrevious(), "Feedback Text or Actions is missing or empty"));
            return map;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
