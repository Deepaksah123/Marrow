package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014"}, d2 = {"Lo/JsonPropertyAccess;", "", "Lo/setPlayedColor;", "p0", "p1", "p2", "<init>", "(Lo/setPlayedColor;Lo/setPlayedColor;Lo/setPlayedColor;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/setPlayedColor;", "IconCompatParcelizer", "()Lo/setPlayedColor;", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonPropertyAccess {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setPlayedColor RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setPlayedColor read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setPlayedColor IconCompatParcelizer;

    public JsonPropertyAccess(setPlayedColor setplayedcolor, setPlayedColor setplayedcolor2, setPlayedColor setplayedcolor3) {
        this.read = setplayedcolor;
        this.IconCompatParcelizer = setplayedcolor2;
        this.RemoteActionCompatParcelizer = setplayedcolor3;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setPlayedColor getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setPlayedColor getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setPlayedColor getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JsonPropertyAccess)) {
            return false;
        }
        JsonPropertyAccess jsonPropertyAccess = (JsonPropertyAccess) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, jsonPropertyAccess.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, jsonPropertyAccess.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, jsonPropertyAccess.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shapes(small=");
        sb.append(this.read);
        sb.append(", medium=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", large=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ JsonPropertyAccess(setShowFastForwardButton setshowfastforwardbutton, setShowFastForwardButton setshowfastforwardbutton2, setShowFastForwardButton setshowfastforwardbutton3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)) : setshowfastforwardbutton, (i & 2) != 0 ? setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)) : setshowfastforwardbutton2, (i & 4) != 0 ? setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) : setshowfastforwardbutton3);
    }

    public JsonPropertyAccess() {
        this(null, null, null, 7, null);
    }
}
