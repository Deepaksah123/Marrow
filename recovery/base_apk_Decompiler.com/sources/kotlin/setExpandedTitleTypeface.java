package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\n\u0010\u001a"}, d2 = {"Lo/setExpandedTitleTypeface;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "Landroid/content/Intent;", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "()Landroid/os/Bundle;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setExpandedTitleTypeface {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public setExpandedTitleTypeface(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.setExpandedTitleTypeface$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lo/setExpandedTitleTypeface$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/setExpandedTitleTypeface;", "IconCompatParcelizer", "(Landroid/content/Intent;)Lo/setExpandedTitleTypeface;", "Lo/POJOPropertyBuilder5;", "(Lo/POJOPropertyBuilder5;)Lo/setExpandedTitleTypeface;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setExpandedTitleTypeface IconCompatParcelizer(Intent p0) {
            String string;
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null || (string = extras.getString("key_id")) == null) {
                return null;
            }
            return new setExpandedTitleTypeface(string, extras.getBoolean("is_force_download", false));
        }

        public static setExpandedTitleTypeface IconCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("key_id");
            String str2 = str != null ? str : "";
            Boolean bool = (Boolean) p0.write("is_force_download");
            return new setExpandedTitleTypeface(str2, bool != null ? bool.booleanValue() : false);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void AudioAttributesCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("key_id", this.IconCompatParcelizer);
        p0.putExtra("is_force_download", this.AudioAttributesCompatParcelizer);
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("key_id", this.IconCompatParcelizer);
        bundle.putBoolean("is_force_download", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setExpandedTitleTypeface)) {
            return false;
        }
        setExpandedTitleTypeface setexpandedtitletypeface = (setExpandedTitleTypeface) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setexpandedtitletypeface.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == setexpandedtitletypeface.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("setExpandedTitleTypeface(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
