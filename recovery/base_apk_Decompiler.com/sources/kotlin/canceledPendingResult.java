package kotlin;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d"}, d2 = {"Lo/canceledPendingResult;", "", "", "p0", "p1", "Lo/Response;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lo/Response;)V", "Landroid/content/Intent;", "", "IconCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Lo/Response;", "()Lo/Response;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class canceledPendingResult {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Response AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    public canceledPendingResult(String str, String str2, Response response) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(response, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = response;
    }

    public /* synthetic */ canceledPendingResult(String str, String str2, Response response, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Response.IconCompatParcelizer : response);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Response getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("title", this.write);
        p0.putExtra("extra_web_content", this.RemoteActionCompatParcelizer);
        p0.putExtra("extra_web_source", this.AudioAttributesCompatParcelizer);
    }

    public final Bundle IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("title", this.write);
        bundle.putString("extra_web_content", this.RemoteActionCompatParcelizer);
        bundle.putSerializable("extra_web_source", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    public canceledPendingResult() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof canceledPendingResult)) {
            return false;
        }
        canceledPendingResult canceledpendingresult = (canceledPendingResult) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) canceledpendingresult.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) canceledpendingresult.write) && this.AudioAttributesCompatParcelizer == canceledpendingresult.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        Response response = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("canceledPendingResult(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(response);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.canceledPendingResult$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/canceledPendingResult$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/canceledPendingResult;", "read", "(Landroid/content/Intent;)Lo/canceledPendingResult;", "Lo/POJOPropertyBuilder5;", "AudioAttributesCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/canceledPendingResult;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static canceledPendingResult read(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String stringExtra = p0.getStringExtra("extra_web_content");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = p0.getStringExtra("title");
            String str = stringExtra2 != null ? stringExtra2 : "";
            Serializable serializableExtra = p0.getSerializableExtra("extra_web_source");
            Response response = serializableExtra instanceof Response ? (Response) serializableExtra : null;
            if (response == null) {
                response = Response.IconCompatParcelizer;
            }
            return new canceledPendingResult(stringExtra, str, response);
        }

        public static canceledPendingResult AudioAttributesCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("extra_web_content");
            if (str == null) {
                str = "";
            }
            String str2 = (String) p0.write("title");
            String str3 = str2 != null ? str2 : "";
            Response response = (Response) p0.write("extra_web_source");
            if (response == null) {
                response = Response.IconCompatParcelizer;
            }
            return new canceledPendingResult(str, str3, response);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
