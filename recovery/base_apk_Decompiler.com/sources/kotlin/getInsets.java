package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0010*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012\u001a^\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0010*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\b\u0010\u0014\u001af\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0010*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0016\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0018\"\u001a\u0010\u0016\u001a\u00020\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/getDisplayCutout;", "p0", "Lo/setOnCloseListener;", "", "p1", "Lo/setOrientation;", "p2", "Lo/performClickableSpanAction;", "IconCompatParcelizer", "(Lo/getDisplayCutout;Lo/setOnCloseListener;Lo/setOrientation;)Lo/performClickableSpanAction;", "Lo/checkSelfPermission;", "Lo/onRequestSendAccessibilityEvent;", "Lo/setHoverListener;", "Lkotlin/Function1;", "", "p3", "Lo/sendAccessibilityEventUnchecked;", "RemoteActionCompatParcelizer", "(Lo/checkSelfPermission;FFLo/onRequestSendAccessibilityEvent;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setShowDividers;", "(Lo/checkSelfPermission;FLo/setShowDividers;Lo/setOnCloseListener;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "p4", "AudioAttributesCompatParcelizer", "(Lo/checkSelfPermission;FFLo/setShowDividers;Lo/setOrientation;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "(FF)F", "Lo/assignParameter;", "F", "write", "()F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getInsets {
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(400.0f);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        float AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        float IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return getInsets.AudioAttributesCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        float read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return getInsets.IconCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
        }
    }

    public static final performClickableSpanAction IconCompatParcelizer(getDisplayCutout getdisplaycutout, setOnCloseListener<Float> setoncloselistener, setOrientation<Float> setorientation) {
        return new consumeSystemWindowInsets(getdisplaycutout, setoncloselistener, setorientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(checkSelfPermission checkselfpermission, float f, float f2, onRequestSendAccessibilityEvent<Float, setHoverListener> onrequestsendaccessibilityevent, getAnswerMap<? super Float, getShowPopup> getanswermap, SampleVideos<? super sendAccessibilityEventUnchecked<Float, setHoverListener>> sampleVideos) {
        return onrequestsendaccessibilityevent.RemoteActionCompatParcelizer(checkselfpermission, QBankStatsResponse.write(f), QBankStatsResponse.write(f2), getanswermap, sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object IconCompatParcelizer(final kotlin.checkSelfPermission r5, final float r6, kotlin.setShowDividers<java.lang.Float, kotlin.setHoverListener> r7, kotlin.setOnCloseListener<java.lang.Float> r8, final kotlin.getAnswerMap<? super java.lang.Float, kotlin.getShowPopup> r9, kotlin.SampleVideos<? super kotlin.sendAccessibilityEventUnchecked<java.lang.Float, kotlin.setHoverListener>> r10) {
        /*
            boolean r0 = r10 instanceof o.getInsets.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            o.getInsets$IconCompatParcelizer r0 = (o.getInsets.IconCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.write
            int r10 = r10 + r2
            r0.write = r10
            goto L19
        L14:
            o.getInsets$IconCompatParcelizer r0 = new o.getInsets$IconCompatParcelizer
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            float r6 = r0.read
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer r5 = (o.MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer) r5
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            o.setShowDividers r7 = (kotlin.setShowDividers) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L6d
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer r10 = new o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer
            r10.<init>()
            java.lang.Object r2 = r7.AudioAttributesCompatParcelizer()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = 0
        L56:
            o.equals r4 = new o.equals
            r4.<init>()
            r0.AudioAttributesCompatParcelizer = r7
            r0.IconCompatParcelizer = r10
            r0.read = r6
            r0.write = r3
            r5 = r2 ^ 1
            java.lang.Object r5 = kotlin.setTitleMarginStart.IconCompatParcelizer(r7, r8, r5, r4, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            r5 = r10
        L6d:
            o.sendAccessibilityEventUnchecked r8 = new o.sendAccessibilityEventUnchecked
            float r5 = r5.read
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.QBankStatsResponse.write(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInsets.IconCompatParcelizer(o.checkSelfPermission, float, o.setShowDividers, o.setOnCloseListener, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    private static final void write(setWeightSum<Float, setHoverListener> setweightsum, checkSelfPermission checkselfpermission, getAnswerMap<? super Float, getShowPopup> getanswermap, float f) {
        float fIconCompatParcelizer;
        try {
            fIconCompatParcelizer = checkselfpermission.IconCompatParcelizer(f);
        } catch (CancellationException unused) {
            setweightsum.AudioAttributesCompatParcelizer();
            fIconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }
        getanswermap.invoke(Float.valueOf(fIconCompatParcelizer));
        if (Math.abs(f - fIconCompatParcelizer) > 0.5f) {
            setweightsum.AudioAttributesCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(float f, MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, checkSelfPermission checkselfpermission, getAnswerMap getanswermap, setWeightSum setweightsum) {
        if (Math.abs(((Number) setweightsum.write()).floatValue()) >= Math.abs(f)) {
            float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(((Number) setweightsum.write()).floatValue(), f);
            write(setweightsum, checkselfpermission, getanswermap, fAudioAttributesCompatParcelizer - remoteActionCompatParcelizer.read);
            setweightsum.AudioAttributesCompatParcelizer();
            remoteActionCompatParcelizer.read = fAudioAttributesCompatParcelizer;
        } else {
            write(setweightsum, checkselfpermission, getanswermap, ((Number) setweightsum.write()).floatValue() - remoteActionCompatParcelizer.read);
            remoteActionCompatParcelizer.read = ((Number) setweightsum.write()).floatValue();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object AudioAttributesCompatParcelizer(final kotlin.checkSelfPermission r11, float r12, final float r13, kotlin.setShowDividers<java.lang.Float, kotlin.setHoverListener> r14, kotlin.setOrientation<java.lang.Float> r15, final kotlin.getAnswerMap<? super java.lang.Float, kotlin.getShowPopup> r16, kotlin.SampleVideos<? super kotlin.sendAccessibilityEventUnchecked<java.lang.Float, kotlin.setHoverListener>> r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof o.getInsets.AudioAttributesCompatParcelizer
            if (r1 == 0) goto L16
            r1 = r0
            o.getInsets$AudioAttributesCompatParcelizer r1 = (o.getInsets.AudioAttributesCompatParcelizer) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.RemoteActionCompatParcelizer
            int r0 = r0 + r3
            r1.RemoteActionCompatParcelizer = r0
            goto L1b
        L16:
            o.getInsets$AudioAttributesCompatParcelizer r1 = new o.getInsets$AudioAttributesCompatParcelizer
            r1.<init>(r0)
        L1b:
            r7 = r1
            java.lang.Object r0 = r7.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r7.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.AudioAttributesCompatParcelizer
            float r2 = r7.IconCompatParcelizer
            java.lang.Object r3 = r7.write
            o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer r3 = (o.MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer) r3
            java.lang.Object r4 = r7.read
            o.setShowDividers r4 = (kotlin.setShowDividers) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r0)
            r10 = r2
            r0 = r4
            goto L8f
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.SdkPayloadData.IconCompatParcelizer(r0)
            o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer r0 = new o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer
            r0.<init>()
            java.lang.Object r2 = r14.AudioAttributesCompatParcelizer()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.QBankStatsResponse.write(r12)
            java.lang.Object r2 = r14.AudioAttributesCompatParcelizer()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            r2 = r3
            goto L6b
        L6a:
            r2 = 0
        L6b:
            o.copyWindowDataInto r6 = new o.copyWindowDataInto
            r5 = r11
            r9 = r13
            r10 = r16
            r6.<init>()
            r9 = r14
            r7.read = r9
            r7.write = r0
            r10 = r12
            r7.IconCompatParcelizer = r10
            r7.AudioAttributesCompatParcelizer = r8
            r7.RemoteActionCompatParcelizer = r3
            r5 = r2 ^ 1
            r2 = r14
            r3 = r4
            r4 = r15
            java.lang.Object r2 = kotlin.setTitleMarginStart.write(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8c
            return r1
        L8c:
            r3 = r0
            r1 = r8
            r0 = r9
        L8f:
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = AudioAttributesCompatParcelizer(r2, r1)
            float r1 = r3.read
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.QBankStatsResponse.write(r10)
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 29
            r9 = 0
            o.setShowDividers r0 = kotlin.setAllowCollapse.write$default(r0, r1, r2, r3, r5, r7, r8, r9)
            o.sendAccessibilityEventUnchecked r1 = new o.sendAccessibilityEventUnchecked
            r1.<init>(r10, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInsets.AudioAttributesCompatParcelizer(o.checkSelfPermission, float, float, o.setShowDividers, o.setOrientation, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(float f, MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, checkSelfPermission checkselfpermission, getAnswerMap getanswermap, setWeightSum setweightsum) {
        float fIconCompatParcelizer;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(((Number) setweightsum.write()).floatValue(), f);
        float f2 = fAudioAttributesCompatParcelizer - remoteActionCompatParcelizer.read;
        try {
            fIconCompatParcelizer = checkselfpermission.IconCompatParcelizer(f2);
        } catch (CancellationException unused) {
            setweightsum.AudioAttributesCompatParcelizer();
            fIconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }
        getanswermap.invoke(Float.valueOf(fIconCompatParcelizer));
        if (Math.abs(f2 - fIconCompatParcelizer) > 0.5f || fAudioAttributesCompatParcelizer != ((Number) setweightsum.write()).floatValue()) {
            setweightsum.AudioAttributesCompatParcelizer();
        }
        remoteActionCompatParcelizer.read += fIconCompatParcelizer;
        return getShowPopup.INSTANCE;
    }

    private static final float AudioAttributesCompatParcelizer(float f, float f2) {
        return f2 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : f2 > BitmapDescriptorFactory.HUE_RED ? getQues.write(f, f2) : getQues.read(f, f2);
    }

    public static final float write() {
        return RemoteActionCompatParcelizer;
    }
}
