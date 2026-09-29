package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lo/component5;", "", "<init>", "()V", "write", "MediaMetadataCompat", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "onCustomAction", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatMediaItem", "onCommand", "read", "onAddQueueItem", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/component5$read;", "Lo/component5$AudioAttributesCompatParcelizer;", "Lo/component5$RemoteActionCompatParcelizer;", "Lo/component5$IconCompatParcelizer;", "Lo/component5$write;", "Lo/component5$MediaBrowserCompatItemReceiver;", "Lo/component5$AudioAttributesImplApi26Parcelizer;", "Lo/component5$AudioAttributesImplApi21Parcelizer;", "Lo/component5$MediaBrowserCompatCustomActionResultReceiver;", "Lo/component5$AudioAttributesImplBaseParcelizer;", "Lo/component5$MediaBrowserCompatSearchResultReceiver;", "Lo/component5$RatingCompat;", "Lo/component5$MediaDescriptionCompat;", "Lo/component5$MediaMetadataCompat;", "Lo/component5$MediaBrowserCompatMediaItem;", "Lo/component5$handleMediaPlayPauseIfPendingOnHandler;", "Lo/component5$onCustomAction;", "Lo/component5$onCommand;", "Lo/component5$onAddQueueItem;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class component5 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$write;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends component5 {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private component5() {
    }

    public static final class MediaMetadataCompat extends component5 {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) ((MediaMetadataCompat) obj).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnSubjectClick(subjectId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ component5(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class handleMediaPlayPauseIfPendingOnHandler extends component5 {
        private final getLastUpdatedTimeMs IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public handleMediaPlayPauseIfPendingOnHandler(getLastUpdatedTimeMs getlastupdatedtimems) {
            super(null);
            toMagicModuleMetaRepoModel.write(getlastupdatedtimems, "");
            this.IconCompatParcelizer = getlastupdatedtimems;
        }

        public final getLastUpdatedTimeMs IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof handleMediaPlayPauseIfPendingOnHandler) && this.IconCompatParcelizer == ((handleMediaPlayPauseIfPendingOnHandler) obj).IconCompatParcelizer;
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            getLastUpdatedTimeMs getlastupdatedtimems = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnTabSelected(tab=");
            sb.append(getlastupdatedtimems);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends component5 {
        private final getLastDbVersion AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str, getLastDbVersion getlastdbversion) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getlastdbversion, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = getlastdbversion;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final getLastDbVersion read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplApi21Parcelizer)) {
                return false;
            }
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) audioAttributesImplApi21Parcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            getLastDbVersion getlastdbversion = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("OnLessonVideoClick(subjectTitle=");
            sb.append(str);
            sb.append(", revisionVideoLesson=");
            sb.append(getlastdbversion);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$RemoteActionCompatParcelizer;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends component5 {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$IconCompatParcelizer;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends component5 {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends component5 {
        private final component4 read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(component4 component4Var) {
            super(null);
            toMagicModuleMetaRepoModel.write(component4Var, "");
            this.read = component4Var;
        }

        public final component4 write() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((MediaBrowserCompatItemReceiver) obj).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            component4 component4Var = this.read;
            StringBuilder sb = new StringBuilder("OnIndexSelected(index=");
            sb.append(component4Var);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$onCustomAction;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onCustomAction extends component5 {
        public static final onCustomAction INSTANCE = new onCustomAction();

        private onCustomAction() {
            super(null);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends component5 {
        private final int AudioAttributesCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(int i, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = i;
            this.write = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplBaseParcelizer)) {
                return false;
            }
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) obj;
            return this.AudioAttributesCompatParcelizer == audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) audioAttributesImplBaseParcelizer.write);
        }

        public final int hashCode() {
            return (Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + this.write.hashCode();
        }

        public final String toString() {
            int i = this.AudioAttributesCompatParcelizer;
            String str = this.write;
            StringBuilder sb = new StringBuilder("OnMarkCompleteEventReceived(completionStatus=");
            sb.append(i);
            sb.append(", lessonId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class MediaBrowserCompatMediaItem extends component5 {
        private final String IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$onCommand;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onCommand extends component5 {
        public static final onCommand INSTANCE = new onCommand();

        private onCommand() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$read;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends component5 {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$onAddQueueItem;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onAddQueueItem extends component5 {
        public static final onAddQueueItem INSTANCE = new onAddQueueItem();

        private onAddQueueItem() {
            super(null);
        }
    }

    public static final class MediaDescriptionCompat extends component5 {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$AudioAttributesCompatParcelizer;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends component5 {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends component5 {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatCustomActionResultReceiver)) {
                return false;
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) mediaBrowserCompatCustomActionResultReceiver.write);
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.write;
            StringBuilder sb = new StringBuilder("OnLinkedSubjectClick(subjectId=");
            sb.append(str);
            sb.append(", subjectName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/component5$RatingCompat;", "Lo/component5;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RatingCompat extends component5 {
        public static final RatingCompat INSTANCE = new RatingCompat();

        private RatingCompat() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/component5$AudioAttributesImplApi26Parcelizer;", "Lo/component5;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesImplApi26Parcelizer extends component5 {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        public final int hashCode() {
            return 774468519;
        }

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesImplApi26Parcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesImplApi26Parcelizer";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/component5$MediaBrowserCompatSearchResultReceiver;", "Lo/component5;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompatSearchResultReceiver extends component5 {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        public final int hashCode() {
            return -1961373287;
        }

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompatSearchResultReceiver)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "MediaBrowserCompatSearchResultReceiver";
        }
    }
}
