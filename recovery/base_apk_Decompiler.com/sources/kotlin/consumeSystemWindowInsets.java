package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.consumeSystemWindowInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u000fJD\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0013*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0014\u0010#"}, d2 = {"Lo/consumeSystemWindowInsets;", "Lo/performClickableSpanAction;", "Lo/getDisplayCutout;", "p0", "Lo/setOnCloseListener;", "", "p1", "Lo/setOrientation;", "p2", "<init>", "(Lo/getDisplayCutout;Lo/setOnCloseListener;Lo/setOrientation;)V", "Lo/checkSelfPermission;", "Lkotlin/Function1;", "", "write", "(Lo/checkSelfPermission;FLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/sendAccessibilityEventUnchecked;", "Lo/setHoverListener;", "read", "Lo/setShowDividers;", "RemoteActionCompatParcelizer", "(Lo/checkSelfPermission;FFLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "", "(FF)Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getDisplayCutout;", "Lo/setOnCloseListener;", "AudioAttributesCompatParcelizer", "Lo/setOrientation;", "Lo/_handleOddValue;", "Lo/_handleOddValue;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class consumeSystemWindowInsets implements performClickableSpanAction {
    private final setOrientation<Float> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public _handleOddValue IconCompatParcelizer = getColor.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getDisplayCutout write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setOnCloseListener<Float> RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return consumeSystemWindowInsets.this.write(null, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return consumeSystemWindowInsets.this.RemoteActionCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return consumeSystemWindowInsets.this.read(null, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    public consumeSystemWindowInsets(getDisplayCutout getdisplaycutout, setOnCloseListener<Float> setoncloselistener, setOrientation<Float> setorientation) {
        this.write = getdisplaycutout;
        this.RemoteActionCompatParcelizer = setoncloselistener;
        this.AudioAttributesCompatParcelizer = setorientation;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.performClickableSpanAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.checkSelfPermission r5, float r6, kotlin.getAnswerMap<? super java.lang.Float, kotlin.getShowPopup> r7, kotlin.SampleVideos<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.consumeSystemWindowInsets.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.consumeSystemWindowInsets$AudioAttributesCompatParcelizer r0 = (o.consumeSystemWindowInsets.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.IconCompatParcelizer
            int r8 = r8 + r2
            r0.IconCompatParcelizer = r8
            goto L19
        L14:
            o.consumeSystemWindowInsets$AudioAttributesCompatParcelizer r0 = new o.consumeSystemWindowInsets$AudioAttributesCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            r0.IconCompatParcelizer = r3
            java.lang.Object r8 = r4.read(r5, r6, r7, r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            o.sendAccessibilityEventUnchecked r8 = (kotlin.sendAccessibilityEventUnchecked) r8
            java.lang.Object r4 = r8.write()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            o.setShowDividers r5 = r8.RemoteActionCompatParcelizer()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r5.AudioAttributesCompatParcelizer()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L5d:
            java.lang.Float r4 = kotlin.QBankStatsResponse.write(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.consumeSystemWindowInsets.write(o.checkSelfPermission, float, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.checkSelfPermission r11, float r12, kotlin.getAnswerMap<? super java.lang.Float, kotlin.getShowPopup> r13, kotlin.SampleVideos<? super kotlin.sendAccessibilityEventUnchecked<java.lang.Float, kotlin.setHoverListener>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof o.consumeSystemWindowInsets.read
            if (r0 == 0) goto L14
            r0 = r14
            o.consumeSystemWindowInsets$read r0 = (o.consumeSystemWindowInsets.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.AudioAttributesCompatParcelizer
            int r14 = r14 + r2
            r0.AudioAttributesCompatParcelizer = r14
            goto L19
        L14:
            o.consumeSystemWindowInsets$read r0 = new o.consumeSystemWindowInsets$read
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            r13 = r10
            o.getAnswerMap r13 = (kotlin.getAnswerMap) r13
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L56
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            o._handleOddValue r14 = r10.IconCompatParcelizer
            o.CurrentQuery r14 = (kotlin.CurrentQuery) r14
            o.consumeSystemWindowInsets$IconCompatParcelizer r2 = new o.consumeSystemWindowInsets$IconCompatParcelizer
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r6, r7, r8, r9)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.RemoteActionCompatParcelizer = r13
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r14 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r14, r2, r0)
            if (r14 != r1) goto L56
            return r1
        L56:
            o.sendAccessibilityEventUnchecked r14 = (kotlin.sendAccessibilityEventUnchecked) r14
            r10 = 0
            java.lang.Float r10 = kotlin.QBankStatsResponse.write(r10)
            r13.invoke(r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.consumeSystemWindowInsets.read(o.checkSelfPermission, float, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super sendAccessibilityEventUnchecked<Float, setHoverListener>>, Object> {
        final /* synthetic */ float AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<Float, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ checkSelfPermission RemoteActionCompatParcelizer;
        Object read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            Object objRemoteActionCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                float fWrite = consumeSystemWindowInsets.this.write.write(this.AudioAttributesCompatParcelizer, setOnSuggestionListener.AudioAttributesCompatParcelizer(consumeSystemWindowInsets.this.RemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, this.AudioAttributesCompatParcelizer));
                if (Float.isNaN(fWrite)) {
                    getRootStableInsets.AudioAttributesCompatParcelizer("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                remoteActionCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer.read = Math.abs(fWrite) * Math.signum(this.AudioAttributesCompatParcelizer);
                this.IconCompatParcelizer.invoke(QBankStatsResponse.write(remoteActionCompatParcelizer.read));
                consumeSystemWindowInsets consumesystemwindowinsets = consumeSystemWindowInsets.this;
                checkSelfPermission checkselfpermission = this.RemoteActionCompatParcelizer;
                float f = remoteActionCompatParcelizer.read;
                float f2 = this.AudioAttributesCompatParcelizer;
                final getAnswerMap<Float, getShowPopup> getanswermap = this.IconCompatParcelizer;
                this.read = remoteActionCompatParcelizer;
                this.write = 1;
                objRemoteActionCompatParcelizer = consumesystemwindowinsets.RemoteActionCompatParcelizer(checkselfpermission, f, f2, new getAnswerMap() { // from class: o.WindowInsetsCompatImpl
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return consumeSystemWindowInsets.IconCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, getanswermap, ((Float) obj2).floatValue());
                    }
                }, this);
                if (objRemoteActionCompatParcelizer != objIconCompatParcelizer) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer) this.read;
            SdkPayloadData.IconCompatParcelizer(obj);
            remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            objRemoteActionCompatParcelizer = obj;
            setShowDividers setshowdividers = (setShowDividers) objRemoteActionCompatParcelizer;
            float fRemoteActionCompatParcelizer = consumeSystemWindowInsets.this.write.RemoteActionCompatParcelizer(((Number) setshowdividers.AudioAttributesCompatParcelizer()).floatValue());
            if (Float.isNaN(fRemoteActionCompatParcelizer)) {
                getRootStableInsets.AudioAttributesCompatParcelizer("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            remoteActionCompatParcelizer.read = fRemoteActionCompatParcelizer;
            checkSelfPermission checkselfpermission2 = this.RemoteActionCompatParcelizer;
            float f3 = remoteActionCompatParcelizer.read;
            float f4 = remoteActionCompatParcelizer.read;
            setShowDividers setshowdividersWrite$default = setAllowCollapse.write$default(setshowdividers, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, 30, null);
            setOrientation setorientation = consumeSystemWindowInsets.this.AudioAttributesCompatParcelizer;
            final getAnswerMap<Float, getShowPopup> getanswermap2 = this.IconCompatParcelizer;
            this.read = null;
            this.write = 2;
            Object objAudioAttributesCompatParcelizer = getInsets.AudioAttributesCompatParcelizer(checkselfpermission2, f3, f4, setshowdividersWrite$default, setorientation, new getAnswerMap() { // from class: o.consumeDisplayCutout
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return consumeSystemWindowInsets.IconCompatParcelizer.write(remoteActionCompatParcelizer, getanswermap2, ((Float) obj2).floatValue());
                }
            }, this);
            return objAudioAttributesCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objAudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getAnswerMap getanswermap, float f) {
            remoteActionCompatParcelizer.read -= f;
            getanswermap.invoke(Float.valueOf(remoteActionCompatParcelizer.read));
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getAnswerMap getanswermap, float f) {
            remoteActionCompatParcelizer.read -= f;
            getanswermap.invoke(Float.valueOf(remoteActionCompatParcelizer.read));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(float f, getAnswerMap<? super Float, getShowPopup> getanswermap, checkSelfPermission checkselfpermission, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = f;
            this.IconCompatParcelizer = getanswermap;
            this.RemoteActionCompatParcelizer = checkselfpermission;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return consumeSystemWindowInsets.this.new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super sendAccessibilityEventUnchecked<Float, setHoverListener>> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.checkSelfPermission r10, float r11, float r12, kotlin.getAnswerMap<? super java.lang.Float, kotlin.getShowPopup> r13, kotlin.SampleVideos<? super kotlin.setShowDividers<java.lang.Float, kotlin.setHoverListener>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof o.consumeSystemWindowInsets.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r14
            o.consumeSystemWindowInsets$RemoteActionCompatParcelizer r0 = (o.consumeSystemWindowInsets.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.write
            int r14 = r14 + r2
            r0.write = r14
            goto L19
        L14:
            o.consumeSystemWindowInsets$RemoteActionCompatParcelizer r0 = new o.consumeSystemWindowInsets$RemoteActionCompatParcelizer
            r0.<init>(r14)
        L19:
            r6 = r0
            java.lang.Object r14 = r6.IconCompatParcelizer
            java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r6.write
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L56
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            float r14 = java.lang.Math.abs(r11)
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 == 0) goto L5d
            float r14 = java.lang.Math.abs(r12)
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L48
            goto L5d
        L48:
            r6.write = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.read(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L56
            return r0
        L56:
            o.sendAccessibilityEventUnchecked r14 = (kotlin.sendAccessibilityEventUnchecked) r14
            o.setShowDividers r9 = r14.read()
            return r9
        L5d:
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 28
            r8 = 0
            r0 = r11
            r1 = r12
            o.setShowDividers r9 = kotlin.setAllowCollapse.AudioAttributesCompatParcelizer$default(r0, r1, r2, r4, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.consumeSystemWindowInsets.RemoteActionCompatParcelizer(o.checkSelfPermission, float, float, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    private final Object read(checkSelfPermission checkselfpermission, float f, float f2, getAnswerMap<? super Float, getShowPopup> getanswermap, SampleVideos<? super sendAccessibilityEventUnchecked<Float, setHoverListener>> sampleVideos) {
        getMandatorySystemGestureInsets getmandatorysystemgestureinsets;
        if (RemoteActionCompatParcelizer(f, f2)) {
            getmandatorysystemgestureinsets = new performAccessibilityAction(this.RemoteActionCompatParcelizer);
        } else {
            getmandatorysystemgestureinsets = new getMandatorySystemGestureInsets(this.AudioAttributesCompatParcelizer);
        }
        return getInsets.RemoteActionCompatParcelizer(checkselfpermission, f, f2, getmandatorysystemgestureinsets, getanswermap, sampleVideos);
    }

    private final boolean RemoteActionCompatParcelizer(float p0, float p1) {
        return Math.abs(setOnSuggestionListener.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, p1)) >= Math.abs(p0);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof consumeSystemWindowInsets)) {
            return false;
        }
        consumeSystemWindowInsets consumesystemwindowinsets = (consumeSystemWindowInsets) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(consumesystemwindowinsets.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(consumesystemwindowinsets.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(consumesystemwindowinsets.write, this.write);
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }
}
