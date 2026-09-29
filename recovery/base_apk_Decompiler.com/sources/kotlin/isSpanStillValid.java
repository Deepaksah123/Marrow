package kotlin;

import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0088\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u000f\u0010\u0012\u001aT\u0010\u0013\u001a\u00020\u0003*\u00020\u00002(\u0010\u0004\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014\u001a(\u0010\u0017\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u000f\u001a\u00020\u0015*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u000f\u0010\u001a\u001a \u0010\u000f\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u000f\u0010\u001b\u001a\u001e\u0010\u0013\u001a\u00020\u001c*\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0013\u0010\u001b\u001aI\u0010\u0017\u001a\u00020\u001e*\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001e2\b\b\u0002\u0010\u0005\u001a\u00020\u001f2\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0 H\u0002¢\u0006\u0004\b\u0017\u0010!\"6\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"\"\u0014\u0010\f\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010#"}, d2 = {"Lo/handleBadMerge;", "Lkotlin/Function1;", "Lo/getReferencedType;", "", "p0", "p1", "Lkotlin/Function3;", "Lo/RemoteActionCompat;", "Lo/SampleVideos;", "", "p2", "p3", "AudioAttributesCompatParcelizer", "(Lo/handleBadMerge;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getModuleData;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getConstructorDetector;", "write", "(Lo/getConstructorDetector;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getArrayBuilders;", "(Lo/getConstructorDetector;Lo/getArrayBuilders;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "(Lo/handleBadMerge;Lo/getModuleData;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "", "Lo/_shapeForToken;", "RemoteActionCompatParcelizer", "(Lo/getConstructorDetector;ZLo/_shapeForToken;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/DeserializationContext;", "(Lo/DeserializationContext;ZZ)Z", "(Lo/getConstructorDetector;Lo/_shapeForToken;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CoordinatorLayoutBehavior;", "Lo/TopUserCompanion;", "Lo/setPassingYear;", "Lo/getCollegeName;", "Lkotlin/Function2;", "(Lo/TopUserCompanion;Lo/setPassingYear;Lo/getCollegeName;Lo/MagicModuleSubmissionRequestBody;)Lo/setPassingYear;", "Lo/getModuleData;", "()Lo/getCollegeName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isSpanStillValid {
    private static final getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return isSpanStillValid.write(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return isSpanStillValid.IconCompatParcelizer((getConstructorDetector) null, (_shapeForToken) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return isSpanStillValid.write((getConstructorDetector) null, (_shapeForToken) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getTotalMcq {
        boolean AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return isSpanStillValid.RemoteActionCompatParcelizer((getConstructorDetector) null, false, (_shapeForToken) null, (SampleVideos<? super getArrayBuilders>) this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.IconCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(3, sampleVideos);
        }

        @Override // kotlin.getModuleData
        public final /* synthetic */ Object AudioAttributesCompatParcelizer(RemoteActionCompat remoteActionCompat, getReferencedType getreferencedtype, SampleVideos<? super getShowPopup> sampleVideos) {
            return read(remoteActionCompat, getreferencedtype.getWrite(), sampleVideos);
        }

        public final Object read(RemoteActionCompat remoteActionCompat, long j, SampleVideos<? super getShowPopup> sampleVideos) {
            return new RemoteActionCompatParcelizer(sampleVideos).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer$default(handleBadMerge handlebadmerge, getAnswerMap getanswermap, getAnswerMap getanswermap2, getModuleData getmoduledata, getAnswerMap getanswermap3, SampleVideos sampleVideos, int i, Object obj) {
        getAnswerMap getanswermap4 = (i & 1) != 0 ? null : getanswermap;
        getAnswerMap getanswermap5 = (i & 2) != 0 ? null : getanswermap2;
        if ((i & 4) != 0) {
            getmoduledata = AudioAttributesCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(handlebadmerge, getanswermap4, getanswermap5, getmoduledata, (i & 8) != 0 ? null : getanswermap3, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> AudioAttributesCompatParcelizer;
        int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatItemReceiver;
        final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ handleBadMerge read;
        final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.MediaBrowserCompatItemReceiver;
                shouldDumpInternalState shoulddumpinternalstate = new shouldDumpInternalState(this.read);
                this.AudioAttributesImplBaseParcelizer = 1;
                if (setOnHierarchyChangeListener.IconCompatParcelizer(this.read, new AnonymousClass3(topUserCompanion, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, shoulddumpinternalstate, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> AudioAttributesCompatParcelizer;
            Object AudioAttributesImplApi21Parcelizer;
            int AudioAttributesImplApi26Parcelizer;
            Object AudioAttributesImplBaseParcelizer;
            final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
            Object MediaBrowserCompatCustomActionResultReceiver;
            final /* synthetic */ shouldDumpInternalState MediaBrowserCompatItemReceiver;
            private /* synthetic */ Object MediaMetadataCompat;
            final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> RemoteActionCompatParcelizer;
            final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> read;
            final /* synthetic */ TopUserCompanion write;

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00f2, code lost:
            
                if (r5 != r1) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x01b3  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0269  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x027f  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x02a2  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 746
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.isSpanStillValid.AudioAttributesImplBaseParcelizer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$RemoteActionCompatParcelizer */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int AudioAttributesCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState IconCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.AudioAttributesCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.AudioAttributesCompatParcelizer = 1;
                        if (this.IconCompatParcelizer.read(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                RemoteActionCompatParcelizer(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$3, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C01173 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
                final /* synthetic */ getArrayBuilders IconCompatParcelizer;
                int RemoteActionCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState read;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.RemoteActionCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> getmoduledata = this.AudioAttributesCompatParcelizer;
                        shouldDumpInternalState shoulddumpinternalstate = this.read;
                        getReferencedType getreferencedtype = getReferencedType.read(this.IconCompatParcelizer.getRead());
                        this.RemoteActionCompatParcelizer = 1;
                        if (getmoduledata.AudioAttributesCompatParcelizer(shoulddumpinternalstate, getreferencedtype, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C01173(getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, shouldDumpInternalState shoulddumpinternalstate, getArrayBuilders getarraybuilders, SampleVideos<? super C01173> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = getmoduledata;
                    this.read = shoulddumpinternalstate;
                    this.IconCompatParcelizer = getarraybuilders;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new C01173(this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((C01173) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int AudioAttributesCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.AudioAttributesCompatParcelizer != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass5> sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass5(this.RemoteActionCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ shouldDumpInternalState AudioAttributesCompatParcelizer;
                int RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.RemoteActionCompatParcelizer != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer.write();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass2> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass2(this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ shouldDumpInternalState AudioAttributesCompatParcelizer;
                int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.write != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass1> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass1(this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int IconCompatParcelizer;
                final /* synthetic */ setPassingYear RemoteActionCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState write;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
                
                    if (r4.write.read(r4) == r0) goto L17;
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
                        int r1 = r4.IconCompatParcelizer
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                        goto L3c
                    L12:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L1a:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                        goto L2e
                    L1e:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                        o.setPassingYear r5 = r4.RemoteActionCompatParcelizer
                        r1 = r4
                        o.SampleVideos r1 = (kotlin.SampleVideos) r1
                        r4.IconCompatParcelizer = r3
                        java.lang.Object r5 = r5.a_(r1)
                        if (r5 == r0) goto L3f
                    L2e:
                        o.shouldDumpInternalState r5 = r4.write
                        r1 = r4
                        o.SampleVideos r1 = (kotlin.SampleVideos) r1
                        r4.IconCompatParcelizer = r2
                        java.lang.Object r4 = r5.read(r1)
                        if (r4 != r0) goto L3c
                        goto L3f
                    L3c:
                        o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                        return r4
                    L3f:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.isSpanStillValid.AudioAttributesImplBaseParcelizer.AnonymousClass3.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(setPassingYear setpassingyear, shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass4> sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = setpassingyear;
                    this.write = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass4(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$6, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass6 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
                final /* synthetic */ getArrayBuilders IconCompatParcelizer;
                int RemoteActionCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState read;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.RemoteActionCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> getmoduledata = this.AudioAttributesCompatParcelizer;
                        shouldDumpInternalState shoulddumpinternalstate = this.read;
                        getReferencedType getreferencedtype = getReferencedType.read(this.IconCompatParcelizer.getRead());
                        this.RemoteActionCompatParcelizer = 1;
                        if (getmoduledata.AudioAttributesCompatParcelizer(shoulddumpinternalstate, getreferencedtype, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass6(getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, shouldDumpInternalState shoulddumpinternalstate, getArrayBuilders getarraybuilders, SampleVideos<? super AnonymousClass6> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = getmoduledata;
                    this.read = shoulddumpinternalstate;
                    this.IconCompatParcelizer = getarraybuilders;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass6(this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass6) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$read */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ shouldDumpInternalState AudioAttributesCompatParcelizer;
                int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.write != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                read(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super read> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new read(this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$7, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass7 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int AudioAttributesCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.AudioAttributesCompatParcelizer != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass7(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass7> sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass7(this.RemoteActionCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass7) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$AudioAttributesImplBaseParcelizer$3$10, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass10 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ shouldDumpInternalState IconCompatParcelizer;
                int RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.RemoteActionCompatParcelizer != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer.write();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass10(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass10> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass10(this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass10) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(TopUserCompanion topUserCompanion, getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap2, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap3, shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.write = topUserCompanion;
                this.IconCompatParcelizer = getmoduledata;
                this.RemoteActionCompatParcelizer = getanswermap;
                this.read = getanswermap2;
                this.AudioAttributesCompatParcelizer = getanswermap3;
                this.MediaBrowserCompatItemReceiver = shoulddumpinternalstate;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, sampleVideos);
                anonymousClass3.MediaMetadataCompat = obj;
                return anonymousClass3;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplBaseParcelizer(handleBadMerge handlebadmerge, getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap2, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap3, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = handlebadmerge;
            this.IconCompatParcelizer = getmoduledata;
            this.write = getanswermap;
            this.RemoteActionCompatParcelizer = getanswermap2;
            this.AudioAttributesCompatParcelizer = getanswermap3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(this.read, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = obj;
            return audioAttributesImplBaseParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final Object AudioAttributesCompatParcelizer(handleBadMerge handlebadmerge, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap2, getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap3, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new AudioAttributesImplBaseParcelizer(handlebadmerge, getmoduledata, getanswermap2, getanswermap, getanswermap3, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[LOOP:0: B:19:0x0054->B:20:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object write(kotlin.getConstructorDetector r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            boolean r0 = r9 instanceof o.isSpanStillValid.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.isSpanStillValid$AudioAttributesCompatParcelizer r0 = (o.isSpanStillValid.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o.isSpanStillValid$AudioAttributesCompatParcelizer r0 = new o.isSpanStillValid$AudioAttributesCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.read
            o.getConstructorDetector r8 = (kotlin.getConstructorDetector) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L45
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
        L39:
            r0.read = r8
            r0.RemoteActionCompatParcelizer = r3
            r9 = 0
            java.lang.Object r9 = kotlin.getConstructorDetector.read$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L45
            return r1
        L45:
            o.DeserializationContext r9 = (kotlin.DeserializationContext) r9
            java.util.List r2 = r9.AudioAttributesCompatParcelizer()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L54:
            if (r6 >= r4) goto L62
            java.lang.Object r7 = r2.get(r6)
            o.getArrayBuilders r7 = (kotlin.getArrayBuilders) r7
            r7.RemoteActionCompatParcelizer()
            int r6 = r6 + 1
            goto L54
        L62:
            java.util.List r9 = r9.AudioAttributesCompatParcelizer()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L6d:
            if (r5 >= r2) goto L7e
            java.lang.Object r4 = r9.get(r5)
            o.getArrayBuilders r4 = (kotlin.getArrayBuilders) r4
            boolean r4 = r4.getRemoteActionCompatParcelizer()
            if (r4 != 0) goto L39
            int r5 = r5 + 1
            goto L6d
        L7e:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSpanStillValid.write(o.getConstructorDetector, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getArrayBuilders>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ getArrayBuilders IconCompatParcelizer;
        private /* synthetic */ Object read;
        long write;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0046 -> B:12:0x0049). Please report as a decompilation issue!!! */
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
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r11.AudioAttributesCompatParcelizer
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                long r3 = r11.write
                java.lang.Object r1 = r11.read
                o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                goto L49
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                java.lang.Object r12 = r11.read
                o.getConstructorDetector r12 = (kotlin.getConstructorDetector) r12
                o.getArrayBuilders r1 = r11.IconCompatParcelizer
                long r3 = r1.getWrite()
                o.CoercionConfig r1 = r12.AudioAttributesImplApi26Parcelizer()
                long r5 = r1.AudioAttributesCompatParcelizer()
                long r3 = r3 + r5
                r1 = r12
            L34:
                r8 = r11
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r11.read = r1
                r11.write = r3
                r11.AudioAttributesCompatParcelizer = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r5 = r1
                java.lang.Object r12 = kotlin.isSpanStillValid.RemoteActionCompatParcelizer$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L49
                return r0
            L49:
                o.getArrayBuilders r12 = (kotlin.getArrayBuilders) r12
                long r5 = r12.getWrite()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L34
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isSpanStillValid.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getArrayBuilders getarraybuilders, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = getarraybuilders;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.IconCompatParcelizer, sampleVideos);
            readVar.read = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getArrayBuilders> sampleVideos) {
            return ((read) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(getConstructorDetector getconstructordetector, getArrayBuilders getarraybuilders, SampleVideos<? super getArrayBuilders> sampleVideos) {
        return getconstructordetector.read(getconstructordetector.AudioAttributesImplApi26Parcelizer().read(), new read(getarraybuilders, null), sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ handleBadMerge IconCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> read;
        final /* synthetic */ shouldDumpInternalState write;

        /* JADX INFO: renamed from: o.isSpanStillValid$IconCompatParcelizer$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> AudioAttributesCompatParcelizer;
            private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
            final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
            int MediaBrowserCompatCustomActionResultReceiver;
            final /* synthetic */ shouldDumpInternalState RemoteActionCompatParcelizer;
            Object read;
            final /* synthetic */ TopUserCompanion write;

            /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.isSpanStillValid.IconCompatParcelizer.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$IconCompatParcelizer$5$read */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ shouldDumpInternalState IconCompatParcelizer;
                int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.write;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.write = 1;
                        if (this.IconCompatParcelizer.read(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                read(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super read> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new read(this.IconCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$IconCompatParcelizer$5$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int AudioAttributesCompatParcelizer;
                final /* synthetic */ getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState read;
                final /* synthetic */ getArrayBuilders write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.AudioAttributesCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> getmoduledata = this.IconCompatParcelizer;
                        shouldDumpInternalState shoulddumpinternalstate = this.read;
                        getReferencedType getreferencedtype = getReferencedType.read(this.write.getRead());
                        this.AudioAttributesCompatParcelizer = 1;
                        if (getmoduledata.AudioAttributesCompatParcelizer(shoulddumpinternalstate, getreferencedtype, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, shouldDumpInternalState shoulddumpinternalstate, getArrayBuilders getarraybuilders, SampleVideos<? super AnonymousClass3> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = getmoduledata;
                    this.read = shoulddumpinternalstate;
                    this.write = getarraybuilders;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass3(this.IconCompatParcelizer, this.read, this.write, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$IconCompatParcelizer$5$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int AudioAttributesCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.AudioAttributesCompatParcelizer != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer.write();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass1> sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass1(this.RemoteActionCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: o.isSpanStillValid$IconCompatParcelizer$5$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                int RemoteActionCompatParcelizer;
                final /* synthetic */ shouldDumpInternalState write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    if (this.RemoteActionCompatParcelizer != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.write.RemoteActionCompatParcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass2> sampleVideos) {
                    super(2, sampleVideos);
                    this.write = shoulddumpinternalstate;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AnonymousClass2(this.write, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(TopUserCompanion topUserCompanion, getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.write = topUserCompanion;
                this.IconCompatParcelizer = getmoduledata;
                this.AudioAttributesCompatParcelizer = getanswermap;
                this.RemoteActionCompatParcelizer = shoulddumpinternalstate;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass5.AudioAttributesImplApi21Parcelizer = obj;
                return anonymousClass5;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.MediaBrowserCompatItemReceiver;
                this.RemoteActionCompatParcelizer = 1;
                if (setOnHierarchyChangeListener.IconCompatParcelizer(this.IconCompatParcelizer, new AnonymousClass5(topUserCompanion, this.read, this.AudioAttributesCompatParcelizer, this.write, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(handleBadMerge handlebadmerge, getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, shouldDumpInternalState shoulddumpinternalstate, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = handlebadmerge;
            this.read = getmoduledata;
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.write = shoulddumpinternalstate;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
            iconCompatParcelizer.MediaBrowserCompatItemReceiver = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final Object IconCompatParcelizer(handleBadMerge handlebadmerge, getModuleData<? super RemoteActionCompat, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new IconCompatParcelizer(handlebadmerge, getmoduledata, getanswermap, new shouldDumpInternalState(handlebadmerge), null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004f -> B:18:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object RemoteActionCompatParcelizer(kotlin.getConstructorDetector r7, boolean r8, kotlin._shapeForToken r9, kotlin.SampleVideos<? super kotlin.getArrayBuilders> r10) {
        /*
            boolean r0 = r10 instanceof o.isSpanStillValid.write
            if (r0 == 0) goto L14
            r0 = r10
            o.isSpanStillValid$write r0 = (o.isSpanStillValid.write) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.RemoteActionCompatParcelizer
            int r10 = r10 + r2
            r0.RemoteActionCompatParcelizer = r10
            goto L19
        L14:
            o.isSpanStillValid$write r0 = new o.isSpanStillValid$write
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            boolean r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r8 = r0.write
            o._shapeForToken r8 = (kotlin._shapeForToken) r8
            java.lang.Object r9 = r0.IconCompatParcelizer
            o.getConstructorDetector r9 = (kotlin.getConstructorDetector) r9
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L52
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
        L43:
            r0.IconCompatParcelizer = r7
            r0.write = r9
            r0.AudioAttributesCompatParcelizer = r8
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r10 = r7.read(r9, r0)
            if (r10 != r1) goto L52
            return r1
        L52:
            o.DeserializationContext r10 = (kotlin.DeserializationContext) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = write$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L43
            java.util.List r7 = r10.AudioAttributesCompatParcelizer()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSpanStillValid.RemoteActionCompatParcelizer(o.getConstructorDetector, boolean, o._shapeForToken, o.SampleVideos):java.lang.Object");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer$default(getConstructorDetector getconstructordetector, boolean z, _shapeForToken _shapefortoken, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            _shapefortoken = _shapeForToken.AudioAttributesCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(getconstructordetector, z, _shapefortoken, (SampleVideos<? super getArrayBuilders>) sampleVideos);
    }

    public static /* synthetic */ boolean write$default(DeserializationContext deserializationContext, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = getActionList.AudioAttributesCompatParcelizer();
        }
        return write(deserializationContext, z, z2);
    }

    public static final boolean write(DeserializationContext deserializationContext, boolean z, boolean z2) {
        if (z2) {
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = deserializationContext.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!handleWeirdNumberValue.read(listAudioAttributesCompatParcelizer.get(i).getMediaBrowserCompatItemReceiver(), handleWeirdNumberValue.INSTANCE.RemoteActionCompatParcelizer())) {
                        break;
                    }
                    i++;
                } else if (!canOverrideAccessModifiers.AudioAttributesCompatParcelizer(deserializationContext.getRead())) {
                    return false;
                }
            }
        }
        List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = deserializationContext.AudioAttributesCompatParcelizer();
        int size2 = listAudioAttributesCompatParcelizer2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            getArrayBuilders getarraybuilders = listAudioAttributesCompatParcelizer2.get(i2);
            if (!(z ? bufferAsCopyOfValue.write(getarraybuilders) : bufferAsCopyOfValue.read(getarraybuilders))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r0 == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c5 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object write(kotlin.getConstructorDetector r18, kotlin._shapeForToken r19, kotlin.SampleVideos<? super kotlin.getArrayBuilders> r20) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSpanStillValid.write(o.getConstructorDetector, o._shapeForToken, o.SampleVideos):java.lang.Object");
    }

    public static /* synthetic */ Object write$default(getConstructorDetector getconstructordetector, _shapeForToken _shapefortoken, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            _shapefortoken = _shapeForToken.AudioAttributesCompatParcelizer;
        }
        return write(getconstructordetector, _shapefortoken, (SampleVideos<? super getArrayBuilders>) sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.CoordinatorLayoutBehavior$RemoteActionCompatParcelizer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object IconCompatParcelizer(kotlin.getConstructorDetector r7, kotlin._shapeForToken r8, kotlin.SampleVideos<? super kotlin.CoordinatorLayoutBehavior> r9) {
        /*
            boolean r0 = r9 instanceof o.isSpanStillValid.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.isSpanStillValid$AudioAttributesImplApi26Parcelizer r0 = (o.isSpanStillValid.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            o.isSpanStillValid$AudioAttributesImplApi26Parcelizer r0 = new o.isSpanStillValid$AudioAttributesImplApi26Parcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.write
            o.MagicModuleUseCaseImplWhenMappings$write r7 = (o.MagicModuleUseCaseImplWhenMappings.write) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: kotlin.constructSpecializedType -> L61
            goto L5e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.MagicModuleUseCaseImplWhenMappings$write r9 = new o.MagicModuleUseCaseImplWhenMappings$write
            r9.<init>()
            o.CoordinatorLayoutBehavior$RemoteActionCompatParcelizer r2 = o.CoordinatorLayoutBehavior.RemoteActionCompatParcelizer.INSTANCE
            r9.write = r2
            o.CoercionConfig r2 = r7.AudioAttributesImplApi26Parcelizer()     // Catch: kotlin.constructSpecializedType -> L61
            long r4 = r2.IconCompatParcelizer()     // Catch: kotlin.constructSpecializedType -> L61
            o.isSpanStillValid$AudioAttributesImplApi21Parcelizer r2 = new o.isSpanStillValid$AudioAttributesImplApi21Parcelizer     // Catch: kotlin.constructSpecializedType -> L61
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: kotlin.constructSpecializedType -> L61
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2     // Catch: kotlin.constructSpecializedType -> L61
            r0.write = r9     // Catch: kotlin.constructSpecializedType -> L61
            r0.AudioAttributesCompatParcelizer = r3     // Catch: kotlin.constructSpecializedType -> L61
            java.lang.Object r7 = r7.write(r4, r2, r0)     // Catch: kotlin.constructSpecializedType -> L61
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r7 = r9
        L5e:
            T r7 = r7.write
            return r7
        L61:
            o.CoordinatorLayoutBehavior$read r7 = o.CoordinatorLayoutBehavior.read.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSpanStillValid.IconCompatParcelizer(o.getConstructorDetector, o._shapeForToken, o.SampleVideos):java.lang.Object");
    }

    public static /* synthetic */ Object IconCompatParcelizer$default(getConstructorDetector getconstructordetector, _shapeForToken _shapefortoken, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            _shapefortoken = _shapeForToken.AudioAttributesCompatParcelizer;
        }
        return IconCompatParcelizer(getconstructordetector, _shapefortoken, (SampleVideos<? super CoordinatorLayoutBehavior>) sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ _shapeForToken IconCompatParcelizer;
        private /* synthetic */ Object read;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<CoordinatorLayoutBehavior> write;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (kotlin.getActionList.RemoteActionCompatParcelizer(r14) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        
            r13.write.write = o.CoordinatorLayoutBehavior.read.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            r14 = r14.AudioAttributesCompatParcelizer();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        
            if (r6 >= r5) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (r7.MediaDescriptionCompat() != false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            if (kotlin.bufferAsCopyOfValue.write(r7, r1.RemoteActionCompatParcelizer(), r1.read()) != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        
            r13.write.write = o.CoordinatorLayoutBehavior.RemoteActionCompatParcelizer.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        
            r13.read = r1;
            r13.AudioAttributesCompatParcelizer = 2;
            r14 = r1.read(kotlin._shapeForToken.read, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        
            if (r14 != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
        
            r13.write.write = o.CoordinatorLayoutBehavior.RemoteActionCompatParcelizer.INSTANCE;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00da A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, o.CoordinatorLayoutBehavior$AudioAttributesCompatParcelizer] */
        /* JADX WARN: Type inference failed for: r14v11, types: [T, o.CoordinatorLayoutBehavior$RemoteActionCompatParcelizer] */
        /* JADX WARN: Type inference failed for: r14v12, types: [T, o.CoordinatorLayoutBehavior$read] */
        /* JADX WARN: Type inference failed for: r14v19, types: [T, o.CoordinatorLayoutBehavior$RemoteActionCompatParcelizer] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00aa -> B:32:0x00ad). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isSpanStillValid.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(_shapeForToken _shapefortoken, MagicModuleUseCaseImplWhenMappings.write<CoordinatorLayoutBehavior> writeVar, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = _shapefortoken;
            this.write = writeVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, this.write, sampleVideos);
            audioAttributesImplApi21Parcelizer.read = obj;
            return audioAttributesImplApi21Parcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getCollegeName RemoteActionCompatParcelizer() {
        if (getDesignInfoListui_tooling.IconCompatParcelizer) {
            return getCollegeName.AudioAttributesCompatParcelizer;
        }
        return getCollegeName.write;
    }

    static /* synthetic */ setPassingYear RemoteActionCompatParcelizer$default(TopUserCompanion topUserCompanion, setPassingYear setpassingyear, getCollegeName getcollegename, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, Object obj) {
        if ((i & 2) != 0) {
            getcollegename = RemoteActionCompatParcelizer();
        }
        return RemoteActionCompatParcelizer(topUserCompanion, setpassingyear, getcollegename, (MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object>) magicModuleSubmissionRequestBody);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ setPassingYear RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> read;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r6.invoke(r1, r5) == r0) goto L16;
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
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L4b
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.IconCompatParcelizer
                o.TopUserCompanion r1 = (kotlin.TopUserCompanion) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L3d
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                java.lang.Object r6 = r5.IconCompatParcelizer
                r1 = r6
                o.TopUserCompanion r1 = (kotlin.TopUserCompanion) r1
                boolean r6 = kotlin.getDesignInfoListui_tooling.IconCompatParcelizer
                if (r6 == 0) goto L3d
                o.setPassingYear r6 = r5.RemoteActionCompatParcelizer
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.IconCompatParcelizer = r1
                r5.AudioAttributesCompatParcelizer = r3
                java.lang.Object r6 = r6.a_(r4)
                if (r6 == r0) goto L4a
            L3d:
                o.MagicModuleSubmissionRequestBody<o.TopUserCompanion, o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r6 = r5.read
                r3 = 0
                r5.IconCompatParcelizer = r3
                r5.AudioAttributesCompatParcelizer = r2
                java.lang.Object r5 = r6.invoke(r1, r5)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isSpanStillValid.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        MediaBrowserCompatItemReceiver(setPassingYear setpassingyear, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = setpassingyear;
            this.read = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
            mediaBrowserCompatItemReceiver.IconCompatParcelizer = obj;
            return mediaBrowserCompatItemReceiver;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final setPassingYear RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion, setPassingYear setpassingyear, getCollegeName getcollegename, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getcollegename, new MediaBrowserCompatItemReceiver(setpassingyear, magicModuleSubmissionRequestBody, null), 1);
    }
}
