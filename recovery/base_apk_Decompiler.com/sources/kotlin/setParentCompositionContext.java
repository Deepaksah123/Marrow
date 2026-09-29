package kotlin;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00112\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0096@¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u000f\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010\u001b\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\"J\u0017\u0010\u0019\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\"R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001b\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150)8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b!\u0010,R\u0016\u0010\u000f\u001a\u00020\u001e8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b#\u0010-R\u0016\u0010.\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010*\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010&R\u0014\u0010\u001d\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u001a\u00107\u001a\u0002048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b\u000f\u00106"}, d2 = {"Lo/setParentCompositionContext;", "Lo/setLastHorizontalStyle;", "Landroid/content/Context;", "p0", "Lo/bufferMapProperty;", "p1", "Lo/switchToNext;", "p2", "Lo/getReturnTransition;", "p3", "<init>", "(Landroid/content/Context;Lo/bufferMapProperty;JLo/getReturnTransition;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/getReferencedType;", "Lo/findCoercionAction;", "Lkotlin/Function1;", "IconCompatParcelizer", "(JILo/getAnswerMap;)J", "Lo/UnsupportedTypeDeserializer;", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "", "(JLo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/calloc;", "(J)V", "write", "()J", "AudioAttributesCompatParcelizer", "()V", "AudioAttributesImplApi26Parcelizer", "", "(J)Z", "", "RemoteActionCompatParcelizer", "(J)F", "read", "Lo/bufferMapProperty;", "MediaBrowserCompatCustomActionResultReceiver", "J", "Lo/getModifier;", "Lo/getModifier;", "Lo/InputAccessor;", "MediaBrowserCompatItemReceiver", "Lo/InputAccessor;", "()Lo/InputAccessor;", "Z", "AudioAttributesImplApi21Parcelizer", "()Z", "Lo/findClass;", "AudioAttributesImplBaseParcelizer", "Lo/handleWeirdStringValue;", "Lo/handleWeirdStringValue;", "Lo/Module;", "Lo/Module;", "()Lo/Module;", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setParentCompositionContext implements setLastHorizontalStyle {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long MediaBrowserCompatCustomActionResultReceiver;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final handleWeirdStringValue AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Module MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getModifier AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final bufferMapProperty RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        long write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return setParentCompositionContext.this.IconCompatParcelizer(0L, (MagicModuleSubmissionRequestBody<? super UnsupportedTypeDeserializer, ? super SampleVideos<? super UnsupportedTypeDeserializer>, ? extends Object>) null, this);
        }
    }

    private setParentCompositionContext(Context context, bufferMapProperty buffermapproperty, long j, getReturnTransition getreturntransition) {
        setLifecycleOwner setlifecycleowner;
        this.RemoteActionCompatParcelizer = buffermapproperty;
        this.read = getReferencedType.INSTANCE.read();
        getModifier getmodifier = new getModifier(context, RequestPayload.IconCompatParcelizer(j));
        this.AudioAttributesCompatParcelizer = getmodifier;
        this.write = _qbuf.RemoteActionCompatParcelizer(getShowPopup.INSTANCE, _qbuf.AudioAttributesCompatParcelizer());
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatCustomActionResultReceiver = calloc.INSTANCE.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = findClass.RemoteActionCompatParcelizer(-1L);
        handleWeirdStringValue handleweirdstringvalueWrite = hasSomeOfFeatures.write(new write());
        this.AudioAttributesImplApi26Parcelizer = handleweirdstringvalueWrite;
        if (Build.VERSION.SDK_INT >= 31) {
            setlifecycleowner = new setInteractionEnabled(handleweirdstringvalueWrite, this, getmodifier);
        } else {
            setlifecycleowner = new setLifecycleOwner(handleweirdstringvalueWrite, this, getmodifier, getreturntransition);
        }
        this.MediaBrowserCompatSearchResultReceiver = setlifecycleowner;
    }

    public final InputAccessor<getShowPopup> RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[PHI: r9
      0x00e1: PHI (r9v12 float) = (r9v11 float), (r9v15 float) binds: [B:42:0x00da, B:32:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b A[PHI: r12
      0x015b: PHI (r12v10 float) = (r12v9 float), (r12v13 float) binds: [B:67:0x0154, B:57:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    @Override // kotlin.setLastHorizontalStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long IconCompatParcelizer(long r19, int r21, kotlin.getAnswerMap<? super kotlin.getReferencedType, kotlin.getReferencedType> r22) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setParentCompositionContext.IconCompatParcelizer(long, int, o.getAnswerMap):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r19.invoke(r0, r3) != r4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.setLastHorizontalStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(long r17, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.UnsupportedTypeDeserializer, ? super kotlin.SampleVideos<? super kotlin.UnsupportedTypeDeserializer>, ? extends java.lang.Object> r19, kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setParentCompositionContext.IconCompatParcelizer(long, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.setLastHorizontalStyle
    public final boolean read() {
        getModifier getmodifier = this.AudioAttributesCompatParcelizer;
        EdgeEffect edgeEffect = getmodifier.read;
        if (edgeEffect != null && getLifecycleOwner.INSTANCE.write(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect2 = getmodifier.AudioAttributesCompatParcelizer;
        if (edgeEffect2 != null && getLifecycleOwner.INSTANCE.write(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect3 = getmodifier.AudioAttributesImplBaseParcelizer;
        if (edgeEffect3 != null && getLifecycleOwner.INSTANCE.write(edgeEffect3) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect4 = getmodifier.MediaBrowserCompatCustomActionResultReceiver;
        return (edgeEffect4 == null || getLifecycleOwner.INSTANCE.write(edgeEffect4) == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    public final void IconCompatParcelizer(long p0) {
        boolean zRemoteActionCompatParcelizer = calloc.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, calloc.INSTANCE.AudioAttributesCompatParcelizer());
        boolean zRemoteActionCompatParcelizer2 = calloc.RemoteActionCompatParcelizer(p0, this.MediaBrowserCompatCustomActionResultReceiver);
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
        if (!zRemoteActionCompatParcelizer2) {
            long j = -1;
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getKey.read((((long) getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) p0))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (p0 >> 32)))) << 32)));
        }
        if (zRemoteActionCompatParcelizer || zRemoteActionCompatParcelizer2) {
            return;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    public final long write() {
        long jAudioAttributesCompatParcelizer = this.read;
        if ((9223372034707292159L & jAudioAttributesCompatParcelizer) == 9205357640488583168L) {
            jAudioAttributesCompatParcelizer = allocCharBuffer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer) / Float.intBitsToFloat((int) this.MediaBrowserCompatCustomActionResultReceiver))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)) / Float.intBitsToFloat((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32)))) << 32));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements PointerInputEventHandler {

        /* JADX INFO: renamed from: o.setParentCompositionContext$write$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ setParentCompositionContext AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
            
                if (r15 != r0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
            
                if (r15 != r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
            
                return r0;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0060 -> B:16:0x0064). Please report as a decompilation issue!!! */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setParentCompositionContext.write.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(setParentCompositionContext setparentcompositioncontext, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = setparentcompositioncontext;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.AudioAttributesCompatParcelizer, sampleVideos);
                anonymousClass1.RemoteActionCompatParcelizer = obj;
                return anonymousClass1;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = setOnHierarchyChangeListener.IconCompatParcelizer(handlebadmerge, new AnonymousClass1(setParentCompositionContext.this, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        write() {
        }
    }

    @Override // kotlin.setLastHorizontalStyle
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Module getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            this.write.write(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        boolean z;
        getModifier getmodifier = this.AudioAttributesCompatParcelizer;
        EdgeEffect edgeEffect = getmodifier.read;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = getmodifier.AudioAttributesCompatParcelizer;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = getmodifier.AudioAttributesImplBaseParcelizer;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        EdgeEffect edgeEffect4 = getmodifier.MediaBrowserCompatCustomActionResultReceiver;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean AudioAttributesImplApi26Parcelizer(long r9) {
        /*
            r8 = this;
            o.getModifier r0 = r8.AudioAttributesCompatParcelizer
            boolean r0 = r0.MediaBrowserCompatMediaItem()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r9 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            o.getLifecycleOwner r4 = kotlin.getLifecycleOwner.INSTANCE
            o.getModifier r5 = r8.AudioAttributesCompatParcelizer
            android.widget.EdgeEffect r5 = r5.AudioAttributesCompatParcelizer()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.IconCompatParcelizer(r5, r0)
            o.getModifier r0 = r8.AudioAttributesCompatParcelizer
            boolean r0 = r0.MediaBrowserCompatMediaItem()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            o.getModifier r4 = r8.AudioAttributesCompatParcelizer
            boolean r4 = r4.onAddQueueItem()
            r5 = 1
            if (r4 == 0) goto L5e
            long r6 = r9 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5e
            o.getLifecycleOwner r4 = kotlin.getLifecycleOwner.INSTANCE
            o.getModifier r6 = r8.AudioAttributesCompatParcelizer
            android.widget.EdgeEffect r6 = r6.AudioAttributesImplApi21Parcelizer()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.IconCompatParcelizer(r6, r1)
            if (r0 != 0) goto L5d
            o.getModifier r0 = r8.AudioAttributesCompatParcelizer
            boolean r0 = r0.onAddQueueItem()
            if (r0 != 0) goto L5d
            r0 = r3
            goto L5e
        L5d:
            r0 = r5
        L5e:
            o.getModifier r1 = r8.AudioAttributesCompatParcelizer
            boolean r1 = r1.onCustomAction()
            if (r1 == 0) goto L8b
            int r1 = (int) r9
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L8b
            o.getLifecycleOwner r4 = kotlin.getLifecycleOwner.INSTANCE
            o.getModifier r6 = r8.AudioAttributesCompatParcelizer
            android.widget.EdgeEffect r6 = r6.AudioAttributesImplApi26Parcelizer()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.IconCompatParcelizer(r6, r1)
            if (r0 != 0) goto L8a
            o.getModifier r0 = r8.AudioAttributesCompatParcelizer
            boolean r0 = r0.onCustomAction()
            if (r0 != 0) goto L8a
            r0 = r3
            goto L8b
        L8a:
            r0 = r5
        L8b:
            o.getModifier r1 = r8.AudioAttributesCompatParcelizer
            boolean r1 = r1.MediaBrowserCompatItemReceiver()
            if (r1 == 0) goto Lb7
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto Lb7
            o.getLifecycleOwner r10 = kotlin.getLifecycleOwner.INSTANCE
            o.getModifier r1 = r8.AudioAttributesCompatParcelizer
            android.widget.EdgeEffect r1 = r1.IconCompatParcelizer()
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r10.IconCompatParcelizer(r1, r9)
            if (r0 != 0) goto Lb6
            o.getModifier r8 = r8.AudioAttributesCompatParcelizer
            boolean r8 = r8.MediaBrowserCompatItemReceiver()
            if (r8 != 0) goto Lb6
            return r3
        Lb6:
            return r5
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setParentCompositionContext.AudioAttributesImplApi26Parcelizer(long):boolean");
    }

    private final float RemoteActionCompatParcelizer(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (write() >> 32));
        int i = (int) p0;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) this.MediaBrowserCompatCustomActionResultReceiver);
        EdgeEffect edgeEffectAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        return getLifecycleOwner.INSTANCE.write(edgeEffectAudioAttributesImplApi26Parcelizer) == BitmapDescriptorFactory.HUE_RED ? getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(edgeEffectAudioAttributesImplApi26Parcelizer, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) this.MediaBrowserCompatCustomActionResultReceiver) : Float.intBitsToFloat(i);
    }

    private final float read(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (write() >> 32));
        int i = (int) p0;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) this.MediaBrowserCompatCustomActionResultReceiver);
        EdgeEffect edgeEffectIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        return getLifecycleOwner.INSTANCE.write(edgeEffectIconCompatParcelizer) == BitmapDescriptorFactory.HUE_RED ? (-getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(edgeEffectIconCompatParcelizer, -fIntBitsToFloat2, 1.0f - fIntBitsToFloat)) * Float.intBitsToFloat((int) this.MediaBrowserCompatCustomActionResultReceiver) : Float.intBitsToFloat(i);
    }

    private final float AudioAttributesCompatParcelizer(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) write());
        int i = (int) (p0 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32));
        EdgeEffect edgeEffectAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        return getLifecycleOwner.INSTANCE.write(edgeEffectAudioAttributesCompatParcelizer) == BitmapDescriptorFactory.HUE_RED ? getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(edgeEffectAudioAttributesCompatParcelizer, fIntBitsToFloat2, 1.0f - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32)) : Float.intBitsToFloat(i);
    }

    private final float write(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) write());
        int i = (int) (p0 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32));
        EdgeEffect edgeEffectAudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        return getLifecycleOwner.INSTANCE.write(edgeEffectAudioAttributesImplApi21Parcelizer) == BitmapDescriptorFactory.HUE_RED ? (-getLifecycleOwner.INSTANCE.RemoteActionCompatParcelizer(edgeEffectAudioAttributesImplApi21Parcelizer, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32)) : Float.intBitsToFloat(i);
    }

    public /* synthetic */ setParentCompositionContext(Context context, bufferMapProperty buffermapproperty, long j, getReturnTransition getreturntransition, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, buffermapproperty, j, getreturntransition);
    }
}
