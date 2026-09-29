package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ]\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\n*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001c\u001a\u00020\n*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u0018*\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010!\u001a\u00020\u0018*\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u00020\u0018*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010\u001e\u001a\u00020&*\u00020%H\u0096\u0001¢\u0006\u0004\b\u001e\u0010'J\u0014\u0010\u0015\u001a\u00020 *\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\"J\u0014\u0010(\u001a\u00020 *\u00020\u001bH\u0096\u0001¢\u0006\u0004\b(\u0010$J\u0014\u0010)\u001a\u00020%*\u00020&H\u0096\u0001¢\u0006\u0004\b)\u0010'J\u0014\u0010*\u001a\u00020\u001b*\u00020 H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010,\u001a\u00020\u001b*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b,\u0010+R\u0017\u0010\u0015\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010/R\"\u0010*\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102\"\u0004\b*\u00103R\u0014\u0010!\u001a\u0002048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\"\u0010\u0019\u001a\u0002078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u00108\u001a\u0004\b*\u00109\"\u0004\b\u0019\u0010:R\u0014\u0010,\u001a\u0002078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u00105\u001a\u00020 8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010<R\u0014\u0010=\u001a\u00020 8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010<R\u0014\u0010.\u001a\u00020>8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010?"}, d2 = {"Lo/containedType;", "Lo/weirdStringException;", "Lo/withContentValueHandler;", "Lo/refine;", "Lo/_findRootDeserializer;", "p0", "Lo/EnumNamingStrategy;", "p1", "<init>", "(Lo/_findRootDeserializer;Lo/EnumNamingStrategy;)V", "", "", "Lo/weirdNumberException;", "p2", "Lkotlin/Function1;", "Lo/JsonNode;", "", "p3", "Lo/_parser$IconCompatParcelizer;", "p4", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;", "(IILjava/util/Map;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/assignParameter;", "IconCompatParcelizer", "(F)I", "Lo/ReadableObjectIdReferring;", "a_", "(J)I", "b_", "(I)F", "", "write", "(F)F", "e_", "(J)F", "Lo/calloc;", "Lo/handleIdValue;", "(J)J", "c_", "d_", "RemoteActionCompatParcelizer", "(F)J", "read", "Lo/_findRootDeserializer;", "AudioAttributesImplApi26Parcelizer", "()Lo/_findRootDeserializer;", "Lo/EnumNamingStrategy;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/EnumNamingStrategy;", "(Lo/EnumNamingStrategy;)V", "Lo/getKey;", "AudioAttributesImplApi21Parcelizer", "()J", "", "Z", "()Z", "(Z)V", "r_", "()F", "AudioAttributesImplBaseParcelizer", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class containedType implements weirdStringException, refine {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private EnumNamingStrategy RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _findRootDeserializer AudioAttributesCompatParcelizer;

    @Override // kotlin.getValueHandler
    public final boolean r_() {
        return false;
    }

    public containedType(_findRootDeserializer _findrootdeserializer, EnumNamingStrategy enumNamingStrategy) {
        this.AudioAttributesCompatParcelizer = _findrootdeserializer;
        this.RemoteActionCompatParcelizer = enumNamingStrategy;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final _findRootDeserializer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final EnumNamingStrategy getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(EnumNamingStrategy enumNamingStrategy) {
        this.RemoteActionCompatParcelizer = enumNamingStrategy;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        readerFor write = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        withHandlersFrom withhandlersfromOnMediaButtonEvent = write.onMediaButtonEvent();
        long j = -1;
        return getKey.read((((long) withhandlersfromOnMediaButtonEvent.getIconCompatParcelizer()) << 32) | (((long) withhandlersfromOnMediaButtonEvent.getRead()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/containedType$AudioAttributesCompatParcelizer;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "AudioAttributesImplApi26Parcelizer", "I", "onFastForward", "()I", "RemoteActionCompatParcelizer", "onAddQueueItem", "IconCompatParcelizer", "", "Lo/weirdNumberException;", "AudioAttributesCompatParcelizer", "Ljava/util/Map;", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lo/JsonNode;", "write", "Lo/getAnswerMap;", "onPause", "()Lo/getAnswerMap;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements withHandlersFrom {
        private final Map<weirdNumberException, Integer> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;
        final /* synthetic */ containedType IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;
        final /* synthetic */ getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final getAnswerMap<JsonNode, getShowPopup> read;

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(int i, int i2, Map<weirdNumberException, Integer> map, getAnswerMap<? super JsonNode, getShowPopup> getanswermap, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> getanswermap2, containedType containedtype) {
            this.read = getanswermap2;
            this.IconCompatParcelizer = containedtype;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = map;
            this.read = getanswermap;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getRead() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final getAnswerMap<JsonNode, getShowPopup> onPause() {
            return this.read;
        }

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
            this.read.invoke(this.IconCompatParcelizer.getAudioAttributesCompatParcelizer().getMediaDescriptionCompat());
        }
    }

    @Override // kotlin.withContentValueHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
        if ((p0 & (-16777216)) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            reportWrongTokenException.read(sb.toString());
        }
        return new AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4, this);
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        return this.AudioAttributesCompatParcelizer.getRead();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getIconCompatParcelizer();
    }

    @Override // kotlin.getValueHandler
    /* JADX INFO: renamed from: read */
    public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.withContentValueHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p3) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3);
    }

    @Override // kotlin.bufferMapProperty
    public final int a_(long j) {
        return this.AudioAttributesCompatParcelizer.a_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final int IconCompatParcelizer(float f) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(f);
    }

    @Override // kotlin.getParameter
    public final float e_(long j) {
        return this.AudioAttributesCompatParcelizer.e_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float write(float f) {
        return this.AudioAttributesCompatParcelizer.write(f);
    }

    @Override // kotlin.bufferMapProperty
    public final float b_(int i) {
        return this.AudioAttributesCompatParcelizer.b_(i);
    }

    @Override // kotlin.bufferMapProperty
    public final long b_(long j) {
        return this.AudioAttributesCompatParcelizer.b_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float c_(long j) {
        return this.AudioAttributesCompatParcelizer.c_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float AudioAttributesCompatParcelizer(float f) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long d_(long j) {
        return this.AudioAttributesCompatParcelizer.d_(j);
    }

    @Override // kotlin.getParameter
    public final long read(float f) {
        return this.AudioAttributesCompatParcelizer.read(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long RemoteActionCompatParcelizer(float f) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(f);
    }
}
