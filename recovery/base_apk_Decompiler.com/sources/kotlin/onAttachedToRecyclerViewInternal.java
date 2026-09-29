package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.onAttachedToRecyclerViewInternal;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u000f\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0005\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0005\u0010\u0013\u001a,\u0010\u0005\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0005\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u000e*\u00020\rH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u000f\u0010\u001a"}, d2 = {"Lo/_handleOddName;", "Lkotlin/Function1;", "", "", "p0", "write", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;", "Lo/handleBadMerge;", "Lo/add;", "Lo/MediaRouteButton;", "p1", "IconCompatParcelizer", "(Lo/handleBadMerge;Lo/add;Lo/MediaRouteButton;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getConstructorDetector;", "Lo/DeserializationContext;", "AudioAttributesCompatParcelizer", "(Lo/getConstructorDetector;Lo/MediaRouteButton;Lo/DeserializationContext;Lo/SampleVideos;)Ljava/lang/Object;", "", "p2", "(Lo/getConstructorDetector;Lo/MediaRouteButton;Lo/DeserializationContext;ILo/SampleVideos;)Ljava/lang/Object;", "Lo/setGlobalDuplicateFilteringDefault;", "(Lo/getConstructorDetector;Lo/add;Lo/setGlobalDuplicateFilteringDefault;Lo/DeserializationContext;Lo/SampleVideos;)Ljava/lang/Object;", "read", "(Lo/getConstructorDetector;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CoercionConfig;", "Lo/getArrayBuilders;", "(Lo/CoercionConfig;Lo/getArrayBuilders;Lo/getArrayBuilders;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onAttachedToRecyclerViewInternal {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return onAttachedToRecyclerViewInternal.write((getConstructorDetector) null, (add) null, (setGlobalDuplicateFilteringDefault) null, (DeserializationContext) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return onAttachedToRecyclerViewInternal.read((getConstructorDetector) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.read |= Integer.MIN_VALUE;
            return onAttachedToRecyclerViewInternal.write((getConstructorDetector) null, (MediaRouteButton) null, (DeserializationContext) null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer implements PointerInputEventHandler {
        final /* synthetic */ getAnswerMap<Boolean, getShowPopup> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.onAttachedToRecyclerViewInternal$AudioAttributesImplBaseParcelizer$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getAnswerMap<Boolean, getShowPopup> IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            int write;

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:12:0x0033). Please report as a decompilation issue!!! */
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
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r4.write
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.RemoteActionCompatParcelizer
                    o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                    kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                    goto L33
                L13:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L1b:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                    java.lang.Object r5 = r4.RemoteActionCompatParcelizer
                    o.getConstructorDetector r5 = (kotlin.getConstructorDetector) r5
                    r1 = r5
                L23:
                    o._shapeForToken r5 = kotlin._shapeForToken.IconCompatParcelizer
                    r3 = r4
                    o.SampleVideos r3 = (kotlin.SampleVideos) r3
                    r4.RemoteActionCompatParcelizer = r1
                    r4.write = r2
                    java.lang.Object r5 = r1.read(r5, r3)
                    if (r5 != r0) goto L33
                    return r0
                L33:
                    o.DeserializationContext r5 = (kotlin.DeserializationContext) r5
                    o.getAnswerMap<java.lang.Boolean, o.getShowPopup> r3 = r4.IconCompatParcelizer
                    boolean r5 = kotlin.removeModelBuildListener.AudioAttributesCompatParcelizer(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: o.onAttachedToRecyclerViewInternal.AudioAttributesImplBaseParcelizer.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(getAnswerMap<? super Boolean, getShowPopup> getanswermap, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = getanswermap;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.IconCompatParcelizer, sampleVideos);
                anonymousClass5.RemoteActionCompatParcelizer = obj;
                return anonymousClass5;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object obj = handlebadmerge.read(new AnonymousClass5(this.RemoteActionCompatParcelizer, null), sampleVideos);
            return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplBaseParcelizer(getAnswerMap<? super Boolean, getShowPopup> getanswermap) {
            this.RemoteActionCompatParcelizer = getanswermap;
        }
    }

    public static final _handleOddName write(_handleOddName _handleoddname, getAnswerMap<? super Boolean, getShowPopup> getanswermap) {
        return hasSomeOfFeatures.IconCompatParcelizer(_handleoddname, 8675309, new AudioAttributesImplBaseParcelizer(getanswermap));
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setGlobalDuplicateFilteringDefault AudioAttributesCompatParcelizer;
        final /* synthetic */ add IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        final /* synthetic */ MediaRouteButton write;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (kotlin.onAttachedToRecyclerViewInternal.write(r1, r12.IconCompatParcelizer, r12.AudioAttributesCompatParcelizer, r13, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            if (kotlin.onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer(r1, r12.write, r13, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        
            if (kotlin.onAttachedToRecyclerViewInternal.write(r1, r12.write, r13, r12.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), r12) == r0) goto L38;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r12.RemoteActionCompatParcelizer
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto Lb6
            L22:
                java.lang.Object r1 = r12.read
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L3f
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                java.lang.Object r13 = r12.read
                r1 = r13
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                r13 = r12
                o.SampleVideos r13 = (kotlin.SampleVideos) r13
                r12.read = r1
                r12.RemoteActionCompatParcelizer = r5
                java.lang.Object r13 = kotlin.onAttachedToRecyclerViewInternal.IconCompatParcelizer(r1, r13)
                if (r13 == r0) goto Lb9
            L3f:
                o.DeserializationContext r13 = (kotlin.DeserializationContext) r13
                o.setGlobalDuplicateFilteringDefault r6 = r12.AudioAttributesCompatParcelizer
                r6.AudioAttributesCompatParcelizer(r13)
                boolean r6 = kotlin.removeModelBuildListener.AudioAttributesCompatParcelizer(r13)
                r7 = 0
                if (r6 == 0) goto L86
                int r8 = r13.getRead()
                boolean r8 = kotlin.canOverrideAccessModifiers.AudioAttributesCompatParcelizer(r8)
                if (r8 == 0) goto L86
                java.util.List r8 = r13.AudioAttributesCompatParcelizer()
                r9 = r8
                java.util.Collection r9 = (java.util.Collection) r9
                int r9 = r9.size()
                r10 = 0
            L63:
                if (r10 >= r9) goto L74
                java.lang.Object r11 = r8.get(r10)
                o.getArrayBuilders r11 = (kotlin.getArrayBuilders) r11
                boolean r11 = r11.MediaDescriptionCompat()
                if (r11 != 0) goto L86
                int r10 = r10 + 1
                goto L63
            L74:
                o.add r2 = r12.IconCompatParcelizer
                o.setGlobalDuplicateFilteringDefault r3 = r12.AudioAttributesCompatParcelizer
                r5 = r12
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r12.read = r7
                r12.RemoteActionCompatParcelizer = r4
                java.lang.Object r12 = kotlin.onAttachedToRecyclerViewInternal.write(r1, r2, r3, r13, r5)
                if (r12 != r0) goto Lb6
                goto Lb9
            L86:
                if (r6 != 0) goto Lb6
                o.setGlobalDuplicateFilteringDefault r4 = r12.AudioAttributesCompatParcelizer
                int r4 = r4.AudioAttributesCompatParcelizer()
                if (r4 != r5) goto La0
                o.MediaRouteButton r2 = r12.write
                r4 = r12
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r12.read = r7
                r12.RemoteActionCompatParcelizer = r3
                java.lang.Object r12 = kotlin.onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer(r1, r2, r13, r4)
                if (r12 != r0) goto Lb6
                goto Lb9
            La0:
                o.MediaRouteButton r3 = r12.write
                o.setGlobalDuplicateFilteringDefault r4 = r12.AudioAttributesCompatParcelizer
                int r4 = r4.AudioAttributesCompatParcelizer()
                r5 = r12
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r12.read = r7
                r12.RemoteActionCompatParcelizer = r2
                java.lang.Object r12 = kotlin.onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer(r1, r3, r13, r4, r5)
                if (r12 != r0) goto Lb6
                goto Lb9
            Lb6:
                o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                return r12
            Lb9:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(setGlobalDuplicateFilteringDefault setglobalduplicatefilteringdefault, add addVar, MediaRouteButton mediaRouteButton, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = setglobalduplicatefilteringdefault;
            this.IconCompatParcelizer = addVar;
            this.write = mediaRouteButton;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
            audioAttributesCompatParcelizer.read = obj;
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final Object IconCompatParcelizer(handleBadMerge handlebadmerge, add addVar, MediaRouteButton mediaRouteButton, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = setOnHierarchyChangeListener.IconCompatParcelizer(handlebadmerge, new AudioAttributesCompatParcelizer(new setGlobalDuplicateFilteringDefault(handlebadmerge.read()), addVar, mediaRouteButton, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: CancellationException -> 0x00db, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:13:0x0032, B:30:0x00a4, B:32:0x00ac, B:34:0x00be, B:36:0x00ca, B:37:0x00cd, B:38:0x00d0, B:39:0x00d4, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: CancellationException -> 0x00db, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:13:0x0032, B:30:0x00a4, B:32:0x00ac, B:34:0x00be, B:36:0x00ca, B:37:0x00cd, B:38:0x00d0, B:39:0x00d4, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object AudioAttributesCompatParcelizer(kotlin.getConstructorDetector r8, final kotlin.MediaRouteButton r9, kotlin.DeserializationContext r10, kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer(o.getConstructorDetector, o.MediaRouteButton, o.DeserializationContext, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(MediaRouteButton mediaRouteButton, getArrayBuilders getarraybuilders) {
        mediaRouteButton.IconCompatParcelizer(bufferAsCopyOfValue.MediaBrowserCompatCustomActionResultReceiver(getarraybuilders));
        getarraybuilders.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea A[Catch: CancellationException -> 0x0119, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:13:0x0033, B:46:0x00e2, B:48:0x00ea, B:50:0x00fc, B:52:0x0108, B:53:0x010b, B:54:0x010e, B:55:0x0112, B:29:0x00ab, B:31:0x00af, B:32:0x00b1, B:34:0x00b5, B:36:0x00bb, B:38:0x00bf, B:40:0x00c5, B:42:0x00c9, B:43:0x00ce, B:23:0x005b, B:25:0x006f, B:27:0x007c, B:26:0x0076), top: B:63:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112 A[Catch: CancellationException -> 0x0119, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:13:0x0033, B:46:0x00e2, B:48:0x00ea, B:50:0x00fc, B:52:0x0108, B:53:0x010b, B:54:0x010e, B:55:0x0112, B:29:0x00ab, B:31:0x00af, B:32:0x00b1, B:34:0x00b5, B:36:0x00bb, B:38:0x00bf, B:40:0x00c5, B:42:0x00c9, B:43:0x00ce, B:23:0x005b, B:25:0x006f, B:27:0x007c, B:26:0x0076), top: B:63:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object write(kotlin.getConstructorDetector r10, final kotlin.MediaRouteButton r11, kotlin.DeserializationContext r12, int r13, kotlin.SampleVideos<? super kotlin.getShowPopup> r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onAttachedToRecyclerViewInternal.write(o.getConstructorDetector, o.MediaRouteButton, o.DeserializationContext, int, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/DownResolution;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super setGlobalDebugLoggingEnabled>, Object> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.read AudioAttributesCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ long read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getConstructorDetector getconstructordetector;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getConstructorDetector getconstructordetector2 = (getConstructorDetector) this.RemoteActionCompatParcelizer;
                long j = this.read;
                final MagicModuleUseCaseImplWhenMappings.read readVar = this.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = getconstructordetector2;
                this.write = 1;
                Object objAudioAttributesCompatParcelizer = setConstraintSet.AudioAttributesCompatParcelizer(getconstructordetector2, j, (MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super getReferencedType, getShowPopup>) new MagicModuleSubmissionRequestBody() { // from class: o.onModelBound
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj2, Object obj3) {
                        return onAttachedToRecyclerViewInternal.AudioAttributesImplApi21Parcelizer.read(readVar, (getArrayBuilders) obj2, (getReferencedType) obj3);
                    }
                }, this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                getconstructordetector = getconstructordetector2;
                obj = objAudioAttributesCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getconstructordetector = (getConstructorDetector) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((getArrayBuilders) obj) != null && (this.AudioAttributesCompatParcelizer.IconCompatParcelizer & 9223372034707292159L) != 9205357640488583168L) {
                return setGlobalDebugLoggingEnabled.RemoteActionCompatParcelizer;
            }
            getArrayBuilders getarraybuilders = (getArrayBuilders) IntermediateLoginResponseBody.RatingCompat((List) getconstructordetector.write().AudioAttributesCompatParcelizer());
            if (bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders)) {
                getarraybuilders.RemoteActionCompatParcelizer();
                return setGlobalDebugLoggingEnabled.read;
            }
            return setGlobalDebugLoggingEnabled.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(MagicModuleUseCaseImplWhenMappings.read readVar, getArrayBuilders getarraybuilders, getReferencedType getreferencedtype) {
            getarraybuilders.RemoteActionCompatParcelizer();
            readVar.IconCompatParcelizer = getreferencedtype.getWrite();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(long j, MagicModuleUseCaseImplWhenMappings.read readVar, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = j;
            this.AudioAttributesCompatParcelizer = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
            audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesImplApi21Parcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super setGlobalDebugLoggingEnabled> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(MediaRouteButton mediaRouteButton, getArrayBuilders getarraybuilders) {
        mediaRouteButton.IconCompatParcelizer(bufferAsCopyOfValue.MediaBrowserCompatCustomActionResultReceiver(getarraybuilders));
        getarraybuilders.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0036, B:53:0x0119, B:55:0x0121, B:57:0x0125, B:59:0x0136, B:61:0x0142, B:49:0x00ec), top: B:68:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object write(kotlin.getConstructorDetector r9, final kotlin.add r10, kotlin.setGlobalDuplicateFilteringDefault r11, kotlin.DeserializationContext r12, kotlin.SampleVideos<? super kotlin.getShowPopup> r13) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onAttachedToRecyclerViewInternal.write(o.getConstructorDetector, o.add, o.setGlobalDuplicateFilteringDefault, o.DeserializationContext, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(add addVar, getArrayBuilders getarraybuilders) {
        if (addVar.IconCompatParcelizer(getarraybuilders.getRead())) {
            getarraybuilders.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(add addVar, getModelCountBuiltSoFar getmodelcountbuiltsofar, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getArrayBuilders getarraybuilders) {
        if (addVar.write(getarraybuilders.getRead(), getmodelcountbuiltsofar)) {
            getarraybuilders.RemoteActionCompatParcelizer();
            audioAttributesCompatParcelizer.IconCompatParcelizer = true;
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object read(kotlin.getConstructorDetector r7, kotlin.SampleVideos<? super kotlin.DeserializationContext> r8) {
        /*
            boolean r0 = r8 instanceof o.onAttachedToRecyclerViewInternal.read
            if (r0 == 0) goto L14
            r0 = r8
            o.onAttachedToRecyclerViewInternal$read r0 = (o.onAttachedToRecyclerViewInternal.read) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.IconCompatParcelizer
            int r8 = r8 + r2
            r0.IconCompatParcelizer = r8
            goto L19
        L14:
            o.onAttachedToRecyclerViewInternal$read r0 = new o.onAttachedToRecyclerViewInternal$read
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            o.getConstructorDetector r7 = (kotlin.getConstructorDetector) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L46
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
        L39:
            o._shapeForToken r8 = kotlin._shapeForToken.AudioAttributesCompatParcelizer
            r0.RemoteActionCompatParcelizer = r7
            r0.IconCompatParcelizer = r3
            java.lang.Object r8 = r7.read(r8, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            o.DeserializationContext r8 = (kotlin.DeserializationContext) r8
            java.util.List r2 = r8.AudioAttributesCompatParcelizer()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L54:
            if (r5 >= r4) goto L65
            java.lang.Object r6 = r2.get(r5)
            o.getArrayBuilders r6 = (kotlin.getArrayBuilders) r6
            boolean r6 = kotlin.bufferAsCopyOfValue.write(r6)
            if (r6 == 0) goto L39
            int r5 = r5 + 1
            goto L54
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onAttachedToRecyclerViewInternal.read(o.getConstructorDetector, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(CoercionConfig coercionConfig, getArrayBuilders getarraybuilders, getArrayBuilders getarraybuilders2) {
        return getReferencedType.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer(getarraybuilders.getRead(), getarraybuilders2.getRead())) < setConstraintSet.write(coercionConfig, getarraybuilders.getMediaBrowserCompatItemReceiver());
    }
}
