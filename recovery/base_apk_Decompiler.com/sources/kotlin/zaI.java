package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\n\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016"}, d2 = {"Lo/zaI;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "", "read", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zaI {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public zaI(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.zaI$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lo/zaI$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/zaI;", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)Lo/zaI;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Lo/zaI;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zaI RemoteActionCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            Companion companion = zaI.INSTANCE;
            return RemoteActionCompatParcelizer(extras);
        }

        public static zaI RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.getString("workflowId", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("transactionId", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            String string3 = p0.getString("dkycToken", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            return new zaI(string, string2, string3);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void read(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("workflowId", this.write);
        p0.putExtra("transactionId", this.AudioAttributesCompatParcelizer);
        p0.putExtra("dkycToken", this.IconCompatParcelizer);
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("workflowId", this.write);
        bundle.putString("transactionId", this.AudioAttributesCompatParcelizer);
        bundle.putString("dkycToken", this.IconCompatParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zaI)) {
            return false;
        }
        zaI zai = (zaI) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zai.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zai.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zai.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("zaI(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
