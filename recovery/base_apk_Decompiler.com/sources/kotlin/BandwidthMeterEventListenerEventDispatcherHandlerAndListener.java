package kotlin;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.LoggedUser;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.getDownloadRequest;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J3\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\"\u0006\u0012\u0002\b\u00030\u0015H\u0003¢\u0006\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener;", "", "Landroid/content/Context;", "p0", "Lo/getNextChunkIndex;", "p1", "Lo/beginSection;", "p2", "Lo/TopUserCompanion;", "p3", "<init>", "(Landroid/content/Context;Lo/getNextChunkIndex;Lo/beginSection;Lo/TopUserCompanion;)V", "", "RemoteActionCompatParcelizer", "()V", "", "AudioAttributesCompatParcelizer", "()Z", "read", "IconCompatParcelizer", "", "Ljava/lang/Class;", "(Landroid/content/Context;[Ljava/lang/Class;)Z", "Landroid/content/Context;", "write", "Lo/getNextChunkIndex;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/beginSection;", "MediaBrowserCompatItemReceiver", "Lo/TopUserCompanion;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BandwidthMeterEventListenerEventDispatcherHandlerAndListener {
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private final getNextChunkIndex IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final beginSection AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final TopUserCompanion RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Context write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object write = new Object();
    private static AtomicLong RemoteActionCompatParcelizer = new AtomicLong(0);

    public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i8 | i2));
        int i10 = ~((~i2) | i3 | i5);
        int i11 = i9 | i10;
        int i12 = (~(i2 | i8 | i3)) | i10;
        int i13 = i3 | i5;
        int i14 = i3 + i5 + i + ((-1865910757) * i6) + ((-1665280692) * i4);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-906343980)) - 215482368) + ((-906343980) * i5) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i) + ((-1540882432) * i6) + ((-912261120) * i4) + (1566179328 * i15);
        int i17 = (i3 * (-52584228)) + 761582770 + (i5 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i * (-52583813)) + (i6 * (-195242759)) + (i4 * 1657508740) + (i15 * (-834797568));
        switch (i16 + (i17 * i17 * 1251344384)) {
            case 1:
                return read(objArr);
            case 2:
                return RemoteActionCompatParcelizer(objArr);
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                return IconCompatParcelizer(objArr);
            case 5:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 6:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            default:
                return write(objArr);
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (i2 ^ 2) + ((i2 & 2) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        MediaBrowserCompatSearchResultReceiver = i5;
        int i6 = i4 % 2;
        AtomicLong atomicLong = RemoteActionCompatParcelizer;
        int i7 = i5 + 5;
        AudioAttributesImplApi26Parcelizer = i7 % 128;
        int i8 = i7 % 2;
        return atomicLong;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = (BandwidthMeterEventListenerEventDispatcherHandlerAndListener) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = ((i2 & 52) + (i2 | 52)) - 1;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        beginSection beginsection = bandwidthMeterEventListenerEventDispatcherHandlerAndListener.AudioAttributesCompatParcelizer;
        if (i4 != 0) {
            return beginsection;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = (BandwidthMeterEventListenerEventDispatcherHandlerAndListener) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 & 63;
        int i4 = -(-((i2 ^ 63) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
            ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem, 931346119, getExamName.onRemoveQueueItem(), -931346117, getExamName.onRemoveQueueItem())).booleanValue();
            throw null;
        }
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        boolean zBooleanValue = ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem2, 931346119, getExamName.onRemoveQueueItem(), -931346117, getExamName.onRemoveQueueItem())).booleanValue();
        int i6 = MediaBrowserCompatSearchResultReceiver;
        int i7 = ((i6 | 109) << 1) - (i6 ^ 109);
        AudioAttributesImplApi26Parcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        obj.hashCode();
        throw null;
    }

    @setSdkPayload
    public BandwidthMeterEventListenerEventDispatcherHandlerAndListener(Context context, getNextChunkIndex getnextchunkindex, beginSection beginsection, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(context, "");
        int i = AudioAttributesImplApi26Parcelizer;
        int i2 = ((i ^ 113) - (~(-(-((i & 113) << 1))))) - 1;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
            toMagicModuleMetaRepoModel.write(beginsection, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(beginsection, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        this.write = context;
        this.IconCompatParcelizer = getnextchunkindex;
        this.AudioAttributesCompatParcelizer = beginsection;
        this.RemoteActionCompatParcelizer = topUserCompanion;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = (BandwidthMeterEventListenerEventDispatcherHandlerAndListener) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            buildResolutionString.IconCompatParcelizer("SyncLogger", "sync started");
            int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
            if (!((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem, 341879052, getExamName.onRemoveQueueItem(), -341879051, getExamName.onRemoveQueueItem())).booleanValue()) {
                int i3 = MediaBrowserCompatSearchResultReceiver;
                int i4 = (i3 & 113) + (i3 | 113);
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            TopUserCompanion topUserCompanion = bandwidthMeterEventListenerEventDispatcherHandlerAndListener.RemoteActionCompatParcelizer;
            write writeVar = bandwidthMeterEventListenerEventDispatcherHandlerAndListener.new write(null);
            int i6 = AudioAttributesImplApi26Parcelizer;
            int i7 = ((i6 | 47) << 1) - (i6 ^ 47);
            MediaBrowserCompatSearchResultReceiver = i7 % 128;
            int i8 = i7 % 2;
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, writeVar, 3);
            int i9 = MediaBrowserCompatSearchResultReceiver;
            int i10 = (i9 ^ 93) + ((i9 & 93) << 1);
            AudioAttributesImplApi26Parcelizer = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        buildResolutionString.IconCompatParcelizer("SyncLogger", "sync started");
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem2, 341879052, getExamName.onRemoveQueueItem(), -341879051, getExamName.onRemoveQueueItem())).booleanValue();
        obj.hashCode();
        throw null;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        private int IconCompatParcelizer;

        public static /* synthetic */ Object IconCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~i3;
            int i9 = (~(i7 | i8)) | (~(i8 | i6));
            int i10 = ~i6;
            int i11 = i9 | (~(i10 | i5 | i3));
            int i12 = i8 | i5;
            int i13 = (~(i6 | i5)) | (~i12);
            int i14 = i12 | i10;
            int i15 = i5 + i3 + i2 + ((-1468046718) * i) + (327422179 * i4);
            int i16 = i15 * i15;
            int i17 = (677926197 * i5) + 1810235392 + (1154460365 * i3) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i2) + (1933049856 * i) + (743702528 * i4) + (286654464 * i16);
            int i18 = (i5 * (-645773371)) + 280972133 + (i3 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i2 * (-645772719)) + (i * 1523302178) + (i4 * 1475409363) + (i16 * (-1007288320));
            int i19 = i17 + (i18 * i18 * (-492175360));
            return i19 != 1 ? i19 != 2 ? i19 != 3 ? AudioAttributesCompatParcelizer(objArr) : read(objArr) : IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        
            if (r15.AudioAttributesCompatParcelizer(r6) == r4) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r15) {
            /*
                Method dump skipped, instruction units count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BandwidthMeterEventListenerEventDispatcherHandlerAndListener.write.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            return (SampleVideos) IconCompatParcelizer(new Object[]{this, obj, sampleVideos}, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -2079960655, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 2079960658, iRemoteActionCompatParcelizer);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(new Object[]{this, topUserCompanion, sampleVideos}, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -1786870309, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 1786870311, iRemoteActionCompatParcelizer);
        }

        private Object read(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(new Object[]{this, topUserCompanion, sampleVideos}, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 1261225504, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -1261225504, iRemoteActionCompatParcelizer);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(new Object[]{this, obj}, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 29031544, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -29031543, iRemoteActionCompatParcelizer);
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            write writeVar = (write) objArr[0];
            TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
            SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
            int i = 2 % 2;
            int i2 = (-2) - ((read + 6) ^ (-1));
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            write writeVar2 = (write) writeVar.create(topUserCompanion, sampleVideos);
            if (i3 == 0) {
                Object[] objArr2 = {writeVar2, getShowPopup.INSTANCE};
                int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                return IconCompatParcelizer(objArr2, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 29031544, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -29031543, iRemoteActionCompatParcelizer);
            }
            Object[] objArr3 = {writeVar2, getShowPopup.INSTANCE};
            int iRemoteActionCompatParcelizer2 = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            IconCompatParcelizer(objArr3, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 29031544, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -29031543, iRemoteActionCompatParcelizer2);
            throw null;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            write writeVar = (write) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = (i2 & (-8)) | ((~i2) & 7);
            int i4 = -(-((i2 & 7) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            read = i5 % 128;
            Object obj3 = null;
            TopUserCompanion topUserCompanion = (TopUserCompanion) obj;
            SampleVideos sampleVideos = (SampleVideos) obj2;
            if (i5 % 2 == 0) {
                IconCompatParcelizer(new Object[]{writeVar, topUserCompanion, sampleVideos}, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 1261225504, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -1261225504, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                obj3.hashCode();
                throw null;
            }
            Object objIconCompatParcelizer = IconCompatParcelizer(new Object[]{writeVar, topUserCompanion, sampleVideos}, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 1261225504, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), -1261225504, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            int i6 = RemoteActionCompatParcelizer;
            int i7 = (((i6 | 68) << 1) - (i6 ^ 68)) - 1;
            read = i7 % 128;
            if (i7 % 2 != 0) {
                return objIconCompatParcelizer;
            }
            obj3.hashCode();
            throw null;
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            write writeVar = (write) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            write writeVar2 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.this.new write((SampleVideos) objArr[2]);
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 & 81;
            int i4 = (i3 - (~(-(-((i2 ^ 81) | i3))))) - 1;
            int i5 = i4 % 128;
            read = i5;
            write writeVar3 = writeVar2;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i6 = (-2) - ((i5 + 58) ^ (-1));
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 40 / 0;
            }
            return writeVar3;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        boolean zIsUserCollegeDataAvailable;
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = (BandwidthMeterEventListenerEventDispatcherHandlerAndListener) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 107;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if ((i2 % 2 != 0 ? System.currentTimeMillis() * RemoteActionCompatParcelizer.get() : System.currentTimeMillis() - RemoteActionCompatParcelizer.get()) < 900000) {
            int i3 = MediaBrowserCompatSearchResultReceiver;
            int i4 = i3 ^ 77;
            int i5 = (i3 & 77) << 1;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            AudioAttributesImplApi26Parcelizer = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 101;
            MediaBrowserCompatSearchResultReceiver = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            throw null;
        }
        LoggedUser loggedUserIconCompatParcelizer = bandwidthMeterEventListenerEventDispatcherHandlerAndListener.IconCompatParcelizer.IconCompatParcelizer();
        if (loggedUserIconCompatParcelizer != null) {
            int i10 = MediaBrowserCompatSearchResultReceiver;
            int i11 = ((i10 | 73) << 1) - (i10 ^ 73);
            AudioAttributesImplApi26Parcelizer = i11 % 128;
            int i12 = i11 % 2;
            if (!TextUtils.isEmpty(loggedUserIconCompatParcelizer.getInfo().getId())) {
                int i13 = MediaBrowserCompatSearchResultReceiver;
                int i14 = i13 & 89;
                int i15 = -(-(i13 | 89));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                AudioAttributesImplApi26Parcelizer = i16 % 128;
                int i17 = i16 % 2;
                College college = loggedUserIconCompatParcelizer.getInfo().getCollege();
                if (i17 != 0) {
                    zIsUserCollegeDataAvailable = college.isUserCollegeDataAvailable();
                    int i18 = 8 / 0;
                } else {
                    zIsUserCollegeDataAvailable = college.isUserCollegeDataAvailable();
                }
                return Boolean.valueOf(zIsUserCollegeDataAvailable);
            }
        }
        int i19 = AudioAttributesImplApi26Parcelizer;
        int i20 = i19 & 119;
        int i21 = (((i19 | 119) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
        MediaBrowserCompatSearchResultReceiver = i21 % 128;
        int i22 = i21 % 2;
        return false;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = (BandwidthMeterEventListenerEventDispatcherHandlerAndListener) objArr[0];
        synchronized (write) {
            try {
                RemoteActionCompatParcelizer.set(System.currentTimeMillis());
                int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
                if (!((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem, -588288265, getExamName.onRemoveQueueItem(), 588288271, getExamName.onRemoveQueueItem())).booleanValue()) {
                    bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write.startService(new Intent(bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write, (Class<?>) maybeNotifyDownstreamFormat.class));
                } else {
                    if (!setSeekMap.write()) {
                        return false;
                    }
                    bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write.stopService(new Intent(bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write, (Class<?>) maybeNotifyDownstreamFormat.class));
                    bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write.startService(new Intent(bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write, (Class<?>) maybeNotifyDownstreamFormat.class));
                }
                return true;
            } catch (IllegalStateException unused) {
                return false;
            }
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        Class[] clsArr;
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = (BandwidthMeterEventListenerEventDispatcherHandlerAndListener) objArr[0];
        int i = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(bandwidthMeterEventListenerEventDispatcherHandlerAndListener);
        int i2 = 1966075157 & iIdentityHashCode;
        int i3 = (1966075157 | iIdentityHashCode) & (~i2);
        int i4 = ~iIdentityHashCode;
        int i5 = ~((i3 & i2) | (i3 ^ i2));
        int i6 = ((~i5) & 1555286757) | (i5 & (-1555286758));
        int i7 = i5 & 1555286757;
        int i8 = -(-(((i7 & i6) | (i6 ^ i7)) * (-318)));
        int i9 = (-1008086940) & i8;
        int i10 = -(-((i8 ^ (-1008086940)) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        int i12 = 1555286757 & iIdentityHashCode;
        int i13 = (~i12) & (1555286757 | iIdentityHashCode);
        int i14 = (i12 & i13) | (i13 ^ i12);
        int i15 = (i14 | (~i14)) & (~i14);
        int i16 = ~iIdentityHashCode;
        int i17 = (i16 & (-1966075158)) | (i16 ^ (-1966075158));
        int i18 = ((-1555286758) & i17) | (i17 & 1555286757) | ((~i17) & (-1555286758));
        int i19 = (i18 | (~i18)) & (~i18);
        int i20 = -(-(((i15 & i19) | ((~i19) & i15) | ((~i15) & i19)) * 318));
        int i21 = i11 ^ i20;
        int i22 = ((i20 & i11) | i21) << 1;
        int i23 = -i21;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        int i25 = (~iIdentityHashCode) | 1555286757;
        int i26 = i25 ^ (-1966075158);
        int i27 = i25 & (-1966075158);
        int i28 = ~((i27 & i26) | (i26 ^ i27));
        int i29 = (i4 & (-1411631110)) | (1411631109 & iIdentityHashCode);
        int i30 = iIdentityHashCode & (-1411631110);
        int i31 = ~((i30 & i29) | (i29 ^ i30));
        int i32 = ((i31 & i28) | (i28 ^ i31)) * 318;
        int i33 = i24 & i32;
        int i34 = -(-(i32 | i24));
        int i35 = (i33 & i34) + (i34 | i33);
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int i36 = ~iOnRemoveQueueItem;
        int i37 = (-1066399927) & i36;
        int i38 = (((-1066399927) | i36) & (~i37)) | i37;
        int i39 = (i38 & (-2002156766)) | (i38 ^ (-2002156766));
        int i40 = (i39 | (~i39)) & (~i39);
        int i41 = ((-1078985802) & i36) | (1078985801 & iOnRemoveQueueItem);
        int i42 = (-1078985802) & iOnRemoveQueueItem;
        int i43 = ~((i42 & i41) | (i41 ^ i42));
        int i44 = i40 & i43;
        int i45 = -(-((((i40 | i43) & (~i44)) | i44) * (-302)));
        int i46 = ((-1944571792) ^ i45) + ((i45 & (-1944571792)) << 1);
        int i47 = (~(((-923170965) & iOnRemoveQueueItem) | ((-923170965) ^ iOnRemoveQueueItem))) * (-604);
        int i48 = (i46 | i47) << 1;
        int i49 = -(i47 ^ i46);
        int i50 = (i48 & i49) + (i49 | i48);
        int i51 = (i36 & (-2002156766)) | (2002156765 & iOnRemoveQueueItem);
        int i52 = iOnRemoveQueueItem & (-2002156766);
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = (-2145385728) & i53;
        if (i35 <= (-2) - (((i50 - (~(-(~((((i53 | (-2145385728)) & (~i54)) | i54) * 302))))) - 1) ^ (-1))) {
            clsArr = new Class[4];
            clsArr[1] = maybeNotifyDownstreamFormat.class;
        } else {
            clsArr = new Class[2];
            clsArr[0] = maybeNotifyDownstreamFormat.class;
        }
        clsArr[1] = getAdjustedUpstreamFormat.class;
        int i55 = AudioAttributesImplApi26Parcelizer;
        int i56 = (i55 ^ 15) + ((i55 & 15) << 1);
        MediaBrowserCompatSearchResultReceiver = i56 % 128;
        int i57 = i56 % 2;
        int i58 = 0;
        while (i58 < 2) {
            int i59 = MediaBrowserCompatSearchResultReceiver;
            int i60 = (-2) - (((i59 ^ 42) + ((i59 & 42) << 1)) ^ (-1));
            int i61 = i60 % 128;
            AudioAttributesImplApi26Parcelizer = i61;
            Class cls = i60 % 2 != 0 ? clsArr[i58] : clsArr[i58];
            Context context = bandwidthMeterEventListenerEventDispatcherHandlerAndListener.write;
            Class[] clsArr2 = new Class[1];
            int i62 = i61 ^ 13;
            int i63 = (((i61 & 13) | i62) << 1) - i62;
            MediaBrowserCompatSearchResultReceiver = i63 % 128;
            if (i63 % 2 == 0) {
                toMagicModuleMetaRepoModel.read(cls, "");
                clsArr2[0] = cls;
            } else {
                toMagicModuleMetaRepoModel.read(cls, "");
                clsArr2[0] = cls;
            }
            int i64 = (-2) - ((AudioAttributesImplApi26Parcelizer + 84) ^ (-1));
            MediaBrowserCompatSearchResultReceiver = i64 % 128;
            Object obj = null;
            if (i64 % 2 == 0) {
                ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{context, clsArr2}, getExamName.onRemoveQueueItem(), -254151303, getExamName.onRemoveQueueItem(), 254151310, getExamName.onRemoveQueueItem())).booleanValue();
                obj.hashCode();
                throw null;
            }
            if (((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{context, clsArr2}, getExamName.onRemoveQueueItem(), -254151303, getExamName.onRemoveQueueItem(), 254151310, getExamName.onRemoveQueueItem())).booleanValue()) {
                int i65 = AudioAttributesImplApi26Parcelizer;
                int i66 = i65 & 121;
                int i67 = (i65 ^ 121) | i66;
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                MediaBrowserCompatSearchResultReceiver = i68 % 128;
                if (i68 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i69 = i58 & 76;
            int i70 = (i58 ^ 76) | i69;
            int i71 = (i69 & i70) + (i70 | i69);
            int i72 = i71 & (-75);
            int i73 = -(-((i71 ^ (-75)) | i72));
            i58 = ((i72 & i73) << 1) + (i72 ^ i73);
            int i74 = AudioAttributesImplApi26Parcelizer;
            int i75 = i74 & 119;
            int i76 = (i74 ^ 119) | i75;
            int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
            MediaBrowserCompatSearchResultReceiver = i77 % 128;
            int i78 = i77 % 2;
        }
        int i79 = AudioAttributesImplApi26Parcelizer + 69;
        MediaBrowserCompatSearchResultReceiver = i79 % 128;
        int i80 = i79 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object MediaBrowserCompatItemReceiver(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener.MediaBrowserCompatItemReceiver(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.BandwidthMeterEventListenerEventDispatcherHandlerAndListener$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t"}, d2 = {"Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "write", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        private Companion() {
        }

        public static void RemoteActionCompatParcelizer() {
            AtomicLong atomicLong;
            long j;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 91;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
                atomicLong = (AtomicLong) BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), new Object[0], iOnRemoveQueueItem, -1783526607, getExamName.onRemoveQueueItem(), 1783526610, getExamName.onRemoveQueueItem());
                j = 1;
            } else {
                int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
                atomicLong = (AtomicLong) BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), new Object[0], iOnRemoveQueueItem2, -1783526607, getExamName.onRemoveQueueItem(), 1783526610, getExamName.onRemoveQueueItem());
                j = 0;
            }
            atomicLong.set(j);
            int i3 = IconCompatParcelizer + 83;
            write = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        int i = AudioAttributesImplApi21Parcelizer;
        int i2 = i & 105;
        int i3 = (i2 - (~(-(-((i ^ 105) | i2))))) - 1;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ AtomicLong write() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return (AtomicLong) read(getExamName.onRemoveQueueItem(), new Object[0], iOnRemoveQueueItem, -1783526607, getExamName.onRemoveQueueItem(), 1783526610, getExamName.onRemoveQueueItem());
    }

    public static final /* synthetic */ beginSection RemoteActionCompatParcelizer(BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener) {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return (beginSection) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem, 181200284, getExamName.onRemoveQueueItem(), -181200279, getExamName.onRemoveQueueItem());
    }

    public static final /* synthetic */ boolean write(BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener) {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem, 500248057, getExamName.onRemoveQueueItem(), -500248053, getExamName.onRemoveQueueItem())).booleanValue();
    }

    private final boolean IconCompatParcelizer() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem, -588288265, getExamName.onRemoveQueueItem(), 588288271, getExamName.onRemoveQueueItem())).booleanValue();
    }

    @SafeVarargs
    private static boolean read(Context p0, Class<?>... p1) {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{p0, p1}, iOnRemoveQueueItem, -254151303, getExamName.onRemoveQueueItem(), 254151310, getExamName.onRemoveQueueItem())).booleanValue();
    }

    private final boolean read() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem, 931346119, getExamName.onRemoveQueueItem(), -931346117, getExamName.onRemoveQueueItem())).booleanValue();
    }

    private final boolean AudioAttributesCompatParcelizer() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        return ((Boolean) read(getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem, 341879052, getExamName.onRemoveQueueItem(), -341879051, getExamName.onRemoveQueueItem())).booleanValue();
    }

    public final void RemoteActionCompatParcelizer() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        read(getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem, 1896980334, getExamName.onRemoveQueueItem(), -1896980334, getExamName.onRemoveQueueItem());
    }
}
