package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J]\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\b*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\b*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u0015*\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001e\u001a\u00020\u0015*\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00020\u0015*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010\u001b\u001a\u00020#*\u00020\"H\u0096\u0001¢\u0006\u0004\b\u001b\u0010$J\u0014\u0010\u0013\u001a\u00020\u001d*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u001fJ\u0014\u0010%\u001a\u00020\u001d*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b%\u0010!J\u0014\u0010&\u001a\u00020\"*\u00020#H\u0096\u0001¢\u0006\u0004\b&\u0010$J\u0014\u0010'\u001a\u00020\u0018*\u00020\u001dH\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u0018*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b)\u0010(R\u001a\u0010)\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b)\u0010+R\u0014\u0010\u0013\u001a\u00020\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010,R\u0014\u0010\u0016\u001a\u00020\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010,R\u0014\u0010\u001e\u001a\u00020-8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lo/DeserializationFeature;", "Lo/weirdStringException;", "Lo/DeserializationContext1;", "p0", "Lo/tryToResolveUnresolved;", "p1", "<init>", "(Lo/DeserializationContext1;Lo/tryToResolveUnresolved;)V", "", "", "Lo/weirdNumberException;", "p2", "Lkotlin/Function1;", "Lo/JsonNode;", "", "p3", "Lo/_parser$IconCompatParcelizer;", "p4", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/assignParameter;", "IconCompatParcelizer", "(F)I", "Lo/ReadableObjectIdReferring;", "a_", "(J)I", "b_", "(I)F", "", "write", "(F)F", "e_", "(J)F", "Lo/calloc;", "Lo/handleIdValue;", "(J)J", "c_", "d_", "RemoteActionCompatParcelizer", "(F)J", "read", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "()F", "", "r_", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeserializationFeature implements weirdStringException {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final tryToResolveUnresolved read;
    private final /* synthetic */ DeserializationContext1 read;

    public DeserializationFeature(DeserializationContext1 deserializationContext1, tryToResolveUnresolved trytoresolveunresolved) {
        this.read = deserializationContext1;
        this.read = trytoresolveunresolved;
    }

    @Override // kotlin.getValueHandler
    /* JADX INFO: renamed from: read, reason: from getter */
    public final tryToResolveUnresolved getRead() {
        return this.read;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/DeserializationFeature$AudioAttributesCompatParcelizer;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "onFastForward", "()I", "IconCompatParcelizer", "onAddQueueItem", "write", "", "Lo/weirdNumberException;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "AudioAttributesCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements withHandlersFrom {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        final /* synthetic */ Map<weirdNumberException, Integer> IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<JsonNode, getShowPopup> read;

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(int i, int i2, Map<weirdNumberException, Integer> map, getAnswerMap<? super JsonNode, getShowPopup> getanswermap) {
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.IconCompatParcelizer = map;
            this.read = getanswermap;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final getAnswerMap<JsonNode, getShowPopup> onPause() {
            return this.read;
        }
    }

    @Override // kotlin.withContentValueHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
        if (p0 < 0) {
            p0 = 0;
        }
        if (p1 < 0) {
            p1 = 0;
        }
        if ((p0 & (-16777216)) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            reportWrongTokenException.read(sb.toString());
        }
        return new AudioAttributesCompatParcelizer(p0, p1, p2, p3);
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getAudioAttributesCompatParcelizer() {
        return this.read.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.read.getIconCompatParcelizer();
    }

    @Override // kotlin.getValueHandler
    public final boolean r_() {
        return this.read.r_();
    }

    @Override // kotlin.bufferMapProperty
    public final int a_(long j) {
        return this.read.a_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final int IconCompatParcelizer(float f) {
        return this.read.IconCompatParcelizer(f);
    }

    @Override // kotlin.getParameter
    public final float e_(long j) {
        return this.read.e_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float write(float f) {
        return this.read.write(f);
    }

    @Override // kotlin.bufferMapProperty
    public final float b_(int i) {
        return this.read.b_(i);
    }

    @Override // kotlin.bufferMapProperty
    public final long b_(long j) {
        return this.read.b_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float c_(long j) {
        return this.read.c_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float AudioAttributesCompatParcelizer(float f) {
        return this.read.AudioAttributesCompatParcelizer(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long d_(long j) {
        return this.read.d_(j);
    }

    @Override // kotlin.getParameter
    public final long read(float f) {
        return this.read.read(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long RemoteActionCompatParcelizer(float f) {
        return this.read.RemoteActionCompatParcelizer(f);
    }
}
