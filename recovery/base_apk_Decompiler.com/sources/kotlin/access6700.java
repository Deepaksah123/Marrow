package kotlin;

import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lo/access6700;", "", "Lo/containsType;", "p0", "", "p1", "<init>", "(Lo/containsType;Ljava/lang/String;)V", "Lorg/json/JSONArray;", "AudioAttributesCompatParcelizer", "()Lorg/json/JSONArray;", "", "read", "()V", "", "IconCompatParcelizer", "(J)V", "write", "()J", "Lo/containsType;", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access6700 {
    private final containsType IconCompatParcelizer;
    private final String write;

    public access6700(containsType containstype, String str) {
        toMagicModuleMetaRepoModel.write(containstype, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = containstype;
        this.write = PlayerPlaybackSuppressionReason.IconCompatParcelizer("inApp", str, ":");
    }

    public final JSONArray AudioAttributesCompatParcelizer() {
        containsType containstype = this.IconCompatParcelizer;
        String str = this.write;
        toMagicModuleMetaRepoModel.write((Object) str);
        try {
            return new JSONArray(containstype.write(str, ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI));
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public final void read() {
        containsType containstype = this.IconCompatParcelizer;
        String str = this.write;
        toMagicModuleMetaRepoModel.write((Object) str);
        containstype.RemoteActionCompatParcelizer(str);
    }

    public final void IconCompatParcelizer(long p0) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer("last_assets_cleanup", p0);
    }

    public final long write() {
        return this.IconCompatParcelizer.read("last_assets_cleanup");
    }
}
