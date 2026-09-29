package kotlin;

import com.google.android.exoplayer2.ext.mediasession.TimelineQueueEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AppMeasurementContentProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/transferEnded;", "", "Lo/maybeStartDeferredRetry;", "p0", "<init>", "(Lo/maybeStartDeferredRetry;)V", "", "Lo/ByteArrayDataSource;", "", "IconCompatParcelizer", "(Ljava/util/List;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/maybeStartDeferredRetry;", "AudioAttributesCompatParcelizer", "Lo/setDownloadedThemeState;", "write", "Lo/setDownloadedThemeState;", "Lo/setPassingYear;", "read", "Lo/setPassingYear;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class transferEnded {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final maybeStartDeferredRetry AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private setPassingYear RemoteActionCompatParcelizer;
    private final setDownloadedThemeState write;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = i | i7 | i8;
        int i10 = (~(i7 | i5)) | (~(i8 | i));
        int i11 = (~(i5 | i)) | (~(i7 | (~i) | i8));
        int i12 = i + i3 + i2 + ((-160716491) * i4) + (1883135422 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i) - 666828800) + ((-962678542) * i3) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i2) + ((-1967783936) * i4) + ((-2092695552) * i6) + ((-870252544) * i13);
        int i15 = (i * 1975847376) + 750996803 + (i3 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i2 * 1975846509) + (i4 * (-526956143)) + (i6 * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : read(objArr) : write(objArr);
    }

    @setSdkPayload
    public transferEnded(maybeStartDeferredRetry maybestartdeferredretry) {
        toMagicModuleMetaRepoModel.write(maybestartdeferredretry, "");
        this.AudioAttributesCompatParcelizer = maybestartdeferredretry;
        this.write = setPytCount.AudioAttributesCompatParcelizer(4, 0);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        transferEnded transferended = (transferEnded) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 41;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        setPassingYear setpassingyear = transferended.RemoteActionCompatParcelizer;
        int i5 = ((i2 & (-72)) | ((~i2) & 71)) + ((i2 & 71) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return setpassingyear;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        transferEnded transferended = (transferEnded) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        int i4 = i3 % 128;
        AudioAttributesImplBaseParcelizer = i4;
        int i5 = i3 % 2;
        setDownloadedThemeState setdownloadedthemestate = transferended.write;
        int i6 = (i4 & 45) + (i4 | 45);
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            return setdownloadedthemestate;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        transferEnded transferended = (transferEnded) objArr[0];
        setPassingYear setpassingyear = (setPassingYear) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 & 27;
        int i4 = i2 | 27;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        transferended.RemoteActionCompatParcelizer = setpassingyear;
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        int i7 = ~iIconCompatParcelizer;
        int i8 = i7 & (-1266897199);
        int i9 = (i7 | (-1266897199)) & (~i8);
        int i10 = ~((i9 & i8) | (i9 ^ i8));
        int i11 = (-2071295003) ^ i10;
        int i12 = i10 & (-2071295003);
        int i13 = -(-(((i12 & i11) | (i11 ^ i12)) * (-1042)));
        int i14 = (((-1522653078) ^ i13) | ((-1522653078) & i13)) << 1;
        int i15 = -((i13 & 1522653077) | ((-1522653078) & (~i13)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = -(-(((-1266897199) | iIconCompatParcelizer) * 521));
        int i18 = ((i16 | i17) << 1) - ((i17 & (~i16)) | ((~i17) & i16));
        int i19 = 2071295002 & iIconCompatParcelizer;
        int i20 = (2071295002 | iIconCompatParcelizer) & (~i19);
        int i21 = ~iIconCompatParcelizer;
        int i22 = (~(i20 | i19)) | (-2079814975);
        int i23 = i21 & (-2071295003);
        int i24 = (i21 | (-2071295003)) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = (1266897198 & i25) | ((~i25) & (-1266897199));
        int i27 = i25 & (-1266897199);
        int i28 = ~((i27 & i26) | (i26 ^ i27));
        int i29 = ((~i28) & i22) | ((~i22) & i28);
        int i30 = i28 & i22;
        int i31 = -(-(((i30 & i29) | (i29 ^ i30)) * 521));
        int i32 = ((((~i31) & i18) | ((~i18) & i31)) - (~(-(-((i31 & i18) << 1))))) - 1;
        int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
        int i33 = ~iIconCompatParcelizer2;
        int i34 = ~((i33 & (-285280257)) | ((-285280257) ^ i33));
        int i35 = i34 ^ (-2009464012);
        int i36 = i34 & (-2009464012);
        int i37 = -(-(((i36 & i35) | (i35 ^ i36)) * (-591)));
        int i38 = (1209394214 | i37) << 1;
        int i39 = -((i37 & (-1209394215)) | (1209394214 & (~i37)));
        int i40 = (i38 & i39) + (i39 | i38);
        int i41 = iIconCompatParcelizer2 & (-1434782724);
        int i42 = ((iIconCompatParcelizer2 | (-1434782724)) & (~i41)) | i41;
        int i43 = -(-(((i42 & (-859961545)) | (i42 ^ (-859961545))) * 591));
        int i44 = i40 ^ i43;
        int i45 = (i43 & i40) << 1;
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        Object obj = null;
        if (i32 > i46) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        transferEnded transferended = (transferEnded) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 99;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        maybeStartDeferredRetry maybestartdeferredretry = transferended.AudioAttributesCompatParcelizer;
        int i5 = (i2 & 117) + (i2 | 117);
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return maybestartdeferredretry;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: o.transferEnded$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/transferEnded$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        transferEnded transferended = (transferEnded) objArr[0];
        List list = (List) objArr[1];
        SampleVideos sampleVideos = (SampleVideos) objArr[2];
        int i = 2 % 2;
        Object obj = null;
        IconCompatParcelizer iconCompatParcelizer = transferended.new IconCompatParcelizer(list, null);
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 & 1;
        int i4 = i3 + ((i2 ^ 1) | i3);
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            College.IconCompatParcelizer(iconCompatParcelizer, sampleVideos);
            getYear.IconCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        Object objIconCompatParcelizer = College.IconCompatParcelizer(iconCompatParcelizer, sampleVideos);
        if (objIconCompatParcelizer == getYear.IconCompatParcelizer()) {
            int i5 = AudioAttributesImplBaseParcelizer + 19;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            return objIconCompatParcelizer;
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i7 = MediaBrowserCompatCustomActionResultReceiver;
        int i8 = ((i7 ^ 41) | (i7 & 41)) << 1;
        int i9 = -(((~i7) & 41) | (i7 & (-42)));
        int i10 = (i8 & i9) + (i9 | i8);
        AudioAttributesImplBaseParcelizer = i10 % 128;
        int i11 = i10 % 2;
        return getshowpopup;
    }

    static {
        int i = RemoteActionCompatParcelizer + 71;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ setPassingYear write(transferEnded transferended) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        return (setPassingYear) IconCompatParcelizer(45728618, setScheme.IconCompatParcelizer(), new Object[]{transferended}, -45728615, setScheme.IconCompatParcelizer(), iIconCompatParcelizer, setScheme.IconCompatParcelizer());
    }

    public static final /* synthetic */ setDownloadedThemeState AudioAttributesCompatParcelizer(transferEnded transferended) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        return (setDownloadedThemeState) IconCompatParcelizer(-378328210, setScheme.IconCompatParcelizer(), new Object[]{transferended}, 378328210, setScheme.IconCompatParcelizer(), iIconCompatParcelizer, setScheme.IconCompatParcelizer());
    }

    public static final /* synthetic */ maybeStartDeferredRetry IconCompatParcelizer(transferEnded transferended) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        return (maybeStartDeferredRetry) IconCompatParcelizer(851314130, setScheme.IconCompatParcelizer(), new Object[]{transferended}, -851314129, setScheme.IconCompatParcelizer(), iIconCompatParcelizer, setScheme.IconCompatParcelizer());
    }

    public static final /* synthetic */ void IconCompatParcelizer(transferEnded transferended, setPassingYear setpassingyear) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        IconCompatParcelizer(-1273645531, setScheme.IconCompatParcelizer(), new Object[]{transferended, setpassingyear}, 1273645533, setScheme.IconCompatParcelizer(), iIconCompatParcelizer, setScheme.IconCompatParcelizer());
    }

    public final Object IconCompatParcelizer(List<? extends ByteArrayDataSource> list, SampleVideos<? super getShowPopup> sampleVideos) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        return IconCompatParcelizer(1834845208, setScheme.IconCompatParcelizer(), new Object[]{this, list, sampleVideos}, -1834845204, setScheme.IconCompatParcelizer(), iIconCompatParcelizer, setScheme.IconCompatParcelizer());
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private static int AudioAttributesImplBaseParcelizer = 1;
        private static int read;
        private /* synthetic */ List<ByteArrayDataSource> IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private int write;

        public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i;
            int i8 = ~(i7 | i5);
            int i9 = (~(i7 | i6)) | i8;
            int i10 = ~i5;
            int i11 = ~(i10 | i);
            int i12 = i8 | i11 | (~(i10 | i6));
            int i13 = (~((~i6) | i10)) | i8 | i11;
            int i14 = i + i5 + i2 + ((-369695973) * i3) + (1794320298 * i4);
            int i15 = i14 * i14;
            int i16 = ((-1820121865) * i) + 1478230016 + (776760710 * i5) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i2) + (217841664 * i3) + ((-410517504) * i4) + ((-175177728) * i15);
            int i17 = ((i * 1872133577) - 2052485254) + (i5 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i2 * 1872134975) + (i3 * (-1328892763)) + (i4 * (-1296121642)) + (i15 * (-1691287552));
            int i18 = i16 + (i17 * i17 * (-1729036288));
            return i18 != 1 ? i18 != 2 ? i18 != 3 ? write(objArr) : RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
        }

        /* JADX INFO: renamed from: o.transferEnded$IconCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private static int AudioAttributesImplBaseParcelizer = 1;
            private static int MediaBrowserCompatItemReceiver;
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            private /* synthetic */ transferEnded IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ List<ByteArrayDataSource> write;

            public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
                int i7 = i6 | i;
                int i8 = ~i2;
                int i9 = i7 | i8;
                int i10 = ~(i8 | i6);
                int i11 = (~i7) | i10;
                int i12 = i10 | (~((~i6) | (~i)));
                int i13 = i6 + i + i3 + (1699743442 * i5) + (2071835342 * i4);
                int i14 = i13 * i13;
                int i15 = ((i6 * (-557635572)) - 1375207424) + ((-557635572) * i) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i3) + ((-648019968) * i5) + ((-1801453568) * i4) + (1296564224 * i14);
                int i16 = ((i6 * (-355764420)) - 259725689) + (i * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i3 * (-355763899)) + (i5 * 2119243930) + (i4 * (-943812730)) + (i14 * (-597164032));
                int i17 = i15 + (i16 * i16 * 58195968);
                return i17 != 1 ? i17 != 2 ? i17 != 3 ? IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr);
            }

            private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) objArr[0];
                Object obj = objArr[1];
                int i = 2 % 2;
                int i2 = MediaBrowserCompatItemReceiver + 26;
                int i3 = (i2 ^ (-1)) + (i2 << 1);
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
                TopUserCompanion topUserCompanion = (TopUserCompanion) anonymousClass3.AudioAttributesCompatParcelizer;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i5 = anonymousClass3.read;
                int i6 = AudioAttributesImplBaseParcelizer;
                int i7 = (i6 & (-94)) | ((~i6) & 93);
                int i8 = (i6 & 93) << 1;
                int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                MediaBrowserCompatItemReceiver = i9 % 128;
                int i10 = i9 % 2;
                Object obj2 = null;
                if (i5 != 0) {
                    int i11 = i6 & 83;
                    int i12 = (i11 - (~((i6 ^ 83) | i11))) - 1;
                    int i13 = i12 % 128;
                    MediaBrowserCompatItemReceiver = i13;
                    if (i12 % 2 == 0 ? i5 != 1 : i5 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = i13 ^ 107;
                    int i15 = ((i13 & 107) | i14) << 1;
                    int i16 = -i14;
                    int i17 = (i15 & i16) + (i16 | i15);
                    AudioAttributesImplBaseParcelizer = i17 % 128;
                    if (i17 % 2 == 0) {
                        Object obj3 = anonymousClass3.RemoteActionCompatParcelizer;
                        SdkPayloadData.IconCompatParcelizer(obj);
                        throw null;
                    }
                    Object obj4 = anonymousClass3.RemoteActionCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    int i18 = MediaBrowserCompatItemReceiver;
                    int i19 = i18 & 41;
                    int i20 = i18 | 41;
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    AudioAttributesImplBaseParcelizer = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    List<ByteArrayDataSource> list = anonymousClass3.write;
                    transferEnded transferended = anonymousClass3.IconCompatParcelizer;
                    ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                    int i23 = MediaBrowserCompatItemReceiver;
                    int i24 = i23 & 83;
                    int i25 = (i24 - (~((i23 ^ 83) | i24))) - 1;
                    AudioAttributesImplBaseParcelizer = i25 % 128;
                    int i26 = i25 % 2;
                    ArrayList arrayList2 = arrayList;
                    Iterator<T> it = list.iterator();
                    int i27 = AudioAttributesImplBaseParcelizer;
                    int i28 = i27 & 117;
                    int i29 = -(-(i27 | 117));
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    MediaBrowserCompatItemReceiver = i30 % 128;
                    if (i30 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    while (it.hasNext()) {
                        int i31 = MediaBrowserCompatItemReceiver;
                        int i32 = i31 & 123;
                        int i33 = (i32 - (~(-(-((i31 ^ 123) | i32))))) - 1;
                        AudioAttributesImplBaseParcelizer = i33 % 128;
                        if (i33 % 2 == 0) {
                            throw null;
                        }
                        write writeVar = new write(transferended, (ByteArrayDataSource) it.next(), null);
                        int i34 = MediaBrowserCompatItemReceiver + 51;
                        AudioAttributesImplBaseParcelizer = i34 % 128;
                        int i35 = i34 % 2;
                        getYearOfAdmission getyearofadmissionIconCompatParcelizer = setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, writeVar);
                        int i36 = MediaBrowserCompatItemReceiver;
                        int i37 = i36 & 73;
                        int i38 = i37 + ((i36 ^ 73) | i37);
                        AudioAttributesImplBaseParcelizer = i38 % 128;
                        int i39 = i38 % 2;
                        arrayList2.add(getyearofadmissionIconCompatParcelizer);
                        int i40 = MediaBrowserCompatItemReceiver + 65;
                        AudioAttributesImplBaseParcelizer = i40 % 128;
                        int i41 = i40 % 2;
                    }
                    ArrayList arrayList3 = arrayList2;
                    AnonymousClass3 anonymousClass32 = anonymousClass3;
                    int i42 = AudioAttributesImplBaseParcelizer;
                    int i43 = i42 & 29;
                    int i44 = (i42 ^ 29) | i43;
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    MediaBrowserCompatItemReceiver = i45 % 128;
                    if (i45 % 2 != 0) {
                        anonymousClass3.AudioAttributesCompatParcelizer = null;
                        anonymousClass3.RemoteActionCompatParcelizer = null;
                        int i46 = 24 / 0;
                    } else {
                        anonymousClass3.AudioAttributesCompatParcelizer = null;
                        anonymousClass3.RemoteActionCompatParcelizer = null;
                    }
                    anonymousClass3.read = 1;
                    Object objAudioAttributesCompatParcelizer = setEndTimestamp.AudioAttributesCompatParcelizer(arrayList3, anonymousClass32);
                    int i47 = MediaBrowserCompatItemReceiver;
                    int i48 = (i47 & 66) + (i47 | 66);
                    int i49 = (i48 ^ (-1)) + (i48 << 1);
                    int i50 = i49 % 128;
                    AudioAttributesImplBaseParcelizer = i50;
                    int i51 = i49 % 2;
                    if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                        int i52 = (((i50 & (-76)) | ((~i50) & 75)) - (~(-(-((i50 & 75) << 1))))) - 1;
                        MediaBrowserCompatItemReceiver = i52 % 128;
                        if (i52 % 2 == 0) {
                            return objIconCompatParcelizer;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                int i53 = MediaBrowserCompatItemReceiver;
                int i54 = ((i53 | 1) << 1) - (i53 ^ 1);
                AudioAttributesImplBaseParcelizer = i54 % 128;
                if (i54 % 2 != 0) {
                    return getshowpopup;
                }
                obj2.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: o.transferEnded$IconCompatParcelizer$3$write */
            static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private static int AudioAttributesImplBaseParcelizer = 1;
                private static int MediaBrowserCompatItemReceiver;
                private Object AudioAttributesCompatParcelizer;
                private /* synthetic */ transferEnded AudioAttributesImplApi21Parcelizer;
                private int IconCompatParcelizer;
                private int MediaBrowserCompatCustomActionResultReceiver;
                private Object RemoteActionCompatParcelizer;
                private Object read;
                private /* synthetic */ ByteArrayDataSource write;

                public static /* synthetic */ Object write(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                    int i7 = ~(i | i4);
                    int i8 = ~(i4 | i6);
                    int i9 = i7 | i8;
                    int i10 = ~i;
                    int i11 = ~i4;
                    int i12 = (~(i10 | i6)) | (~(i10 | i11)) | (~(i11 | i6));
                    int i13 = ~i6;
                    int i14 = i12 | (~(i13 | i | i4));
                    int i15 = (~(i13 | i11)) | i | i8;
                    int i16 = i + i4 + i3 + (1962400304 * i5) + (1167700406 * i2);
                    int i17 = i16 * i16;
                    int i18 = ((i * (-1019457937)) - 559939584) + ((-1019457937) * i4) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i3) + ((-1660944384) * i5) + ((-325058560) * i2) + (867827712 * i17);
                    int i19 = ((i * (-1629562239)) - 1134582380) + (i4 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i3 * (-1629561329)) + (i5 * (-1621399344)) + (i2 * (-873382486)) + (i17 * 1407582208);
                    int i20 = i18 + (i19 * i19 * (-1895432192));
                    return i20 != 1 ? i20 != 2 ? i20 != 3 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : write(objArr) : read(objArr);
                }

                /* JADX WARN: Finally extract failed */
                private static /* synthetic */ Object read(Object[] objArr) {
                    transferEnded transferended;
                    setDownloadedThemeState setdownloadedthemestate;
                    ByteArrayDataSource byteArrayDataSource;
                    write writeVar = (write) objArr[0];
                    Object obj = objArr[1];
                    int i = 2 % 2;
                    int i2 = MediaBrowserCompatItemReceiver;
                    int i3 = i2 ^ 67;
                    int i4 = ((i2 & 67) | i3) << 1;
                    int i5 = -i3;
                    int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                    AudioAttributesImplBaseParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i8 = writeVar.MediaBrowserCompatCustomActionResultReceiver;
                    Object obj2 = null;
                    if (i8 != 0) {
                        int i9 = AudioAttributesImplBaseParcelizer;
                        int i10 = (i9 ^ 57) + ((i9 & 57) << 1);
                        int i11 = i10 % 128;
                        MediaBrowserCompatItemReceiver = i11;
                        int i12 = i10 % 2;
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i13 = i11 + 1;
                        AudioAttributesImplBaseParcelizer = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        byteArrayDataSource = (ByteArrayDataSource) writeVar.RemoteActionCompatParcelizer;
                        transferended = (transferEnded) writeVar.read;
                        setdownloadedthemestate = (setDownloadedThemeState) writeVar.AudioAttributesCompatParcelizer;
                        SdkPayloadData.IconCompatParcelizer(obj);
                        int i14 = AudioAttributesImplBaseParcelizer;
                        int i15 = (-2) - (((i14 & 114) + (i14 | 114)) ^ (-1));
                        MediaBrowserCompatItemReceiver = i15 % 128;
                        int i16 = i15 % 2;
                        int i17 = i14 + 121;
                        MediaBrowserCompatItemReceiver = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        setDownloadedThemeState setdownloadedthemestate2 = (setDownloadedThemeState) transferEnded.IconCompatParcelizer(-378328210, setScheme.IconCompatParcelizer(), new Object[]{writeVar.AudioAttributesImplApi21Parcelizer}, 378328210, setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer());
                        transferended = writeVar.AudioAttributesImplApi21Parcelizer;
                        int i19 = AudioAttributesImplBaseParcelizer;
                        int i20 = (((i19 | 74) << 1) - (i19 ^ 74)) - 1;
                        MediaBrowserCompatItemReceiver = i20 % 128;
                        int i21 = i20 % 2;
                        ByteArrayDataSource byteArrayDataSource2 = writeVar.write;
                        write writeVar2 = writeVar;
                        int i22 = (i19 & 71) + (i19 | 71);
                        MediaBrowserCompatItemReceiver = i22 % 128;
                        if (i22 % 2 != 0) {
                            writeVar.AudioAttributesCompatParcelizer = setdownloadedthemestate2;
                            writeVar.read = transferended;
                            writeVar.RemoteActionCompatParcelizer = byteArrayDataSource2;
                            obj2.hashCode();
                            throw null;
                        }
                        writeVar.AudioAttributesCompatParcelizer = setdownloadedthemestate2;
                        writeVar.read = transferended;
                        writeVar.RemoteActionCompatParcelizer = byteArrayDataSource2;
                        writeVar.IconCompatParcelizer = 0;
                        writeVar.MediaBrowserCompatCustomActionResultReceiver = 1;
                        Object obj3 = setdownloadedthemestate2.read(writeVar2);
                        int i23 = MediaBrowserCompatItemReceiver;
                        int i24 = i23 ^ 81;
                        int i25 = (i23 & 81) << 1;
                        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                        int i27 = i26 % 128;
                        AudioAttributesImplBaseParcelizer = i27;
                        if (i26 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        if (obj3 == objIconCompatParcelizer) {
                            int i28 = i27 + 107;
                            MediaBrowserCompatItemReceiver = i28 % 128;
                            int i29 = i28 % 2;
                            int i30 = i27 + 84;
                            int i31 = (i30 ^ (-1)) + (i30 << 1);
                            MediaBrowserCompatItemReceiver = i31 % 128;
                            if (i31 % 2 == 0) {
                                return objIconCompatParcelizer;
                            }
                            throw null;
                        }
                        setdownloadedthemestate = setdownloadedthemestate2;
                        byteArrayDataSource = byteArrayDataSource2;
                    }
                    try {
                        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
                        ((maybeStartDeferredRetry) transferEnded.IconCompatParcelizer(851314130, setScheme.IconCompatParcelizer(), new Object[]{transferended}, -851314129, setScheme.IconCompatParcelizer(), iIconCompatParcelizer, setScheme.IconCompatParcelizer())).read(byteArrayDataSource);
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        int i32 = AudioAttributesImplBaseParcelizer;
                        int i33 = i32 & 41;
                        int i34 = (i32 | 41) & (~i33);
                        int i35 = i33 << 1;
                        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                        MediaBrowserCompatItemReceiver = i36 % 128;
                        int i37 = i36 % 2;
                        setdownloadedthemestate.AudioAttributesCompatParcelizer();
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                        int i38 = MediaBrowserCompatItemReceiver;
                        int i39 = (i38 & 51) + (i38 | 51);
                        AudioAttributesImplBaseParcelizer = i39 % 128;
                        if (i39 % 2 == 0) {
                            int i40 = 71 / 0;
                        }
                        return getshowpopup2;
                    } catch (Throwable th) {
                        setdownloadedthemestate.AudioAttributesCompatParcelizer();
                        throw th;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                write(transferEnded transferended, ByteArrayDataSource byteArrayDataSource, SampleVideos<? super write> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesImplApi21Parcelizer = transferended;
                    this.write = byteArrayDataSource;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    int iRemoteActionCompatParcelizer = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer2 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer3 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    return (SampleVideos) write(742122330, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{this, obj, sampleVideos}, -742122330, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    int iRemoteActionCompatParcelizer = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer2 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer3 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    return write(-55140849, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{this, topUserCompanion, sampleVideos}, 55140852, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
                }

                private Object RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    int iRemoteActionCompatParcelizer = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer2 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer3 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    return write(-93883349, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{this, topUserCompanion, sampleVideos}, 93883351, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    int iRemoteActionCompatParcelizer = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer2 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer3 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    return write(-2058905561, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{this, obj}, 2058905562, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
                }

                private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
                    write writeVar = (write) objArr[0];
                    Object obj = objArr[1];
                    int i = 2 % 2;
                    write writeVar2 = new write(writeVar.AudioAttributesImplApi21Parcelizer, writeVar.write, (SampleVideos) objArr[2]);
                    int i2 = AudioAttributesImplBaseParcelizer;
                    int i3 = (((i2 & (-72)) | ((~i2) & 71)) - (~((i2 & 71) << 1))) - 1;
                    MediaBrowserCompatItemReceiver = i3 % 128;
                    int i4 = i3 % 2;
                    write writeVar3 = writeVar2;
                    int i5 = (i2 ^ 93) + ((i2 & 93) << 1);
                    MediaBrowserCompatItemReceiver = i5 % 128;
                    int i6 = i5 % 2;
                    return writeVar3;
                }

                private static /* synthetic */ Object write(Object[] objArr) {
                    getShowPopup getshowpopup;
                    write writeVar = (write) objArr[0];
                    TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
                    SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
                    int i = 2 % 2;
                    int i2 = AudioAttributesImplBaseParcelizer;
                    int i3 = (-2) - ((((i2 | 98) << 1) - (i2 ^ 98)) ^ (-1));
                    MediaBrowserCompatItemReceiver = i3 % 128;
                    int i4 = i3 % 2;
                    write writeVar2 = (write) writeVar.create(topUserCompanion, sampleVideos);
                    if (i4 != 0) {
                        getshowpopup = getShowPopup.INSTANCE;
                        int i5 = 46 / 0;
                    } else {
                        getshowpopup = getShowPopup.INSTANCE;
                    }
                    int i6 = MediaBrowserCompatItemReceiver;
                    int i7 = (i6 ^ 53) + ((i6 & 53) << 1);
                    AudioAttributesImplBaseParcelizer = i7 % 128;
                    if (i7 % 2 == 0) {
                        int iRemoteActionCompatParcelizer = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                        int iRemoteActionCompatParcelizer2 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                        int iRemoteActionCompatParcelizer3 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                        write(-2058905561, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{writeVar2, getshowpopup}, 2058905562, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iRemoteActionCompatParcelizer4 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer5 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer6 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    Object objWrite = write(-2058905561, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer5, new Object[]{writeVar2, getshowpopup}, 2058905562, iRemoteActionCompatParcelizer6, iRemoteActionCompatParcelizer4);
                    int i8 = MediaBrowserCompatItemReceiver + 62;
                    int i9 = (i8 ^ (-1)) + (i8 << 1);
                    AudioAttributesImplBaseParcelizer = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 12 / 0;
                    }
                    return objWrite;
                }

                private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
                    write writeVar = (write) objArr[0];
                    Object obj = objArr[1];
                    Object obj2 = objArr[2];
                    int i = 2 % 2;
                    int i2 = MediaBrowserCompatItemReceiver;
                    int i3 = ((i2 & 66) + (i2 | 66)) - 1;
                    AudioAttributesImplBaseParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    int iRemoteActionCompatParcelizer = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer2 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer3 = AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer();
                    Object objWrite = write(-93883349, AppMeasurementContentProvider.AnonymousClass5.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{writeVar, (TopUserCompanion) obj, (SampleVideos) obj2}, 93883351, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
                    int i5 = MediaBrowserCompatItemReceiver;
                    int i6 = ((i5 & (-92)) | ((~i5) & 91)) + ((i5 & 91) << 1);
                    AudioAttributesImplBaseParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                    return objWrite;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(List<? extends ByteArrayDataSource> list, transferEnded transferended, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.write = list;
                this.IconCompatParcelizer = transferended;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                int i = StyledPlayerControlViewLayoutManager4.read();
                int i2 = StyledPlayerControlViewLayoutManager4.read();
                int i3 = StyledPlayerControlViewLayoutManager4.read();
                return (SampleVideos) RemoteActionCompatParcelizer(1886400429, i, i2, StyledPlayerControlViewLayoutManager4.read(), new Object[]{this, obj, sampleVideos}, i3, -1886400426);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                int i = StyledPlayerControlViewLayoutManager4.read();
                int i2 = StyledPlayerControlViewLayoutManager4.read();
                int i3 = StyledPlayerControlViewLayoutManager4.read();
                return RemoteActionCompatParcelizer(-1604648711, i, i2, StyledPlayerControlViewLayoutManager4.read(), new Object[]{this, topUserCompanion, sampleVideos}, i3, 1604648712);
            }

            private Object RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                int i = StyledPlayerControlViewLayoutManager4.read();
                int i2 = StyledPlayerControlViewLayoutManager4.read();
                int i3 = StyledPlayerControlViewLayoutManager4.read();
                return RemoteActionCompatParcelizer(-1374478443, i, i2, StyledPlayerControlViewLayoutManager4.read(), new Object[]{this, topUserCompanion, sampleVideos}, i3, 1374478443);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                int i = StyledPlayerControlViewLayoutManager4.read();
                int i2 = StyledPlayerControlViewLayoutManager4.read();
                int i3 = StyledPlayerControlViewLayoutManager4.read();
                return RemoteActionCompatParcelizer(1370885305, i, i2, StyledPlayerControlViewLayoutManager4.read(), new Object[]{this, obj}, i3, -1370885303);
            }

            private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) objArr[0];
                TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
                SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
                int i = 2 % 2;
                int i2 = MediaBrowserCompatItemReceiver;
                int i3 = i2 ^ 77;
                int i4 = ((i2 & 77) | i3) << 1;
                int i5 = -i3;
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                AudioAttributesImplBaseParcelizer = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr2 = {(AnonymousClass3) anonymousClass3.create(topUserCompanion, sampleVideos), getShowPopup.INSTANCE};
                Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1370885305, StyledPlayerControlViewLayoutManager4.read(), StyledPlayerControlViewLayoutManager4.read(), StyledPlayerControlViewLayoutManager4.read(), objArr2, StyledPlayerControlViewLayoutManager4.read(), -1370885303);
                int i8 = AudioAttributesImplBaseParcelizer + 61;
                MediaBrowserCompatItemReceiver = i8 % 128;
                int i9 = i8 % 2;
                return objRemoteActionCompatParcelizer;
            }

            private static /* synthetic */ Object write(Object[] objArr) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i = 2 % 2;
                int i2 = MediaBrowserCompatItemReceiver;
                int i3 = i2 | 23;
                int i4 = i3 << 1;
                int i5 = -((~(i2 & 23)) & i3);
                int i6 = (i4 & i5) + (i5 | i4);
                AudioAttributesImplBaseParcelizer = i6 % 128;
                int i7 = i6 % 2;
                int i8 = StyledPlayerControlViewLayoutManager4.read();
                int i9 = StyledPlayerControlViewLayoutManager4.read();
                int i10 = StyledPlayerControlViewLayoutManager4.read();
                Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(-1374478443, i8, i9, StyledPlayerControlViewLayoutManager4.read(), new Object[]{anonymousClass3, (TopUserCompanion) obj, (SampleVideos) obj2}, i10, 1374478443);
                int i11 = AudioAttributesImplBaseParcelizer;
                int i12 = i11 & 7;
                int i13 = -(-((i11 ^ 7) | i12));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                MediaBrowserCompatItemReceiver = i14 % 128;
                int i15 = i14 % 2;
                return objRemoteActionCompatParcelizer;
            }

            private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) objArr[0];
                Object obj = objArr[1];
                int i = 2 % 2;
                AnonymousClass3 anonymousClass32 = new AnonymousClass3(anonymousClass3.write, anonymousClass3.IconCompatParcelizer, (SampleVideos) objArr[2]);
                int i2 = AudioAttributesImplBaseParcelizer;
                int i3 = i2 | 125;
                int i4 = i3 << 1;
                int i5 = -(i3 & (~(i2 & 125)));
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
                anonymousClass32.AudioAttributesCompatParcelizer = obj;
                AnonymousClass3 anonymousClass33 = anonymousClass32;
                int i8 = i2 & 111;
                int i9 = -(-((i2 ^ 111) | i8));
                int i10 = (i8 & i9) + (i9 | i8);
                MediaBrowserCompatItemReceiver = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 76 / 0;
                }
                return anonymousClass33;
            }
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer;
            int i3 = i2 & 69;
            int i4 = (i2 ^ 69) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            read = i5 % 128;
            Object obj2 = null;
            if (i5 % 2 != 0) {
                getYear.IconCompatParcelizer();
                throw null;
            }
            TopUserCompanion topUserCompanion = (TopUserCompanion) iconCompatParcelizer.RemoteActionCompatParcelizer;
            getYear.IconCompatParcelizer();
            int i6 = iconCompatParcelizer.write;
            SdkPayloadData.IconCompatParcelizer(obj);
            setPassingYear setpassingyear = (setPassingYear) transferEnded.IconCompatParcelizer(45728618, setScheme.IconCompatParcelizer(), new Object[]{transferEnded.this}, -45728615, setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer());
            int i7 = AudioAttributesImplBaseParcelizer + 47;
            int i8 = i7 % 128;
            read = i8;
            int i9 = i7 % 2;
            if (setpassingyear != null) {
                int i10 = (((i8 | 31) << 1) - (~(-(i8 ^ 31)))) - 1;
                AudioAttributesImplBaseParcelizer = i10 % 128;
                int i11 = i10 % 2;
                setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
                int i12 = read;
                int i13 = i12 & 85;
                int i14 = ((i12 | 85) & (~i13)) + (i13 << 1);
                AudioAttributesImplBaseParcelizer = i14 % 128;
                int i15 = i14 % 2;
            }
            if (iconCompatParcelizer.IconCompatParcelizer.isEmpty()) {
                int i16 = AudioAttributesImplBaseParcelizer + 5;
                read = i16 % 128;
                if (i16 % 2 != 0) {
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    obj2.hashCode();
                    throw null;
                }
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                int i17 = AudioAttributesImplBaseParcelizer;
                int i18 = (i17 & 113) + (i17 | 113);
                read = i18 % 128;
                int i19 = i18 % 2;
                return getshowpopup2;
            }
            transferEnded transferended = transferEnded.this;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(iconCompatParcelizer.IconCompatParcelizer, transferEnded.this, null);
            int i20 = AudioAttributesImplBaseParcelizer;
            int i21 = ((i20 & (-10)) | ((~i20) & 9)) + ((i20 & 9) << 1);
            read = i21 % 128;
            int i22 = i21 % 2;
            transferEnded.IconCompatParcelizer(-1273645531, setScheme.IconCompatParcelizer(), new Object[]{transferended, C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, anonymousClass3, 3)}, 1273645533, setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer());
            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
            int i23 = read;
            int i24 = (i23 & (-70)) | ((~i23) & 69);
            int i25 = -(-((i23 & 69) << 1));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            AudioAttributesImplBaseParcelizer = i26 % 128;
            int i27 = i26 % 2;
            return getshowpopup3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(List<? extends ByteArrayDataSource> list, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            int iRemoteActionCompatParcelizer = TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer();
            return (SampleVideos) IconCompatParcelizer(-1118288779, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), 1118288781, new Object[]{this, obj, sampleVideos}, iRemoteActionCompatParcelizer);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iRemoteActionCompatParcelizer = TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(-372357608, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), 372357608, new Object[]{this, topUserCompanion, sampleVideos}, iRemoteActionCompatParcelizer);
        }

        private Object write(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iRemoteActionCompatParcelizer = TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(186832967, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), -186832966, new Object[]{this, topUserCompanion, sampleVideos}, iRemoteActionCompatParcelizer);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int iRemoteActionCompatParcelizer = TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(1551362845, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), -1551362842, new Object[]{this, obj}, iRemoteActionCompatParcelizer);
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer + 121;
            read = i2 % 128;
            TopUserCompanion topUserCompanion = (TopUserCompanion) obj;
            SampleVideos sampleVideos = (SampleVideos) obj2;
            if (i2 % 2 == 0) {
                int iRemoteActionCompatParcelizer = TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer();
                return IconCompatParcelizer(186832967, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), -186832966, new Object[]{iconCompatParcelizer, topUserCompanion, sampleVideos}, iRemoteActionCompatParcelizer);
            }
            int iRemoteActionCompatParcelizer2 = TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer();
            Object objIconCompatParcelizer = IconCompatParcelizer(186832967, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), -186832966, new Object[]{iconCompatParcelizer, topUserCompanion, sampleVideos}, iRemoteActionCompatParcelizer2);
            int i3 = 8 / 0;
            return objIconCompatParcelizer;
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
            SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
            int i = 2 % 2;
            int i2 = read + 33;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object objIconCompatParcelizer = IconCompatParcelizer(1551362845, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer(), -1551362842, new Object[]{(IconCompatParcelizer) iconCompatParcelizer.create(topUserCompanion, sampleVideos), getShowPopup.INSTANCE}, TimelineQueueEditor.MediaIdEqualityChecker.RemoteActionCompatParcelizer());
            int i4 = read;
            int i5 = i4 ^ 15;
            int i6 = (i4 & 15) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
            return objIconCompatParcelizer;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            IconCompatParcelizer iconCompatParcelizer2 = transferEnded.this.new IconCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer, (SampleVideos) objArr[2]);
            int i2 = read;
            int i3 = i2 ^ 65;
            int i4 = (((i2 & 65) | i3) << 1) - i3;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            iconCompatParcelizer2.RemoteActionCompatParcelizer = obj;
            IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer2;
            if (i5 == 0) {
                int i6 = 14 / 0;
            }
            return iconCompatParcelizer3;
        }
    }
}
