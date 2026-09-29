package kotlin;

import android.content.Intent;
import android.os.Bundle;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow.data.models.subject.Subject;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c"}, d2 = {"Lo/WakeLockEvent;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/content/Intent;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WakeLockEvent {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;
    private final String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: o.WakeLockEvent$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/WakeLockEvent$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/WakeLockEvent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)Lo/WakeLockEvent;", "Lo/POJOPropertyBuilder5;", "write", "(Lo/POJOPropertyBuilder5;)Lo/WakeLockEvent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static WakeLockEvent AudioAttributesCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            String string = extras.getString("subject_id", Subject.ROOT_PARENT_ID);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = extras.getString("subject_title", FilterItemRecord.filter_all_title);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            return new WakeLockEvent(string, string2, extras.getBoolean("bookmark_selected"));
        }

        public static WakeLockEvent write(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("subject_id");
            if (str == null) {
                str = Subject.ROOT_PARENT_ID;
            }
            String str2 = (String) p0.write("subject_title");
            if (str2 == null) {
                str2 = FilterItemRecord.filter_all_title;
            }
            Boolean bool = (Boolean) p0.write("bookmark_selected");
            return new WakeLockEvent(str, str2, bool != null ? bool.booleanValue() : false);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public WakeLockEvent(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("subject_id", this.AudioAttributesCompatParcelizer);
        p0.putExtra("subject_title", this.read);
        p0.putExtra("bookmark_selected", this.IconCompatParcelizer);
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString("subject_id", this.AudioAttributesCompatParcelizer);
        bundle.putString("subject_title", this.read);
        bundle.putBoolean("bookmark_selected", this.IconCompatParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WakeLockEvent)) {
            return false;
        }
        WakeLockEvent wakeLockEvent = (WakeLockEvent) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) wakeLockEvent.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) wakeLockEvent.read) && this.IconCompatParcelizer == wakeLockEvent.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        boolean z = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("WakeLockEvent(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
