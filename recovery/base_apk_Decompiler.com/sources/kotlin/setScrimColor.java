package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0014\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001fR\u0014\u0010 \u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001f"}, d2 = {"Lo/setScrimColor;", "Lo/setDrawerShadow;", "Lo/writeReplace;", "Lo/bufferMapProperty;", "p0", "Lo/PropertyValueAny;", "p1", "<init>", "(Lo/bufferMapProperty;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/_handleOddName;", "Lo/_skipWSOrEnd;", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;Lo/_skipWSOrEnd;)Lo/_handleOddName;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "(Lo/_handleOddName;)Lo/_handleOddName;", "", "toString", "()Ljava/lang/String;", "write", "Lo/bufferMapProperty;", "read", "J", "()J", "Lo/assignParameter;", "()F", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class setScrimColor implements setDrawerShadow {
    private final long AudioAttributesCompatParcelizer;
    private final /* synthetic */ setDrawerElevation read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final bufferMapProperty read;

    private setScrimColor(bufferMapProperty buffermapproperty, long j) {
        this.read = setDrawerElevation.INSTANCE;
        this.read = buffermapproperty;
        this.AudioAttributesCompatParcelizer = j;
    }

    @Override // kotlin.setDrawerShadow
    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setDrawerShadow
    public final float write() {
        return PropertyValueAny.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer()) ? this.read.b_(PropertyValueAny.AudioAttributesImplBaseParcelizer(getAudioAttributesCompatParcelizer())) : assignParameter.INSTANCE.read();
    }

    @Override // kotlin.setDrawerShadow
    public final float IconCompatParcelizer() {
        return PropertyValueAny.AudioAttributesCompatParcelizer(getAudioAttributesCompatParcelizer()) ? this.read.b_(PropertyValueAny.AudioAttributesImplApi21Parcelizer(getAudioAttributesCompatParcelizer())) : assignParameter.INSTANCE.read();
    }

    public /* synthetic */ setScrimColor(bufferMapProperty buffermapproperty, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(buffermapproperty, j);
    }

    @Override // kotlin.writeReplace
    public final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd _skipwsorend) {
        return this.read.AudioAttributesCompatParcelizer(_handleoddname, _skipwsorend);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setScrimColor)) {
            return false;
        }
        setScrimColor setscrimcolor = (setScrimColor) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setscrimcolor.read) && PropertyValueAny.write(this.AudioAttributesCompatParcelizer, setscrimcolor.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + PropertyValueAny.MediaDescriptionCompat(this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writeReplace
    public final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname) {
        return this.read.IconCompatParcelizer(_handleoddname);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("setScrimColor(read=");
        sb.append(this.read);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append((Object) PropertyValueAny.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }
}
