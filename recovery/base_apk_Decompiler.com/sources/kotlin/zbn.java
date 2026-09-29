package kotlin;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Lo/zbn;", "", "", "p0", "p1", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/CharSequence;", "write", "()Ljava/lang/CharSequence;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zbn {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CharSequence write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final CharSequence AudioAttributesCompatParcelizer;

    public zbn(CharSequence charSequence, CharSequence charSequence2) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        this.AudioAttributesCompatParcelizer = charSequence;
        this.write = charSequence2;
    }

    public /* synthetic */ zbn(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final CharSequence getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final CharSequence getWrite() {
        return this.write;
    }

    public final Bundle RemoteActionCompatParcelizer() {
        return _getIndexResolver.write(setAction.write("title", this.AudioAttributesCompatParcelizer), setAction.write("message", this.write));
    }

    /* JADX INFO: renamed from: o.zbn$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zbn$write;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Lo/zbn;", "IconCompatParcelizer", "(Landroid/os/Bundle;)Lo/zbn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zbn IconCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            CharSequence charSequence = p0.getCharSequence("title");
            if (charSequence == null) {
            }
            CharSequence charSequence2 = p0.getCharSequence("message");
            if (charSequence2 == null) {
            }
            return new zbn(charSequence, charSequence2);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zbn() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zbn)) {
            return false;
        }
        zbn zbnVar = (zbn) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, zbnVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, zbnVar.write);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.AudioAttributesCompatParcelizer;
        CharSequence charSequence2 = this.write;
        StringBuilder sb = new StringBuilder("zbn(AudioAttributesCompatParcelizer=");
        sb.append((Object) charSequence);
        sb.append(", write=");
        sb.append((Object) charSequence2);
        sb.append(")");
        return sb.toString();
    }
}
