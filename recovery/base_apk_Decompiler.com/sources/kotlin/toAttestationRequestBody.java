package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lo/toAttestationRequestBody;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "AudioAttributesCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class toAttestationRequestBody {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public toAttestationRequestBody(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.toAttestationRequestBody$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lo/toAttestationRequestBody$write;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/toAttestationRequestBody;", "IconCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/toAttestationRequestBody;", "Landroid/content/Intent;", "(Landroid/content/Intent;)Lo/toAttestationRequestBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static toAttestationRequestBody IconCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("subject_id");
            if (str == null) {
                str = "";
            }
            String str2 = (String) p0.write("subject_title");
            return new toAttestationRequestBody(str, str2 != null ? str2 : "");
        }

        public static toAttestationRequestBody IconCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            String string = extras.getString("subject_id");
            if (string == null) {
                string = "";
            }
            String string2 = extras.getString("subject_title");
            return new toAttestationRequestBody(string, string2 != null ? string2 : "");
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final Bundle AudioAttributesCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("subject_id", this.RemoteActionCompatParcelizer);
        bundle.putString("subject_title", this.IconCompatParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof toAttestationRequestBody)) {
            return false;
        }
        toAttestationRequestBody toattestationrequestbody = (toAttestationRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) toattestationrequestbody.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) toattestationrequestbody.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("toAttestationRequestBody(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
