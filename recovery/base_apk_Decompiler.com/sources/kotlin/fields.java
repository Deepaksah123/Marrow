package kotlin;

import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001a\u0010\u0013\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0012\u0010\u0015"}, d2 = {"Lo/fields;", "Lo/_parser$IconCompatParcelizer;", "", "p0", "Lo/tryToResolveUnresolved;", "p1", "", "p2", "p3", "<init>", "(ILo/tryToResolveUnresolved;FF)V", "RemoteActionCompatParcelizer", "I", "write", "()I", "IconCompatParcelizer", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "AudioAttributesCompatParcelizer", "read", "F", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class fields extends _parser.IconCompatParcelizer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final tryToResolveUnresolved AudioAttributesCompatParcelizer;

    public fields(int i, tryToResolveUnresolved trytoresolveunresolved, float f, float f2) {
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = trytoresolveunresolved;
        this.write = f;
        this.read = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o._parser.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o._parser.IconCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o._parser.IconCompatParcelizer, kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    @Override // o._parser.IconCompatParcelizer, kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }
}
