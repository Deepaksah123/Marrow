package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u0016\u0010\u0013"}, d2 = {"Lo/whenAll;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/content/Intent;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "read", "AudioAttributesCompatParcelizer", "I", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class whenAll {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final String read;

    public whenAll(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.whenAll$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/whenAll$write;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/whenAll;", "read", "(Landroid/content/Intent;)Lo/whenAll;", "Lo/POJOPropertyBuilder5;", "IconCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/whenAll;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static whenAll read(Intent p0) {
            String string;
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null || (string = extras.getString("subjectId")) == null) {
                return null;
            }
            String string2 = extras.getString("subjectName");
            return new whenAll(string, string2 != null ? string2 : "", extras.getInt("limit", 20));
        }

        public static whenAll IconCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("subjectId");
            if (str == null) {
                str = "";
            }
            String str2 = (String) p0.write("subjectName");
            String str3 = str2 != null ? str2 : "";
            Integer num = (Integer) p0.write("limit");
            return new whenAll(str, str3, num != null ? num.intValue() : 20);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void RemoteActionCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("subjectId", this.IconCompatParcelizer);
        p0.putExtra("subjectName", this.read);
        p0.putExtra("limit", this.AudioAttributesCompatParcelizer);
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("subjectId", this.IconCompatParcelizer);
        bundle.putString("subjectName", this.read);
        bundle.putInt("limit", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof whenAll)) {
            return false;
        }
        whenAll whenall = (whenAll) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) whenall.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) whenall.read) && this.AudioAttributesCompatParcelizer == whenall.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("whenAll(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
