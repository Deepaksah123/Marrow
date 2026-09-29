package kotlin;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u0019\u0010\u001dR\u001a\u0010\u0019\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0014"}, d2 = {"Lo/onPageFinished;", "", "", "p0", "p1", "", "p2", "", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", "Landroid/os/Bundle;", "MediaBrowserCompatItemReceiver", "()Landroid/os/Bundle;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "read", "I", "RemoteActionCompatParcelizer", "(I)V", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class onPageFinished {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public onPageFinished(String str, String str2, int i, boolean z, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.write = i;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = str3;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public final void IconCompatParcelizer(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Bundle MediaBrowserCompatItemReceiver() {
        return _getIndexResolver.write(setAction.write("lessonId", this.AudioAttributesCompatParcelizer), setAction.write("rootSubjectId", this.read), setAction.write("currentPosition", Integer.valueOf(this.write)), setAction.write("isInSplitScreen", Boolean.valueOf(this.IconCompatParcelizer)), setAction.write("launchSource", this.RemoteActionCompatParcelizer));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof onPageFinished)) {
            return false;
        }
        onPageFinished onpagefinished = (onPageFinished) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) onpagefinished.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) onpagefinished.read) && this.write == onpagefinished.write && this.IconCompatParcelizer == onpagefinished.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) onpagefinished.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.onPageFinished$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/onPageFinished$IconCompatParcelizer;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/onPageFinished;", "AudioAttributesCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/onPageFinished;", "Landroid/os/Bundle;", "read", "(Landroid/os/Bundle;)Lo/onPageFinished;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static onPageFinished AudioAttributesCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("lessonId");
            String str2 = str == null ? "" : str;
            String str3 = (String) p0.write("rootSubjectId");
            String str4 = str3 == null ? "" : str3;
            Integer num = (Integer) p0.write("currentPosition");
            int iIntValue = num != null ? num.intValue() : 0;
            Boolean bool = (Boolean) p0.write("isInSplitScreen");
            return new onPageFinished(str2, str4, iIntValue, bool != null ? bool.booleanValue() : false, (String) p0.write("launchSource"));
        }

        public static onPageFinished read(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.getString("lessonId", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("rootSubjectId", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            return new onPageFinished(string, string2, p0.getInt("currentPosition", 0), p0.getBoolean("isInSplitScreen", false), p0.getString("launchSource"));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = Integer.hashCode(this.write);
        int iHashCode4 = Boolean.hashCode(this.IconCompatParcelizer);
        String str = this.RemoteActionCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        int i = this.write;
        boolean z = this.IconCompatParcelizer;
        String str3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("onPageFinished(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
