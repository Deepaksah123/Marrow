package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\u001d"}, d2 = {"Lo/zzlh;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Landroid/content/Intent;", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "IconCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "read", "write", "RemoteActionCompatParcelizer", "J", "()J"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzlh {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;
    private final String write;

    public zzlh(String str, String str2, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = j;
    }

    public /* synthetic */ zzlh(String str, String str2, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("schema_id", this.read);
        p0.putExtra("schema_title", this.write);
        p0.putExtra("last_lesson_submittedOn", this.IconCompatParcelizer);
    }

    public final Bundle IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("schema_id", this.read);
        bundle.putString("schema_title", this.write);
        bundle.putLong("last_lesson_submittedOn", this.IconCompatParcelizer);
        return bundle;
    }

    public zzlh() {
        this(null, null, 0L, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zzlh)) {
            return false;
        }
        zzlh zzlhVar = (zzlh) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) zzlhVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zzlhVar.write) && this.IconCompatParcelizer == zzlhVar.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + Long.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        long j = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("zzlh(read=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.zzlh$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/zzlh$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/zzlh;", "read", "(Landroid/content/Intent;)Lo/zzlh;", "Lo/POJOPropertyBuilder5;", "write", "(Lo/POJOPropertyBuilder5;)Lo/zzlh;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zzlh read(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String stringExtra = p0.getStringExtra("schema_id");
            String stringExtra2 = p0.getStringExtra("schema_title");
            String str = stringExtra2 != null ? stringExtra2 : "";
            long longExtra = p0.getLongExtra("last_lesson_submittedOn", 0L);
            String str2 = stringExtra;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            return new zzlh(stringExtra, str, longExtra);
        }

        public static zzlh write(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("schema_id");
            if (str == null) {
                str = "";
            }
            String str2 = (String) p0.write("schema_title");
            String str3 = str2 != null ? str2 : "";
            Long l = (Long) p0.write("last_lesson_submittedOn");
            return new zzlh(str, str3, l != null ? l.longValue() : 0L);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
