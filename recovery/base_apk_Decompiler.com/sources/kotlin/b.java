package kotlin;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0003\f\n\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\f\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018R\u001a\u0010\n\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010 \u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b\n\u0010+R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010+R\"\u00102\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b\u0010\u0010+R\"\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b-\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u0001048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b\u0019\u00106R\u0014\u00108\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\u0012\u001a\u00020:8GX\u0087\u0004¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\b,\u0010<R\u001a\u0010&\u001a\u00020:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b2\u0010<R\u001a\u0010\u0010\u001a\u00020:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010;\u001a\u0004\b#\u0010<R\u001a\u0010\u0007\u001a\u00020:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b\u0015\u0010<R\u001a\u0010\u001d\u001a\u00020:8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b/\u0010<R\u0014\u0010-\u001a\u00020\u00068GX\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u0014\u00103\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010=R\u001a\u0010A\u001a\u00020>8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\b8\u0010@"}, d2 = {"Lo/b;", "", "Lo/b$read;", "p0", "<init>", "(Lo/b$read;)V", "", "onCustomAction", "()Z", "Ljava/util/concurrent/Executor;", "write", "Ljava/util/concurrent/Executor;", "read", "()Ljava/util/concurrent/Executor;", "RemoteActionCompatParcelizer", "Lo/CurrentQuery;", "onCommand", "Lo/CurrentQuery;", "MediaBrowserCompatSearchResultReceiver", "()Lo/CurrentQuery;", "MediaDescriptionCompat", "IconCompatParcelizer", "Lo/setInstallerPackageName;", "Lo/setInstallerPackageName;", "()Lo/setInstallerPackageName;", "AudioAttributesCompatParcelizer", "Lo/getNextWindowIndex;", "onPause", "Lo/getNextWindowIndex;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/getNextWindowIndex;", "Lo/gc;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/gc;", "()Lo/gc;", "MediaBrowserCompatItemReceiver", "Lo/CctBackendFactory;", "Lo/CctBackendFactory;", "MediaMetadataCompat", "()Lo/CctBackendFactory;", "Lo/wrapAsJsonMappingException;", "", "Lo/wrapAsJsonMappingException;", "()Lo/wrapAsJsonMappingException;", "AudioAttributesImplApi21Parcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "RatingCompat", "AudioAttributesImplBaseParcelizer", "Lo/getChildIndexByPeriodIndex;", "onPlay", "AudioAttributesImplApi26Parcelizer", "onAddQueueItem", "", "Ljava/lang/String;", "()Ljava/lang/String;", "", "MediaBrowserCompatMediaItem", "J", "", "I", "()I", "Z", "Lo/getConcatenatedUid;", "Lo/getConcatenatedUid;", "()Lo/getConcatenatedUid;", "onFastForward"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int onCommand;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final gc MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final wrapAsJsonMappingException<Throwable> AudioAttributesImplApi21Parcelizer;
    private final long MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final wrapAsJsonMappingException<Throwable> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final CctBackendFactory MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setInstallerPackageName AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final getConcatenatedUid onFastForward;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final wrapAsJsonMappingException<getChildIndexByPeriodIndex> RatingCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final CurrentQuery read;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final Executor IconCompatParcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final getNextWindowIndex write;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final wrapAsJsonMappingException<getChildIndexByPeriodIndex> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int onCustomAction;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Executor RemoteActionCompatParcelizer;

    public interface write {
        b AudioAttributesCompatParcelizer();
    }

    public b(read readVar) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        getPlatform getplatformMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        Executor executorIconCompatParcelizer = readVar.IconCompatParcelizer();
        if (executorIconCompatParcelizer == null) {
            executorIconCompatParcelizer = getplatformMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null ? ac.RemoteActionCompatParcelizer(getplatformMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) : null;
            if (executorIconCompatParcelizer == null) {
                executorIconCompatParcelizer = ac.write(false);
            }
        }
        this.RemoteActionCompatParcelizer = executorIconCompatParcelizer;
        this.read = getplatformMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null ? readVar.IconCompatParcelizer() != null ? getDegree.write(executorIconCompatParcelizer) : setMbbsVerificationYear.IconCompatParcelizer() : getplatformMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readVar.onAddQueueItem() == null;
        Executor executorOnAddQueueItem = readVar.onAddQueueItem();
        this.IconCompatParcelizer = executorOnAddQueueItem == null ? ac.write(true) : executorOnAddQueueItem;
        getNextChildIndex getnextchildindexAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
        this.AudioAttributesCompatParcelizer = getnextchildindexAudioAttributesCompatParcelizer == null ? new getNextChildIndex() : getnextchildindexAudioAttributesCompatParcelizer;
        ea eaVarOnCommand = readVar.onCommand();
        this.write = eaVarOnCommand == null ? ea.INSTANCE : eaVarOnCommand;
        onServiceConnected onserviceconnectedAudioAttributesImplApi21Parcelizer = readVar.AudioAttributesImplApi21Parcelizer();
        this.MediaBrowserCompatItemReceiver = onserviceconnectedAudioAttributesImplApi21Parcelizer == null ? onServiceConnected.INSTANCE : onserviceconnectedAudioAttributesImplApi21Parcelizer;
        getPeriod getperiodMediaBrowserCompatMediaItem = readVar.MediaBrowserCompatMediaItem();
        this.MediaBrowserCompatCustomActionResultReceiver = getperiodMediaBrowserCompatMediaItem == null ? new getPeriod() : getperiodMediaBrowserCompatMediaItem;
        this.MediaBrowserCompatSearchResultReceiver = readVar.AudioAttributesImplBaseParcelizer();
        this.MediaMetadataCompat = readVar.RatingCompat();
        this.onCommand = readVar.AudioAttributesImplApi26Parcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler = readVar.MediaMetadataCompat();
        this.AudioAttributesImplApi21Parcelizer = readVar.MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplBaseParcelizer = readVar.MediaDescriptionCompat();
        this.AudioAttributesImplApi26Parcelizer = readVar.onPlay();
        this.RatingCompat = readVar.onCustomAction();
        this.MediaDescriptionCompat = readVar.read();
        this.MediaBrowserCompatMediaItem = readVar.MediaBrowserCompatSearchResultReceiver();
        this.onCustomAction = readVar.RemoteActionCompatParcelizer();
        this.onAddQueueItem = readVar.MediaBrowserCompatCustomActionResultReceiver();
        getConcatenatedUid getconcatenateduidHandleMediaPlayPauseIfPendingOnHandler = readVar.handleMediaPlayPauseIfPendingOnHandler();
        this.onFastForward = getconcatenateduidHandleMediaPlayPauseIfPendingOnHandler == null ? ac.AudioAttributesCompatParcelizer() : getconcatenateduidHandleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Executor getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final CurrentQuery getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final Executor getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final setInstallerPackageName getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final getNextWindowIndex getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final gc getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final CctBackendFactory getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final wrapAsJsonMappingException<Throwable> write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final wrapAsJsonMappingException<Throwable> RatingCompat() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final wrapAsJsonMappingException<getChildIndexByPeriodIndex> onCommand() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final wrapAsJsonMappingException<getChildIndexByPeriodIndex> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final getConcatenatedUid getOnFastForward() {
        return this.onFastForward;
    }

    public static final class read {
        private Executor AudioAttributesCompatParcelizer;
        private gc AudioAttributesImplApi21Parcelizer;
        private setInstallerPackageName IconCompatParcelizer;
        private int MediaBrowserCompatSearchResultReceiver;
        private CurrentQuery MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private wrapAsJsonMappingException<Throwable> MediaDescriptionCompat;
        private Executor MediaMetadataCompat;
        private CctBackendFactory RatingCompat;
        private wrapAsJsonMappingException<Throwable> RemoteActionCompatParcelizer;
        private wrapAsJsonMappingException<getChildIndexByPeriodIndex> handleMediaPlayPauseIfPendingOnHandler;
        private wrapAsJsonMappingException<getChildIndexByPeriodIndex> onAddQueueItem;
        private getConcatenatedUid onCommand;
        private getNextWindowIndex onCustomAction;
        private String read;
        private long MediaBrowserCompatMediaItem = 600000;
        private int MediaBrowserCompatItemReceiver = 4;
        private int AudioAttributesImplBaseParcelizer = Integer.MAX_VALUE;
        private int MediaBrowserCompatCustomActionResultReceiver = 20;
        private int write = 8;
        private boolean AudioAttributesImplApi26Parcelizer = true;

        public final Executor IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final CurrentQuery MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final getNextWindowIndex onCommand() {
            return this.onCustomAction;
        }

        public final gc AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final Executor onAddQueueItem() {
            return this.MediaMetadataCompat;
        }

        public final setInstallerPackageName AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final CctBackendFactory MediaBrowserCompatMediaItem() {
            return this.RatingCompat;
        }

        public final wrapAsJsonMappingException<Throwable> MediaBrowserCompatItemReceiver() {
            return this.RemoteActionCompatParcelizer;
        }

        public final wrapAsJsonMappingException<Throwable> MediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        public final wrapAsJsonMappingException<getChildIndexByPeriodIndex> onPlay() {
            return this.onAddQueueItem;
        }

        public final wrapAsJsonMappingException<getChildIndexByPeriodIndex> onCustomAction() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final String read() {
            return this.read;
        }

        public final long MediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final int RatingCompat() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final int MediaMetadataCompat() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final getConcatenatedUid handleMediaPlayPauseIfPendingOnHandler() {
            return this.onCommand;
        }

        public final read IconCompatParcelizer(getNextWindowIndex getnextwindowindex) {
            toMagicModuleMetaRepoModel.write(getnextwindowindex, "");
            this.onCustomAction = getnextwindowindex;
            return this;
        }

        public final b write() {
            return new b(this);
        }
    }
}
