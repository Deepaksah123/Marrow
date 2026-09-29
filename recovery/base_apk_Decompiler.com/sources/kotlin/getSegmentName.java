package kotlin;

import com.marrow.data.api.models.response.lesson.LessonIndexResponseBody;
import com.marrow.data.models.lesson.LessonSyncUserLocalModel;
import com.marrow2.core.sync.PaginatedSyncTask;
import com.marrow2.data.test.remote.model.MarkTestCompleteRequestBody;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSegmentName extends PaginatedSyncTask<List<? extends LessonIndexResponseBody>> {
    private static int handleMediaPlayPauseIfPendingOnHandler = 0;
    private static int onCustomAction = 1;
    private final DefaultDashChunkSource AudioAttributesCompatParcelizer;
    private onDashManifestPublishTimeExpired AudioAttributesImplApi21Parcelizer;
    private final setManifestParser AudioAttributesImplApi26Parcelizer;
    private final getAdjustedWindowDefaultStartPositionUs AudioAttributesImplBaseParcelizer;
    private final resolveUtcTimingElementHttp IconCompatParcelizer;
    private final onInitializationFailed MediaBrowserCompatCustomActionResultReceiver;
    private Map<String, LessonSyncUserLocalModel> MediaBrowserCompatItemReceiver;
    private final newMediaChunk MediaBrowserCompatMediaItem;
    private final BundledChunkExtractor MediaBrowserCompatSearchResultReceiver;
    private final releaseDisabledStreams MediaDescriptionCompat;
    private final onUtcTimestampLoadCompleted MediaMetadataCompat;
    private final DefaultDashChunkSourceRepresentationHolder RatingCompat;
    private final scheduleManifestRefresh RemoteActionCompatParcelizer;
    private final copyWithNewRepresentation onAddQueueItem;
    private final getPlatform read;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i5)) | (~(i7 | i2)) | (~(i5 | i2));
        int i9 = (~(i3 | i2)) | i5;
        int i10 = (~(i2 | i3 | i5)) | (~(i7 | (~i5) | (~i2)));
        int i11 = i3 + i5 + i4 + (862446602 * i6) + (395103901 * i);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i3) - 438566912) + ((-683246085) * i5) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i4) + ((-128450560) * i6) + ((-674496512) * i) + ((-1108934656) * i12);
        int i14 = (i3 * 1384179468) + 550727958 + (i5 * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i4 * 1384179971) + (i6 * 1640285726) + (i * 120803543) + (i12 * 2025127936);
        switch (i13 + (i14 * i14 * (-275709952))) {
            case 1:
                return IconCompatParcelizer(objArr);
            case 2:
                return RemoteActionCompatParcelizer(objArr);
            case 3:
                return read(objArr);
            case 4:
                return AudioAttributesCompatParcelizer(objArr);
            case 5:
                return MediaBrowserCompatItemReceiver(objArr);
            case 6:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 7:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 8:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 9:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 10:
                return RatingCompat(objArr);
            case 11:
                return MediaMetadataCompat(objArr);
            case 12:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 13:
                return MediaBrowserCompatMediaItem(objArr);
            case 14:
                return MediaDescriptionCompat(objArr);
            case 15:
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(objArr);
            case 16:
                return handleMediaPlayPauseIfPendingOnHandler(objArr);
            case 17:
                return onAddQueueItem(objArr);
            default:
                return write(objArr);
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 ^ 109;
        int i4 = ((i2 & 109) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i5 | i4);
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        setManifestParser setmanifestparser = getsegmentname.AudioAttributesImplApi26Parcelizer;
        int i8 = ((i2 & 100) + (i2 | 100)) - 1;
        handleMediaPlayPauseIfPendingOnHandler = i8 % 128;
        int i9 = i8 % 2;
        return setmanifestparser;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 15;
        int i4 = ((~i3) & (i2 | 15)) + (i3 << 1);
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        resolveUtcTimingElementHttp resolveutctimingelementhttp = getsegmentname.IconCompatParcelizer;
        if (i5 != 0) {
            throw null;
        }
        int i6 = (((i2 ^ 25) | (i2 & 25)) << 1) - (((~i2) & 25) | (i2 & (-26)));
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        return resolveutctimingelementhttp;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        Map<String, LessonSyncUserLocalModel> map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (i2 | 73) << 1;
        int i4 = -(i2 ^ 73);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        int i6 = i5 % 2;
        getsegmentname.MediaBrowserCompatItemReceiver = map;
        if (i6 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (((i2 & (-98)) | ((~i2) & 97)) - (~((i2 & 97) << 1))) - 1;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        copyWithNewRepresentation copywithnewrepresentation = getsegmentname.onAddQueueItem;
        if (i4 == 0) {
            return copywithnewrepresentation;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        int i4 = i3 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i4;
        int i5 = i3 % 2;
        getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus = getsegmentname.AudioAttributesImplBaseParcelizer;
        int i6 = i4 & 73;
        int i7 = -(-((i4 ^ 73) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        onCustomAction = i8 % 128;
        int i9 = i8 % 2;
        return getadjustedwindowdefaultstartpositionus;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 19;
        int i4 = i3 + ((i2 ^ 19) | i3);
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        DefaultDashChunkSource defaultDashChunkSource = getsegmentname.AudioAttributesCompatParcelizer;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int i6 = 1782579324 & iWrite;
        int i7 = (~i6) & (1782579324 | iWrite);
        int i8 = (i6 & i7) | (i7 ^ i6);
        int i9 = i8 ^ 394835739;
        int i10 = i8 & 394835739;
        int i11 = ((i10 & i9) | (i9 ^ i10)) * (-676);
        int i12 = 146544320 & i11;
        int i13 = (((146544320 ^ i11) | i12) << 1) - ((i11 | 146544320) & (~i12));
        int i14 = ~iWrite;
        int i15 = i14 ^ 1782579324;
        int i16 = 1782579324 & i14;
        int i17 = -(-(((~((i16 & i15) | (i15 ^ i16))) | (-2143860608)) * 676));
        int i18 = i13 & i17;
        int i19 = ((i13 ^ i17) | i18) << 1;
        int i20 = -((i17 | i13) & (~i18));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        int i22 = ~iWrite;
        int i23 = ((~i22) & 394835739) | ((-394835740) & i22);
        int i24 = 394835739 & i22;
        int i25 = ~((i23 & i24) | (i23 ^ i24));
        int i26 = 1749024868 ^ i25;
        int i27 = i25 & 1749024868;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = (i22 & (-361281284)) | (361281283 & iWrite);
        int i30 = iWrite & (-361281284);
        int i31 = ~((i30 & i29) | (i29 ^ i30));
        int i32 = i28 ^ i31;
        int i33 = i31 & i28;
        int i34 = -(-(((i33 & i32) | (i32 ^ i33)) * 676));
        int i35 = ((i21 & i34) - (~(-(-(i34 | i21))))) - 1;
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int i36 = ~iWrite2;
        int i37 = ((i36 & (-1906052833)) | ((-1906052833) ^ i36)) * (-757);
        int i38 = ((-668556754) & i37) + (i37 | (-668556754));
        int i39 = -(-((~(((-1074268769) & iWrite2) | ((-1074268769) ^ iWrite2))) * 1514));
        int i40 = i38 & i39;
        int i41 = ((i38 ^ i39) | i40) << 1;
        int i42 = -((i39 | i38) & (~i40));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        int i44 = ~iWrite2;
        int i45 = (-1112173428) & i44;
        int i46 = (i44 | (-1112173428)) & (~i45);
        int i47 = ~((i46 & i45) | (i46 ^ i45));
        int i48 = ((~i47) & 37904659) | ((-37904660) & i47);
        int i49 = i47 & 37904659;
        int i50 = (i49 & i48) | (i48 ^ i49);
        int i51 = (-831784065) & iWrite2;
        int i52 = (iWrite2 | (-831784065)) & (~i51);
        int i53 = ~((i52 & i51) | (i52 ^ i51));
        int i54 = i50 ^ i53;
        int i55 = i53 & i50;
        int i56 = ((i55 & i54) | (i54 ^ i55)) * 757;
        int i57 = ((i43 ^ i56) | (i43 & i56)) << 1;
        int i58 = -((i56 & (~i43)) | ((~i56) & i43));
        if (i35 > (i57 ^ i58) + ((i58 & i57) << 1)) {
            return defaultDashChunkSource;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 109;
        int i4 = ((i2 ^ 109) | i3) << 1;
        int i5 = -((~i3) & (i2 | 109));
        int i6 = (i4 & i5) + (i4 | i5);
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        Map<String, LessonSyncUserLocalModel> map = getsegmentname.MediaBrowserCompatItemReceiver;
        int i8 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
        handleMediaPlayPauseIfPendingOnHandler = i8 % 128;
        int i9 = i8 % 2;
        return map;
    }

    private static /* synthetic */ Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        Object obj = objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        SampleVideos sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 79;
        int i4 = (i2 ^ 79) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onCustomAction = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr2 = {getsegmentname, (List) obj, Boolean.valueOf(zBooleanValue), sampleVideos};
        Object objIconCompatParcelizer = IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), MarkTestCompleteRequestBody.Companion.write(), -958033967, MarkTestCompleteRequestBody.Companion.write(), 958033975, objArr2, MarkTestCompleteRequestBody.Companion.write());
        int i7 = handleMediaPlayPauseIfPendingOnHandler;
        int i8 = i7 & 11;
        int i9 = (i7 | 11) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        onCustomAction = i11 % 128;
        int i12 = i11 % 2;
        return objIconCompatParcelizer;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        MarkTestCompleteRequestBody.Companion.write();
        MarkTestCompleteRequestBody.Companion.write();
        BundledChunkExtractor bundledChunkExtractor = getsegmentname.MediaBrowserCompatSearchResultReceiver;
        int i2 = onCustomAction;
        int i3 = i2 & 1;
        int i4 = i3 + ((i2 ^ 1) | i3);
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return bundledChunkExtractor;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 77;
        int i4 = -(-(i2 | 77));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        int i6 = i5 % 2;
        DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder = getsegmentname.RatingCompat;
        int i7 = (i2 ^ 43) + ((i2 & 43) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 76 / 0;
        }
        return defaultDashChunkSourceRepresentationHolder;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 113;
        int i4 = i3 + ((i2 ^ 113) | i3);
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -183066588, iWrite2, 183066600, new Object[]{getsegmentname, list}, iWrite3);
        int i6 = handleMediaPlayPauseIfPendingOnHandler;
        int i7 = i6 & 117;
        int i8 = (i6 | 117) & (~i7);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        onCustomAction = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    private static /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 29;
        int i3 = i2 % 128;
        onCustomAction = i3;
        int i4 = i2 % 2;
        onInitializationFailed oninitializationfailed = getsegmentname.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = ((i3 & (-52)) | ((~i3) & 51)) + ((i3 & 51) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return oninitializationfailed;
    }

    private static /* synthetic */ Object onAddQueueItem(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = (i2 & 23) + (i2 | 23);
        int i4 = i3 % 128;
        onCustomAction = i4;
        int i5 = i3 % 2;
        onUtcTimestampLoadCompleted onutctimestamploadcompleted = getsegmentname.MediaMetadataCompat;
        int i6 = (i4 ^ 85) + ((i4 & 85) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        return onutctimestamploadcompleted;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 113;
        int i4 = (i2 | 113) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        onCustomAction = i7;
        int i8 = i6 % 2;
        onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired = getsegmentname.AudioAttributesImplApi21Parcelizer;
        int i9 = (i7 & 97) + (i7 | 97);
        handleMediaPlayPauseIfPendingOnHandler = i9 % 128;
        int i10 = i9 % 2;
        return ondashmanifestpublishtimeexpired;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (-2) - (((i2 & 96) + (i2 | 96)) ^ (-1));
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        scheduleManifestRefresh schedulemanifestrefresh = getsegmentname.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return schedulemanifestrefresh;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSegmentName(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, resolveUtcTimingElementHttp resolveutctimingelementhttp, scheduleManifestRefresh schedulemanifestrefresh, copyWithNewRepresentation copywithnewrepresentation, onUtcTimestampLoadCompleted onutctimestamploadcompleted, setManifestParser setmanifestparser, onInitializationFailed oninitializationfailed, newMediaChunk newmediachunk, releaseDisabledStreams releasedisabledstreams, getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus, DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder, DefaultDashChunkSource defaultDashChunkSource, getPlatform getplatform) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor);
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        toMagicModuleMetaRepoModel.write(resolveutctimingelementhttp, "");
        int i = handleMediaPlayPauseIfPendingOnHandler;
        int i2 = (i | 67) << 1;
        int i3 = -((i & (-68)) | (67 & (~i)));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(schedulemanifestrefresh, "");
        toMagicModuleMetaRepoModel.write(copywithnewrepresentation, "");
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        int i6 = onCustomAction;
        int i7 = (((i6 ^ 73) | (i6 & 73)) << 1) - ((i6 & (-74)) | (73 & (~i6)));
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(newmediachunk, "");
        toMagicModuleMetaRepoModel.write(releasedisabledstreams, "");
        int i9 = onCustomAction + 91;
        handleMediaPlayPauseIfPendingOnHandler = i9 % 128;
        if (i9 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
            toMagicModuleMetaRepoModel.write(defaultDashChunkSourceRepresentationHolder, "");
            toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
            toMagicModuleMetaRepoModel.write(getplatform, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceRepresentationHolder, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.MediaBrowserCompatSearchResultReceiver = bundledChunkExtractor;
        this.AudioAttributesImplApi21Parcelizer = ondashmanifestpublishtimeexpired;
        this.IconCompatParcelizer = resolveutctimingelementhttp;
        this.RemoteActionCompatParcelizer = schedulemanifestrefresh;
        this.onAddQueueItem = copywithnewrepresentation;
        this.MediaMetadataCompat = onutctimestamploadcompleted;
        this.AudioAttributesImplApi26Parcelizer = setmanifestparser;
        this.MediaBrowserCompatCustomActionResultReceiver = oninitializationfailed;
        this.MediaBrowserCompatMediaItem = newmediachunk;
        this.MediaDescriptionCompat = releasedisabledstreams;
        this.AudioAttributesImplBaseParcelizer = getadjustedwindowdefaultstartpositionus;
        this.RatingCompat = defaultDashChunkSourceRepresentationHolder;
        this.AudioAttributesCompatParcelizer = defaultDashChunkSource;
        this.read = getplatform;
        this.MediaBrowserCompatItemReceiver = VideoTimelineResponseBody.read();
    }

    protected int write() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = (((i2 | 102) << 1) - (i2 ^ 102)) - 1;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        BundledChunkExtractor bundledChunkExtractor = this.MediaBrowserCompatSearchResultReceiver;
        if (i4 != 0) {
            return bundledChunkExtractor.onSetRating();
        }
        bundledChunkExtractor.onSetRating();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        SampleVideos sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        getPlatform getplatform = getsegmentname.read;
        Object obj = null;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getsegmentname.new AudioAttributesCompatParcelizer(zBooleanValue, list, null);
        int i2 = onCustomAction;
        int i3 = (((i2 ^ 33) | (i2 & 33)) << 1) - (((~i2) & 33) | (i2 & (-34)));
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
        if (i3 % 2 != 0) {
            setModifiedEndTimestampMs.RemoteActionCompatParcelizer(getplatform, audioAttributesCompatParcelizer2, sampleVideos);
            getYear.IconCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(getplatform, audioAttributesCompatParcelizer2, sampleVideos);
        if (objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer()) {
            int i4 = onCustomAction;
            int i5 = ((i4 ^ 79) - (~((i4 & 79) << 1))) - 1;
            handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
            int i6 = i5 % 2;
            return objRemoteActionCompatParcelizer;
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i7 = handleMediaPlayPauseIfPendingOnHandler;
        int i8 = ((((i7 ^ 5) | (i7 & 5)) << 1) - (~(-(((~i7) & 5) | (i7 & (-6)))))) - 1;
        onCustomAction = i8 % 128;
        if (i8 % 2 != 0) {
            return getshowpopup;
        }
        obj.hashCode();
        throw null;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private static int AudioAttributesImplApi21Parcelizer = 1;
        private static int RemoteActionCompatParcelizer;
        private /* synthetic */ List<LessonIndexResponseBody> IconCompatParcelizer;
        private int read;
        private /* synthetic */ boolean write;

        public static /* synthetic */ Object write(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = (~(i7 | i2)) | i4;
            int i9 = ~i2;
            int i10 = i7 | i4;
            int i11 = (~(i3 | i9 | i4)) | (~(i10 | i2));
            int i12 = (~i10) | (~(i9 | (~i4)));
            int i13 = i4 + i2 + i6 + (1353909401 * i) + ((-1351514252) * i5);
            int i14 = i13 * i13;
            int i15 = (1883508457 * i4) + 799145984 + ((-1483212659) * i2) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i6) + (337379328 * i) + ((-1540358144) * i5) + (669122560 * i14);
            int i16 = ((i4 * 521834465) - 1171472169) + (i2 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i6 * 521834041) + (i * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
            int i17 = i15 + (i16 * i16 * 1635647488);
            return i17 != 1 ? i17 != 2 ? i17 != 3 ? RemoteActionCompatParcelizer(objArr) : read(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr);
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x0945  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x09b5  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0a09  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r32) {
            /*
                Method dump skipped, instruction units count: 2727
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSegmentName.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(boolean z, List<? extends LessonIndexResponseBody> list, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = z;
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
            return (SampleVideos) write(getVariantWithAudioGroup.IconCompatParcelizer(), -809417683, iIconCompatParcelizer, new Object[]{this, obj, sampleVideos}, 809417686, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
            return write(getVariantWithAudioGroup.IconCompatParcelizer(), -864140466, iIconCompatParcelizer, new Object[]{this, topUserCompanion, sampleVideos}, 864140468, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2);
        }

        private Object IconCompatParcelizer(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
            return write(getVariantWithAudioGroup.IconCompatParcelizer(), -1273700499, iIconCompatParcelizer, new Object[]{this, topUserCompanion, sampleVideos}, 1273700500, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
            return write(getVariantWithAudioGroup.IconCompatParcelizer(), 165805456, iIconCompatParcelizer, new Object[]{this, obj}, -165805456, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2);
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
            SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
            int i = 2 % 2;
            int i2 = AudioAttributesImplApi21Parcelizer + 17;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = {(AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer.create(topUserCompanion, sampleVideos), getShowPopup.INSTANCE};
            Object objWrite = write(getVariantWithAudioGroup.IconCompatParcelizer(), 165805456, getVariantWithAudioGroup.IconCompatParcelizer(), objArr2, -165805456, getVariantWithAudioGroup.IconCompatParcelizer(), getVariantWithAudioGroup.IconCompatParcelizer());
            int i4 = RemoteActionCompatParcelizer;
            int i5 = ((i4 | 83) << 1) - (i4 ^ 83);
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                return objWrite;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 & 77;
            int i4 = ((((i2 ^ 77) | i3) << 1) - (~(-((i2 | 77) & (~i3))))) - 1;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
            Object objWrite = write(getVariantWithAudioGroup.IconCompatParcelizer(), -1273700499, iIconCompatParcelizer, new Object[]{audioAttributesCompatParcelizer, (TopUserCompanion) obj, (SampleVideos) obj2}, 1273700500, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2);
            int i6 = (-2) - ((RemoteActionCompatParcelizer + 48) ^ (-1));
            AudioAttributesImplApi21Parcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                return objWrite;
            }
            throw null;
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getSegmentName.this.new AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.IconCompatParcelizer, (SampleVideos) objArr[2]);
            int i2 = RemoteActionCompatParcelizer;
            int i3 = (((i2 ^ 3) | (i2 & 3)) << 1) - (((~i2) & 3) | (i2 & (-4)));
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = audioAttributesCompatParcelizer2;
            if (i3 % 2 == 0) {
                int i4 = 67 / 0;
            }
            return audioAttributesCompatParcelizer3;
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        newMediaChunk newmediachunk;
        List list;
        String[] strArr;
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        List list2 = (List) objArr[1];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
        onCustomAction = i3 % 128;
        if (i3 % 2 == 0) {
            newmediachunk = getsegmentname.MediaBrowserCompatMediaItem;
            list = list2;
            strArr = new String[1];
        } else {
            newmediachunk = getsegmentname.MediaBrowserCompatMediaItem;
            list = list2;
            strArr = new String[0];
        }
        int i4 = ((i2 & 91) - (~(i2 | 91))) - 1;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            newmediachunk.AudioAttributesImplApi26Parcelizer((String[]) list.toArray(strArr));
            throw null;
        }
        String[] strArrAudioAttributesImplApi26Parcelizer = newmediachunk.AudioAttributesImplApi26Parcelizer((String[]) list.toArray(strArr));
        int i5 = handleMediaPlayPauseIfPendingOnHandler;
        int i6 = i5 + 55;
        int i7 = i6 % 128;
        onCustomAction = i7;
        int i8 = i6 % 2;
        if (strArrAudioAttributesImplApi26Parcelizer.length == 0) {
            int i9 = (((i7 ^ 113) | (i7 & 113)) << 1) - ((i7 & (-114)) | ((~i7) & 113));
            handleMediaPlayPauseIfPendingOnHandler = i9 % 128;
            if (!(i9 % 2 == 0)) {
            }
            int i10 = handleMediaPlayPauseIfPendingOnHandler + 5;
            onCustomAction = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = i5 & 53;
        int i13 = (i5 ^ 53) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        onCustomAction = i14 % 128;
        int i15 = i14 % 2;
        int i16 = onCustomAction;
        int i17 = (i16 ^ 115) + ((i16 & 115) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i17 % 128;
        int i18 = i17 % 2;
        newMediaChunk newmediachunk2 = getsegmentname.MediaBrowserCompatMediaItem;
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        int i19 = handleMediaPlayPauseIfPendingOnHandler;
        int i20 = i19 & 69;
        int i21 = (i19 ^ 69) | i20;
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        onCustomAction = i22 % 128;
        if (i22 % 2 == 0) {
            newmediachunk2.read(strArr2);
            getsegmentname.MediaDescriptionCompat.IconCompatParcelizer(strArrAudioAttributesImplApi26Parcelizer);
            throw null;
        }
        newmediachunk2.read(strArr2);
        getsegmentname.MediaDescriptionCompat.IconCompatParcelizer(strArrAudioAttributesImplApi26Parcelizer);
        BundledChunkExtractor bundledChunkExtractor = getsegmentname.MediaBrowserCompatSearchResultReceiver;
        int iAudioAttributesImplApi21Parcelizer = bundledChunkExtractor.AudioAttributesImplApi21Parcelizer("video_delete_count");
        int length = strArrAudioAttributesImplApi26Parcelizer.length;
        int i23 = handleMediaPlayPauseIfPendingOnHandler;
        int i24 = ((i23 & 8) + (i23 | 8)) - 1;
        onCustomAction = i24 % 128;
        if (i24 % 2 == 0) {
            bundledChunkExtractor.RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer >>> length);
        } else {
            int i25 = -(-length);
            int i26 = iAudioAttributesImplApi21Parcelizer & i25;
            int i27 = -(-((iAudioAttributesImplApi21Parcelizer ^ i25) | i26));
            bundledChunkExtractor.RemoteActionCompatParcelizer((i26 & i27) + (i27 | i26));
        }
        int i102 = handleMediaPlayPauseIfPendingOnHandler + 5;
        onCustomAction = i102 % 128;
        int i112 = i102 % 2;
        return null;
    }

    public static final /* synthetic */ scheduleManifestRefresh IconCompatParcelizer(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (scheduleManifestRefresh) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -509312181, iWrite2, 509312181, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ DefaultDashChunkSource RemoteActionCompatParcelizer(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (DefaultDashChunkSource) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, 651688503, iWrite2, -651688498, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ resolveUtcTimingElementHttp write(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (resolveUtcTimingElementHttp) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, 1939018444, iWrite2, -1939018435, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ Map read(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (Map) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -379411858, iWrite2, 379411871, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ onDashManifestPublishTimeExpired AudioAttributesCompatParcelizer(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (onDashManifestPublishTimeExpired) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -2034109564, iWrite2, 2034109567, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ onInitializationFailed MediaBrowserCompatCustomActionResultReceiver(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (onInitializationFailed) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -938756252, iWrite2, 938756268, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ getAdjustedWindowDefaultStartPositionUs MediaBrowserCompatItemReceiver(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (getAdjustedWindowDefaultStartPositionUs) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -477278891, iWrite2, 477278897, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ setManifestParser AudioAttributesImplApi21Parcelizer(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (setManifestParser) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -926858224, iWrite2, 926858228, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ BundledChunkExtractor AudioAttributesImplBaseParcelizer(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (BundledChunkExtractor) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -748805856, iWrite2, 748805870, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ onUtcTimestampLoadCompleted AudioAttributesImplApi26Parcelizer(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (onUtcTimestampLoadCompleted) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, 93916797, iWrite2, -93916780, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ DefaultDashChunkSourceRepresentationHolder MediaBrowserCompatSearchResultReceiver(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (DefaultDashChunkSourceRepresentationHolder) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -1932766464, iWrite2, 1932766475, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ copyWithNewRepresentation MediaMetadataCompat(getSegmentName getsegmentname) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        return (copyWithNewRepresentation) IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, 851456396, iWrite2, -851456395, new Object[]{getsegmentname}, iWrite3);
    }

    public static final /* synthetic */ void write(getSegmentName getsegmentname, List list) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -22782645, iWrite2, 22782647, new Object[]{getsegmentname, list}, iWrite3);
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(getSegmentName getsegmentname, Map map) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -812603296, iWrite2, 812603303, new Object[]{getsegmentname, map}, iWrite3);
    }

    private final void RemoteActionCompatParcelizer(List<String> list) {
        int iWrite = MarkTestCompleteRequestBody.Companion.write();
        int iWrite2 = MarkTestCompleteRequestBody.Companion.write();
        int iWrite3 = MarkTestCompleteRequestBody.Companion.write();
        IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), iWrite, -183066588, iWrite2, 183066600, new Object[]{this, list}, iWrite3);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(getSegmentName getsegmentname, List<? extends LessonIndexResponseBody> list, boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object[] objArr = {getsegmentname, list, Boolean.valueOf(z), sampleVideos};
        return IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), MarkTestCompleteRequestBody.Companion.write(), -45768500, MarkTestCompleteRequestBody.Companion.write(), 45768510, objArr, MarkTestCompleteRequestBody.Companion.write());
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(List<? extends LessonIndexResponseBody> list, boolean z, SampleVideos sampleVideos) {
        Object[] objArr = {this, list, Boolean.valueOf(z), sampleVideos};
        return IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), MarkTestCompleteRequestBody.Companion.write(), 987305434, MarkTestCompleteRequestBody.Companion.write(), -987305419, objArr, MarkTestCompleteRequestBody.Companion.write());
    }

    private Object write(List<? extends LessonIndexResponseBody> list, boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object[] objArr = {this, list, Boolean.valueOf(z), sampleVideos};
        return IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), MarkTestCompleteRequestBody.Companion.write(), -958033967, MarkTestCompleteRequestBody.Companion.write(), 958033975, objArr, MarkTestCompleteRequestBody.Companion.write());
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        Object objIconCompatParcelizer;
        getSegmentName getsegmentname = (getSegmentName) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        SampleVideos sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        if (i3 % 2 != 0) {
            objIconCompatParcelizer = IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), MarkTestCompleteRequestBody.Companion.write(), -45768500, MarkTestCompleteRequestBody.Companion.write(), 45768510, new Object[]{getsegmentname, list, Boolean.valueOf(zBooleanValue), sampleVideos}, MarkTestCompleteRequestBody.Companion.write());
            int i4 = 43 / 0;
        } else {
            objIconCompatParcelizer = IconCompatParcelizer(MarkTestCompleteRequestBody.Companion.write(), MarkTestCompleteRequestBody.Companion.write(), -45768500, MarkTestCompleteRequestBody.Companion.write(), 45768510, new Object[]{getsegmentname, list, Boolean.valueOf(zBooleanValue), sampleVideos}, MarkTestCompleteRequestBody.Companion.write());
        }
        int i5 = handleMediaPlayPauseIfPendingOnHandler;
        int i6 = i5 & 83;
        int i7 = (((i5 | 83) & (~i6)) - (~(i6 << 1))) - 1;
        onCustomAction = i7 % 128;
        if (i7 % 2 != 0) {
            return objIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
