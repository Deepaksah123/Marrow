package kotlin;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setErrorTextColor;", "", "", "", "p0", "<init>", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "read", "()Ljava/util/List;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setErrorTextColor {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<String> IconCompatParcelizer;

    public setErrorTextColor(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
    }

    public /* synthetic */ setErrorTextColor(List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final List<String> read() {
        return this.IconCompatParcelizer;
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("info_description_points", new ArrayList<>(this.IconCompatParcelizer));
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setErrorTextColor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: o.setErrorTextColor$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setErrorTextColor$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Lo/setErrorTextColor;", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;)Lo/setErrorTextColor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setErrorTextColor RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ArrayList<String> stringArrayList = p0.getStringArrayList("info_description_points");
            return new setErrorTextColor(stringArrayList != null ? stringArrayList : IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof setErrorTextColor) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((setErrorTextColor) p0).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<String> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("setErrorTextColor(IconCompatParcelizer=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
