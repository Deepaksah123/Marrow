package kotlin;

import com.marrow.data.api.models.response.common.LearnMoreResponse;
import com.marrow.data.models.common.Editor;
import com.marrow2.data.user.remote.model.CourseModelV3;
import dagger.Lazy;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B=\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0004\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0019J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u001cJ*\u0010\u0015\u001a\u00020\u001e2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00130\u001dH\u0082@¢\u0006\u0004\b\u0015\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010\u0015\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u001cJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013H\u0082@¢\u0006\u0004\b\u0011\u0010\u001cR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0014\u0010 \u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010(\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010'R\u0014\u0010*\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010)"}, d2 = {"Lo/getInitialBitrateCountryGroupAssignment;", "Lo/getSingletonInstance;", "Ldagger/Lazy;", "Lo/DefaultBandwidthMeter;", "p0", "Lo/getCurrentContext;", "p1", "Lo/notifySpanRemoved;", "p2", "Lo/getStreamPositionUsForContent;", "p3", "Lo/onTransferInitializing;", "p4", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;Lo/notifySpanRemoved;Lo/getStreamPositionUsForContent;Lo/onTransferInitializing;)V", "", "Lcom/marrow/data/api/models/response/common/LearnMoreResponse;", "IconCompatParcelizer", "(IIILo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow/data/models/common/Editor;", "write", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lo/isTransferAtFullNetworkSpeed;", "read", "(IILo/SampleVideos;)Ljava/lang/Object;", "Lo/onTransferStart;", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getSubscriptionExpiresOn;", "", "(Lo/getSubscriptionExpiresOn;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Ldagger/Lazy;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "Lo/notifySpanRemoved;", "Lo/getStreamPositionUsForContent;", "Lo/onTransferInitializing;", "()Lo/getCurrentContext;", "AudioAttributesImplBaseParcelizer", "()Lo/DefaultBandwidthMeter;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getInitialBitrateCountryGroupAssignment implements getSingletonInstance {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getStreamPositionUsForContent RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Lazy<getCurrentContext> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final notifySpanRemoved read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy<DefaultBandwidthMeter> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final onTransferInitializing IconCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return getInitialBitrateCountryGroupAssignment.this.read(0, 0, this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return getInitialBitrateCountryGroupAssignment.this.write(0, 0, this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return getInitialBitrateCountryGroupAssignment.IconCompatParcelizer(getInitialBitrateCountryGroupAssignment.this, this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int write;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return getInitialBitrateCountryGroupAssignment.this.IconCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return getInitialBitrateCountryGroupAssignment.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class read extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return getInitialBitrateCountryGroupAssignment.this.read(this);
        }
    }

    @setSdkPayload
    public getInitialBitrateCountryGroupAssignment(Lazy<DefaultBandwidthMeter> lazy, Lazy<getCurrentContext> lazy2, notifySpanRemoved notifyspanremoved, getStreamPositionUsForContent getstreampositionusforcontent, onTransferInitializing ontransferinitializing) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(lazy2, "");
        toMagicModuleMetaRepoModel.write(notifyspanremoved, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(ontransferinitializing, "");
        this.write = lazy;
        this.AudioAttributesCompatParcelizer = lazy2;
        this.read = notifyspanremoved;
        this.RemoteActionCompatParcelizer = getstreampositionusforcontent;
        this.IconCompatParcelizer = ontransferinitializing;
    }

    public static final /* synthetic */ Object IconCompatParcelizer(getInitialBitrateCountryGroupAssignment getinitialbitratecountrygroupassignment, SampleVideos sampleVideos) {
        return getinitialbitratecountrygroupassignment.write((Pair<Integer, ? extends List<CourseModelV3>>) null, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    private final getCurrentContext write() {
        getCurrentContext getcurrentcontext = this.AudioAttributesCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getcurrentcontext, "");
        return getcurrentcontext;
    }

    private final DefaultBandwidthMeter IconCompatParcelizer() {
        DefaultBandwidthMeter defaultBandwidthMeter = this.write.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultBandwidthMeter, "");
        return defaultBandwidthMeter;
    }

    @Override // kotlin.getSingletonInstance
    public final Object IconCompatParcelizer(int i, int i2, int i3, SampleVideos<? super LearnMoreResponse> sampleVideos) {
        return IconCompatParcelizer().IconCompatParcelizer(i, i2, i3, sampleVideos);
    }

    @Override // kotlin.getSingletonInstance
    public final Object write(int i, SampleVideos<? super List<? extends Editor>> sampleVideos) {
        return IconCompatParcelizer().RemoteActionCompatParcelizer(i, sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getSingletonInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(int r5, int r6, kotlin.SampleVideos<? super kotlin.isTransferAtFullNetworkSpeed> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.getInitialBitrateCountryGroupAssignment.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesCompatParcelizer r0 = (o.getInitialBitrateCountryGroupAssignment.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesCompatParcelizer r0 = new o.getInitialBitrateCountryGroupAssignment$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r4 = r0.RemoteActionCompatParcelizer
            int r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.DefaultBandwidthMeter r4 = r4.IconCompatParcelizer()
            r0.write = r5
            r0.RemoteActionCompatParcelizer = r6
            r0.read = r3
            java.lang.Object r7 = r4.RemoteActionCompatParcelizer(r5, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.marrow2.data.course_config.remote.model.SampleVideosRSModel r7 = (com.marrow2.data.course_config.remote.model.SampleVideosRSModel) r7
            o.isTransferAtFullNetworkSpeed r4 = kotlin.getInitialBitrateEstimateForNetworkType.AudioAttributesCompatParcelizer(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInitialBitrateCountryGroupAssignment.read(int, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getSingletonInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(int r5, int r6, kotlin.SampleVideos<? super kotlin.onTransferStart> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.getInitialBitrateCountryGroupAssignment.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplApi26Parcelizer r0 = (o.getInitialBitrateCountryGroupAssignment.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.RemoteActionCompatParcelizer
            int r7 = r7 + r2
            r0.RemoteActionCompatParcelizer = r7
            goto L19
        L14:
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplApi26Parcelizer r0 = new o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplApi26Parcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r4 = r0.IconCompatParcelizer
            int r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.DefaultBandwidthMeter r4 = r4.IconCompatParcelizer()
            r0.write = r5
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = r4.IconCompatParcelizer(r5, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.marrow2.data.course_config.remote.model.ShareCopyRSModel r7 = (com.marrow2.data.course_config.remote.model.ShareCopyRSModel) r7
            o.onTransferStart r4 = kotlin.onBytesTransferred.IconCompatParcelizer(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInitialBitrateCountryGroupAssignment.write(int, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getSingletonInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super java.util.List<com.marrow2.data.user.remote.model.CourseModelV3>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.getInitialBitrateCountryGroupAssignment.read
            if (r0 == 0) goto L14
            r0 = r8
            o.getInitialBitrateCountryGroupAssignment$read r0 = (o.getInitialBitrateCountryGroupAssignment.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.getInitialBitrateCountryGroupAssignment$read r0 = new o.getInitialBitrateCountryGroupAssignment$read
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.read
            com.marrow.data.utils.product.exceptions.ResponseErrorException r7 = (com.marrow.data.utils.product.exceptions.ResponseErrorException) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            return r8
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            int r2 = r0.RemoteActionCompatParcelizer
            java.lang.Object r2 = r0.read
            o.getSubscriptionExpiresOn r2 = (kotlin.Pair) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            goto L86
        L49:
            int r2 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            goto L76
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            goto L5e
        L53:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            r0.write = r6     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            java.lang.Object r8 = r7.IconCompatParcelizer(r0)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            if (r8 == r1) goto Lb9
        L5e:
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            boolean r2 = r8.isEmpty()     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            if (r2 == 0) goto L8c
            o.getCurrentContext r8 = r7.write()     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r2 = 0
            r0.RemoteActionCompatParcelizer = r2     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r0.write = r5     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r5 = -1
            java.lang.Object r8 = r8.write(r5, r0)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            if (r8 == r1) goto Lb9
        L76:
            o.getSubscriptionExpiresOn r8 = (kotlin.Pair) r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r0.read = r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r0.RemoteActionCompatParcelizer = r2     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r0.write = r4     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            java.lang.Object r2 = r7.write(r8, r0)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            if (r2 != r1) goto L85
            goto Lb9
        L85:
            r2 = r8
        L86:
            java.lang.Object r8 = r2.IconCompatParcelizer()     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            java.util.List r8 = (java.util.List) r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
        L8c:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            o.getInitialBitrateCountryGroupAssignment$write r2 = new o.getInitialBitrateCountryGroupAssignment$write     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r2.<init>()     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            java.util.Comparator r2 = (java.util.Comparator) r2     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            o.getInitialBitrateCountryGroupAssignment$RemoteActionCompatParcelizer r4 = new o.getInitialBitrateCountryGroupAssignment$RemoteActionCompatParcelizer     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            r4.<init>(r2)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            java.util.Comparator r4 = (java.util.Comparator) r4     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            java.util.List r7 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r8, r4)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> La1
            return r7
        La1:
            r8 = move-exception
            com.marrow.data.models.ResponseError r2 = r8.getError()
            int r2 = r2.getErrorCode()
            r4 = 1472(0x5c0, float:2.063E-42)
            if (r2 != r4) goto Lbb
            r8 = 0
            r0.read = r8
            r0.write = r3
            java.lang.Object r7 = r7.IconCompatParcelizer(r0)
            if (r7 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            return r7
        Lbb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInitialBitrateCountryGroupAssignment.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r11, r12, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(kotlin.Pair<java.lang.Integer, ? extends java.util.List<com.marrow2.data.user.remote.model.CourseModelV3>> r11, kotlin.SampleVideos<? super kotlin.getShowPopup> r12) throws com.fasterxml.jackson.core.JsonProcessingException {
        /*
            r10 = this;
            boolean r0 = r12 instanceof o.getInitialBitrateCountryGroupAssignment.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto L14
            r0 = r12
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplBaseParcelizer r0 = (o.getInitialBitrateCountryGroupAssignment.AudioAttributesImplBaseParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.write
            int r12 = r12 + r2
            r0.write = r12
            goto L19
        L14:
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplBaseParcelizer r0 = new o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplBaseParcelizer
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r10 = r0.IconCompatParcelizer
            o.getSubscriptionExpiresOn r10 = (kotlin.Pair) r10
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            goto Lab
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r11 = r0.IconCompatParcelizer
            o.getSubscriptionExpiresOn r11 = (kotlin.Pair) r11
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            goto L53
        L46:
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            r0.IconCompatParcelizer = r11
            r0.write = r4
            java.lang.Object r12 = r10.write(r0)
            if (r12 == r1) goto Lae
        L53:
            r6 = r11
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r12.intValue()
            java.lang.Object r12 = r6.write()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L69
            o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
            return r10
        L69:
            com.marrow2.data.user.remote.model.CourseModelV3$Companion r11 = com.marrow2.data.user.remote.model.CourseModelV3.INSTANCE
            java.lang.Object r12 = r6.IconCompatParcelizer()
            java.util.List r12 = (java.util.List) r12
            o.getStreamPositionUsForContent r2 = r10.RemoteActionCompatParcelizer
            int r2 = r2.onRemoveQueueItem()
            o.getStreamPositionUsForContent r4 = r10.RemoteActionCompatParcelizer
            int r4 = r4.onPrepareFromUri()
            java.lang.String r7 = r11.getCourseNameWithEdition(r12, r2, r4)
            com.marrow2.data.user.remote.model.CourseModelV3$Companion r11 = com.marrow2.data.user.remote.model.CourseModelV3.INSTANCE
            java.lang.Object r12 = r6.IconCompatParcelizer()
            java.util.List r12 = (java.util.List) r12
            java.lang.String r8 = r11.toJson(r12)
            o.setRefreshToken r11 = kotlin.setRefreshToken.write
            o.CurrentQuery r11 = (kotlin.CurrentQuery) r11
            o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplApi21Parcelizer r12 = new o.getInitialBitrateCountryGroupAssignment$AudioAttributesImplApi21Parcelizer
            r9 = 0
            r4 = r12
            r5 = r10
            r4.<init>(r6, r7, r8, r9)
            o.MagicModuleSubmissionRequestBody r12 = (kotlin.MagicModuleSubmissionRequestBody) r12
            r10 = 0
            r0.IconCompatParcelizer = r10
            r0.AudioAttributesCompatParcelizer = r10
            r0.RemoteActionCompatParcelizer = r10
            r0.write = r3
            java.lang.Object r10 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r11, r12, r0)
            if (r10 != r1) goto Lab
            goto Lae
        Lab:
            o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
            return r10
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInitialBitrateCountryGroupAssignment.write(o.getSubscriptionExpiresOn, o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Pair<Integer, List<CourseModelV3>> IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        
            if (r5.read.read.read("courses_key_server", r5.write, r5) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L61
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L40
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                o.getInitialBitrateCountryGroupAssignment r6 = kotlin.getInitialBitrateCountryGroupAssignment.this
                o.notifySpanRemoved r6 = kotlin.getInitialBitrateCountryGroupAssignment.AudioAttributesCompatParcelizer(r6)
                o.getSubscriptionExpiresOn<java.lang.Integer, java.util.List<com.marrow2.data.user.remote.model.CourseModelV3>> r1 = r5.IconCompatParcelizer
                java.lang.Object r1 = r1.write()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.AudioAttributesCompatParcelizer = r3
                java.lang.String r3 = "course_version_server"
                java.lang.Object r6 = r6.RemoteActionCompatParcelizer(r3, r1, r4)
                if (r6 == r0) goto L64
            L40:
                o.getInitialBitrateCountryGroupAssignment r6 = kotlin.getInitialBitrateCountryGroupAssignment.this
                o.getStreamPositionUsForContent r6 = kotlin.getInitialBitrateCountryGroupAssignment.read(r6)
                java.lang.String r1 = r5.RemoteActionCompatParcelizer
                r6.IconCompatParcelizer(r1)
                o.getInitialBitrateCountryGroupAssignment r6 = kotlin.getInitialBitrateCountryGroupAssignment.this
                o.notifySpanRemoved r6 = kotlin.getInitialBitrateCountryGroupAssignment.AudioAttributesCompatParcelizer(r6)
                java.lang.String r1 = r5.write
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.AudioAttributesCompatParcelizer = r2
                java.lang.String r5 = "courses_key_server"
                java.lang.Object r5 = r6.read(r5, r1, r3)
                if (r5 != r0) goto L61
                goto L64
            L61:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L64:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getInitialBitrateCountryGroupAssignment.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplApi21Parcelizer(Pair<Integer, ? extends List<CourseModelV3>> pair, String str, String str2, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = pair;
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getInitialBitrateCountryGroupAssignment.this.new AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class write<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((CourseModelV3) t).getCourseSection()), Integer.valueOf(((CourseModelV3) t2).getCourseSection()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (write((kotlin.Pair<java.lang.Integer, ? extends java.util.List<com.marrow2.data.user.remote.model.CourseModelV3>>) r8, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getSingletonInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.getInitialBitrateCountryGroupAssignment.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r8
            o.getInitialBitrateCountryGroupAssignment$MediaBrowserCompatItemReceiver r0 = (o.getInitialBitrateCountryGroupAssignment.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.RemoteActionCompatParcelizer
            int r8 = r8 + r2
            r0.RemoteActionCompatParcelizer = r8
            goto L19
        L14:
            o.getInitialBitrateCountryGroupAssignment$MediaBrowserCompatItemReceiver r0 = new o.getInitialBitrateCountryGroupAssignment$MediaBrowserCompatItemReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r7 = r0.IconCompatParcelizer
            o.getSubscriptionExpiresOn r7 = (kotlin.Pair) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            goto L7f
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            goto L6a
        L41:
            java.lang.Object r2 = r0.IconCompatParcelizer
            o.getCurrentContext r2 = (kotlin.getCurrentContext) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            goto L5a
        L49:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getCurrentContext r2 = r7.write()     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            r0.IconCompatParcelizer = r2     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            r0.RemoteActionCompatParcelizer = r6     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            java.lang.Object r8 = r7.write(r0)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            if (r8 == r1) goto L76
        L5a:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            int r8 = r8.intValue()     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            r0.IconCompatParcelizer = r3     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            r0.RemoteActionCompatParcelizer = r5     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            java.lang.Object r8 = r2.write(r8, r0)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            if (r8 == r1) goto L76
        L6a:
            o.getSubscriptionExpiresOn r8 = (kotlin.Pair) r8     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            r0.IconCompatParcelizer = r3     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            r0.RemoteActionCompatParcelizer = r4     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            java.lang.Object r7 = r7.write(r8, r0)     // Catch: com.marrow.data.utils.product.exceptions.ResponseErrorException -> L77
            if (r7 != r1) goto L7f
        L76:
            return r1
        L77:
            r7 = move-exception
            com.marrow.data.models.ResponseError r7 = r7.getError()
            r7.getErrorCode()
        L7f:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInitialBitrateCountryGroupAssignment.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    private final Object write(SampleVideos<? super Integer> sampleVideos) {
        return this.read.IconCompatParcelizer("course_version_server", -1, sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r5.IconCompatParcelizer.read(r6, "course_parse", new java.util.HashMap<>()) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.util.List<com.marrow2.data.user.remote.model.CourseModelV3>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o.getInitialBitrateCountryGroupAssignment.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r6
            o.getInitialBitrateCountryGroupAssignment$MediaBrowserCompatCustomActionResultReceiver r0 = (o.getInitialBitrateCountryGroupAssignment.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.getInitialBitrateCountryGroupAssignment$MediaBrowserCompatCustomActionResultReceiver r0 = new o.getInitialBitrateCountryGroupAssignment$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r5 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L7a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4e
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.notifySpanRemoved r6 = r5.read
            r0.write = r4
            java.lang.String r2 = "courses_key_server"
            java.lang.String r4 = ""
            java.lang.Object r6 = r6.write(r2, r4, r0)
            if (r6 == r1) goto L7f
        L4e:
            java.lang.String r6 = (java.lang.String) r6
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L5e
            java.util.List r5 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer()
            return r5
        L5e:
            com.marrow2.data.user.remote.model.CourseModelV3$Companion r2 = com.marrow2.data.user.remote.model.CourseModelV3.INSTANCE     // Catch: java.lang.Exception -> L65
            java.util.List r5 = r2.fromJson(r6)     // Catch: java.lang.Exception -> L65
            return r5
        L65:
            r6 = move-exception
            o.onTransferInitializing r5 = r5.IconCompatParcelizer
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r2 = 0
            r0.IconCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r2
            r0.write = r3
            java.lang.String r0 = "course_parse"
            java.lang.Object r5 = kotlin.onTransferInitializing.RemoteActionCompatParcelizer(r5, r6, r0)
            if (r5 != r1) goto L7a
            goto L7f
        L7a:
            java.util.List r5 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer()
            return r5
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInitialBitrateCountryGroupAssignment.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public static final class RemoteActionCompatParcelizer<T> implements Comparator {
        private /* synthetic */ Comparator read;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.read.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Integer.valueOf(((CourseModelV3) t).getSortOrder()), Integer.valueOf(((CourseModelV3) t2).getSortOrder()));
        }

        public RemoteActionCompatParcelizer(Comparator comparator) {
            this.read = comparator;
        }
    }
}
