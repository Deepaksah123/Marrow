package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000b\u0010\u001cR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001a\u0010\u0013"}, d2 = {"Lo/getCameraMotionListener;", "", "", "p0", "", "p1", "p2", "<init>", "(IZI)V", "Landroid/content/Intent;", "", "read", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "IconCompatParcelizer", "()Landroid/os/Bundle;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCameraMotionListener {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public getCameraMotionListener(int i, boolean z, int i2) {
        this.AudioAttributesCompatParcelizer = i;
        this.write = z;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ getCameraMotionListener(int i, boolean z, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.getCameraMotionListener$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\n\u0010\r"}, d2 = {"Lo/getCameraMotionListener$read;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/getCameraMotionListener;", "IconCompatParcelizer", "(Landroid/content/Intent;)Lo/getCameraMotionListener;", "Lo/POJOPropertyBuilder5;", "RemoteActionCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/getCameraMotionListener;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Lo/getCameraMotionListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getCameraMotionListener IconCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            Companion companion = getCameraMotionListener.INSTANCE;
            return RemoteActionCompatParcelizer(extras);
        }

        public static getCameraMotionListener RemoteActionCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Integer num = (Integer) p0.write("key_course_id");
            int iIntValue = num != null ? num.intValue() : 0;
            Boolean bool = (Boolean) p0.write("key_force_update");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Integer num2 = (Integer) p0.write("key_edition_val");
            return new getCameraMotionListener(iIntValue, zBooleanValue, num2 != null ? num2.intValue() : 0);
        }

        private static getCameraMotionListener RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getCameraMotionListener(p0.getInt("key_course_id", 0), p0.getBoolean("key_force_update", false), p0.getInt("key_edition_val", 0));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void read(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("key_course_id", this.AudioAttributesCompatParcelizer);
        p0.putExtra("key_force_update", this.write);
        p0.putExtra("key_edition_val", this.RemoteActionCompatParcelizer);
    }

    public final Bundle IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_course_id", this.AudioAttributesCompatParcelizer);
        bundle.putBoolean("key_force_update", this.write);
        bundle.putInt("key_edition_val", this.RemoteActionCompatParcelizer);
        return bundle;
    }

    public getCameraMotionListener() {
        this(0, false, 0, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getCameraMotionListener)) {
            return false;
        }
        getCameraMotionListener getcameramotionlistener = (getCameraMotionListener) p0;
        return this.AudioAttributesCompatParcelizer == getcameramotionlistener.AudioAttributesCompatParcelizer && this.write == getcameramotionlistener.write && this.RemoteActionCompatParcelizer == getcameramotionlistener.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Boolean.hashCode(this.write)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.AudioAttributesCompatParcelizer;
        boolean z = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("getCameraMotionListener(AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
