package com.marrow2.ui.qbank.lesson_list.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel;", "", "<init>", "()V", "Lesson", "AudioAttributesCompatParcelizer", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$AudioAttributesCompatParcelizer;", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$Lesson;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SealedLessonDetailsModel {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bá\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+R\u0017\u0010/\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010'R\u001a\u00102\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010'R\u0014\u0010.\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u0014\u0010,\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00108\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00105\u001a\u0004\b7\u0010!\"\u0004\b8\u00109R\u001a\u0010<\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010!R\u0014\u0010=\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010@\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b=\u0010!\"\u0004\b2\u00109R\"\u0010B\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u00105\u001a\u0004\b?\u0010!\"\u0004\b/\u00109R\u001a\u0010;\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010DR\u001a\u00101\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010>\u001a\u0004\b4\u0010DR\u001a\u0010E\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bE\u0010'R\u001a\u00107\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\b,\u0010GR\u001a\u0010?\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010>\u001a\u0004\bH\u0010DR\u001a\u0010H\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\b/\u0010'R\u001c\u00100\u001a\u00020\u00038\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b<\u0010'R\u001a\u0010C\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\b@\u0010!R\u001a\u00103\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010F\u001a\u0004\bB\u0010GR\u0014\u0010:\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001a\u00104\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010I\u001a\u0004\b8\u0010JR\u001a\u0010K\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b3\u0010DR\u001a\u00106\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b2\u0010!"}, d2 = {"Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$Lesson;", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "", "p19", "p20", "p21", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZIIZZLjava/lang/String;FZLjava/lang/String;Ljava/lang/String;IFFJZI)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "read", "onAddQueueItem", "MediaBrowserCompatMediaItem", "IconCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCustomAction", "I", "onPlayFromMediaId", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesCompatParcelizer", "(I)V", "onCommand", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Z", "MediaDescriptionCompat", "AudioAttributesImplApi21Parcelizer", "onMediaButtonEvent", "AudioAttributesImplApi26Parcelizer", "handleMediaPlayPauseIfPendingOnHandler", "()Z", "RatingCompat", "F", "()F", "MediaMetadataCompat", "J", "()J", "onPause"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Lesson extends SealedLessonDetailsModel implements Parcelable {
        public static final Parcelable.Creator<Lesson> CREATOR = new RemoteActionCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final boolean MediaDescriptionCompat;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final String MediaMetadataCompat;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final boolean AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final boolean onPause;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int onPlayFromMediaId;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final boolean MediaBrowserCompatMediaItem;
        private final boolean MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private final float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private String onAddQueueItem;

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private int AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private final float onCommand;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private final int handleMediaPlayPauseIfPendingOnHandler;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final long onCustomAction;

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
        private final String RatingCompat;

        /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private final int MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
        private int AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final float MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String read;

        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<Lesson> {
            private static Lesson read(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new Lesson(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readFloat(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Lesson createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            private static Lesson[] write(int i) {
                return new Lesson[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Lesson[] newArray(int i) {
                return write(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lesson(String str, String str2, String str3, int i, int i2, int i3, boolean z, int i4, int i5, boolean z2, boolean z3, String str4, float f, boolean z4, String str5, String str6, int i6, float f2, float f3, long j, boolean z5, int i7) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            toMagicModuleMetaRepoModel.write(str6, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = str3;
            this.write = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.MediaBrowserCompatCustomActionResultReceiver = i3;
            this.MediaBrowserCompatItemReceiver = z;
            this.AudioAttributesImplApi21Parcelizer = i4;
            this.AudioAttributesImplApi26Parcelizer = i5;
            this.AudioAttributesImplBaseParcelizer = z2;
            this.MediaBrowserCompatMediaItem = z3;
            this.RatingCompat = str4;
            this.MediaBrowserCompatSearchResultReceiver = f;
            this.MediaDescriptionCompat = z4;
            this.MediaMetadataCompat = str5;
            this.onAddQueueItem = str6;
            this.handleMediaPlayPauseIfPendingOnHandler = i6;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f2;
            this.onCommand = f3;
            this.onCustomAction = j;
            this.onPause = z5;
            this.onPlayFromMediaId = i7;
        }

        public /* synthetic */ Lesson(String str, String str2, String str3, int i, int i2, int i3, boolean z, int i4, int i5, boolean z2, boolean z3, String str4, float f, boolean z4, String str5, String str6, int i6, float f2, float f3, long j, boolean z5, int i7, int i8, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? 0 : i, (i8 & 16) != 0 ? 0 : i2, (i8 & 32) != 0 ? 0 : i3, (i8 & 64) != 0 ? false : z, (i8 & 128) != 0 ? 0 : i4, (i8 & 256) != 0 ? 0 : i5, (i8 & 512) != 0 ? false : z2, (i8 & 1024) != 0 ? false : z3, (i8 & 2048) != 0 ? "" : str4, (i8 & 4096) != 0 ? 0.0f : f, (i8 & 8192) != 0 ? false : z4, (i8 & 16384) != 0 ? "" : str5, (32768 & i8) != 0 ? "" : str6, (65536 & i8) != 0 ? 0 : i6, (131072 & i8) != 0 ? 0.0f : f2, (262144 & i8) != 0 ? 0.0f : f3, (524288 & i8) != 0 ? 0L : j, (i8 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z5, i7);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final int getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final void IconCompatParcelizer(int i) {
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final int getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
        public final int getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final void read(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
        public final boolean getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        /* JADX INFO: renamed from: onCustomAction, reason: from getter */
        public final boolean getMediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatMediaItem;
        }

        /* JADX INFO: renamed from: RatingCompat, reason: from getter */
        public final String getRatingCompat() {
            return this.RatingCompat;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final float getMediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
        public final boolean getMediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getMediaMetadataCompat() {
            return this.MediaMetadataCompat;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final String getOnAddQueueItem() {
            return this.onAddQueueItem;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final int getHandleMediaPlayPauseIfPendingOnHandler() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final float getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final long getOnCustomAction() {
            return this.onCustomAction;
        }

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
        public final boolean getOnPause() {
            return this.onPause;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getOnPlayFromMediaId() {
            return this.onPlayFromMediaId;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Lesson)) {
                return false;
            }
            Lesson lesson = (Lesson) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) lesson.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) lesson.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) lesson.RemoteActionCompatParcelizer) && this.write == lesson.write && this.AudioAttributesCompatParcelizer == lesson.AudioAttributesCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == lesson.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == lesson.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == lesson.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == lesson.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplBaseParcelizer == lesson.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatMediaItem == lesson.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) lesson.RatingCompat) && Float.compare(this.MediaBrowserCompatSearchResultReceiver, lesson.MediaBrowserCompatSearchResultReceiver) == 0 && this.MediaDescriptionCompat == lesson.MediaDescriptionCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) lesson.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) lesson.onAddQueueItem) && this.handleMediaPlayPauseIfPendingOnHandler == lesson.handleMediaPlayPauseIfPendingOnHandler && Float.compare(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, lesson.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) == 0 && Float.compare(this.onCommand, lesson.onCommand) == 0 && this.onCustomAction == lesson.onCustomAction && this.onPause == lesson.onPause && this.onPlayFromMediaId == lesson.onPlayFromMediaId;
        }

        public final int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + this.RatingCompat.hashCode()) * 31) + Float.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Boolean.hashCode(this.MediaDescriptionCompat)) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.onAddQueueItem.hashCode()) * 31) + Integer.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Float.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) * 31) + Float.hashCode(this.onCommand)) * 31) + Long.hashCode(this.onCustomAction)) * 31) + Boolean.hashCode(this.onPause)) * 31) + Integer.hashCode(this.onPlayFromMediaId);
        }

        public final String toString() {
            String str = this.read;
            String str2 = this.IconCompatParcelizer;
            String str3 = this.RemoteActionCompatParcelizer;
            int i = this.write;
            int i2 = this.AudioAttributesCompatParcelizer;
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
            boolean z = this.MediaBrowserCompatItemReceiver;
            int i4 = this.AudioAttributesImplApi21Parcelizer;
            int i5 = this.AudioAttributesImplApi26Parcelizer;
            boolean z2 = this.AudioAttributesImplBaseParcelizer;
            boolean z3 = this.MediaBrowserCompatMediaItem;
            String str4 = this.RatingCompat;
            float f = this.MediaBrowserCompatSearchResultReceiver;
            boolean z4 = this.MediaDescriptionCompat;
            String str5 = this.MediaMetadataCompat;
            String str6 = this.onAddQueueItem;
            int i6 = this.handleMediaPlayPauseIfPendingOnHandler;
            float f2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            float f3 = this.onCommand;
            long j = this.onCustomAction;
            boolean z5 = this.onPause;
            int i7 = this.onPlayFromMediaId;
            StringBuilder sb = new StringBuilder("Lesson(read=");
            sb.append(str);
            sb.append(", IconCompatParcelizer=");
            sb.append(str2);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(str3);
            sb.append(", write=");
            sb.append(i);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(i2);
            sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
            sb.append(i3);
            sb.append(", MediaBrowserCompatItemReceiver=");
            sb.append(z);
            sb.append(", AudioAttributesImplApi21Parcelizer=");
            sb.append(i4);
            sb.append(", AudioAttributesImplApi26Parcelizer=");
            sb.append(i5);
            sb.append(", AudioAttributesImplBaseParcelizer=");
            sb.append(z2);
            sb.append(", MediaBrowserCompatMediaItem=");
            sb.append(z3);
            sb.append(", RatingCompat=");
            sb.append(str4);
            sb.append(", MediaBrowserCompatSearchResultReceiver=");
            sb.append(f);
            sb.append(", MediaDescriptionCompat=");
            sb.append(z4);
            sb.append(", MediaMetadataCompat=");
            sb.append(str5);
            sb.append(", onAddQueueItem=");
            sb.append(str6);
            sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
            sb.append(i6);
            sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
            sb.append(f2);
            sb.append(", onCommand=");
            sb.append(f3);
            sb.append(", onCustomAction=");
            sb.append(j);
            sb.append(", onPause=");
            sb.append(z5);
            sb.append(", onPlayFromMediaId=");
            sb.append(i7);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeString(this.read);
            p0.writeString(this.IconCompatParcelizer);
            p0.writeString(this.RemoteActionCompatParcelizer);
            p0.writeInt(this.write);
            p0.writeInt(this.AudioAttributesCompatParcelizer);
            p0.writeInt(this.MediaBrowserCompatCustomActionResultReceiver);
            p0.writeInt(this.MediaBrowserCompatItemReceiver ? 1 : 0);
            p0.writeInt(this.AudioAttributesImplApi21Parcelizer);
            p0.writeInt(this.AudioAttributesImplApi26Parcelizer);
            p0.writeInt(this.AudioAttributesImplBaseParcelizer ? 1 : 0);
            p0.writeInt(this.MediaBrowserCompatMediaItem ? 1 : 0);
            p0.writeString(this.RatingCompat);
            p0.writeFloat(this.MediaBrowserCompatSearchResultReceiver);
            p0.writeInt(this.MediaDescriptionCompat ? 1 : 0);
            p0.writeString(this.MediaMetadataCompat);
            p0.writeString(this.onAddQueueItem);
            p0.writeInt(this.handleMediaPlayPauseIfPendingOnHandler);
            p0.writeFloat(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            p0.writeFloat(this.onCommand);
            p0.writeLong(this.onCustomAction);
            p0.writeInt(this.onPause ? 1 : 0);
            p0.writeInt(this.onPlayFromMediaId);
        }
    }

    private SealedLessonDetailsModel() {
    }

    public /* synthetic */ SealedLessonDetailsModel(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0011\u0010\u0018"}, d2 = {"Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$AudioAttributesCompatParcelizer;", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel;", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "I", "(I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer extends SealedLessonDetailsModel {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String read;
        private int RemoteActionCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str, String str2, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.read = str2;
            this.RemoteActionCompatParcelizer = i;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(String str, String str2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void write(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public AudioAttributesCompatParcelizer() {
            this(null, null, 0, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) audioAttributesCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesCompatParcelizer.read) && this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            String str = this.write;
            String str2 = this.read;
            int i = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(write=");
            sb.append(str);
            sb.append(", read=");
            sb.append(str2);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }
}
