package kotlin;

import com.marrow.data.api.models.request.user.TrackUserRequestBody;
import com.marrow.data.api.models.response.lesson.LessonIndexResponseBody;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.pearl.PearlResponseBody;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.common.NetworkStat;
import com.marrow.data.models.common.Schema;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.core.network.model.EmptyBody;
import com.marrow2.core.network.model.NetworkApiResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0015J.\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0015J>\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u001c\u0010\u0015J.\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0019\u0010\u0015J.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u0015J$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001c\u0010 J.\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\"\u0010\u0015J&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\"\u0010$J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000e\u0010&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\b\u0011\u0010(J \u0010\u000e\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020'H\u0096@¢\u0006\u0004\b\u000e\u0010*R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+"}, d2 = {"Lo/regionsConnect;", "Lo/getRegionEndTimeMs;", "Lo/CachedRegionTracker;", "p0", "<init>", "(Lo/CachedRegionTracker;)V", "", "", "p1", "", "p2", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow/data/api/models/response/lesson/LessonIndexResponseBody;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;IZLo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/CourseConfigV2;", "write", "(IIILo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow/data/models/subject/Subject;", "(JLjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/test/TestIndex;", "MediaBrowserCompatItemReceiver", "p3", "read", "(JLjava/lang/String;IILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/pearl/Pearl;", "IconCompatParcelizer", "Lcom/marrow/data/models/common/Schema;", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "(JLo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/pearl/PearlResponseBody;", "AudioAttributesCompatParcelizer", "Lcom/marrow/data/api/models/response/sync/CrossDeviceSyncResponseObject;", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/FeaturedCard;", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/NetworkStat;", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lcom/marrow/data/models/common/NetworkStat;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CachedRegionTracker;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class regionsConnect implements getRegionEndTimeMs {
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int IconCompatParcelizer = 0;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int read = 1;
    private static int write;
    private final CachedRegionTracker AudioAttributesCompatParcelizer;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i5));
        int i11 = (~(i3 | i5)) | (~((~i5) | i7 | i9));
        int i12 = i7 | i5 | i9;
        int i13 = i5 + i4 + i + (1362283521 * i6) + ((-853422242) * i2);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i5) - 1228931072) + ((-782767794) * i4) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i * 465567744) + (465567744 * i6) + (1887436800 * i2) + ((-1154482176) * i14);
        int i16 = ((i5 * 722868660) - 41817558) + (i4 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i * 722869185) + (i6 * 1172694977) + (i2 * (-747618338)) + (i14 * 791674880);
        switch (i15 + (i16 * i16 * 751828992)) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return read(objArr);
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                return write(objArr);
            case 5:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 6:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 7:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 8:
                return MediaBrowserCompatItemReceiver(objArr);
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 10:
                return MediaMetadataCompat(objArr);
            case 11:
                return MediaBrowserCompatMediaItem(objArr);
            case 12:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 13:
                return RatingCompat(objArr);
            default:
                return IconCompatParcelizer(objArr);
        }
    }

    @setSdkPayload
    public regionsConnect(CachedRegionTracker cachedRegionTracker) {
        toMagicModuleMetaRepoModel.write(cachedRegionTracker, "");
        this.AudioAttributesCompatParcelizer = cachedRegionTracker;
    }

    /* JADX INFO: renamed from: o.regionsConnect$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/regionsConnect$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos = (SampleVideos) objArr[4];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (i2 & (-70)) | ((~i2) & 69);
        int i4 = (i2 & 69) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        write = i5 % 128;
        int i6 = i5 % 2;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        int i7 = (((i2 | 108) << 1) - (i2 ^ 108)) - 1;
        write = i7 % 128;
        int i8 = i7 % 2;
        Object objRemoteActionCompatParcelizer = cachedRegionTracker.RemoteActionCompatParcelizer(2L, str, iIntValue, zBooleanValue, 350, sampleVideos);
        int i9 = write;
        int i10 = (i9 & 61) + (i9 | 61);
        AudioAttributesImplApi26Parcelizer = i10 % 128;
        if (i10 % 2 != 0) {
            return objRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos = (SampleVideos) objArr[4];
        int i = 2 % 2;
        int i2 = write + 51;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return regionsconnect.AudioAttributesCompatParcelizer.IconCompatParcelizer(iIntValue, iIntValue2, iIntValue3, sampleVideos);
        }
        Object objIconCompatParcelizer = regionsconnect.AudioAttributesCompatParcelizer.IconCompatParcelizer(iIntValue, iIntValue2, iIntValue3, sampleVideos);
        int i3 = 72 / 0;
        return objIconCompatParcelizer;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = -(-((i2 & 71) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        if (i6 != 0) {
            return cachedRegionTracker.RemoteActionCompatParcelizer(2L, str, sampleVideos);
        }
        cachedRegionTracker.RemoteActionCompatParcelizer(2L, str, sampleVideos);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 61;
        write = i2 % 128;
        int i3 = i2 % 2;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        if (i3 == 0) {
            return cachedRegionTracker.AudioAttributesImplApi26Parcelizer(2L, str, sampleVideos);
        }
        cachedRegionTracker.AudioAttributesImplApi26Parcelizer(2L, str, sampleVideos);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos = (SampleVideos) objArr[5];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 19;
        int i4 = (((i2 ^ 19) | i3) << 1) - ((i2 | 19) & (~i3));
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        if (i5 != 0) {
            return cachedRegionTracker.write(2L, str, iIntValue, iIntValue2, sampleVideos);
        }
        cachedRegionTracker.write(2L, str, iIntValue, iIntValue2, sampleVideos);
        throw null;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        SampleVideos<? super NetworkApiResponse<List<Pearl>>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 ^ 88) + ((i2 & 88) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        Object obj = regionsconnect.AudioAttributesCompatParcelizer.read(2L, str, sampleVideos);
        int i6 = AudioAttributesImplApi26Parcelizer;
        int i7 = (i6 & (-110)) | ((~i6) & 109);
        int i8 = -(-((i6 & 109) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        write = i9 % 128;
        int i10 = i9 % 2;
        return obj;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        SampleVideos<? super NetworkApiResponse<List<Schema>>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 & 65;
        int i4 = -(-(i2 | 65));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        write = i5 % 128;
        int i6 = i5 % 2;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        if (i6 == 0) {
            return cachedRegionTracker.write(2L, str, sampleVideos);
        }
        cachedRegionTracker.write(2L, str, sampleVideos);
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        SampleVideos<? super NetworkApiResponse<List<McqResponseBody>>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 23;
        int i4 = (i3 - (~(-(-((i2 ^ 23) | i3))))) - 1;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        if (i5 == 0) {
            cachedRegionTracker.AudioAttributesCompatParcelizer(2L, str, sampleVideos);
            obj.hashCode();
            throw null;
        }
        Object objAudioAttributesCompatParcelizer = cachedRegionTracker.AudioAttributesCompatParcelizer(2L, str, sampleVideos);
        int i6 = write;
        int i7 = ((i6 ^ 25) - (~(-(-((i6 & 25) << 1))))) - 1;
        AudioAttributesImplApi26Parcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            return objAudioAttributesCompatParcelizer;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        Object objIconCompatParcelizer;
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = write;
        int i3 = ((i2 | 74) << 1) - (i2 ^ 74);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            objIconCompatParcelizer = regionsconnect.AudioAttributesCompatParcelizer.IconCompatParcelizer(jLongValue, sampleVideos);
            int i5 = 83 / 0;
        } else {
            objIconCompatParcelizer = regionsconnect.AudioAttributesCompatParcelizer.IconCompatParcelizer(jLongValue, sampleVideos);
        }
        int i6 = write + 65;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return objIconCompatParcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        ((Number) objArr[1]).longValue();
        String str = (String) objArr[2];
        SampleVideos<? super NetworkApiResponse<List<PearlResponseBody>>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = ((i2 ^ 81) | (i2 & 81)) << 1;
        int i4 = -(((~i2) & 81) | (i2 & (-82)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        write = i5 % 128;
        int i6 = i5 % 2;
        Object objIconCompatParcelizer = regionsconnect.AudioAttributesCompatParcelizer.IconCompatParcelizer(2L, str, sampleVideos);
        int i7 = AudioAttributesImplApi26Parcelizer;
        int i8 = (i7 & 123) + (i7 | 123);
        write = i8 % 128;
        if (i8 % 2 == 0) {
            return objIconCompatParcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<CrossDeviceSyncResponseObject>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 9;
        int i4 = (i2 ^ 9) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        CachedRegionTracker cachedRegionTracker = regionsconnect.AudioAttributesCompatParcelizer;
        if (i6 == 0) {
            cachedRegionTracker.RemoteActionCompatParcelizer(str, sampleVideos);
            throw null;
        }
        Object objRemoteActionCompatParcelizer = cachedRegionTracker.RemoteActionCompatParcelizer(str, sampleVideos);
        int i7 = write;
        int i8 = i7 ^ 85;
        int i9 = (((i7 & 85) | i8) << 1) - i8;
        AudioAttributesImplApi26Parcelizer = i9 % 128;
        int i10 = i9 % 2;
        return objRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = ((((i2 ^ 5) | (i2 & 5)) << 1) - (~(-(((~i2) & 5) | (i2 & (-6)))))) - 1;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            return regionsconnect.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iIntValue, sampleVideos);
        }
        Object objAudioAttributesCompatParcelizer = regionsconnect.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iIntValue, sampleVideos);
        int i4 = 50 / 0;
        return objAudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        SampleVideos<? super NetworkStat> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = write + 87;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = regionsconnect.AudioAttributesCompatParcelizer.read("http://ip-api.com/json", sampleVideos);
        int i4 = write;
        int i5 = i4 & 45;
        int i6 = -(-((i4 ^ 45) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        AudioAttributesImplApi26Parcelizer = i7 % 128;
        int i8 = i7 % 2;
        return obj;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        double d;
        double[] dArr;
        char c;
        regionsConnect regionsconnect = (regionsConnect) objArr[0];
        String str = (String) objArr[1];
        NetworkStat networkStat = (NetworkStat) objArr[2];
        SampleVideos<? super NetworkApiResponse<EmptyBody>> sampleVideos = (SampleVideos) objArr[3];
        int i = 2 % 2;
        TrackUserRequestBody trackUserRequestBody = new TrackUserRequestBody();
        double d2 = networkStat.lat;
        int iWrite = getColorInfoString.write();
        int i2 = ~iWrite;
        int i3 = ~((84166884 & i2) | ((-84166885) & iWrite) | (84166884 & iWrite));
        int i4 = 1801996137 & i3;
        int i5 = (~i4) & (i3 | 1801996137);
        int i6 = ((i4 & i5) | (i5 ^ i4)) * 262;
        int i7 = 1868358615 & i6;
        int i8 = ((1868358615 ^ i6) | i7) << 1;
        int i9 = -((i6 | 1868358615) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        int i11 = i10 & 1285187166;
        int i12 = (1285187166 | i10) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        int i15 = (~iWrite) & (i2 | iWrite);
        int i16 = ~((i15 & 84166884) | (84166884 ^ i15));
        int i17 = (i16 & 16793696) | (i16 ^ 16793696);
        int i18 = i17 & 1785202441;
        int i19 = (i17 | 1785202441) & (~i18);
        int i20 = ((i19 & i18) | (i19 ^ i18)) * 262;
        int i21 = (i14 & i20) + (i20 | i14);
        int iIdentityHashCode = System.identityHashCode(regionsconnect);
        int i22 = ~iIdentityHashCode;
        int i23 = ~iIdentityHashCode;
        int i24 = i22 & (i23 | iIdentityHashCode);
        int i25 = ((~i24) & (-483590431)) | (483590430 & i24);
        int i26 = i24 & (-483590431);
        int i27 = ~((i26 & i25) | (i25 ^ i26));
        int i28 = (541914483 & i23) | (iIdentityHashCode & (-541914484));
        int i29 = 541914483 & iIdentityHashCode;
        int i30 = (i28 ^ i29) | (i28 & i29);
        int i31 = (~i30) & ((~i30) | i30);
        int i32 = -(-(((i31 & i27) | (i27 ^ i31)) * 959));
        int i33 = ((1216942490 | i32) << 1) - (i32 ^ 1216942490);
        int i34 = ((i33 ^ (-93244639)) | (i33 & (-93244639))) << 1;
        int i35 = -(((-93244639) & (~i33)) | (93244638 & i33));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        int i37 = (-483590431) & iIdentityHashCode;
        int i38 = (iIdentityHashCode | (-483590431)) & (~i37);
        int i39 = ~((i38 & i37) | (i38 ^ i37));
        int i40 = i23 & 541914483;
        int i41 = (541914483 | i23) & (~i40);
        int i42 = ~((i41 & i40) | (i41 ^ i40));
        int i43 = ((i39 & i42) | ((~i42) & i39) | ((~i39) & i42)) * 959;
        int i44 = i36 & i43;
        int i45 = (i43 ^ i36) | i44;
        if (i21 > (i44 & i45) + (i45 | i44)) {
            d = networkStat.lon;
            dArr = new double[3];
            c = 1;
        } else {
            d = networkStat.lon;
            dArr = new double[2];
            c = 0;
        }
        dArr[c] = d2;
        dArr[1] = d;
        trackUserRequestBody.coordinates = dArr;
        int i46 = write;
        int i47 = (i46 | 121) << 1;
        int i48 = -(((~i46) & 121) | (i46 & (-122)));
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        AudioAttributesImplApi26Parcelizer = i49 % 128;
        int i50 = i49 % 2;
        trackUserRequestBody.city = networkStat.city;
        trackUserRequestBody.country = networkStat.country;
        int i51 = write + 55;
        AudioAttributesImplApi26Parcelizer = i51 % 128;
        Object obj = null;
        if (i51 % 2 == 0) {
            trackUserRequestBody.state = networkStat.regionName;
            String str2 = networkStat.zip;
            throw null;
        }
        trackUserRequestBody.state = networkStat.regionName;
        trackUserRequestBody.zip = networkStat.zip;
        Object obj2 = regionsconnect.AudioAttributesCompatParcelizer.read(str, trackUserRequestBody, sampleVideos);
        int i52 = write + 15;
        AudioAttributesImplApi26Parcelizer = i52 % 128;
        if (i52 % 2 == 0) {
            getYear.IconCompatParcelizer();
            throw null;
        }
        if (obj2 != getYear.IconCompatParcelizer()) {
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i53 = AudioAttributesImplApi26Parcelizer;
            int i54 = (i53 & 59) + (i53 | 59);
            write = i54 % 128;
            int i55 = i54 % 2;
            return getshowpopup;
        }
        int i56 = AudioAttributesImplApi26Parcelizer;
        int i57 = i56 & 37;
        int i58 = -(-((i56 ^ 37) | i57));
        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
        write = i59 % 128;
        if (i59 % 2 == 0) {
            return obj2;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = IconCompatParcelizer;
        int i2 = i & 55;
        int i3 = -(-((i ^ 55) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object RemoteActionCompatParcelizer(int i, SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos) {
        Object[] objArr = {this, Integer.valueOf(i), sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 1611116770, objArr, -1611116763, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object write(SampleVideos<? super NetworkStat> sampleVideos) {
        int iWrite = getColorInfoString.write();
        int iWrite2 = getColorInfoString.write();
        int iWrite3 = getColorInfoString.write();
        return read(iWrite2, getColorInfoString.write(), iWrite, -837098584, new Object[]{this, sampleVideos}, 837098592, iWrite3);
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object write(int i, int i2, int i3, SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 696958967, objArr, -696958967, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super NetworkApiResponse<List<CrossDeviceSyncResponseObject>>> sampleVideos) {
        int iWrite = getColorInfoString.write();
        int iWrite2 = getColorInfoString.write();
        int iWrite3 = getColorInfoString.write();
        return read(iWrite2, getColorInfoString.write(), iWrite, -226887358, new Object[]{this, str, sampleVideos}, 226887369, iWrite3);
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object read(long j, String str, int i, int i2, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, Integer.valueOf(i), Integer.valueOf(i2), sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, -1173226580, objArr, 1173226584, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object RemoteActionCompatParcelizer(String str, int i, boolean z, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos) {
        Object[] objArr = {this, str, Integer.valueOf(i), Boolean.valueOf(z), sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, -620868714, objArr, 620868726, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object RemoteActionCompatParcelizer(long j, String str, SampleVideos<? super NetworkApiResponse<List<McqResponseBody>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 1737734543, objArr, -1737734534, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object IconCompatParcelizer(long j, String str, SampleVideos<? super NetworkApiResponse<List<Pearl>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, -803375128, objArr, 803375141, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object AudioAttributesCompatParcelizer(long j, String str, SampleVideos<? super NetworkApiResponse<List<PearlResponseBody>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 40331677, objArr, -40331672, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object read(long j, String str, SampleVideos<? super NetworkApiResponse<List<Schema>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 1739658720, objArr, -1739658719, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object write(long j, String str, SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 275182747, objArr, -275182745, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object MediaBrowserCompatItemReceiver(long j, String str, SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), str, sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 582807186, objArr, -582807176, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object IconCompatParcelizer(long j, SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), sampleVideos};
        int iWrite = getColorInfoString.write();
        return read(getColorInfoString.write(), getColorInfoString.write(), iWrite, 274906902, objArr, -274906899, getColorInfoString.write());
    }

    @Override // kotlin.getRegionEndTimeMs
    public final Object RemoteActionCompatParcelizer(String str, NetworkStat networkStat, SampleVideos<? super getShowPopup> sampleVideos) {
        int iWrite = getColorInfoString.write();
        int iWrite2 = getColorInfoString.write();
        int iWrite3 = getColorInfoString.write();
        return read(iWrite2, getColorInfoString.write(), iWrite, 1687430514, new Object[]{this, str, networkStat, sampleVideos}, -1687430508, iWrite3);
    }
}
