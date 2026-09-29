package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\f\u001a\u00020\u000e*\u00020\u0014H\u0016¢\u0006\u0004\b\f\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0012\u001a\u00020\u0019*\u00020\u001aH\u0016¢\u0006\u0004\b\u0012\u0010\u001cJH\u0010%\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0096\u0001¢\u0006\u0004\b%\u0010&J^\u0010%\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\u001d2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\"\u0018\u00010 2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0096\u0001¢\u0006\u0004\b%\u0010)J\u0014\u0010*\u001a\u00020\t*\u00020\u000fH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010,\u001a\u00020\t*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0014\u0010%\u001a\u00020\u0014*\u00020\u000fH\u0096\u0001¢\u0006\u0004\b%\u0010\u0016J\u0014\u0010.\u001a\u00020\u0014*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b.\u0010\u0011R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R\u0014\u0010%\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\n038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00105R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0014\u00107\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u00106R\u0014\u00108\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u00106R\u0014\u0010<\u001a\u0002098WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010>"}, d2 = {"Lo/ExoPlayer;", "Lo/Mp4LocationData;", "Lo/withContentValueHandler;", "Lo/AudioAttributesCompat;", "p0", "Lo/getNodeType;", "p1", "<init>", "(Lo/AudioAttributesCompat;Lo/getNodeType;)V", "", "", "Lo/isTypeOrSuperTypeOf;", "RemoteActionCompatParcelizer", "(I)Ljava/util/List;", "Lo/ReadableObjectIdReferring;", "Lo/assignParameter;", "e_", "(J)F", "b_", "(I)F", "", "write", "(F)F", "(F)J", "read", "Lo/handleIdValue;", "Lo/calloc;", "d_", "(J)J", "", "Lo/weirdNumberException;", "p2", "Lkotlin/Function1;", "Lo/_parser$IconCompatParcelizer;", "", "p3", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(IILjava/util/Map;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/JsonNode;", "p4", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;", "IconCompatParcelizer", "(F)I", "a_", "(J)I", "c_", "Lo/AudioAttributesCompat;", "Lo/getNodeType;", "Lo/AudioAttributesImplApi21;", "Lo/AudioAttributesImplApi21;", "Lo/setProvider;", "Lo/_parser;", "Lo/setProvider;", "()F", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "", "r_", "()Z", "AudioAttributesImplApi21Parcelizer", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExoPlayer implements Mp4LocationData {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getNodeType read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final AudioAttributesImplApi21 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final AudioAttributesCompat IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setProvider<List<_parser>> write = ActionMenuView.write();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setProvider<List<isTypeOrSuperTypeOf>> RemoteActionCompatParcelizer = ActionMenuView.write();

    public ExoPlayer(AudioAttributesCompat audioAttributesCompat, getNodeType getnodetype) {
        this.IconCompatParcelizer = audioAttributesCompat;
        this.read = getnodetype;
        this.AudioAttributesCompatParcelizer = audioAttributesCompat.write().invoke();
    }

    @Override // kotlin.Mp4LocationData
    public final List<isTypeOrSuperTypeOf> RemoteActionCompatParcelizer(int p0) {
        List<isTypeOrSuperTypeOf> listAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        if (listAudioAttributesCompatParcelizer != null) {
            return listAudioAttributesCompatParcelizer;
        }
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
        List<isTypeOrSuperTypeOf> listIconCompatParcelizer = this.read.IconCompatParcelizer(objIconCompatParcelizer, this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0, objIconCompatParcelizer, this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0)));
        this.RemoteActionCompatParcelizer.write(p0, listIconCompatParcelizer);
        return listIconCompatParcelizer;
    }

    @Override // kotlin.getParameter
    public final float e_(long j) {
        return this.read.e_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float b_(int i) {
        return this.read.b_(i);
    }

    @Override // kotlin.bufferMapProperty
    public final float write(float f) {
        return this.read.write(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long RemoteActionCompatParcelizer(float f) {
        return this.read.RemoteActionCompatParcelizer(f);
    }

    @Override // kotlin.getParameter
    public final long read(float f) {
        return this.read.read(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long d_(long j) {
        return this.read.d_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final long b_(long j) {
        return this.read.b_(j);
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        return this.read.getRead();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.read.getIconCompatParcelizer();
    }

    @Override // kotlin.getValueHandler
    /* JADX INFO: renamed from: read */
    public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
        return this.read.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getValueHandler
    public final boolean r_() {
        return this.read.r_();
    }

    @Override // kotlin.withContentValueHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p3) {
        return this.read.AudioAttributesCompatParcelizer(p0, p1, p2, p3);
    }

    @Override // kotlin.withContentValueHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
        return this.read.AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4);
    }

    @Override // kotlin.bufferMapProperty
    public final int a_(long j) {
        return this.read.a_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final int IconCompatParcelizer(float f) {
        return this.read.IconCompatParcelizer(f);
    }

    @Override // kotlin.bufferMapProperty
    public final float c_(long j) {
        return this.read.c_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float AudioAttributesCompatParcelizer(float f) {
        return this.read.AudioAttributesCompatParcelizer(f);
    }
}
