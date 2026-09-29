package kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.marrow.data.api.models.response.lesson.LessonIndexResponseBody;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.pearl.PearlResponseBody;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.common.NetworkStat;
import com.marrow.data.models.common.Schema;
import com.marrow.data.models.paginationV2.PageValue;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.core.network.model.NetworkApiResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteArrayDataSink implements BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    private final ServerSideAdInsertionMediaSourceSampleStreamImpl AudioAttributesCompatParcelizer;
    private final BundledChunkExtractor IconCompatParcelizer;
    private final getRegionEndTimeMs read;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        private static int MediaBrowserCompatCustomActionResultReceiver = 0;
        private static int MediaBrowserCompatItemReceiver = 1;
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = MediaBrowserCompatCustomActionResultReceiver;
            int i3 = i2 & 15;
            int i4 = i3 + ((i2 ^ 15) | i3);
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            this.read = obj;
            int i6 = this.write;
            if (i5 == 0) {
                this.write = (i6 & Integer.MIN_VALUE) | (i6 ^ Integer.MIN_VALUE);
                int i7 = 3 / 0;
            } else {
                this.write = i6 | Integer.MIN_VALUE;
            }
            Object[] objArr = {ByteArrayDataSink.this, null, this};
            Object objWrite = ByteArrayDataSink.write(AnnotatedField.Serialization.read(), 959967917, AnnotatedField.Serialization.read(), objArr, AnnotatedField.Serialization.read(), -959967917, AnnotatedField.Serialization.read());
            int i8 = MediaBrowserCompatCustomActionResultReceiver;
            int i9 = i8 & 75;
            int i10 = -(-((i8 ^ 75) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            MediaBrowserCompatItemReceiver = i11 % 128;
            if (i11 % 2 != 0) {
                return objWrite;
            }
            throw null;
        }
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = ~i5;
        int i10 = ~i2;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i | i2)) | (~(i7 | i9 | i10));
        int i13 = i5 + i2 + i3 + ((-1136091917) * i6) + (376669458 * i4);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i5) + 1718550528 + ((-1748215485) * i2) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i3) + ((-2044854272) * i6) + (41156608 * i4) + (1721171968 * i14);
        int i16 = ((i5 * (-924404593)) - 1636593565) + (i2 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i3 * (-924404175)) + (i6 * (-2083730301)) + (i4 * 182666354) + (i14 * (-51970048));
        switch (i15 + (i16 * i16 * (-653721600))) {
            case 1:
                return write(objArr);
            case 2:
                return RemoteActionCompatParcelizer(objArr);
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                return read(objArr);
            case 5:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 6:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            case 8:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 9:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 10:
                return MediaDescriptionCompat(objArr);
            case 11:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 12:
                return MediaBrowserCompatMediaItem(objArr);
            case 13:
                return RatingCompat(objArr);
            default:
                return IconCompatParcelizer(objArr);
        }
    }

    @setSdkPayload
    public ByteArrayDataSink(getRegionEndTimeMs getregionendtimems, BundledChunkExtractor bundledChunkExtractor, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl) {
        toMagicModuleMetaRepoModel.write(getregionendtimems, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        this.read = getregionendtimems;
        this.IconCompatParcelizer = bundledChunkExtractor;
        this.AudioAttributesCompatParcelizer = serverSideAdInsertionMediaSourceSampleStreamImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        Object objRemoteActionCompatParcelizer;
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
        int i4 = -(((~i2) & 97) | (i2 & (-98)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        write = i5 % 128;
        int i6 = i5 % 2;
        int iOnSetRating = byteArrayDataSink.IconCompatParcelizer.onSetRating();
        int iOnPrepareFromUri = byteArrayDataSink.IconCompatParcelizer.onPrepareFromUri();
        int i7 = RemoteActionCompatParcelizer;
        int i8 = ((i7 ^ 3) | (i7 & 3)) << 1;
        int i9 = -(((~i7) & 3) | (i7 & (-4)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        write = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            byteArrayDataSink.IconCompatParcelizer.AudioAttributesCompatParcelizer(iOnPrepareFromUri);
            ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = byteArrayDataSink.AudioAttributesCompatParcelizer;
            obj.hashCode();
            throw null;
        }
        boolean zAudioAttributesCompatParcelizer = byteArrayDataSink.IconCompatParcelizer.AudioAttributesCompatParcelizer(iOnPrepareFromUri);
        String strIconCompatParcelizer = byteArrayDataSink.AudioAttributesCompatParcelizer.IconCompatParcelizer(PageValue.PAGE_VALUE_LESSON.concat(String.valueOf(iOnSetRating)));
        int i11 = RemoteActionCompatParcelizer;
        int i12 = (i11 ^ 67) + ((i11 & 67) << 1);
        write = i12 % 128;
        if (i12 % 2 != 0) {
            objRemoteActionCompatParcelizer = byteArrayDataSink.read.RemoteActionCompatParcelizer(strIconCompatParcelizer, iOnSetRating, zAudioAttributesCompatParcelizer, sampleVideos);
        } else {
            objRemoteActionCompatParcelizer = byteArrayDataSink.read.RemoteActionCompatParcelizer(strIconCompatParcelizer, iOnSetRating, (1 & (~(zAudioAttributesCompatParcelizer ? 1 : 0))) | ((zAudioAttributesCompatParcelizer ? 1 : 0) & (-2)), sampleVideos);
        }
        int i13 = write + 29;
        RemoteActionCompatParcelizer = i13 % 128;
        if (i13 % 2 != 0) {
            return objRemoteActionCompatParcelizer;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos = (SampleVideos) objArr[4];
        int i = 2 % 2;
        int i2 = write + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getRegionEndTimeMs getregionendtimems = byteArrayDataSink.read;
        if (i3 == 0) {
            getregionendtimems.write(iIntValue, iIntValue2, iIntValue3, sampleVideos);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objWrite = getregionendtimems.write(iIntValue, iIntValue2, iIntValue3, sampleVideos);
        int i4 = write;
        int i5 = (i4 & 3) + (i4 | 3);
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return objWrite;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = (-2) - ((write + 78) ^ (-1));
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return byteArrayDataSink.read.write(2L, str, sampleVideos);
        }
        Object objWrite = byteArrayDataSink.read.write(2L, str, sampleVideos);
        int i3 = 84 / 0;
        return objWrite;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 71;
        int i4 = ((i2 | 71) & (~i3)) + (i3 << 1);
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return byteArrayDataSink.read.MediaBrowserCompatItemReceiver(2L, str, sampleVideos);
        }
        Object objMediaBrowserCompatItemReceiver = byteArrayDataSink.read.MediaBrowserCompatItemReceiver(2L, str, sampleVideos);
        int i5 = 54 / 0;
        return objMediaBrowserCompatItemReceiver;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        Object obj;
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos = (SampleVideos) objArr[4];
        int i = 2 % 2;
        int i2 = write;
        int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            obj = byteArrayDataSink.read.read(2L, str, iIntValue, iIntValue2, sampleVideos);
            int i4 = 18 / 0;
        } else {
            obj = byteArrayDataSink.read.read(2L, str, iIntValue, iIntValue2, sampleVideos);
        }
        int i5 = write;
        int i6 = i5 & 123;
        int i7 = ((i5 ^ 123) | i6) << 1;
        int i8 = -((i5 | 123) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        RemoteActionCompatParcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<Pearl>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 115;
        int i4 = (i3 - (~((i2 ^ 115) | i3))) - 1;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return byteArrayDataSink.read.IconCompatParcelizer(2L, str, sampleVideos);
        }
        Object objIconCompatParcelizer = byteArrayDataSink.read.IconCompatParcelizer(2L, str, sampleVideos);
        int i5 = 32 / 0;
        return objIconCompatParcelizer;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<Schema>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 23;
        int i4 = i3 + ((i2 ^ 23) | i3);
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        Object obj = byteArrayDataSink.read.read(2L, str, sampleVideos);
        int i6 = RemoteActionCompatParcelizer;
        int i7 = i6 & 35;
        int i8 = -(-((i6 ^ 35) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        write = i9 % 128;
        int i10 = i9 % 2;
        return obj;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<McqResponseBody>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getRegionEndTimeMs getregionendtimems = byteArrayDataSink.read;
        if (i4 != 0) {
            return getregionendtimems.RemoteActionCompatParcelizer(2L, str, sampleVideos);
        }
        getregionendtimems.RemoteActionCompatParcelizer(2L, str, sampleVideos);
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object objIconCompatParcelizer = byteArrayDataSink.read.IconCompatParcelizer(jLongValue, sampleVideos);
        int i5 = RemoteActionCompatParcelizer + 95;
        write = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return objIconCompatParcelizer;
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<PearlResponseBody>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = (i2 ^ 94) + ((i2 & 94) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        write = i4 % 128;
        int i5 = i4 % 2;
        getRegionEndTimeMs getregionendtimems = byteArrayDataSink.read;
        if (i5 == 0) {
            return getregionendtimems.AudioAttributesCompatParcelizer(2L, str, sampleVideos);
        }
        getregionendtimems.AudioAttributesCompatParcelizer(2L, str, sampleVideos);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        String str = (String) objArr[1];
        SampleVideos<? super NetworkApiResponse<List<CrossDeviceSyncResponseObject>>> sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (((i2 ^ 87) | (i2 & 87)) << 1) - (((~i2) & 87) | (i2 & (-88)));
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getRegionEndTimeMs getregionendtimems = byteArrayDataSink.read;
        if (i4 == 0) {
            getregionendtimems.AudioAttributesCompatParcelizer(str, sampleVideos);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAudioAttributesCompatParcelizer = getregionendtimems.AudioAttributesCompatParcelizer(str, sampleVideos);
        int i5 = write;
        int i6 = i5 & 19;
        int i7 = i6 + ((i5 ^ 19) | i6);
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        return objAudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 & 111) + (i2 | 111);
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getRegionEndTimeMs getregionendtimems = byteArrayDataSink.read;
        int iOnPrepareFromUri = byteArrayDataSink.IconCompatParcelizer.onPrepareFromUri();
        int i5 = RemoteActionCompatParcelizer;
        int i6 = ((i5 & (-96)) | ((~i5) & 95)) + ((i5 & 95) << 1);
        write = i6 % 128;
        int i7 = i6 % 2;
        Object objRemoteActionCompatParcelizer = getregionendtimems.RemoteActionCompatParcelizer(iOnPrepareFromUri, sampleVideos);
        int i8 = write;
        int i9 = i8 & 49;
        int i10 = ((i8 ^ 49) | i9) << 1;
        int i11 = -((i8 | 49) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        RemoteActionCompatParcelizer = i12 % 128;
        int i13 = i12 % 2;
        return objRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0241, code lost:
    
        if (r0 == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r19) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ByteArrayDataSink.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        ByteArrayDataSink byteArrayDataSink = (ByteArrayDataSink) objArr[0];
        SampleVideos<? super NetworkStat> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = -(-((i2 & 87) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        write = i5 % 128;
        int i6 = i5 % 2;
        getRegionEndTimeMs getregionendtimems = byteArrayDataSink.read;
        if (i6 == 0) {
            return getregionendtimems.write(sampleVideos);
        }
        getregionendtimems.write(sampleVideos);
        throw null;
    }

    private final Object write(SampleVideos<? super NetworkStat> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), 1100663624, AnnotatedField.Serialization.read(), new Object[]{this, sampleVideos}, AnnotatedField.Serialization.read(), -1100663616, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), -2074041909, AnnotatedField.Serialization.read(), new Object[]{this, sampleVideos}, AnnotatedField.Serialization.read(), 2074041922, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object RemoteActionCompatParcelizer(int i, int i2, int i3, SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), sampleVideos};
        return write(AnnotatedField.Serialization.read(), -1890741880, AnnotatedField.Serialization.read(), objArr, AnnotatedField.Serialization.read(), 1890741885, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object write(String str, SampleVideos<? super NetworkApiResponse<List<CrossDeviceSyncResponseObject>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), 1487789979, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), -1487789972, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object IconCompatParcelizer(String str, int i, int i2, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos) {
        Object[] objArr = {this, str, Integer.valueOf(i), Integer.valueOf(i2), sampleVideos};
        return write(AnnotatedField.Serialization.read(), -864680555, AnnotatedField.Serialization.read(), objArr, AnnotatedField.Serialization.read(), 864680559, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), -1938286592, AnnotatedField.Serialization.read(), new Object[]{this, sampleVideos}, AnnotatedField.Serialization.read(), 1938286604, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object read(String str, SampleVideos<? super NetworkApiResponse<List<McqResponseBody>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), 722765609, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), -722765599, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object IconCompatParcelizer(String str, SampleVideos<? super NetworkApiResponse<List<Pearl>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), 2138844862, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), -2138844860, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super NetworkApiResponse<List<PearlResponseBody>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), -330926919, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), 330926930, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super NetworkApiResponse<List<Schema>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), 1718070483, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), -1718070480, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object MediaBrowserCompatItemReceiver(String str, SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), -1715079297, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), 1715079306, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), -1716408313, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), 1716408319, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object read(long j, SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos) {
        Object[] objArr = {this, Long.valueOf(j), sampleVideos};
        return write(AnnotatedField.Serialization.read(), -431251682, AnnotatedField.Serialization.read(), objArr, AnnotatedField.Serialization.read(), 431251683, AnnotatedField.Serialization.read());
    }

    @Override // kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0
    public final Object AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        return write(AnnotatedField.Serialization.read(), 959967917, AnnotatedField.Serialization.read(), new Object[]{this, str, sampleVideos}, AnnotatedField.Serialization.read(), -959967917, AnnotatedField.Serialization.read());
    }
}
