package com.marrow2.ui.notespurchase.addressinput;

import com.google.android.exoplayer2.C;
import com.marrow2.ui.notespurchase.addressinput.NotesPurchaseAddressInputFragmentViewModel;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.GmsLogger;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.canLogPii;
import kotlin.efmt;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isAbsolute;
import kotlin.isSeekPending;
import kotlin.pii;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0013\u0010 "}, d2 = {"Lcom/marrow2/ui/notespurchase/addressinput/NotesPurchaseAddressInputFragmentViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/isAbsolute;", "p0", "Lo/isSeekPending;", "p1", "<init>", "(Lo/isAbsolute;Lo/isSeekPending;)V", "", "AudioAttributesCompatParcelizer", "()V", "Lo/efmt;", "write", "(Lo/efmt;)V", "AudioAttributesImplApi26Parcelizer", "Lo/isAbsolute;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/isSeekPending;", "read", "Lo/getResolutionSize;", "Lo/GmsLogger;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/fromCursor;", "Lo/pii;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotesPurchaseAddressInputFragmentViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isAbsolute RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<GmsLogger> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<pii> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final fromCursor<pii> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<GmsLogger> AudioAttributesCompatParcelizer;

    @setSdkPayload
    public NotesPurchaseAddressInputFragmentViewModel(isAbsolute isabsolute, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(isabsolute, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.RemoteActionCompatParcelizer = isabsolute;
        this.read = isseekpending;
        getResolutionSize<GmsLogger> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new GmsLogger(null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 262143, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.write = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<pii> fromcursor = getLastName.read(0, null, 7);
        this.IconCompatParcelizer = fromcursor;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        AudioAttributesCompatParcelizer();
    }

    public final setUpdatedStatus<GmsLogger> IconCompatParcelizer() {
        return this.write;
    }

    public final NewNumberOtpResendRequest<pii> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer;
            Object objIconCompatParcelizer2;
            GmsLogger gmsLogger;
            Object objIconCompatParcelizer3 = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                objIconCompatParcelizer = NotesPurchaseAddressInputFragmentViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
                if (objIconCompatParcelizer == objIconCompatParcelizer3) {
                    return objIconCompatParcelizer3;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                objIconCompatParcelizer = obj;
            }
            List list = (List) objIconCompatParcelizer;
            getResolutionSize getresolutionsize = NotesPurchaseAddressInputFragmentViewModel.this.AudioAttributesCompatParcelizer;
            do {
                objIconCompatParcelizer2 = getresolutionsize.IconCompatParcelizer();
                gmsLogger = (GmsLogger) objIconCompatParcelizer2;
            } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer2, GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLogger.RatingCompat : null, (131071 & 2) != 0 ? gmsLogger.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLogger.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLogger.write : null, (131071 & 16) != 0 ? gmsLogger.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLogger.read : null, (131071 & 64) != 0 ? gmsLogger.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLogger.onCommand : null, (131071 & 256) != 0 ? gmsLogger.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLogger.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLogger.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLogger.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLogger.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLogger.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLogger.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLogger.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLogger.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLogger.handleMediaPlayPauseIfPendingOnHandler : list)));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseAddressInputFragmentViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.wtf
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NotesPurchaseAddressInputFragmentViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void write(efmt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof efmt.read) {
            getResolutionSize<GmsLogger> getresolutionsize = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            efmt.read readVar = (efmt.read) p0;
            String strWrite = readVar.write();
            canLogPii canlogpii = canLogPii.INSTANCE;
            getresolutionsize.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer.write : strWrite, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : canLogPii.AudioAttributesCompatParcelizer(readVar.write()), (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.AudioAttributesCompatParcelizer) {
            getResolutionSize<GmsLogger> getresolutionsize2 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            efmt.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (efmt.AudioAttributesCompatParcelizer) p0;
            String str = audioAttributesCompatParcelizer.read();
            canLogPii canlogpii2 = canLogPii.INSTANCE;
            getresolutionsize2.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer2.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer2.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer2.IconCompatParcelizer : str, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer2.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer2.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer2.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer2.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer2.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer2.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : canLogPii.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.read()), (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer2.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.RemoteActionCompatParcelizer) {
            getResolutionSize<GmsLogger> getresolutionsize3 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
            efmt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (efmt.RemoteActionCompatParcelizer) p0;
            String strIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
            canLogPii canlogpii3 = canLogPii.INSTANCE;
            getresolutionsize3.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer3.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer3.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer3.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer3.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer3.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer3.read : strIconCompatParcelizer, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer3.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer3.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer3.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer3.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer3.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer3.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : canLogPii.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer()), (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer3.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer3.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer3.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.IconCompatParcelizer) {
            getResolutionSize<GmsLogger> getresolutionsize4 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer4 = getresolutionsize4.IconCompatParcelizer();
            efmt.IconCompatParcelizer iconCompatParcelizer = (efmt.IconCompatParcelizer) p0;
            String strRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
            canLogPii canlogpii4 = canLogPii.INSTANCE;
            getresolutionsize4.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer4.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer4.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer4.RemoteActionCompatParcelizer : strRemoteActionCompatParcelizer, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer4.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer4.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer4.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer4.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer4.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer4.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer4.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer4.MediaBrowserCompatItemReceiver : canLogPii.read(iconCompatParcelizer.RemoteActionCompatParcelizer()), (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer4.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer4.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer4.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer4.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer4.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.write) {
            getResolutionSize<GmsLogger> getresolutionsize5 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer5 = getresolutionsize5.IconCompatParcelizer();
            efmt.write writeVar = (efmt.write) p0;
            String strRemoteActionCompatParcelizer2 = writeVar.RemoteActionCompatParcelizer();
            canLogPii canlogpii5 = canLogPii.INSTANCE;
            getresolutionsize5.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer5.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer5.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer5.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer5.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer5.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer5.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer5.AudioAttributesCompatParcelizer : strRemoteActionCompatParcelizer2, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer5.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer5.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer5.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer5.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer5.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer5.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer5.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer5.AudioAttributesImplBaseParcelizer : canLogPii.write(writeVar.RemoteActionCompatParcelizer()), (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer5.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer5.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.MediaBrowserCompatCustomActionResultReceiver) {
            getResolutionSize<GmsLogger> getresolutionsize6 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer6 = getresolutionsize6.IconCompatParcelizer();
            efmt.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (efmt.MediaBrowserCompatCustomActionResultReceiver) p0;
            String strWrite2 = mediaBrowserCompatCustomActionResultReceiver.write();
            canLogPii canlogpii6 = canLogPii.INSTANCE;
            getresolutionsize6.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer6.RatingCompat : strWrite2, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer6.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer6.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer6.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer6.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer6.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer6.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer6.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer6.MediaMetadataCompat : canLogPii.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.write()), (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer6.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer6.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer6.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer6.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer6.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer6.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer6.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer6.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer6.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.AudioAttributesImplApi26Parcelizer) {
            getResolutionSize<GmsLogger> getresolutionsize7 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer7 = getresolutionsize7.IconCompatParcelizer();
            efmt.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (efmt.AudioAttributesImplApi26Parcelizer) p0;
            String strAudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            canLogPii canlogpii7 = canLogPii.INSTANCE;
            getresolutionsize7.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer7.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer7.MediaBrowserCompatSearchResultReceiver : strAudioAttributesCompatParcelizer, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer7.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer7.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer7.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer7.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer7.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer7.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer7.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer7.MediaDescriptionCompat : canLogPii.read(audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer()), (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer7.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer7.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer7.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer7.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer7.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer7.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer7.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.AudioAttributesImplBaseParcelizer) {
            getResolutionSize<GmsLogger> getresolutionsize8 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer8 = getresolutionsize8.IconCompatParcelizer();
            efmt.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (efmt.AudioAttributesImplBaseParcelizer) p0;
            String strAudioAttributesCompatParcelizer2 = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
            canLogPii canlogpii8 = canLogPii.INSTANCE;
            getresolutionsize8.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer8.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer8.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer8.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer8.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer8.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer8.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer8.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer8.onCommand : strAudioAttributesCompatParcelizer2, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer8.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer8.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer8.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer8.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer8.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer8.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer8.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer8.MediaBrowserCompatMediaItem : canLogPii.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer()), (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer8.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer8.handleMediaPlayPauseIfPendingOnHandler : null));
            return;
        }
        if (p0 instanceof efmt.MediaBrowserCompatItemReceiver) {
            AudioAttributesImplApi26Parcelizer();
        } else {
            if (!(p0 instanceof efmt.AudioAttributesImplApi21Parcelizer)) {
                throw new RenewEligibleCreator();
            }
            getResolutionSize<GmsLogger> getresolutionsize9 = this.AudioAttributesCompatParcelizer;
            GmsLogger gmsLoggerIconCompatParcelizer9 = getresolutionsize9.IconCompatParcelizer();
            getresolutionsize9.write(GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? gmsLoggerIconCompatParcelizer9.RatingCompat : null, (131071 & 2) != 0 ? gmsLoggerIconCompatParcelizer9.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? gmsLoggerIconCompatParcelizer9.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? gmsLoggerIconCompatParcelizer9.write : null, (131071 & 16) != 0 ? gmsLoggerIconCompatParcelizer9.IconCompatParcelizer : null, (131071 & 32) != 0 ? gmsLoggerIconCompatParcelizer9.read : null, (131071 & 64) != 0 ? gmsLoggerIconCompatParcelizer9.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? gmsLoggerIconCompatParcelizer9.onCommand : null, (131071 & 256) != 0 ? gmsLoggerIconCompatParcelizer9.MediaMetadataCompat : false, (131071 & 512) != 0 ? gmsLoggerIconCompatParcelizer9.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? gmsLoggerIconCompatParcelizer9.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? gmsLoggerIconCompatParcelizer9.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? gmsLoggerIconCompatParcelizer9.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? gmsLoggerIconCompatParcelizer9.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? gmsLoggerIconCompatParcelizer9.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? gmsLoggerIconCompatParcelizer9.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gmsLoggerIconCompatParcelizer9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : ((efmt.AudioAttributesImplApi21Parcelizer) p0).AudioAttributesCompatParcelizer(), (131071 & 131072) != 0 ? gmsLoggerIconCompatParcelizer9.handleMediaPlayPauseIfPendingOnHandler : null));
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
        
            if (r14.IconCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(new o.pii.AudioAttributesCompatParcelizer(r15), r14) == r0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
        
            if (r14.IconCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(o.pii.write.INSTANCE, r14) == r0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.notespurchase.addressinput.NotesPurchaseAddressInputFragmentViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseAddressInputFragmentViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.IAccountAccessorStub
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NotesPurchaseAddressInputFragmentViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
