package com.marrow2.ui.main.viewmodel;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DataBufferRef;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.VerifyNewNumberRequest;
import kotlin.addApi;
import kotlin.getApiOptions;
import kotlin.getResolutionSize;
import kotlin.isConnectionFailedListenerRegistered;
import kotlin.maybeSignOut;
import kotlin.onDataRangeMoved;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0007\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\n\u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0007\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001a¢\u0006\u0004\b\n\u0010\u001bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u000f\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010$R$\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R\u001e\u0010(\u001a\u0004\u0018\u00010\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010.R\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010.R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR \u00100\u001a\b\u0012\u0004\u0012\u00020\u00150 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001e\u0010$"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "Lo/POJOPropertyBuilderWithMember;", "<init>", "()V", "Lo/addApi;", "p0", "", "write", "(Lo/addApi;)V", "", "RemoteActionCompatParcelizer", "(I)V", "Lo/isConnectionFailedListenerRegistered;", "(Lo/isConnectionFailedListenerRegistered;)V", "Lo/maybeSignOut;", "AudioAttributesCompatParcelizer", "(Lo/maybeSignOut;)V", "Lo/getApiOptions;", "(Lo/getApiOptions;)V", "", "(Z)V", "", "(F)V", "IconCompatParcelizer", "()Z", "MediaDescriptionCompat", "Lo/DataBufferRef;", "(Lo/DataBufferRef;)V", "Lo/getResolutionSize;", "Lo/onDataRangeMoved;", "read", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "AudioAttributesImplApi21Parcelizer", "Lo/setUpdatedStatus;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/setUpdatedStatus;", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplBaseParcelizer", "Lo/addApi;", "MediaBrowserCompatItemReceiver", "()Lo/addApi;", "RatingCompat", "Ljava/lang/Integer;", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/Integer;", "Z", "MediaMetadataCompat", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeSharedViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<onDataRangeMoved> AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getApiOptions> read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<getApiOptions> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<maybeSignOut> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private addApi MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Float> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private Integer MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<maybeSignOut> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<onDataRangeMoved> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Float> RatingCompat;

    @setSdkPayload
    public HomeSharedViewModel() {
        getResolutionSize<onDataRangeMoved> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(onDataRangeMoved.IconCompatParcelizer.INSTANCE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<getApiOptions> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(getApiOptions.RemoteActionCompatParcelizer);
        this.read = getresolutionsizeRemoteActionCompatParcelizer2;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        maybeSignOut.write writeVar = maybeSignOut.read;
        getResolutionSize<maybeSignOut> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(maybeSignOut.write.AudioAttributesCompatParcelizer());
        this.write = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        this.MediaBrowserCompatCustomActionResultReceiver = addApi.read;
        getResolutionSize<Float> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
    }

    public final setUpdatedStatus<onDataRangeMoved> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<getApiOptions> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<maybeSignOut> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final addApi getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final Integer getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Float> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private final void write(addApi p0) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == p0) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
    }

    private final void RemoteActionCompatParcelizer(int p0) {
        this.MediaBrowserCompatItemReceiver = Integer.valueOf(p0);
    }

    private final void write(isConnectionFailedListenerRegistered p0) {
        if (this.write.IconCompatParcelizer().getIconCompatParcelizer() == p0) {
            return;
        }
        getResolutionSize<maybeSignOut> getresolutionsize = this.write;
        maybeSignOut maybesignoutIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(maybeSignOut.AudioAttributesCompatParcelizer(p0, maybesignoutIconCompatParcelizer.RemoteActionCompatParcelizer, maybesignoutIconCompatParcelizer.AudioAttributesCompatParcelizer, maybesignoutIconCompatParcelizer.write));
    }

    private final void AudioAttributesCompatParcelizer(maybeSignOut p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer(), p0)) {
            return;
        }
        this.write.write(p0);
    }

    private final void write(getApiOptions p0) {
        this.read.write(p0);
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        this.AudioAttributesImplApi21Parcelizer = p0;
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        this.AudioAttributesImplApi26Parcelizer = p0;
    }

    private final void AudioAttributesCompatParcelizer(float p0) {
        if (this.RatingCompat.IconCompatParcelizer().floatValue() == p0) {
            return;
        }
        this.RatingCompat.write(Float.valueOf(p0));
    }

    private final void write(boolean p0) {
        this.MediaMetadataCompat.write(Boolean.valueOf(p0));
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(DataBufferRef p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof DataBufferRef.RemoteActionCompatParcelizer) {
            DataBufferRef.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (DataBufferRef.RemoteActionCompatParcelizer) p0;
            this.IconCompatParcelizer.write(new onDataRangeMoved.read(remoteActionCompatParcelizer.getRemoteActionCompatParcelizer(), remoteActionCompatParcelizer.getWrite(), remoteActionCompatParcelizer.write()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, DataBufferRef.IconCompatParcelizer.INSTANCE)) {
            this.IconCompatParcelizer.write(onDataRangeMoved.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, DataBufferRef.write.INSTANCE)) {
            this.IconCompatParcelizer.write(onDataRangeMoved.write.INSTANCE);
            return;
        }
        if (p0 instanceof DataBufferRef.AudioAttributesImplBaseParcelizer) {
            AudioAttributesCompatParcelizer(((DataBufferRef.AudioAttributesImplBaseParcelizer) p0).write());
            return;
        }
        if (p0 instanceof DataBufferRef.MediaBrowserCompatMediaItem) {
            write(((DataBufferRef.MediaBrowserCompatMediaItem) p0).AudioAttributesCompatParcelizer());
            return;
        }
        if (p0 instanceof DataBufferRef.MediaBrowserCompatSearchResultReceiver) {
            RemoteActionCompatParcelizer(((DataBufferRef.MediaBrowserCompatSearchResultReceiver) p0).RemoteActionCompatParcelizer());
            return;
        }
        if (p0 instanceof DataBufferRef.MediaMetadataCompat) {
            write(((DataBufferRef.MediaMetadataCompat) p0).AudioAttributesCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, DataBufferRef.read.INSTANCE)) {
            this.IconCompatParcelizer.write(onDataRangeMoved.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof DataBufferRef.MediaBrowserCompatItemReceiver) {
            AudioAttributesCompatParcelizer(((DataBufferRef.MediaBrowserCompatItemReceiver) p0).RemoteActionCompatParcelizer());
            return;
        }
        if (p0 instanceof DataBufferRef.AudioAttributesImplApi21Parcelizer) {
            RemoteActionCompatParcelizer(((DataBufferRef.AudioAttributesImplApi21Parcelizer) p0).write());
            return;
        }
        if (p0 instanceof DataBufferRef.MediaDescriptionCompat) {
            AudioAttributesCompatParcelizer(((DataBufferRef.MediaDescriptionCompat) p0).RemoteActionCompatParcelizer());
            return;
        }
        if (p0 instanceof DataBufferRef.MediaBrowserCompatCustomActionResultReceiver) {
            write(((DataBufferRef.MediaBrowserCompatCustomActionResultReceiver) p0).IconCompatParcelizer());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, DataBufferRef.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.IconCompatParcelizer.write(onDataRangeMoved.AudioAttributesCompatParcelizer.INSTANCE);
        } else {
            if (!(p0 instanceof DataBufferRef.AudioAttributesImplApi26Parcelizer)) {
                throw new RenewEligibleCreator();
            }
            write(((DataBufferRef.AudioAttributesImplApi26Parcelizer) p0).AudioAttributesCompatParcelizer());
        }
    }
}
