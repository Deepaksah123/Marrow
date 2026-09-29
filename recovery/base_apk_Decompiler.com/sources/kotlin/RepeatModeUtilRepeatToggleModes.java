package kotlin;

import com.marrow2.data.subject.local.model.SubjectLSModel;

/* JADX INFO: loaded from: classes3.dex */
public final class RepeatModeUtilRepeatToggleModes {

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[RepeatModeUtil.values().length];
            try {
                iArr[RepeatModeUtil.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RepeatModeUtil.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RepeatModeUtil.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RepeatModeUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RepeatModeUtil.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    public static final PriorityTaskManager IconCompatParcelizer(startLoadingManifest startloadingmanifest) {
        boolean z;
        String str;
        float audioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(startloadingmanifest, "");
        String iconCompatParcelizer = startloadingmanifest.getIconCompatParcelizer();
        String read = startloadingmanifest.getRead();
        String mediaBrowserCompatCustomActionResultReceiver = startloadingmanifest.getMediaBrowserCompatCustomActionResultReceiver();
        if (mediaBrowserCompatCustomActionResultReceiver == null) {
            mediaBrowserCompatCustomActionResultReceiver = "";
        }
        String remoteActionCompatParcelizer = startloadingmanifest.getRemoteActionCompatParcelizer();
        String audioAttributesCompatParcelizer = startloadingmanifest.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = "";
        }
        int audioAttributesImplApi21Parcelizer = startloadingmanifest.getAudioAttributesImplApi21Parcelizer();
        boolean mediaBrowserCompatItemReceiver = startloadingmanifest.getMediaBrowserCompatItemReceiver();
        int mediaMetadataCompat = startloadingmanifest.getMediaMetadataCompat();
        int mediaDescriptionCompat = startloadingmanifest.getMediaDescriptionCompat();
        int audioAttributesImplBaseParcelizer = startloadingmanifest.getAudioAttributesImplBaseParcelizer();
        int audioAttributesImplApi26Parcelizer2 = startloadingmanifest.getAudioAttributesImplApi26Parcelizer();
        int ratingCompat = startloadingmanifest.getRatingCompat();
        boolean onCommand = startloadingmanifest.getOnCommand();
        String write = startloadingmanifest.getWrite();
        int mediaBrowserCompatSearchResultReceiver = startloadingmanifest.getMediaBrowserCompatSearchResultReceiver();
        float onCustomAction = startloadingmanifest.getOnCustomAction();
        long mediaBrowserCompatMediaItem = startloadingmanifest.getMediaBrowserCompatMediaItem();
        String handleMediaPlayPauseIfPendingOnHandler = startloadingmanifest.getHandleMediaPlayPauseIfPendingOnHandler();
        int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = startloadingmanifest.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (startloadingmanifest.getAudioAttributesImplApi26Parcelizer() == 0 || startloadingmanifest.getAudioAttributesImplBaseParcelizer() == 0) {
            z = onCommand;
            str = write;
            audioAttributesImplApi26Parcelizer = 0.0f;
        } else {
            str = write;
            z = onCommand;
            audioAttributesImplApi26Parcelizer = (float) ((((double) startloadingmanifest.getAudioAttributesImplApi26Parcelizer()) * 100.0d) / ((double) startloadingmanifest.getAudioAttributesImplBaseParcelizer()));
        }
        return new PriorityTaskManager(iconCompatParcelizer, read, mediaBrowserCompatCustomActionResultReceiver, remoteActionCompatParcelizer, audioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer, mediaBrowserCompatItemReceiver, mediaMetadataCompat, mediaDescriptionCompat, audioAttributesImplBaseParcelizer, audioAttributesImplApi26Parcelizer2, ratingCompat, z, str, mediaBrowserCompatSearchResultReceiver, onCustomAction, mediaBrowserCompatMediaItem, handleMediaPlayPauseIfPendingOnHandler, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, audioAttributesImplApi26Parcelizer, (startloadingmanifest.getMediaBrowserCompatSearchResultReceiver() & withAdditionalHeaders.IconCompatParcelizer.getRemoteActionCompatParcelizer()) == withAdditionalHeaders.IconCompatParcelizer.getRemoteActionCompatParcelizer(), (startloadingmanifest.getMediaBrowserCompatSearchResultReceiver() & withAdditionalHeaders.write.getRemoteActionCompatParcelizer()) == withAdditionalHeaders.write.getRemoteActionCompatParcelizer(), startloadingmanifest.getMediaMetadataCompat() > 0 ? startloadingmanifest.getMediaDescriptionCompat() / startloadingmanifest.getMediaMetadataCompat() : 0.0f);
    }

    public static final proceedOrThrow IconCompatParcelizer(SubjectLSModel subjectLSModel) {
        toMagicModuleMetaRepoModel.write(subjectLSModel, "");
        return new proceedOrThrow(subjectLSModel.getRemoteActionCompatParcelizer(), subjectLSModel.getAudioAttributesCompatParcelizer(), subjectLSModel.getWrite());
    }

    public static final CopyOnWriteMultiset write(RepeatModeUtil repeatModeUtil) {
        toMagicModuleMetaRepoModel.write(repeatModeUtil, "");
        int i = AudioAttributesCompatParcelizer.write[repeatModeUtil.ordinal()];
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw new RenewEligibleCreator();
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = i3;
                }
            }
        } else {
            i2 = -1;
        }
        return new CopyOnWriteMultiset(i2);
    }
}
