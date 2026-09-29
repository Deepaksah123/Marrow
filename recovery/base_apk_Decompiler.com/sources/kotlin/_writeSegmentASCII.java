package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0016\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ#\u0010\u001c\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ#\u0010\u001d\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ#\u0010\u001e\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001c\u0010 J\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010 J\u0013\u0010\u001e\u001a\u00020\"*\u00020!H\u0016¢\u0006\u0004\b\u001e\u0010#J\u0013\u0010$\u001a\u00020\u0006*\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u001fH\u0002¢\u0006\u0004\b\u0016\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\"\u0010$\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b\u0016\u0010*\"\u0004\b\u001d\u0010+R\"\u0010\u0016\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u001e\u0010.\"\u0004\b\u0016\u0010/R\u001c\u0010\u001d\u001a\u00020\b8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b$\u00100\"\u0004\b\u001e\u00101R\u001c\u0010\u001c\u001a\u00020\n8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001c\u00102\"\u0004\b\u001d\u00103R\u001c\u0010\u001e\u001a\u00020\f8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001d\u00104\"\u0004\b\u001e\u00105R\u001e\u0010,\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u00106\"\u0004\b$\u00107R\u0014\u00109\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010.R\u0014\u0010:\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010."}, d2 = {"Lo/_writeSegmentASCII;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/addKeySerializers;", "Lo/isAnnotationBundle;", "p0", "", "p1", "Lo/_skipWSOrEnd;", "p2", "Lo/getContentType;", "p3", "", "p4", "Lo/switchAndReturnNext;", "p5", "<init>", "(Lo/isAnnotationBundle;ZLo/_skipWSOrEnd;Lo/getContentType;FLo/switchAndReturnNext;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Lo/calloc;", "(J)J", "Lo/findSerializer;", "", "(Lo/findSerializer;)V", "IconCompatParcelizer", "(J)Z", "", "toString", "()Ljava/lang/String;", "Lo/isAnnotationBundle;", "()Lo/isAnnotationBundle;", "(Lo/isAnnotationBundle;)V", "AudioAttributesImplBaseParcelizer", "Z", "()Z", "(Z)V", "Lo/_skipWSOrEnd;", "(Lo/_skipWSOrEnd;)V", "Lo/getContentType;", "(Lo/getContentType;)V", "F", "(F)V", "Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _writeSegmentASCII extends _handleOddName.IconCompatParcelizer implements _initForReading, addKeySerializers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private _skipWSOrEnd AudioAttributesCompatParcelizer;
    private getContentType RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private isAnnotationBundle IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private switchAndReturnNext AudioAttributesImplBaseParcelizer;

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final boolean getRemoteActionCompatParcelizer() {
        return false;
    }

    public _writeSegmentASCII(isAnnotationBundle isannotationbundle, boolean z, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, float f, switchAndReturnNext switchandreturnnext) {
        this.IconCompatParcelizer = isannotationbundle;
        this.read = z;
        this.AudioAttributesCompatParcelizer = _skipwsorend;
        this.RemoteActionCompatParcelizer = getcontenttype;
        this.write = f;
        this.AudioAttributesImplBaseParcelizer = switchandreturnnext;
    }

    public final void AudioAttributesCompatParcelizer(isAnnotationBundle isannotationbundle) {
        this.IconCompatParcelizer = isannotationbundle;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final isAnnotationBundle getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void read(boolean z) {
        this.read = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void write(_skipWSOrEnd _skipwsorend) {
        this.AudioAttributesCompatParcelizer = _skipwsorend;
    }

    public final void AudioAttributesCompatParcelizer(getContentType getcontenttype) {
        this.RemoteActionCompatParcelizer = getcontenttype;
    }

    public final void write(float f) {
        this.write = f;
    }

    public final void IconCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        this.AudioAttributesImplBaseParcelizer = switchandreturnnext;
    }

    private final boolean AudioAttributesImplApi21Parcelizer() {
        return this.read && this.IconCompatParcelizer.getRead() != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: o._writeSegmentASCII$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            read(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, this.$write, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(_parser _parserVar) {
            super(1);
            this.$write = _parserVar;
        }
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        _parser _parserVarWrite = istypeorsupertypeof.write(write(j));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass2(_parserVarWrite), 4, null);
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (AudioAttributesImplApi21Parcelizer()) {
            long jWrite = write(PropertyValueBuffer.read$default(0, 0, 0, i, 7, null));
            return Math.max(PropertyValueAny.MediaBrowserCompatItemReceiver(jWrite), hashandlers.AudioAttributesCompatParcelizer(i));
        }
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (AudioAttributesImplApi21Parcelizer()) {
            long jWrite = write(PropertyValueBuffer.read$default(0, 0, 0, i, 7, null));
            return Math.max(PropertyValueAny.MediaBrowserCompatItemReceiver(jWrite), hashandlers.write(i));
        }
        return hashandlers.write(i);
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (AudioAttributesImplApi21Parcelizer()) {
            long jWrite = write(PropertyValueBuffer.read$default(0, i, 0, 0, 13, null));
            return Math.max(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(jWrite), hashandlers.read(i));
        }
        return hashandlers.read(i);
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (AudioAttributesImplApi21Parcelizer()) {
            long jWrite = write(PropertyValueBuffer.read$default(0, i, 0, 0, 13, null));
            return Math.max(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(jWrite), hashandlers.IconCompatParcelizer(i));
        }
        return hashandlers.IconCompatParcelizer(i);
    }

    private final long RemoteActionCompatParcelizer(long p0) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        if (!AudioAttributesImplApi21Parcelizer()) {
            return p0;
        }
        if (!IconCompatParcelizer(this.IconCompatParcelizer.getRead())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (this.IconCompatParcelizer.getRead() >> 32));
        }
        if (!read(this.IconCompatParcelizer.getRead())) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) p0);
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) this.IconCompatParcelizer.getRead());
        }
        long j = -1;
        long jWrite = calloc.write((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        if (Float.intBitsToFloat((int) (p0 >> 32)) != BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) p0) != BitmapDescriptorFactory.HUE_RED) {
            return doubleValue.IconCompatParcelizer(jWrite, this.RemoteActionCompatParcelizer.IconCompatParcelizer(jWrite, p0));
        }
        return calloc.INSTANCE.AudioAttributesCompatParcelizer();
    }

    private final long write(long p0) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatCustomActionResultReceiver;
        boolean z = PropertyValueAny.RemoteActionCompatParcelizer(p0) && PropertyValueAny.AudioAttributesCompatParcelizer(p0);
        boolean z2 = PropertyValueAny.AudioAttributesImplApi26Parcelizer(p0) && PropertyValueAny.IconCompatParcelizer(p0);
        if ((!AudioAttributesImplApi21Parcelizer() && z) || z2) {
            return PropertyValueAny.AudioAttributesCompatParcelizer$default(p0, PropertyValueAny.AudioAttributesImplBaseParcelizer(p0), 0, PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0), 0, 10, null);
        }
        long j = this.IconCompatParcelizer.getRead();
        if (!IconCompatParcelizer(j)) {
            iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(p0);
        } else {
            iMediaBrowserCompatItemReceiver = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        }
        if (!read(j)) {
            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(p0);
        } else {
            iMediaBrowserCompatCustomActionResultReceiver = Math.round(Float.intBitsToFloat((int) j));
        }
        long j2 = -1;
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(calloc.write((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(PropertyValueBuffer.RemoteActionCompatParcelizer(p0, iMediaBrowserCompatCustomActionResultReceiver)))) | (((long) Float.floatToRawIntBits(PropertyValueBuffer.IconCompatParcelizer(p0, iMediaBrowserCompatItemReceiver))) << 32)));
        return PropertyValueAny.AudioAttributesCompatParcelizer$default(p0, PropertyValueBuffer.IconCompatParcelizer(p0, Math.round(Float.intBitsToFloat((int) (jRemoteActionCompatParcelizer >> 32)))), 0, PropertyValueBuffer.RemoteActionCompatParcelizer(p0, Math.round(Float.intBitsToFloat((int) jRemoteActionCompatParcelizer))), 0, 10, null);
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long jAudioAttributesCompatParcelizer;
        long j = this.IconCompatParcelizer.getRead();
        if (IconCompatParcelizer(j)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32));
        }
        if (read(j)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver());
        }
        long j2 = -1;
        long jWrite = calloc.write((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        if (Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32)) != BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver()) != BitmapDescriptorFactory.HUE_RED) {
            jAudioAttributesCompatParcelizer = doubleValue.IconCompatParcelizer(jWrite, this.RemoteActionCompatParcelizer.IconCompatParcelizer(jWrite, findserializer.MediaBrowserCompatCustomActionResultReceiver()));
        } else {
            jAudioAttributesCompatParcelizer = calloc.INSTANCE.AudioAttributesCompatParcelizer();
        }
        long j3 = -1;
        long j4 = jAudioAttributesCompatParcelizer;
        long j5 = -1;
        long jIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getKey.read((((long) Math.round(Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (((long) Math.round(Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)))) << 32)), getKey.read((((j5 - ((j5 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Math.round(Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver())))) | (((long) Math.round(Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32)))) << 32)), findserializer.RemoteActionCompatParcelizer());
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(jIconCompatParcelizer);
        float fAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(jIconCompatParcelizer);
        findSerializer findserializer2 = findserializer;
        findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(fIconCompatParcelizer, fAudioAttributesCompatParcelizer);
        try {
            this.IconCompatParcelizer.write(findserializer2, j4, this.write, this.AudioAttributesImplBaseParcelizer);
            findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(-fIconCompatParcelizer, -fAudioAttributesCompatParcelizer);
            findserializer.write();
        } catch (Throwable th) {
            findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(-fIconCompatParcelizer, -fAudioAttributesCompatParcelizer);
            throw th;
        }
    }

    private final boolean IconCompatParcelizer(long j) {
        return !calloc.RemoteActionCompatParcelizer(j, calloc.INSTANCE.IconCompatParcelizer()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final boolean read(long j) {
        return !calloc.RemoteActionCompatParcelizer(j, calloc.INSTANCE.IconCompatParcelizer()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) j)) & Integer.MAX_VALUE) < 2139095040;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PainterModifier(painter=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.read);
        sb.append(", alignment=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", alpha=");
        sb.append(this.write);
        sb.append(", colorFilter=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
