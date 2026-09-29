package kotlin;

import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a^\u0010\f\u001a\u00020\u0006*\u00020\u00102\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\f\u0010\u0014\u001a\u0088\u0001\u0010\u0019\u001a\u00020\u0006*\u00020\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u00152\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00162\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a@\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u001b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\u001a0\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0086@¢\u0006\u0004\b\u000e\u0010\r\u001ad\u0010\u001d\u001a\u00020\u0006*\u00020\u00102\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u001d\u0010\u0014\u001a\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u001d\u0010\u000f\u001a\u001b\u0010\u001d\u001a\u00020\u000b*\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010 \u001a\u001b\u0010\u0019\u001a\u00020\u001c*\u00020!2\u0006\u0010\u0002\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u0019\u0010\"\"\u0014\u0010\b\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$\"\u0014\u0010\u000e\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$"}, d2 = {"Lo/getConstructorDetector;", "Lo/findClass;", "p0", "Lkotlin/Function2;", "Lo/getArrayBuilders;", "Lo/getReferencedType;", "", "p1", "AudioAttributesCompatParcelizer", "(Lo/getConstructorDetector;JLo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "read", "(Lo/getConstructorDetector;JLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "(Lo/getConstructorDetector;JLo/SampleVideos;)Ljava/lang/Object;", "Lo/handleBadMerge;", "Lkotlin/Function0;", "p2", "p3", "(Lo/handleBadMerge;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/superDispatchKeyEvent;", "Lkotlin/Function3;", "p4", "p5", "write", "(Lo/handleBadMerge;Lo/superDispatchKeyEvent;Lo/getModuleData;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/handleWeirdNumberValue;", "", "RemoteActionCompatParcelizer", "(Lo/getConstructorDetector;JILo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/DeserializationContext;", "(Lo/DeserializationContext;J)Z", "Lo/CoercionConfig;", "(Lo/CoercionConfig;I)F", "Lo/assignParameter;", "F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setConstraintSet {
    private static final float AudioAttributesCompatParcelizer;
    private static final float read;
    private static final float write;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return setConstraintSet.IconCompatParcelizer(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return setConstraintSet.read((getConstructorDetector) null, 0L, (getAnswerMap<? super getArrayBuilders, getShowPopup>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return setConstraintSet.IconCompatParcelizer(null, 0L, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        /* synthetic */ Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return setConstraintSet.RemoteActionCompatParcelizer(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        float RemoteActionCompatParcelizer;
        Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return setConstraintSet.AudioAttributesCompatParcelizer((getConstructorDetector) null, 0L, (MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super getReferencedType, getShowPopup>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        float write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return setConstraintSet.RemoteActionCompatParcelizer(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x018d -> B:60:0x0193). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object AudioAttributesCompatParcelizer(kotlin.getConstructorDetector r18, long r19, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.getArrayBuilders, ? super kotlin.getReferencedType, kotlin.getShowPopup> r21, kotlin.SampleVideos<? super kotlin.getArrayBuilders> r22) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setConstraintSet.AudioAttributesCompatParcelizer(o.getConstructorDetector, long, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object read(kotlin.getConstructorDetector r4, long r5, kotlin.getAnswerMap<? super kotlin.getArrayBuilders, kotlin.getShowPopup> r7, kotlin.SampleVideos<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof o.setConstraintSet.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.setConstraintSet$AudioAttributesImplApi21Parcelizer r0 = (o.setConstraintSet.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.IconCompatParcelizer
            int r8 = r8 + r2
            r0.IconCompatParcelizer = r8
            goto L19
        L14:
            o.setConstraintSet$AudioAttributesImplApi21Parcelizer r0 = new o.setConstraintSet$AudioAttributesImplApi21Parcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            o.getAnswerMap r4 = (kotlin.getAnswerMap) r4
            java.lang.Object r5 = r0.read
            o.getConstructorDetector r5 = (kotlin.getConstructorDetector) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            r7 = r4
            r4 = r5
            goto L4c
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
        L3f:
            r0.read = r4
            r0.RemoteActionCompatParcelizer = r7
            r0.IconCompatParcelizer = r3
            java.lang.Object r8 = IconCompatParcelizer(r4, r5, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            o.getArrayBuilders r8 = (kotlin.getArrayBuilders) r8
            if (r8 != 0) goto L56
            r4 = 0
            java.lang.Boolean r4 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r4
        L56:
            boolean r5 = kotlin.bufferAsCopyOfValue.AudioAttributesCompatParcelizer(r8)
            if (r5 == 0) goto L61
            java.lang.Boolean r4 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
            return r4
        L61:
            r7.invoke(r8)
            long r5 = r8.getIconCompatParcelizer()
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setConstraintSet.read(o.getConstructorDetector, long, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (kotlin.bufferAsCopyOfValue.AudioAttributesImplApi21Parcelizer(r11) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:22:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object IconCompatParcelizer(kotlin.getConstructorDetector r17, long r18, kotlin.SampleVideos<? super kotlin.getArrayBuilders> r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setConstraintSet.IconCompatParcelizer(o.getConstructorDetector, long, o.SampleVideos):java.lang.Object");
    }

    public static final Object read(handleBadMerge handlebadmerge, final getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super getReferencedType, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write(handlebadmerge, null, new getModuleData() { // from class: o.setDesignInformation
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setConstraintSet.AudioAttributesCompatParcelizer(getanswermap, (getArrayBuilders) obj, (getArrayBuilders) obj2, (getReferencedType) obj3);
            }
        }, new getAnswerMap() { // from class: o.setId
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setConstraintSet.RemoteActionCompatParcelizer(getcreatedondatems, (getArrayBuilders) obj);
            }
        }, getcreatedondatems2, new getCreatedOnDateMs() { // from class: o.setMinHeight
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(setConstraintSet.IconCompatParcelizer());
            }
        }, magicModuleSubmissionRequestBody, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, getArrayBuilders getarraybuilders, getArrayBuilders getarraybuilders2, getReferencedType getreferencedtype) {
        getanswermap.invoke(getReferencedType.read(getarraybuilders2.getRead()));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems, getArrayBuilders getarraybuilders) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    public static final Object write(handleBadMerge handlebadmerge, superDispatchKeyEvent superdispatchkeyevent, getModuleData<? super getArrayBuilders, ? super getArrayBuilders, ? super getReferencedType, getShowPopup> getmoduledata, getAnswerMap<? super getArrayBuilders, getShowPopup> getanswermap, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<Boolean> getcreatedondatems2, MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super getReferencedType, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = setOnHierarchyChangeListener.IconCompatParcelizer(handlebadmerge, new MediaBrowserCompatCustomActionResultReceiver(getcreatedondatems2, new MagicModuleUseCaseImplWhenMappings.read(), superdispatchkeyevent, getmoduledata, magicModuleSubmissionRequestBody, getcreatedondatems, getanswermap, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ superDispatchKeyEvent AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ getCreatedOnDateMs<Boolean> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ getAnswerMap<getArrayBuilders, getShowPopup> IconCompatParcelizer;
        float MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.read MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        Object MediaBrowserCompatSearchResultReceiver;
        int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        Object MediaDescriptionCompat;
        boolean MediaMetadataCompat;
        Object RatingCompat;
        final /* synthetic */ MagicModuleSubmissionRequestBody<getArrayBuilders, getReferencedType, getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ Object onCommand;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
        final /* synthetic */ getModuleData<getArrayBuilders, getArrayBuilders, getReferencedType, getShowPopup> write;

        /* JADX WARN: Code restructure failed: missing block: B:150:0x04dd, code lost:
        
            if (r6 == r1) goto L188;
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x0551, code lost:
        
            if (kotlin.getReferencedType.IconCompatParcelizer(kotlin.bufferAsCopyOfValue.AudioAttributesImplApi26Parcelizer(r7)) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L149;
         */
        /* JADX WARN: Code restructure failed: missing block: B:189:0x0285, code lost:
        
            r5 = r3;
            r3 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x014c, code lost:
        
            if (r5 == r1) goto L188;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x015a, code lost:
        
            if (r2 != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x02c2, code lost:
        
            if (r5 != r1) goto L77;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:110:0x03bb, B:111:0x03c2], limit reached: 204 */
        /* JADX WARN: Path cross not found for [B:113:0x03c8, B:110:0x03bb], limit reached: 204 */
        /* JADX WARN: Path cross not found for [B:173:0x0546, B:163:0x051a], limit reached: 204 */
        /* JADX WARN: Path cross not found for [B:63:0x0276, B:36:0x01df], limit reached: 204 */
        /* JADX WARN: Path cross not found for [B:63:0x0276, B:38:0x01e5], limit reached: 204 */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0384  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0397  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03ce  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x03ff  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0465  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x048a  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0580  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0586  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x03b5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:207:0x01d5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01a9 A[PHI: r2 r3 r4 r5 r6 r9 r12 r13
          0x01a9: PHI (r2v17 o.getAccessibilityNodeProvider) = (r2v13 o.getAccessibilityNodeProvider), (r2v18 o.getAccessibilityNodeProvider) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r3v14 o.getConstructorDetector) = (r3v10 o.getConstructorDetector), (r3v17 o.getConstructorDetector) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r4v12 o.getConstructorDetector) = (r4v8 o.getConstructorDetector), (r4v13 o.getConstructorDetector) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r5v11 o.getArrayBuilders) = (r5v7 o.getArrayBuilders), (r5v12 o.getArrayBuilders) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r6v6 float) = (r6v3 float), (r6v7 float) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r9v7 o.MagicModuleUseCaseImplWhenMappings$read) = (r9v1 o.MagicModuleUseCaseImplWhenMappings$read), (r9v8 o.MagicModuleUseCaseImplWhenMappings$read) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r12v6 java.lang.Object) = (r12v4 java.lang.Object), (r12v16 java.lang.Object) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r13v4 o.MagicModuleUseCaseImplWhenMappings$read) = (r13v2 o.MagicModuleUseCaseImplWhenMappings$read), (r13v5 o.MagicModuleUseCaseImplWhenMappings$read) binds: [B:11:0x00c2, B:27:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0287  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0458 -> B:134:0x045b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0479 -> B:69:0x0285). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x04dd -> B:152:0x04e1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0176 -> B:63:0x0276). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0178 -> B:26:0x018d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x020e -> B:62:0x0272). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0242 -> B:62:0x0272). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0268 -> B:58:0x026a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x02f8 -> B:75:0x02a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x034d -> B:136:0x0461). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 1446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setConstraintSet.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        MediaBrowserCompatCustomActionResultReceiver(getCreatedOnDateMs<Boolean> getcreatedondatems, MagicModuleUseCaseImplWhenMappings.read readVar, superDispatchKeyEvent superdispatchkeyevent, getModuleData<? super getArrayBuilders, ? super getArrayBuilders, ? super getReferencedType, getShowPopup> getmoduledata, MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super getReferencedType, getShowPopup> magicModuleSubmissionRequestBody, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getAnswerMap<? super getArrayBuilders, getShowPopup> getanswermap, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
            this.MediaBrowserCompatItemReceiver = readVar;
            this.AudioAttributesCompatParcelizer = superdispatchkeyevent;
            this.write = getmoduledata;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = getcreatedondatems2;
            this.IconCompatParcelizer = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
            mediaBrowserCompatCustomActionResultReceiver.onCommand = obj;
            return mediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x019d -> B:60:0x01a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object RemoteActionCompatParcelizer(kotlin.getConstructorDetector r20, long r21, int r23, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.getArrayBuilders, ? super java.lang.Float, kotlin.getShowPopup> r24, kotlin.SampleVideos<? super kotlin.getArrayBuilders> r25) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setConstraintSet.RemoteActionCompatParcelizer(o.getConstructorDetector, long, int, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
    
        if (r0 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L54;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00cc, B:44:0x00f7], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:23:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object IconCompatParcelizer(kotlin.getConstructorDetector r19, long r20, kotlin.getAnswerMap<? super kotlin.getArrayBuilders, kotlin.getShowPopup> r22, kotlin.SampleVideos<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setConstraintSet.IconCompatParcelizer(o.getConstructorDetector, long, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getReferencedType getreferencedtype) {
        return getShowPopup.INSTANCE;
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer$default(handleBadMerge handlebadmerge, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            getanswermap = new getAnswerMap() { // from class: o.setMaxHeight
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return setConstraintSet.RemoteActionCompatParcelizer((getReferencedType) obj2);
                }
            };
        }
        getAnswerMap getanswermap2 = getanswermap;
        if ((i & 2) != 0) {
            getcreatedondatems = new getCreatedOnDateMs() { // from class: o.setOnConstraintsChanged
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setConstraintSet.read();
                }
            };
        }
        getCreatedOnDateMs getcreatedondatems3 = getcreatedondatems;
        if ((i & 4) != 0) {
            getcreatedondatems2 = new getCreatedOnDateMs() { // from class: o.setOptimizationLevel
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setConstraintSet.AudioAttributesImplBaseParcelizer();
                }
            };
        }
        return RemoteActionCompatParcelizer(handlebadmerge, getanswermap2, getcreatedondatems3, getcreatedondatems2, magicModuleSubmissionRequestBody, sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer() {
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<getArrayBuilders, Float, getShowPopup> AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatItemReceiver;
        final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
        
            if (r13 == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r12.AudioAttributesImplApi26Parcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto Lac
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1e:
                java.lang.Object r1 = r12.IconCompatParcelizer
                o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer r1 = (o.MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer) r1
                java.lang.Object r3 = r12.MediaBrowserCompatItemReceiver
                o.getConstructorDetector r3 = (kotlin.getConstructorDetector) r3
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L74
            L2a:
                java.lang.Object r1 = r12.MediaBrowserCompatItemReceiver
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L4e
            L32:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                java.lang.Object r13 = r12.MediaBrowserCompatItemReceiver
                o.getConstructorDetector r13 = (kotlin.getConstructorDetector) r13
                r8 = r12
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r12.MediaBrowserCompatItemReceiver = r13
                r12.AudioAttributesImplApi26Parcelizer = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r13
                java.lang.Object r1 = kotlin.isSpanStillValid.RemoteActionCompatParcelizer$default(r5, r6, r7, r8, r9, r10)
                if (r1 == r0) goto Lc2
                r11 = r1
                r1 = r13
                r13 = r11
            L4e:
                o.getArrayBuilders r13 = (kotlin.getArrayBuilders) r13
                o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer r10 = new o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer
                r10.<init>()
                long r5 = r13.getIconCompatParcelizer()
                int r7 = r13.getMediaBrowserCompatItemReceiver()
                o.setMinWidth r8 = new o.setMinWidth
                r8.<init>()
                r9 = r12
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r12.MediaBrowserCompatItemReceiver = r1
                r12.IconCompatParcelizer = r10
                r12.AudioAttributesImplApi26Parcelizer = r3
                r4 = r1
                java.lang.Object r13 = kotlin.setConstraintSet.RemoteActionCompatParcelizer(r4, r5, r7, r8, r9)
                if (r13 == r0) goto Lc2
                r3 = r1
                r1 = r10
            L74:
                o.getArrayBuilders r13 = (kotlin.getArrayBuilders) r13
                if (r13 == 0) goto Lbf
                o.getAnswerMap<o.getReferencedType, o.getShowPopup> r4 = r12.RemoteActionCompatParcelizer
                long r5 = r13.getRead()
                o.getReferencedType r5 = kotlin.getReferencedType.read(r5)
                r4.invoke(r5)
                o.MagicModuleSubmissionRequestBody<o.getArrayBuilders, java.lang.Float, o.getShowPopup> r4 = r12.AudioAttributesCompatParcelizer
                float r1 = r1.read
                java.lang.Float r1 = kotlin.QBankStatsResponse.write(r1)
                r4.invoke(r13, r1)
                long r4 = r13.getIconCompatParcelizer()
                o.Group r13 = new o.Group
                o.MagicModuleSubmissionRequestBody<o.getArrayBuilders, java.lang.Float, o.getShowPopup> r1 = r12.AudioAttributesCompatParcelizer
                r13.<init>()
                r1 = r12
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6 = 0
                r12.MediaBrowserCompatItemReceiver = r6
                r12.IconCompatParcelizer = r6
                r12.AudioAttributesImplApi26Parcelizer = r2
                java.lang.Object r13 = kotlin.setConstraintSet.IconCompatParcelizer(r3, r4, r13, r1)
                if (r13 != r0) goto Lac
                goto Lc2
            Lac:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lba
                o.getCreatedOnDateMs<o.getShowPopup> r12 = r12.read
                r12.invoke()
                goto Lbf
            Lba:
                o.getCreatedOnDateMs<o.getShowPopup> r12 = r12.write
                r12.invoke()
            Lbf:
                o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                return r12
            Lc2:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setConstraintSet.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getArrayBuilders getarraybuilders, float f) {
            getarraybuilders.RemoteActionCompatParcelizer();
            remoteActionCompatParcelizer.read = f;
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getArrayBuilders getarraybuilders) {
            magicModuleSubmissionRequestBody.invoke(getarraybuilders, Float.valueOf(Float.intBitsToFloat((int) bufferAsCopyOfValue.MediaBrowserCompatCustomActionResultReceiver(getarraybuilders))));
            getarraybuilders.RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        MediaBrowserCompatItemReceiver(getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super Float, getShowPopup> magicModuleSubmissionRequestBody, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getanswermap;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = getcreatedondatems;
            this.write = getcreatedondatems2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write, sampleVideos);
            mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver = obj;
            return mediaBrowserCompatItemReceiver;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final Object RemoteActionCompatParcelizer(handleBadMerge handlebadmerge, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super Float, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = setOnHierarchyChangeListener.IconCompatParcelizer(handlebadmerge, new MediaBrowserCompatItemReceiver(getanswermap, magicModuleSubmissionRequestBody, getcreatedondatems, getcreatedondatems2, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r10v3, types: [o.MagicModuleUseCaseImplWhenMappings$write] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Object, o.getArrayBuilders] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object RemoteActionCompatParcelizer(kotlin.getConstructorDetector r9, long r10, kotlin.SampleVideos<? super kotlin.getArrayBuilders> r12) {
        /*
            boolean r0 = r12 instanceof o.setConstraintSet.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r12
            o.setConstraintSet$IconCompatParcelizer r0 = (o.setConstraintSet.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.read
            int r12 = r12 + r2
            r0.read = r12
            goto L19
        L14:
            o.setConstraintSet$IconCompatParcelizer r0 = new o.setConstraintSet$IconCompatParcelizer
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer r9 = (o.MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer) r9
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            o.MagicModuleUseCaseImplWhenMappings$write r10 = (o.MagicModuleUseCaseImplWhenMappings.write) r10
            java.lang.Object r11 = r0.IconCompatParcelizer
            o.getArrayBuilders r11 = (kotlin.getArrayBuilders) r11
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)     // Catch: kotlin.constructSpecializedType -> Lb8
            goto Lab
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            o.DeserializationContext r12 = r9.write()
            boolean r12 = RemoteActionCompatParcelizer(r12, r10)
            if (r12 == 0) goto L4e
            return r4
        L4e:
            o.DeserializationContext r12 = r9.write()
            java.util.List r12 = r12.AudioAttributesCompatParcelizer()
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L5e:
            if (r5 >= r2) goto L74
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            o.getArrayBuilders r7 = (kotlin.getArrayBuilders) r7
            long r7 = r7.getIconCompatParcelizer()
            boolean r7 = kotlin.findClass.AudioAttributesCompatParcelizer(r7, r10)
            if (r7 != 0) goto L75
            int r5 = r5 + 1
            goto L5e
        L74:
            r6 = r4
        L75:
            r11 = r6
            o.getArrayBuilders r11 = (kotlin.getArrayBuilders) r11
            if (r11 != 0) goto L7b
            return r4
        L7b:
            o.MagicModuleUseCaseImplWhenMappings$write r10 = new o.MagicModuleUseCaseImplWhenMappings$write
            r10.<init>()
            o.MagicModuleUseCaseImplWhenMappings$write r12 = new o.MagicModuleUseCaseImplWhenMappings$write
            r12.<init>()
            r12.write = r11
            o.CoercionConfig r2 = r9.AudioAttributesImplApi26Parcelizer()
            long r5 = r2.IconCompatParcelizer()
            o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer r2 = new o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer     // Catch: kotlin.constructSpecializedType -> Lb8
            r2.<init>()     // Catch: kotlin.constructSpecializedType -> Lb8
            o.setConstraintSet$write r7 = new o.setConstraintSet$write     // Catch: kotlin.constructSpecializedType -> Lb8
            r7.<init>(r2, r12, r10, r4)     // Catch: kotlin.constructSpecializedType -> Lb8
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7     // Catch: kotlin.constructSpecializedType -> Lb8
            r0.IconCompatParcelizer = r11     // Catch: kotlin.constructSpecializedType -> Lb8
            r0.RemoteActionCompatParcelizer = r10     // Catch: kotlin.constructSpecializedType -> Lb8
            r0.AudioAttributesCompatParcelizer = r2     // Catch: kotlin.constructSpecializedType -> Lb8
            r0.read = r3     // Catch: kotlin.constructSpecializedType -> Lb8
            java.lang.Object r9 = r9.write(r5, r7, r0)     // Catch: kotlin.constructSpecializedType -> Lb8
            if (r9 != r1) goto Laa
            return r1
        Laa:
            r9 = r2
        Lab:
            boolean r9 = r9.IconCompatParcelizer     // Catch: kotlin.constructSpecializedType -> Lb8
            if (r9 == 0) goto Lb7
            T r9 = r10.write     // Catch: kotlin.constructSpecializedType -> Lb8
            o.getArrayBuilders r9 = (kotlin.getArrayBuilders) r9     // Catch: kotlin.constructSpecializedType -> Lb8
            if (r9 != 0) goto Lb6
            return r11
        Lb6:
            return r9
        Lb7:
            return r4
        Lb8:
            T r9 = r10.write
            o.getArrayBuilders r9 = (kotlin.getArrayBuilders) r9
            if (r9 == 0) goto Lbf
            r11 = r9
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setConstraintSet.RemoteActionCompatParcelizer(o.getConstructorDetector, long, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getArrayBuilders> AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getArrayBuilders> RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer write;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        
            r2 = r6 ? 1 : 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e5 A[EDGE_INSN: B:65:0x00e5->B:41:0x00e5 BREAK  A[LOOP:0: B:36:0x00d2->B:40:0x00e2], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v10, types: [T] */
        /* JADX WARN: Type inference failed for: r9v11, types: [T, o.getArrayBuilders] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c1 -> B:35:0x00c4). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setConstraintSet.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleUseCaseImplWhenMappings.write<getArrayBuilders> writeVar, MagicModuleUseCaseImplWhenMappings.write<getArrayBuilders> writeVar2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = audioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = writeVar;
            this.AudioAttributesCompatParcelizer = writeVar2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            writeVar.AudioAttributesImplApi21Parcelizer = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(DeserializationContext deserializationContext, long j) {
        getArrayBuilders getarraybuilders;
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = deserializationContext.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                getarraybuilders = null;
                break;
            }
            getarraybuilders = listAudioAttributesCompatParcelizer.get(i);
            if (findClass.AudioAttributesCompatParcelizer(getarraybuilders.getIconCompatParcelizer(), j)) {
                break;
            }
            i++;
        }
        getArrayBuilders getarraybuilders2 = getarraybuilders;
        if (getarraybuilders2 != null && getarraybuilders2.getRemoteActionCompatParcelizer()) {
            z = true;
        }
        return true ^ z;
    }

    public static final float write(CoercionConfig coercionConfig, int i) {
        return handleWeirdNumberValue.read(i, handleWeirdNumberValue.INSTANCE.RemoteActionCompatParcelizer()) ? coercionConfig.RemoteActionCompatParcelizer() * write : coercionConfig.RemoteActionCompatParcelizer();
    }

    static {
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(0.125f);
        AudioAttributesCompatParcelizer = fIconCompatParcelizer;
        float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(18.0f);
        read = fIconCompatParcelizer2;
        write = fIconCompatParcelizer / fIconCompatParcelizer2;
    }
}
