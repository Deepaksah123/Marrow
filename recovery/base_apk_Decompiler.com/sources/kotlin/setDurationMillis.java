package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017"}, d2 = {"Lo/setDurationMillis;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "IconCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setDurationMillis {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public setDurationMillis(String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("parent_id", this.IconCompatParcelizer);
        p0.putExtra("schema_id", this.AudioAttributesCompatParcelizer);
        p0.putExtra("title", this.read);
        p0.putExtra("target_mcq_id", this.RemoteActionCompatParcelizer);
    }

    public final Bundle IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("parent_id", this.IconCompatParcelizer);
        bundle.putString("schema_id", this.AudioAttributesCompatParcelizer);
        bundle.putString("title", this.read);
        bundle.putString("target_mcq_id", this.RemoteActionCompatParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setDurationMillis)) {
            return false;
        }
        setDurationMillis setdurationmillis = (setDurationMillis) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setdurationmillis.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setdurationmillis.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setdurationmillis.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setdurationmillis.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.setDurationMillis$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setDurationMillis$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/setDurationMillis;", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)Lo/setDurationMillis;", "Lo/POJOPropertyBuilder5;", "write", "(Lo/POJOPropertyBuilder5;)Lo/setDurationMillis;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setDurationMillis RemoteActionCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String stringExtra = p0.getStringExtra("parent_id");
            if (stringExtra == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String stringExtra2 = p0.getStringExtra("schema_id");
            if (stringExtra2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String stringExtra3 = p0.getStringExtra("target_mcq_id");
            String stringExtra4 = p0.getStringExtra("title");
            return new setDurationMillis(stringExtra, stringExtra2, stringExtra4 != null ? stringExtra4 : "", stringExtra3);
        }

        public static setDurationMillis write(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object objWrite = p0.write("parent_id");
            if (objWrite == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str = (String) objWrite;
            String str2 = (String) p0.write("schema_id");
            if (str2 == null) {
                str2 = "";
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str3 = (String) p0.write("title");
            String str4 = str3 != null ? str3 : "";
            if (str4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            return new setDurationMillis(str, str2, str4, (String) p0.write("target_mcq_id"));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.read;
        String str4 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("setDurationMillis(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
