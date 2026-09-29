package kotlin;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\r\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b!\u0010\u0019"}, d2 = {"Lo/isoColorPrimariesToColorSpace;", "", "", "p0", "Lo/onDisplayInfoChanged;", "p1", "Lo/isBufferLate;", "p2", "p3", "<init>", "(Ljava/lang/String;Lo/onDisplayInfoChanged;Lo/isBufferLate;Ljava/lang/String;)V", "Landroid/content/Intent;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "write", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "read", "Lo/onDisplayInfoChanged;", "()Lo/onDisplayInfoChanged;", "Lo/isBufferLate;", "()Lo/isBufferLate;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isoColorPrimariesToColorSpace {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final onDisplayInfoChanged write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final isBufferLate RemoteActionCompatParcelizer;

    public isoColorPrimariesToColorSpace(String str, onDisplayInfoChanged ondisplayinfochanged, isBufferLate isbufferlate, String str2) {
        toMagicModuleMetaRepoModel.write(isbufferlate, "");
        this.read = str;
        this.write = ondisplayinfochanged;
        this.RemoteActionCompatParcelizer = isbufferlate;
        this.IconCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final onDisplayInfoChanged getWrite() {
        return this.write;
    }

    public /* synthetic */ isoColorPrimariesToColorSpace(String str, onDisplayInfoChanged ondisplayinfochanged, isBufferLate isbufferlate, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : ondisplayinfochanged, (i & 4) != 0 ? isBufferLate.IconCompatParcelizer : isbufferlate, (i & 8) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final isBufferLate getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("subject_id", this.read);
        p0.putExtra("parent_id", this.write);
        p0.putExtra("parentType", this.RemoteActionCompatParcelizer);
        p0.putExtra("title", this.IconCompatParcelizer);
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putString("subject_id", this.read);
        bundle.putSerializable("parent_id", this.write);
        bundle.putSerializable("parentType", this.RemoteActionCompatParcelizer);
        bundle.putString("title", this.IconCompatParcelizer);
        return bundle;
    }

    public isoColorPrimariesToColorSpace() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isoColorPrimariesToColorSpace)) {
            return false;
        }
        isoColorPrimariesToColorSpace isocolorprimariestocolorspace = (isoColorPrimariesToColorSpace) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) isocolorprimariestocolorspace.read) && this.write == isocolorprimariestocolorspace.write && this.RemoteActionCompatParcelizer == isocolorprimariestocolorspace.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) isocolorprimariestocolorspace.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        onDisplayInfoChanged ondisplayinfochanged = this.write;
        int iHashCode2 = ondisplayinfochanged == null ? 0 : ondisplayinfochanged.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        String str2 = this.IconCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.read;
        onDisplayInfoChanged ondisplayinfochanged = this.write;
        isBufferLate isbufferlate = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("isoColorPrimariesToColorSpace(read=");
        sb.append(str);
        sb.append(", write=");
        sb.append(ondisplayinfochanged);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(isbufferlate);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.isoColorPrimariesToColorSpace$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/isoColorPrimariesToColorSpace$write;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/isoColorPrimariesToColorSpace;", "IconCompatParcelizer", "(Landroid/content/Intent;)Lo/isoColorPrimariesToColorSpace;", "Lo/POJOPropertyBuilder5;", "write", "(Lo/POJOPropertyBuilder5;)Lo/isoColorPrimariesToColorSpace;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static isoColorPrimariesToColorSpace IconCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String stringExtra = p0.getStringExtra("subject_id");
            Serializable serializableExtra = p0.getSerializableExtra("parent_id");
            onDisplayInfoChanged ondisplayinfochanged = serializableExtra instanceof onDisplayInfoChanged ? (onDisplayInfoChanged) serializableExtra : null;
            String stringExtra2 = p0.getStringExtra("title");
            Serializable serializableExtra2 = p0.getSerializableExtra("parentType");
            isBufferLate isbufferlate = serializableExtra2 instanceof isBufferLate ? (isBufferLate) serializableExtra2 : null;
            String str = stringExtra != null ? stringExtra : "";
            if (isbufferlate == null) {
                isbufferlate = isBufferLate.IconCompatParcelizer;
            }
            return new isoColorPrimariesToColorSpace(str, ondisplayinfochanged, isbufferlate, stringExtra2);
        }

        public static isoColorPrimariesToColorSpace write(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("subject_id");
            onDisplayInfoChanged ondisplayinfochanged = (onDisplayInfoChanged) p0.write("parent_id");
            String str2 = (String) p0.write("title");
            isBufferLate isbufferlate = (isBufferLate) p0.write("parentType");
            if (isbufferlate == null) {
                isbufferlate = isBufferLate.IconCompatParcelizer;
            }
            return new isoColorPrimariesToColorSpace(str, ondisplayinfochanged, isbufferlate, str2);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
