package com.marrow2.ui.settings.kyc.upload;

import android.net.Uri;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow2.ui.settings.kyc.upload.KycImageUploadViewModel;
import java.util.UUID;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.GoogleMapOnMyLocationButtonClickListener;
import kotlin.GoogleMapOnMyLocationChangeListener;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.minZoomPreference;
import kotlin.rotateGesturesEnabled;
import kotlin.scrollGesturesEnabled;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.skipShortTermReferencePictureSets;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.unescapeStream;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\n\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\n\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001c0 8\u0007¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\u000f\u0010\"R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020#0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020#0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\u001f\u0010\"R\u0016\u0010\u0014\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%"}, d2 = {"Lcom/marrow2/ui/settings/kyc/upload/KycImageUploadViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/skipShortTermReferencePictureSets;", "p1", "<init>", "(Lo/POJOPropertyBuilder5;Lo/skipShortTermReferencePictureSets;)V", "Lo/GoogleMapOnMyLocationChangeListener;", "", "AudioAttributesCompatParcelizer", "(Lo/GoogleMapOnMyLocationChangeListener;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "Landroid/net/Uri;", "read", "(Landroid/net/Uri;)V", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "", "()Z", "RemoteActionCompatParcelizer", "Lo/skipShortTermReferencePictureSets;", "", "Ljava/lang/String;", "Lo/getResolutionSize;", "Lo/rotateGesturesEnabled;", "write", "Lo/getResolutionSize;", "IconCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/scrollGesturesEnabled;", "Lo/GoogleMapOnMyLocationButtonClickListener;", "Lo/GoogleMapOnMyLocationButtonClickListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycImageUploadViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<scrollGesturesEnabled> write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<rotateGesturesEnabled> AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<scrollGesturesEnabled> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final skipShortTermReferencePictureSets read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private GoogleMapOnMyLocationButtonClickListener AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<rotateGesturesEnabled> IconCompatParcelizer;

    @setSdkPayload
    public KycImageUploadViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, skipShortTermReferencePictureSets skipshorttermreferencepicturesets) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(skipshorttermreferencepicturesets, "");
        this.read = skipshorttermreferencepicturesets;
        String string = UUID.randomUUID().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.RemoteActionCompatParcelizer = string;
        getResolutionSize<rotateGesturesEnabled> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new rotateGesturesEnabled(false, false, null, 0, null, null, null, null, null, 0, null, 2047, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<scrollGesturesEnabled> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(scrollGesturesEnabled.read.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        this.AudioAttributesImplBaseParcelizer = GoogleMapOnMyLocationButtonClickListener.IconCompatParcelizer;
        String str = (String) pOJOPropertyBuilder5.write("doc_type_title");
        String str2 = str == null ? "" : str;
        Integer num = (Integer) pOJOPropertyBuilder5.write("doc_type");
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = (Integer) pOJOPropertyBuilder5.write(LoggedUserResponse.KEY_KYC_STATUS);
        getresolutionsizeRemoteActionCompatParcelizer.write(new rotateGesturesEnabled(false, false, str2, iIntValue, null, null, null, null, null, num2 != null ? num2.intValue() : 1, null, 1523, null));
    }

    public final setUpdatedStatus<rotateGesturesEnabled> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<scrollGesturesEnabled> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void AudioAttributesCompatParcelizer(GoogleMapOnMyLocationChangeListener p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            this.AudioAttributesImplBaseParcelizer = GoogleMapOnMyLocationButtonClickListener.IconCompatParcelizer;
            getResolutionSize<rotateGesturesEnabled> getresolutionsize = this.IconCompatParcelizer;
            rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplBaseParcelizer : true, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.read.INSTANCE)) {
            this.AudioAttributesImplBaseParcelizer = GoogleMapOnMyLocationButtonClickListener.RemoteActionCompatParcelizer;
            getResolutionSize<rotateGesturesEnabled> getresolutionsize2 = this.IconCompatParcelizer;
            rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : true, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer2.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer2.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer2.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer2.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : null));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            this.write.write(scrollGesturesEnabled.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.RatingCompat.INSTANCE)) {
            this.write.write(scrollGesturesEnabled.write.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            this.write.write(scrollGesturesEnabled.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof GoogleMapOnMyLocationChangeListener.MediaMetadataCompat) {
            read(((GoogleMapOnMyLocationChangeListener.MediaMetadataCompat) p0).RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.write.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.onCommand.INSTANCE)) {
            this.write.write(scrollGesturesEnabled.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.MediaBrowserCompatMediaItem.INSTANCE)) {
            if (AudioAttributesCompatParcelizer()) {
                getResolutionSize<rotateGesturesEnabled> getresolutionsize3 = this.IconCompatParcelizer;
                rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
                getresolutionsize3.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer3.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer3.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer3.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer3.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer3.IconCompatParcelizer : this.IconCompatParcelizer.IconCompatParcelizer().getMediaBrowserCompatSearchResultReceiver(), (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer3.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer3.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer3.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer3.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : minZoomPreference.RemoteActionCompatParcelizer));
                return;
            } else {
                getResolutionSize<rotateGesturesEnabled> getresolutionsize4 = this.IconCompatParcelizer;
                rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer4 = getresolutionsize4.IconCompatParcelizer();
                getresolutionsize4.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer4.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer4.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer4.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer4.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer4.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer4.RemoteActionCompatParcelizer : this.IconCompatParcelizer.IconCompatParcelizer().getMediaBrowserCompatSearchResultReceiver(), (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer4.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer4.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer4.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer4.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver : minZoomPreference.RemoteActionCompatParcelizer));
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.AudioAttributesCompatParcelizer.INSTANCE)) {
            getResolutionSize<rotateGesturesEnabled> getresolutionsize5 = this.IconCompatParcelizer;
            rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer5 = getresolutionsize5.IconCompatParcelizer();
            getresolutionsize5.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer5.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer5.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer5.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer5.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer5.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer5.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer5.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer5.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer5.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer5.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer5.MediaBrowserCompatCustomActionResultReceiver : null));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.IconCompatParcelizer.INSTANCE)) {
            this.write.write(scrollGesturesEnabled.read.INSTANCE);
            return;
        }
        if (p0 instanceof GoogleMapOnMyLocationChangeListener.MediaBrowserCompatItemReceiver) {
            getResolutionSize<rotateGesturesEnabled> getresolutionsize6 = this.IconCompatParcelizer;
            rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer6 = getresolutionsize6.IconCompatParcelizer();
            getresolutionsize6.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer6.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer6.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer6.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer6.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer6.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer6.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer6.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer6.AudioAttributesImplApi21Parcelizer : ((GoogleMapOnMyLocationChangeListener.MediaBrowserCompatItemReceiver) p0).write(), (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer6.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer6.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer6.MediaBrowserCompatCustomActionResultReceiver : null));
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.RemoteActionCompatParcelizer.INSTANCE)) {
            getResolutionSize<rotateGesturesEnabled> getresolutionsize7 = this.IconCompatParcelizer;
            rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer7 = getresolutionsize7.IconCompatParcelizer();
            getresolutionsize7.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer7.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer7.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer7.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer7.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer7.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer7.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer7.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer7.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer7.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer7.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer7.MediaBrowserCompatCustomActionResultReceiver : null));
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleMapOnMyLocationChangeListener.MediaDescriptionCompat.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer().getIconCompatParcelizer(), Uri.EMPTY) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer(), Uri.EMPTY)) {
            return;
        }
        getResolutionSize<rotateGesturesEnabled> getresolutionsize = this.IconCompatParcelizer;
        rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatItemReceiver : true, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null));
    }

    private final void read(Uri p0) {
        String str;
        if (AudioAttributesCompatParcelizer()) {
            str = "Front";
        } else {
            str = "Back";
        }
        String write2 = this.IconCompatParcelizer.IconCompatParcelizer().getWrite();
        StringBuilder sb = new StringBuilder();
        sb.append(write2);
        sb.append(" - ");
        sb.append(str);
        String string = sb.toString();
        getResolutionSize<rotateGesturesEnabled> getresolutionsize = this.IconCompatParcelizer;
        rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : p0, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer.read : string, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : minZoomPreference.IconCompatParcelizer));
        this.write.write(scrollGesturesEnabled.read.INSTANCE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.getZoomGesturesEnabled
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return KycImageUploadViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Uri IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                skipShortTermReferencePictureSets skipshorttermreferencepicturesets = KycImageUploadViewModel.this.read;
                long jCurrentTimeMillis = System.currentTimeMillis();
                String string = this.IconCompatParcelizer.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                this.write = 1;
                if (skipshorttermreferencepicturesets.IconCompatParcelizer(new unescapeStream(false, 1, jCurrentTimeMillis, string, KycImageUploadViewModel.this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer(), KycImageUploadViewModel.this.RemoteActionCompatParcelizer, ((rotateGesturesEnabled) KycImageUploadViewModel.this.IconCompatParcelizer.IconCompatParcelizer()).getAudioAttributesCompatParcelizer()), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(Uri uri, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = uri;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return KycImageUploadViewModel.this.new write(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (KycImageUploadViewModel.this.read.AudioAttributesCompatParcelizer(GoogleMapOnMyLocationButtonClickListener.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return KycImageUploadViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        getResolutionSize<rotateGesturesEnabled> getresolutionsize = this.IconCompatParcelizer;
        rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        Uri uri = Uri.EMPTY;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        getresolutionsize.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer.RemoteActionCompatParcelizer : uri, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.latLngBoundsForCameraTarget
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return KycImageUploadViewModel.RemoteActionCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(KycImageUploadViewModel kycImageUploadViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        kycImageUploadViewModel.write.write(new scrollGesturesEnabled.AudioAttributesImplApi26Parcelizer(str));
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (KycImageUploadViewModel.this.read.AudioAttributesCompatParcelizer(GoogleMapOnMyLocationButtonClickListener.IconCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return KycImageUploadViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        getResolutionSize<rotateGesturesEnabled> getresolutionsize = this.IconCompatParcelizer;
        rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        Uri uri = Uri.EMPTY;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        getresolutionsize.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer.IconCompatParcelizer : uri, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.liteMode
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return KycImageUploadViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(KycImageUploadViewModel kycImageUploadViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        kycImageUploadViewModel.write.write(new scrollGesturesEnabled.AudioAttributesImplApi26Parcelizer(str));
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatItemReceiver() {
        this.write.write(scrollGesturesEnabled.AudioAttributesCompatParcelizer.INSTANCE);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer == GoogleMapOnMyLocationButtonClickListener.RemoteActionCompatParcelizer) {
            getResolutionSize<rotateGesturesEnabled> getresolutionsize = this.IconCompatParcelizer;
            rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            Uri uri = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
            getresolutionsize.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer.IconCompatParcelizer : null, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer.RemoteActionCompatParcelizer : uri, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : minZoomPreference.RemoteActionCompatParcelizer));
            return;
        }
        getResolutionSize<rotateGesturesEnabled> getresolutionsize2 = this.IconCompatParcelizer;
        rotateGesturesEnabled rotategesturesenabledIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
        Uri uri2 = Uri.EMPTY;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri2, "");
        getresolutionsize2.write(rotateGesturesEnabled.AudioAttributesCompatParcelizer((2015 & 1) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (2015 & 2) != 0 ? rotategesturesenabledIconCompatParcelizer2.MediaBrowserCompatItemReceiver : false, (2015 & 4) != 0 ? rotategesturesenabledIconCompatParcelizer2.write : null, (2015 & 8) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesCompatParcelizer : 0, (2015 & 16) != 0 ? rotategesturesenabledIconCompatParcelizer2.IconCompatParcelizer : uri2, (2015 & 32) != 0 ? rotategesturesenabledIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (2015 & 64) != 0 ? rotategesturesenabledIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (2015 & 128) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null, (2015 & 256) != 0 ? rotategesturesenabledIconCompatParcelizer2.read : null, (2015 & 512) != 0 ? rotategesturesenabledIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : 0, (2015 & 1024) != 0 ? rotategesturesenabledIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : minZoomPreference.RemoteActionCompatParcelizer));
    }

    private final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer == GoogleMapOnMyLocationButtonClickListener.IconCompatParcelizer;
    }
}
