package com.marrow2.domain.custom_module.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.marrow.data.models.custommodule.CustomModule;
import com.marrow2.data.custom_module.remote.model.FilterParams;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.readExactly;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aB\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003JÇ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u000bHÆ\u0001J\u0006\u0010E\u001a\u00020\bJ\u0013\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020\bHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\u0016\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0016\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010*R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%¨\u0006P"}, d2 = {"Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "Landroid/os/Parcelable;", "id", "", "params", "Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "responseParams", "status", "", "taskStatus", "createdOn", "", "submittedOn", "inviteCode", "moduleOwner", "isExpired", "", "testName", "moduleMessage", "mcqCount", "expiredOn", "startDateTime", "isFacultyMode", "examDurationSeconds", "userInitiatedExamStartedOn", "<init>", "(Ljava/lang/String;Lcom/marrow2/data/custom_module/remote/model/FilterParams;Lcom/marrow2/data/custom_module/remote/model/FilterParams;IIJJLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IJJZIJ)V", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getParams", "()Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "getResponseParams", "getStatus", "()I", "getTaskStatus", "getCreatedOn", "()J", "getSubmittedOn", "getInviteCode", "setInviteCode", "getModuleOwner", "()Z", "getTestName", "getModuleMessage", "getMcqCount", "getExpiredOn", "getStartDateTime", "getExamDurationSeconds", "getUserInitiatedExamStartedOn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomModuleUCModel implements Parcelable {
    public static final Parcelable.Creator<CustomModuleUCModel> CREATOR = new RemoteActionCompatParcelizer();
    private String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final FilterParams MediaBrowserCompatSearchResultReceiver;
    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final FilterParams MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final long RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final int onAddQueueItem;
    private final String read;
    private final long write;

    public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<CustomModuleUCModel> {
        private static CustomModuleUCModel read(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new CustomModuleUCModel(parcel.readString(), FilterParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FilterParams.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomModuleUCModel createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        private static CustomModuleUCModel[] RemoteActionCompatParcelizer(int i) {
            return new CustomModuleUCModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomModuleUCModel[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CustomModuleUCModel(String str, FilterParams filterParams, FilterParams filterParams2, int i, int i2, long j, long j2, String str2, String str3, boolean z, String str4, String str5, int i3, long j3, long j4, boolean z2, int i4, long j5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(filterParams, "");
        this.read = str;
        this.MediaBrowserCompatSearchResultReceiver = filterParams;
        this.MediaDescriptionCompat = filterParams2;
        this.MediaBrowserCompatMediaItem = i;
        this.onAddQueueItem = i2;
        this.write = j;
        this.RatingCompat = j2;
        this.AudioAttributesCompatParcelizer = str2;
        this.AudioAttributesImplApi21Parcelizer = str3;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.handleMediaPlayPauseIfPendingOnHandler = str4;
        this.MediaBrowserCompatItemReceiver = str5;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.IconCompatParcelizer = j3;
        this.MediaMetadataCompat = j4;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.RemoteActionCompatParcelizer = i4;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j5;
    }

    public /* synthetic */ CustomModuleUCModel(String str, FilterParams filterParams, FilterParams filterParams2, int i, int i2, long j, long j2, String str2, String str3, boolean z, String str4, String str5, int i3, long j3, long j4, boolean z2, int i4, long j5, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? new FilterParams(false, 0, 0, false, null, null, null, null, null, null, null, false, UnixStat.PERM_MASK, null) : filterParams, (i5 & 4) != 0 ? null : filterParams2, (i5 & 8) != 0 ? readExactly.write.getRemoteActionCompatParcelizer() : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0L : j, (i5 & 64) != 0 ? 0L : j2, (i5 & 128) != 0 ? null : str2, (i5 & 256) != 0 ? CustomModule.DEFAULT_MODULE_OWNER : str3, (i5 & 512) != 0 ? false : z, (i5 & 1024) != 0 ? null : str4, (i5 & 2048) != 0 ? null : str5, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? 0L : j3, (i5 & 16384) != 0 ? 0L : j4, (32768 & i5) != 0 ? false : z2, (i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : i4, (i5 & 131072) != 0 ? 0L : j5);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final FilterParams getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final FilterParams getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final long getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final long getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final long getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public CustomModuleUCModel(String str) {
        this(null, null, null, 0, 0, 0L, 0L, null, null, false, null, null, 0, 0L, 0L, false, 0, 0L, 262143, null);
        this.AudioAttributesCompatParcelizer = str;
    }

    public CustomModuleUCModel() {
        this(null, null, null, 0, 0, 0L, 0L, null, null, false, null, null, 0, 0L, 0L, false, 0, 0L, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CustomModuleUCModel IconCompatParcelizer(String str, FilterParams filterParams, FilterParams filterParams2, int i, int i2, long j, long j2, String str2, String str3, boolean z, String str4, String str5, int i3, long j3, long j4, boolean z2, int i4, long j5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(filterParams, "");
        return new CustomModuleUCModel(str, filterParams, filterParams2, 1, i2, j, j2, str2, str3, z, str4, str5, i3, j3, j4, z2, i4, j5);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleUCModel)) {
            return false;
        }
        CustomModuleUCModel customModuleUCModel = (CustomModuleUCModel) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) customModuleUCModel.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, customModuleUCModel.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, customModuleUCModel.MediaDescriptionCompat) && this.MediaBrowserCompatMediaItem == customModuleUCModel.MediaBrowserCompatMediaItem && this.onAddQueueItem == customModuleUCModel.onAddQueueItem && this.write == customModuleUCModel.write && this.RatingCompat == customModuleUCModel.RatingCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) customModuleUCModel.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) customModuleUCModel.AudioAttributesImplApi21Parcelizer) && this.AudioAttributesImplApi26Parcelizer == customModuleUCModel.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) customModuleUCModel.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) customModuleUCModel.MediaBrowserCompatItemReceiver) && this.MediaBrowserCompatCustomActionResultReceiver == customModuleUCModel.MediaBrowserCompatCustomActionResultReceiver && this.IconCompatParcelizer == customModuleUCModel.IconCompatParcelizer && this.MediaMetadataCompat == customModuleUCModel.MediaMetadataCompat && this.AudioAttributesImplBaseParcelizer == customModuleUCModel.AudioAttributesImplBaseParcelizer && this.RemoteActionCompatParcelizer == customModuleUCModel.RemoteActionCompatParcelizer && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == customModuleUCModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        FilterParams filterParams = this.MediaDescriptionCompat;
        int iHashCode3 = filterParams == null ? 0 : filterParams.hashCode();
        int iHashCode4 = Integer.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode5 = Integer.hashCode(this.onAddQueueItem);
        int iHashCode6 = Long.hashCode(this.write);
        int iHashCode7 = Long.hashCode(this.RatingCompat);
        String str = this.AudioAttributesCompatParcelizer;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        String str3 = this.handleMediaPlayPauseIfPendingOnHandler;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaBrowserCompatItemReceiver;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.MediaMetadataCompat)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final String toString() {
        String str = this.read;
        FilterParams filterParams = this.MediaBrowserCompatSearchResultReceiver;
        FilterParams filterParams2 = this.MediaDescriptionCompat;
        int i = this.MediaBrowserCompatMediaItem;
        int i2 = this.onAddQueueItem;
        long j = this.write;
        long j2 = this.RatingCompat;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.AudioAttributesImplApi21Parcelizer;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        String str4 = this.handleMediaPlayPauseIfPendingOnHandler;
        String str5 = this.MediaBrowserCompatItemReceiver;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        long j3 = this.IconCompatParcelizer;
        long j4 = this.MediaMetadataCompat;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        int i4 = this.RemoteActionCompatParcelizer;
        long j5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        StringBuilder sb = new StringBuilder("CustomModuleUCModel(id=");
        sb.append(str);
        sb.append(", params=");
        sb.append(filterParams);
        sb.append(", responseParams=");
        sb.append(filterParams2);
        sb.append(", status=");
        sb.append(i);
        sb.append(", taskStatus=");
        sb.append(i2);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(", submittedOn=");
        sb.append(j2);
        sb.append(", inviteCode=");
        sb.append(str2);
        sb.append(", moduleOwner=");
        sb.append(str3);
        sb.append(", isExpired=");
        sb.append(z);
        sb.append(", testName=");
        sb.append(str4);
        sb.append(", moduleMessage=");
        sb.append(str5);
        sb.append(", mcqCount=");
        sb.append(i3);
        sb.append(", expiredOn=");
        sb.append(j3);
        sb.append(", startDateTime=");
        sb.append(j4);
        sb.append(", isFacultyMode=");
        sb.append(z2);
        sb.append(", examDurationSeconds=");
        sb.append(i4);
        sb.append(", userInitiatedExamStartedOn=");
        sb.append(j5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        toMagicModuleMetaRepoModel.write(dest, "");
        dest.writeString(this.read);
        this.MediaBrowserCompatSearchResultReceiver.writeToParcel(dest, flags);
        FilterParams filterParams = this.MediaDescriptionCompat;
        if (filterParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            filterParams.writeToParcel(dest, flags);
        }
        dest.writeInt(this.MediaBrowserCompatMediaItem);
        dest.writeInt(this.onAddQueueItem);
        dest.writeLong(this.write);
        dest.writeLong(this.RatingCompat);
        dest.writeString(this.AudioAttributesCompatParcelizer);
        dest.writeString(this.AudioAttributesImplApi21Parcelizer);
        dest.writeInt(this.AudioAttributesImplApi26Parcelizer ? 1 : 0);
        dest.writeString(this.handleMediaPlayPauseIfPendingOnHandler);
        dest.writeString(this.MediaBrowserCompatItemReceiver);
        dest.writeInt(this.MediaBrowserCompatCustomActionResultReceiver);
        dest.writeLong(this.IconCompatParcelizer);
        dest.writeLong(this.MediaMetadataCompat);
        dest.writeInt(this.AudioAttributesImplBaseParcelizer ? 1 : 0);
        dest.writeInt(this.RemoteActionCompatParcelizer);
        dest.writeLong(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }
}
