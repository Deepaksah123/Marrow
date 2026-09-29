package com.marrow2.core.sync;

import com.google.android.gms.internal.location.zze;
import com.marrow2.core.network.model.NetworkApiResponse;
import kotlin.Allocator;
import kotlin.AllocatorAllocationNode;
import kotlin.BandwidthMeterEventListener;
import kotlin.BundledChunkExtractor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.SampleVideos;
import kotlin.ServerSideAdInsertionMediaSourceSampleStreamImpl;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.setPreferImmediatelyAvailableCredentials;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.trim;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\n\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\fH¦@¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\n\u001a\u00020\u000fH&¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00178\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u001e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001f"}, d2 = {"Lcom/marrow2/core/sync/PaginatedSyncTask;", "T", "Lo/trim;", "Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;", "p0", "Lo/BundledChunkExtractor;", "p1", "<init>", "(Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;Lo/BundledChunkExtractor;)V", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "", "(Ljava/lang/Object;ZLo/SampleVideos;)Ljava/lang/Object;", "Lo/BandwidthMeterEventListener;", "()Lo/BandwidthMeterEventListener;", "RemoteActionCompatParcelizer", "(Lcom/marrow2/core/network/model/NetworkApiResponse;)V", "Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;", "read", "Lo/BundledChunkExtractor;", "write", "Lo/Allocator;", "eventBus", "Lo/Allocator;", "getEventBus", "()Lo/Allocator;", "setEventBus", "(Lo/Allocator;)V", "Lo/AllocatorAllocationNode;", "()Lo/AllocatorAllocationNode;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaginatedSyncTask<T> implements trim {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int read = 1;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final BundledChunkExtractor write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ServerSideAdInsertionMediaSourceSampleStreamImpl read;

    @setSdkPayload
    public Allocator eventBus;

    static final class AudioAttributesCompatParcelizer<T> extends getTotalMcq {
        private static int MediaDescriptionCompat = 0;
        private static int RatingCompat = 1;
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ PaginatedSyncTask<T> AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(PaginatedSyncTask<T> paginatedSyncTask, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplApi26Parcelizer = paginatedSyncTask;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objAudioAttributesCompatParcelizer;
            int i = 2 % 2;
            zze.AudioAttributesCompatParcelizer();
            System.identityHashCode(this);
            this.MediaBrowserCompatItemReceiver = obj;
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            int i3 = i2 & Integer.MIN_VALUE;
            int i4 = (i2 | Integer.MIN_VALUE) & (~i3);
            int i5 = MediaDescriptionCompat + 109;
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
            this.MediaBrowserCompatCustomActionResultReceiver = (i4 & i3) | (i4 ^ i3);
            Object[] objArr = {this.AudioAttributesImplApi26Parcelizer, this};
            int i7 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
            if (i6 == 0) {
                objAudioAttributesCompatParcelizer = PaginatedSyncTask.AudioAttributesCompatParcelizer(897953413, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i7, -897953411, objArr, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
                int i8 = 63 / 0;
            } else {
                objAudioAttributesCompatParcelizer = PaginatedSyncTask.AudioAttributesCompatParcelizer(897953413, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i7, -897953411, objArr, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
            }
            int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
            int i9 = (-987257361) & iAudioAttributesCompatParcelizer;
            int i10 = ~(((~iAudioAttributesCompatParcelizer) & (-987257361)) | (987257360 & iAudioAttributesCompatParcelizer) | i9);
            int i11 = 189300259 & i10;
            int i12 = (i10 | 189300259) & (~i11);
            int i13 = -(-(((i12 & i11) | (i12 ^ i11)) * (-658)));
            int i14 = (-1208152143) & i13;
            int i15 = i13 | (-1208152143);
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = ((i16 | 1844925440) << 1) - (1844925440 ^ i16);
            int i18 = ~((iAudioAttributesCompatParcelizer ^ (-987257361)) | i9);
            int i19 = ((i18 & 172513792) | (172513792 ^ i18)) * 658;
            int i20 = ((i17 & i19) - (~(-(-(i19 | i17))))) - 1;
            int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
            int i21 = ~iAudioAttributesCompatParcelizer2;
            int i22 = ~i21;
            int i23 = (235952084 & i21) | ((-235952085) & i22);
            int i24 = i21 & (-235952085);
            int i25 = (i23 & i24) | (i23 ^ i24);
            int i26 = (i25 | (~i25)) & (~i25);
            int i27 = 683229351 ^ i26;
            int i28 = i26 & 683229351;
            int i29 = -(-(((i28 & i27) | (i27 ^ i28)) * 764));
            int i30 = 271115358 & i29;
            int i31 = -(-((i29 ^ 271115358) | i30));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            int i33 = ~((i21 & 683229351) | ((-683229352) & i21) | (i22 & 683229351));
            int i34 = ((~i33) & (-783898616)) | (783898615 & i33);
            int i35 = i33 & (-783898616);
            int i36 = (i32 - (~(((i35 & i34) | (i34 ^ i35)) * (-1528)))) - 1;
            int i37 = (iAudioAttributesCompatParcelizer2 | (~iAudioAttributesCompatParcelizer2)) & (~iAudioAttributesCompatParcelizer2);
            int i38 = i37 & (-235952085);
            int i39 = (i37 | (-235952085)) & (~i38);
            int i40 = ~((i39 & i38) | (i39 ^ i38));
            int i41 = (-648615796) & i40;
            int i42 = i36 ^ (-(-((((i40 | (-648615796)) & (~i41)) | i41) * 764)));
            if (i20 <= ((((r9 & i36) | i42) << 1) - (~(-i42))) - 1) {
                return objAudioAttributesCompatParcelizer;
            }
            throw null;
        }
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i | i4)) | (~(i5 | i4));
        int i10 = ~i5;
        int i11 = (~(i10 | i4)) | i;
        int i12 = (~(i4 | i | i5)) | (~(i8 | i10));
        int i13 = i + i5 + i2 + ((-373584967) * i3) + ((-1711780345) * i6);
        int i14 = i13 * i13;
        int i15 = (i * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i2) + ((-375259136) * i3) + ((-1109524480) * i6) + (585564160 * i14);
        int i16 = ((i * 235012993) - 778813113) + (i5 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i2 * 235013625) + (i3 * 915899377) + (i6 * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        return i17 != 1 ? i17 != 2 ? read(objArr) : IconCompatParcelizer(objArr) : write(objArr);
    }

    public abstract Object IconCompatParcelizer(T t, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    public abstract Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<T>> sampleVideos);

    public abstract BandwidthMeterEventListener IconCompatParcelizer();

    public abstract AllocatorAllocationNode RemoteActionCompatParcelizer();

    public PaginatedSyncTask(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor) {
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        this.read = serverSideAdInsertionMediaSourceSampleStreamImpl;
        this.write = bundledChunkExtractor;
    }

    public final Allocator getEventBus() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (((i2 | 72) << 1) - (i2 ^ 72)) - 1;
        int i4 = i3 % 128;
        AudioAttributesImplBaseParcelizer = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Allocator allocator = this.eventBus;
        if (allocator != null) {
            int i5 = ((i4 | 121) << 1) - (i4 ^ 121);
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            return allocator;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i7 = AudioAttributesImplApi26Parcelizer + 23;
        AudioAttributesImplBaseParcelizer = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final void setEventBus(Allocator allocator) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = ((i2 | 15) << 1) - (i2 ^ 15);
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(allocator, "");
        this.eventBus = allocator;
        int i5 = AudioAttributesImplBaseParcelizer;
        int i6 = ((i5 | 79) << 1) - (i5 ^ 79);
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x030f, code lost:
    
        if (r3 == r6) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:76:0x0343, B:80:0x0359], limit reached: 198 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06db A[Catch: Exception -> 0x06fa, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x06fa, blocks: (B:72:0x0321, B:74:0x0339, B:81:0x035a, B:84:0x0385, B:128:0x06db, B:130:0x06ea, B:134:0x06ee), top: B:193:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06ff A[Catch: Exception -> 0x06f8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x06f8, blocks: (B:47:0x0236, B:50:0x024d, B:52:0x0264, B:54:0x027a, B:56:0x028c, B:58:0x02a7, B:61:0x02bc, B:63:0x02e9, B:65:0x02fb, B:136:0x06f4, B:146:0x06ff, B:148:0x070c, B:152:0x0710, B:153:0x0715, B:154:0x0718, B:33:0x013e, B:37:0x016f), top: B:194:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0710 A[Catch: Exception -> 0x06f8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x06f8, blocks: (B:47:0x0236, B:50:0x024d, B:52:0x0264, B:54:0x027a, B:56:0x028c, B:58:0x02a7, B:61:0x02bc, B:63:0x02e9, B:65:0x02fb, B:136:0x06f4, B:146:0x06ff, B:148:0x070c, B:152:0x0710, B:153:0x0715, B:154:0x0718, B:33:0x013e, B:37:0x016f), top: B:194:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024d A[Catch: Exception -> 0x06f8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x06f8, blocks: (B:47:0x0236, B:50:0x024d, B:52:0x0264, B:54:0x027a, B:56:0x028c, B:58:0x02a7, B:61:0x02bc, B:63:0x02e9, B:65:0x02fb, B:136:0x06f4, B:146:0x06ff, B:148:0x070c, B:152:0x0710, B:153:0x0715, B:154:0x0718, B:33:0x013e, B:37:0x016f), top: B:194:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bc A[Catch: Exception -> 0x06f8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x06f8, blocks: (B:47:0x0236, B:50:0x024d, B:52:0x0264, B:54:0x027a, B:56:0x028c, B:58:0x02a7, B:61:0x02bc, B:63:0x02e9, B:65:0x02fb, B:136:0x06f4, B:146:0x06ff, B:148:0x070c, B:152:0x0710, B:153:0x0715, B:154:0x0718, B:33:0x013e, B:37:0x016f), top: B:194:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0385 A[Catch: Exception -> 0x06fa, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x06fa, blocks: (B:72:0x0321, B:74:0x0339, B:81:0x035a, B:84:0x0385, B:128:0x06db, B:130:0x06ea, B:134:0x06ee), top: B:193:0x0321 }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.marrow2.core.sync.PaginatedSyncTask] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.marrow2.core.sync.PaginatedSyncTask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v41, types: [int] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v54, types: [int] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v103 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [com.marrow2.core.sync.PaginatedSyncTask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v79, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x04ba -> B:102:0x04be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.sync.PaginatedSyncTask.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r7) {
        /*
            r0 = 0
            r0 = r7[r0]
            com.marrow2.core.sync.PaginatedSyncTask r0 = (com.marrow2.core.sync.PaginatedSyncTask) r0
            r1 = 1
            r7 = r7[r1]
            com.marrow2.core.network.model.NetworkApiResponse r7 = (com.marrow2.core.network.model.NetworkApiResponse) r7
            r2 = 2
            int r3 = r2 % r2
            int r3 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer
            r4 = r3 & 81
            int r5 = ~r4
            r3 = r3 | 81
            r3 = r3 & r5
            int r4 = r4 << r1
            int r4 = -r4
            int r4 = -r4
            int r4 = ~r4
            int r3 = r3 - r4
            int r3 = r3 - r1
            int r4 = r3 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer = r4
            int r3 = r3 % r2
            com.marrow.data.api.models.response.Data r7 = r7.getData()
            r3 = 0
            if (r7 == 0) goto L5e
            int r4 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer
            r5 = r4 | 65
            int r5 = r5 << r1
            r6 = r4 & (-66)
            int r4 = ~r4
            r4 = r4 & 65
            r4 = r4 | r6
            int r4 = -r4
            r6 = r5 | r4
            int r6 = r6 << r1
            r4 = r4 ^ r5
            int r6 = r6 - r4
            int r4 = r6 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer = r4
            int r6 = r6 % r2
            com.marrow.data.api.models.response.EnvironmentData r7 = r7.environmentData
            if (r7 == 0) goto L5e
            int r4 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer
            int r4 = r4 + 51
            int r5 = r4 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer = r5
            int r4 = r4 % r2
            com.marrow.data.api.models.response.VersionUpdateData r7 = r7.versionData
            int r4 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer
            r5 = r4 & 81
            r4 = r4 ^ 81
            r4 = r4 | r5
            r6 = r5 | r4
            int r6 = r6 << r1
            r4 = r4 ^ r5
            int r6 = r6 - r4
            int r4 = r6 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer = r4
            int r6 = r6 % r2
            goto L70
        L5e:
            int r7 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer
            r4 = r7 | 104(0x68, float:1.46E-43)
            int r4 = r4 << r1
            r7 = r7 ^ 104(0x68, float:1.46E-43)
            int r4 = r4 - r7
            r7 = r4 ^ (-1)
            int r7 = (-2) - r7
            int r4 = r7 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer = r4
            int r7 = r7 % r2
            r7 = r3
        L70:
            o.BundledChunkExtractor r0 = r0.write
            if (r7 == 0) goto La5
            int r4 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer
            int r4 = r4 + 63
            int r5 = r4 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer = r5
            int r4 = r4 % r2
            if (r4 != 0) goto La1
            java.lang.String r7 = r7.toJSON()
            int r4 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer
            r5 = r4 ^ 37
            r6 = r4 & 37
            r5 = r5 | r6
            int r5 = r5 << r1
            r6 = r4 & (-38)
            int r4 = ~r4
            r4 = r4 & 37
            r4 = r4 | r6
            int r4 = -r4
            r6 = r5 | r4
            int r6 = r6 << r1
            r4 = r4 ^ r5
            int r6 = r6 - r4
            int r4 = r6 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer = r4
            int r6 = r6 % r2
            if (r6 != 0) goto La6
            r4 = 3
            int r4 = r4 / r4
            goto La6
        La1:
            r7.toJSON()
            throw r3
        La5:
            r7 = r3
        La6:
            r0.MediaDescriptionCompat(r7)
            int r7 = com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplBaseParcelizer
            r0 = r7 ^ 69
            r7 = r7 & 69
            int r7 = r7 << r1
            int r0 = r0 + r7
            int r7 = r0 % 128
            com.marrow2.core.sync.PaginatedSyncTask.AudioAttributesImplApi26Parcelizer = r7
            int r0 = r0 % r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.core.sync.PaginatedSyncTask.read(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.marrow2.core.sync.PaginatedSyncTask$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/core/sync/PaginatedSyncTask$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        int i = read;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void RemoteActionCompatParcelizer(NetworkApiResponse<T> p0) {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        AudioAttributesCompatParcelizer(1584923821, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i, -1584923821, new Object[]{this, p0}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
    }

    static /* synthetic */ <T> Object RemoteActionCompatParcelizer(PaginatedSyncTask<T> paginatedSyncTask, SampleVideos<? super getShowPopup> sampleVideos) {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return AudioAttributesCompatParcelizer(897953413, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i, -897953411, new Object[]{paginatedSyncTask, sampleVideos}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
    }

    @Override // kotlin.trim
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return AudioAttributesCompatParcelizer(-1494277173, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i, 1494277174, new Object[]{this, sampleVideos}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        PaginatedSyncTask paginatedSyncTask = (PaginatedSyncTask) objArr[0];
        SampleVideos sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 & 65;
        int i4 = -(-(i2 | 65));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
            return AudioAttributesCompatParcelizer(897953413, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i6, -897953411, new Object[]{paginatedSyncTask, sampleVideos}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
        }
        int i7 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        AudioAttributesCompatParcelizer(897953413, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i7, -897953411, new Object[]{paginatedSyncTask, sampleVideos}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
        throw null;
    }
}
