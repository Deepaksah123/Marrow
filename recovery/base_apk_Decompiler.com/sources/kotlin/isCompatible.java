package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u000f\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e"}, d2 = {"Lo/isCompatible;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Bundle;", "read", "()Landroid/os/Bundle;", "Landroid/content/Intent;", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "I", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/Integer;", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isCompatible {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Integer IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public isCompatible(int i, String str, String str2, Integer num) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = num;
    }

    public /* synthetic */ isCompatible(int i, String str, String str2, Integer num, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, str, str2, (i2 & 8) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Integer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.isCompatible$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/isCompatible$read;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/isCompatible;", "AudioAttributesCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/isCompatible;", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)Lo/isCompatible;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static isCompatible AudioAttributesCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Integer num = (Integer) p0.write("selected_tab_index");
            int iIntValue = num != null ? num.intValue() : 0;
            String str = (String) p0.write("selected_subject_id");
            if (str == null) {
                str = "";
            }
            String str2 = (String) p0.write("selected_subject_name");
            return new isCompatible(iIntValue, str, str2 != null ? str2 : "", (Integer) p0.write("selected_subject_group_id"));
        }

        public static isCompatible RemoteActionCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            int i = extras.getInt("selected_tab_index");
            String string = extras.getString("selected_subject_id");
            if (string == null) {
                string = "";
            }
            String string2 = extras.getString("selected_subject_name");
            return new isCompatible(i, string, string2 != null ? string2 : "", Integer.valueOf(extras.getInt("selected_subject_group_id")));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final Bundle read() {
        Bundle bundle = new Bundle();
        bundle.putInt("selected_tab_index", this.RemoteActionCompatParcelizer);
        bundle.putString("selected_subject_name", this.read);
        bundle.putString("selected_subject_id", this.AudioAttributesCompatParcelizer);
        Integer num = this.IconCompatParcelizer;
        if (num != null) {
            bundle.putInt("selected_subject_group_id", num.intValue());
        }
        return bundle;
    }

    public final void AudioAttributesCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("selected_tab_index", this.RemoteActionCompatParcelizer);
        p0.putExtra("selected_subject_name", this.read);
        p0.putExtra("selected_subject_id", this.AudioAttributesCompatParcelizer);
        Integer num = this.IconCompatParcelizer;
        if (num != null) {
            p0.putExtra("selected_subject_group_id", num.intValue());
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isCompatible)) {
            return false;
        }
        isCompatible iscompatible = (isCompatible) p0;
        return this.RemoteActionCompatParcelizer == iscompatible.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iscompatible.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iscompatible.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, iscompatible.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        Integer num = this.IconCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        Integer num = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("isCompatible(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }
}
