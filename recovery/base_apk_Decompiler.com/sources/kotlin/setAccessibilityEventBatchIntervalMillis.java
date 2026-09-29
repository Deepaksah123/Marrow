package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0018\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0011\u001a\u00020\u001b*\u00020\u001aH\u0016¢\u0006\u0004\b\u0011\u0010\u001cR\u001a\u0010!\u001a\u00020\r8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0018\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b$\u0010(R$\u0010+\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010)\"\u0004\b\u0011\u0010*R$\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00078\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010,\"\u0004\b!\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010/"}, d2 = {"Lo/setAccessibilityEventBatchIntervalMillis;", "Lo/addAbstractTypeResolver;", "Lo/hasIndex;", "Lo/assignParameter;", "p0", "Lo/Instantiatable;", "p1", "Lo/findAndAddVirtualProperties;", "p2", "<init>", "(FLo/Instantiatable;Lo/findAndAddVirtualProperties;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/_reportInvalidChar;", "Lo/resetWithString$AudioAttributesCompatParcelizer;", "", "", "p3", "Lo/parseMediumName;", "write", "(Lo/_reportInvalidChar;Lo/Instantiatable;Lo/resetWithString$AudioAttributesCompatParcelizer;ZF)Lo/parseMediumName;", "Lo/resetWithString$RemoteActionCompatParcelizer;", "Lo/getReferencedType;", "Lo/calloc;", "p4", "p5", "RemoteActionCompatParcelizer", "(Lo/_reportInvalidChar;Lo/Instantiatable;Lo/resetWithString$RemoteActionCompatParcelizer;JJZF)Lo/parseMediumName;", "Lo/getConfigOverride;", "", "(Lo/getConfigOverride;)V", "AudioAttributesImplApi21Parcelizer", "Z", "AudioAttributesImplBaseParcelizer", "()Z", "IconCompatParcelizer", "j_", "Lo/getPrimaryDirectionalMotionAxisOverridedqNNBbUui;", "AudioAttributesCompatParcelizer", "Lo/getPrimaryDirectionalMotionAxisOverridedqNNBbUui;", "MediaBrowserCompatCustomActionResultReceiver", "F", "(F)V", "Lo/Instantiatable;", "(Lo/Instantiatable;)V", "read", "Lo/findAndAddVirtualProperties;", "(Lo/findAndAddVirtualProperties;)V", "Lo/findName;", "Lo/findName;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setAccessibilityEventBatchIntervalMillis extends addAbstractTypeResolver implements hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getPrimaryDirectionalMotionAxisOverridedqNNBbUui write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private findAndAddVirtualProperties AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final findName MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Instantiatable read;

    private setAccessibilityEventBatchIntervalMillis(float f, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties) {
        this.AudioAttributesCompatParcelizer = f;
        this.read = instantiatable;
        this.AudioAttributesImplBaseParcelizer = findandaddvirtualproperties;
        this.MediaBrowserCompatItemReceiver = (findName) AudioAttributesCompatParcelizer(WriterBasedJsonGenerator.write(new getAnswerMap() { // from class: o.setCoroutineContext
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setAccessibilityEventBatchIntervalMillis.write(this.read, (_reportInvalidChar) obj);
            }
        }));
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: j_, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, f)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = f;
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
    }

    public final void write(Instantiatable instantiatable) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, instantiatable)) {
            return;
        }
        this.read = instantiatable;
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, findandaddvirtualproperties)) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = findandaddvirtualproperties;
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        getValueNulls.write(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseMediumName write(setAccessibilityEventBatchIntervalMillis setaccessibilityeventbatchintervalmillis, _reportInvalidChar _reportinvalidchar) {
        if (_reportinvalidchar.AudioAttributesCompatParcelizer(setaccessibilityeventbatchintervalmillis.AudioAttributesCompatParcelizer) < BitmapDescriptorFactory.HUE_RED || calloc.IconCompatParcelizer(_reportinvalidchar.write()) <= BitmapDescriptorFactory.HUE_RED) {
            return setConfiguration.read(_reportinvalidchar);
        }
        float fMin = Math.min(assignParameter.IconCompatParcelizer(setaccessibilityeventbatchintervalmillis.AudioAttributesCompatParcelizer, assignParameter.INSTANCE.IconCompatParcelizer()) ? 1.0f : (float) Math.ceil(_reportinvalidchar.AudioAttributesCompatParcelizer(setaccessibilityeventbatchintervalmillis.AudioAttributesCompatParcelizer)), (float) Math.ceil(calloc.IconCompatParcelizer(_reportinvalidchar.write()) / 2.0f));
        float f = fMin / 2.0f;
        long j = -1;
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
        long j2 = -1;
        long jWrite = calloc.write((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) _reportinvalidchar.write()) - fMin)) & ((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (_reportinvalidchar.write() >> 32)) - fMin)) << 32));
        boolean z = fMin * 2.0f > calloc.IconCompatParcelizer(_reportinvalidchar.write());
        resetWithString resetwithstringWrite = setaccessibilityeventbatchintervalmillis.AudioAttributesImplBaseParcelizer.write(_reportinvalidchar.write(), _reportinvalidchar.RemoteActionCompatParcelizer(), _reportinvalidchar);
        if (resetwithstringWrite instanceof resetWithString.AudioAttributesCompatParcelizer) {
            return setaccessibilityeventbatchintervalmillis.write(_reportinvalidchar, setaccessibilityeventbatchintervalmillis.read, (resetWithString.AudioAttributesCompatParcelizer) resetwithstringWrite, z, fMin);
        }
        if (resetwithstringWrite instanceof resetWithString.RemoteActionCompatParcelizer) {
            return setaccessibilityeventbatchintervalmillis.RemoteActionCompatParcelizer(_reportinvalidchar, setaccessibilityeventbatchintervalmillis.read, (resetWithString.RemoteActionCompatParcelizer) resetwithstringWrite, jAudioAttributesCompatParcelizer, jWrite, z, fMin);
        }
        if (resetwithstringWrite instanceof resetWithString.read) {
            return setConfiguration.AudioAttributesCompatParcelizer(_reportinvalidchar, setaccessibilityeventbatchintervalmillis.read, jAudioAttributesCompatParcelizer, jWrite, z, fMin);
        }
        throw new RenewEligibleCreator();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, o.unshare] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.parseMediumName write(kotlin._reportInvalidChar r44, final kotlin.Instantiatable r45, final o.resetWithString.AudioAttributesCompatParcelizer r46, boolean r47, float r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAccessibilityEventBatchIntervalMillis.write(o._reportInvalidChar, o.Instantiatable, o.resetWithString$AudioAttributesCompatParcelizer, boolean, float):o.parseMediumName");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(resetWithString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Instantiatable instantiatable, findSerializer findserializer) {
        findserializer.write();
        findSetterInfo.AudioAttributesCompatParcelizer$default(findserializer, audioAttributesCompatParcelizer.getIconCompatParcelizer(), instantiatable, BitmapDescriptorFactory.HUE_RED, (findViews) null, (switchAndReturnNext) null, 0, 60, (Object) null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, MagicModuleUseCaseImplWhenMappings.write writeVar, long j, switchAndReturnNext switchandreturnnext, findSerializer findserializer) throws Throwable {
        float f;
        float f2;
        findserializer.write();
        findSerializer findserializer2 = findserializer;
        float audioAttributesCompatParcelizer = writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        float remoteActionCompatParcelizer = writableTypeIdInclusion.getRemoteActionCompatParcelizer();
        findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
        try {
            try {
                findSetterInfo.write$default(findserializer2, (unshare) writeVar.write, 0L, j, 0L, 0L, BitmapDescriptorFactory.HUE_RED, (findViews) null, switchandreturnnext, 0, 0, 890, (Object) null);
                findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(-audioAttributesCompatParcelizer, -remoteActionCompatParcelizer);
                return getShowPopup.INSTANCE;
            } catch (Throwable th) {
                th = th;
                f = remoteActionCompatParcelizer;
                f2 = audioAttributesCompatParcelizer;
                findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(-f2, -f);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            f = remoteActionCompatParcelizer;
            f2 = audioAttributesCompatParcelizer;
        }
    }

    private final parseMediumName RemoteActionCompatParcelizer(_reportInvalidChar _reportinvalidchar, final Instantiatable instantiatable, resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer, final long j, final long j2, final boolean z, final float f) {
        if (allocByteBuffer.read(remoteActionCompatParcelizer.getRead())) {
            final long write = remoteActionCompatParcelizer.getRead().getWrite();
            final float f2 = f / 2.0f;
            final findValueInstantiator findvalueinstantiator = new findValueInstantiator(f, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
            return _reportinvalidchar.IconCompatParcelizer(new getAnswerMap() { // from class: o.setOnViewTreeOwnersAvailable
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setAccessibilityEventBatchIntervalMillis.RemoteActionCompatParcelizer(z, instantiatable, write, f2, f, j, j2, findvalueinstantiator, (findSerializer) obj);
                }
            });
        }
        if (this.write == null) {
            this.write = new getPrimaryDirectionalMotionAxisOverridedqNNBbUui(null, null, null, null, 15, null);
        }
        getPrimaryDirectionalMotionAxisOverridedqNNBbUui getprimarydirectionalmotionaxisoverridedqnnbbuui = this.write;
        toMagicModuleMetaRepoModel.write(getprimarydirectionalmotionaxisoverridedqnnbbuui);
        final removeSoftRefsClearedByGc removesoftrefsclearedbygcRemoteActionCompatParcelizer = setConfiguration.RemoteActionCompatParcelizer(getprimarydirectionalmotionaxisoverridedqnnbbuui.write(), remoteActionCompatParcelizer.getRead(), f, z);
        return _reportinvalidchar.IconCompatParcelizer(new getAnswerMap() { // from class: o.setContentCaptureManagerui
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setAccessibilityEventBatchIntervalMillis.read(removesoftrefsclearedbygcRemoteActionCompatParcelizer, instantiatable, (findSerializer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, Instantiatable instantiatable, long j, float f, float f2, long j2, long j3, findValueInstantiator findvalueinstantiator, findSerializer findserializer) throws Throwable {
        long j4;
        findserializer.write();
        if (z) {
            findSetterInfo.read$default(findserializer, instantiatable, 0L, 0L, j, BitmapDescriptorFactory.HUE_RED, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j >> 32)) < f) {
            findSerializer findserializer2 = findserializer;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver());
            int iRemoteActionCompatParcelizer = ReadConstrainedTextBuffer.INSTANCE.RemoteActionCompatParcelizer();
            findSerializationTyping iconCompatParcelizer = findserializer2.getIconCompatParcelizer();
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            try {
                iconCompatParcelizer.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(f2, f2, fIntBitsToFloat - f2, fIntBitsToFloat2 - f2, iRemoteActionCompatParcelizer);
                try {
                    findSetterInfo.read$default(findserializer2, instantiatable, 0L, 0L, j, BitmapDescriptorFactory.HUE_RED, null, null, 0, 246, null);
                    iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                    iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
                } catch (Throwable th) {
                    th = th;
                    j4 = jAudioAttributesCompatParcelizer;
                    iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                    iconCompatParcelizer.IconCompatParcelizer(j4);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j4 = jAudioAttributesCompatParcelizer;
            }
        } else {
            findSetterInfo.read$default(findserializer, instantiatable, j2, j3, setConfiguration.RemoteActionCompatParcelizer(j, f), BitmapDescriptorFactory.HUE_RED, findvalueinstantiator, null, 0, 208, null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(removeSoftRefsClearedByGc removesoftrefsclearedbygc, Instantiatable instantiatable, findSerializer findserializer) {
        findserializer.write();
        findSetterInfo.AudioAttributesCompatParcelizer$default(findserializer, removesoftrefsclearedbygc, instantiatable, BitmapDescriptorFactory.HUE_RED, (findViews) null, (switchAndReturnNext) null, 0, 60, (Object) null);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        MapperBuilder.IconCompatParcelizer(getconfigoverride, this.AudioAttributesImplBaseParcelizer);
    }

    public /* synthetic */ setAccessibilityEventBatchIntervalMillis(float f, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, instantiatable, findandaddvirtualproperties);
    }
}
