package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\r\u001a\u00020\u0006*\u00020\t2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getConstructorDetector;", "", "AudioAttributesCompatParcelizer", "(Lo/getConstructorDetector;)Z", "Lo/_shapeForToken;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/getConstructorDetector;Lo/_shapeForToken;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/handleBadMerge;", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "IconCompatParcelizer", "(Lo/handleBadMerge;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setOnHierarchyChangeListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return setOnHierarchyChangeListener.RemoteActionCompatParcelizer(null, null, this);
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(getConstructorDetector getconstructordetector) {
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = getconstructordetector.write().AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (listAudioAttributesCompatParcelizer.get(i).getRemoteActionCompatParcelizer()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (AudioAttributesCompatParcelizer(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object RemoteActionCompatParcelizer(kotlin.getConstructorDetector r7, kotlin._shapeForToken r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            boolean r0 = r9 instanceof o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.setOnHierarchyChangeListener$RemoteActionCompatParcelizer r0 = (o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.read
            int r9 = r9 + r2
            r0.read = r9
            goto L19
        L14:
            o.setOnHierarchyChangeListener$RemoteActionCompatParcelizer r0 = new o.setOnHierarchyChangeListener$RemoteActionCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.IconCompatParcelizer
            o._shapeForToken r7 = (kotlin._shapeForToken) r7
            java.lang.Object r8 = r0.write
            o.getConstructorDetector r8 = (kotlin.getConstructorDetector) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L53
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            boolean r9 = AudioAttributesCompatParcelizer(r7)
            if (r9 != 0) goto L72
        L46:
            r0.write = r7
            r0.IconCompatParcelizer = r8
            r0.read = r3
            java.lang.Object r9 = r7.read(r8, r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            o.DeserializationContext r9 = (kotlin.DeserializationContext) r9
            java.util.List r9 = r9.AudioAttributesCompatParcelizer()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L61:
            if (r4 >= r2) goto L72
            java.lang.Object r5 = r9.get(r4)
            o.getArrayBuilders r5 = (kotlin.getArrayBuilders) r5
            boolean r5 = r5.getRemoteActionCompatParcelizer()
            if (r5 != 0) goto L46
            int r4 = r4 + 1
            goto L61
        L72:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOnHierarchyChangeListener.RemoteActionCompatParcelizer(o.getConstructorDetector, o._shapeForToken, o.SampleVideos):java.lang.Object");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer$default(getConstructorDetector getconstructordetector, _shapeForToken _shapefortoken, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            _shapefortoken = _shapeForToken.read;
        }
        return RemoteActionCompatParcelizer(getconstructordetector, _shapefortoken, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ CurrentQuery read;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: CancellationException -> 0x0032, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:21:0x0044, B:23:0x0050, B:11:0x0026, B:14:0x002e), top: B:34:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.getConstructorDetector] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o.getConstructorDetector] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:19:0x003c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0071 -> B:19:0x003c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.AudioAttributesCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L34
                if (r1 == r5) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L3c
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L22:
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.util.concurrent.CancellationException -> L32
                goto L3c
            L2a:
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.util.concurrent.CancellationException -> L32
                goto L50
            L32:
                r8 = move-exception
                goto L5e
            L34:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                java.lang.Object r8 = r7.RemoteActionCompatParcelizer
                r1 = r8
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
            L3c:
                o.CurrentQuery r8 = r7.read
                boolean r8 = kotlin.getUserConfig.write(r8)
                if (r8 == 0) goto L75
                o.MagicModuleSubmissionRequestBody<o.getConstructorDetector, o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r8 = r7.IconCompatParcelizer     // Catch: java.util.concurrent.CancellationException -> L32
                r7.RemoteActionCompatParcelizer = r1     // Catch: java.util.concurrent.CancellationException -> L32
                r7.AudioAttributesCompatParcelizer = r5     // Catch: java.util.concurrent.CancellationException -> L32
                java.lang.Object r8 = r8.invoke(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L32
                if (r8 == r0) goto L73
            L50:
                r8 = r7
                o.SampleVideos r8 = (kotlin.SampleVideos) r8     // Catch: java.util.concurrent.CancellationException -> L32
                r7.RemoteActionCompatParcelizer = r1     // Catch: java.util.concurrent.CancellationException -> L32
                r7.AudioAttributesCompatParcelizer = r3     // Catch: java.util.concurrent.CancellationException -> L32
                java.lang.Object r8 = kotlin.setOnHierarchyChangeListener.RemoteActionCompatParcelizer$default(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L32
                if (r8 != r0) goto L3c
                goto L73
            L5e:
                o.CurrentQuery r6 = r7.read
                boolean r6 = kotlin.getUserConfig.write(r6)
                if (r6 == 0) goto L74
                r8 = r7
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r7.RemoteActionCompatParcelizer = r1
                r7.AudioAttributesCompatParcelizer = r2
                java.lang.Object r8 = kotlin.setOnHierarchyChangeListener.RemoteActionCompatParcelizer$default(r1, r4, r8, r5, r4)
                if (r8 != r0) goto L3c
            L73:
                return r0
            L74:
                throw r8
            L75:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnHierarchyChangeListener.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(CurrentQuery currentQuery, MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = currentQuery;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.read, this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final Object IconCompatParcelizer(handleBadMerge handlebadmerge, MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = handlebadmerge.read(new IconCompatParcelizer(sampleVideos.getWrite(), magicModuleSubmissionRequestBody, null), sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }
}
