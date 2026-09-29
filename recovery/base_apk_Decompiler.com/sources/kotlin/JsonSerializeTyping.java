package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001aB\u0010\f\u001a\u00020\u0004*\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0082@¢\u0006\u0004\b\f\u0010\r\"\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/JsonSerializeInclusion;", "Lkotlin/Function2;", "Lo/typing;", "Lo/SampleVideos;", "", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/JsonSerializeInclusion;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/_configureGenerator;", "Lo/findPrimaryPropertySerializer;", "p1", "read", "(Lo/_configureGenerator;Lo/findPrimaryPropertySerializer;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CharacterEscapes;", "write", "Lo/CharacterEscapes;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonSerializeTyping {
    private static final CharacterEscapes<findPrimaryPropertySerializer> write = resetAsNaN.read(AnonymousClass4.IconCompatParcelizer);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return JsonSerializeTyping.read(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object read;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return JsonSerializeTyping.AudioAttributesCompatParcelizer(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object AudioAttributesCompatParcelizer(kotlin.JsonSerializeInclusion r4, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.typing, ? super kotlin.SampleVideos<?>, ? extends java.lang.Object> r5, kotlin.SampleVideos<?> r6) {
        /*
            boolean r0 = r6 instanceof o.JsonSerializeTyping.read
            if (r0 == 0) goto L14
            r0 = r6
            o.JsonSerializeTyping$read r0 = (o.JsonSerializeTyping.read) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            o.JsonSerializeTyping$read r0 = new o.JsonSerializeTyping$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L60
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o._handleOddName$IconCompatParcelizer r6 = r4.getRead()
            boolean r6 = r6.getRatingCompat()
            if (r6 == 0) goto L66
            o.Module r4 = (kotlin.Module) r4
            o._configureGenerator r6 = kotlin.collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(r4)
            o._assertNotNull r4 = kotlin.collectLongDefaults.AudioAttributesImplApi26Parcelizer(r4)
            o._getCharDesc r4 = r4.getParcelableVolumeInfo()
            o.CharacterEscapes<o.findPrimaryPropertySerializer> r2 = kotlin.JsonSerializeTyping.write
            o.getTokenColumnNr r2 = (kotlin.getTokenColumnNr) r2
            java.lang.Object r4 = r4.write(r2)
            o.findPrimaryPropertySerializer r4 = (kotlin.findPrimaryPropertySerializer) r4
            r0.IconCompatParcelizer = r3
            java.lang.Object r4 = read(r6, r4, r5, r0)
            if (r4 != r1) goto L60
            return r1
        L60:
            o.PlanDetailsCreator r4 = new o.PlanDetailsCreator
            r4.<init>()
            throw r4
        L66:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonSerializeTyping.AudioAttributesCompatParcelizer(o.JsonSerializeInclusion, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.JsonSerializeTyping$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/findPrimaryPropertySerializer;", "IconCompatParcelizer", "()Lo/findPrimaryPropertySerializer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<findPrimaryPropertySerializer> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final findPrimaryPropertySerializer invoke() {
            return null;
        }

        AnonymousClass4() {
            super(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r5.write(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r6.read(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object read(kotlin._configureGenerator r5, kotlin.findPrimaryPropertySerializer r6, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.typing, ? super kotlin.SampleVideos<?>, ? extends java.lang.Object> r7, kotlin.SampleVideos<?> r8) {
        /*
            boolean r0 = r8 instanceof o.JsonSerializeTyping.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.JsonSerializeTyping$IconCompatParcelizer r0 = (o.JsonSerializeTyping.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.JsonSerializeTyping$IconCompatParcelizer r0 = new o.JsonSerializeTyping$IconCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L56
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L47
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            if (r6 != 0) goto L4d
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r5 = r5.write(r7, r0)
            if (r5 != r1) goto L47
            goto L55
        L47:
            o.PlanDetailsCreator r5 = new o.PlanDetailsCreator
            r5.<init>()
            throw r5
        L4d:
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r6.read(r5, r7, r0)
            if (r5 != r1) goto L56
        L55:
            return r1
        L56:
            o.PlanDetailsCreator r5 = new o.PlanDetailsCreator
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonSerializeTyping.read(o._configureGenerator, o.findPrimaryPropertySerializer, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }
}
