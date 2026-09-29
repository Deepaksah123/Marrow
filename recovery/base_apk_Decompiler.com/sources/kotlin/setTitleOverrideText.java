package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016"}, d2 = {"Lo/setTitleOverrideText;", "", "", "p0", "p1", "", "p2", "Lo/readBlockToCache;", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILo/readBlockToCache;I)V", "Landroid/os/Bundle;", "read", "()Landroid/os/Bundle;", "Landroid/content/Intent;", "", "(Landroid/content/Intent;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "write", "I", "AudioAttributesCompatParcelizer", "Lo/readBlockToCache;", "()Lo/readBlockToCache;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setTitleOverrideText {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final readBlockToCache read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String write;
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public setTitleOverrideText(String str, String str2, int i, readBlockToCache readblocktocache, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = i;
        this.read = readblocktocache;
        this.AudioAttributesCompatParcelizer = i2;
    }

    public /* synthetic */ setTitleOverrideText(String str, String str2, int i, readBlockToCache readblocktocache, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? readBlockToCache.AudioAttributesImplBaseParcelizer : readblocktocache, (i3 & 16) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final readBlockToCache getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.setTitleOverrideText$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setTitleOverrideText$write;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/setTitleOverrideText;", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)Lo/setTitleOverrideText;", "Lo/POJOPropertyBuilder5;", "read", "(Lo/POJOPropertyBuilder5;)Lo/setTitleOverrideText;", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;)Lo/setTitleOverrideText;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setTitleOverrideText AudioAttributesCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras != null) {
                Companion companion = setTitleOverrideText.INSTANCE;
                return RemoteActionCompatParcelizer(extras);
            }
            return new setTitleOverrideText(null, null, 0, null, 0, 31, null);
        }

        public static setTitleOverrideText read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("lesson_id");
            String str2 = str == null ? "" : str;
            String str3 = (String) p0.write("module_id");
            String str4 = str3 == null ? "" : str3;
            Integer num = (Integer) p0.write("filter_type");
            int iIntValue = num != null ? num.intValue() : -1;
            readBlockToCache readblocktocache = (readBlockToCache) p0.write("module_type");
            if (readblocktocache == null) {
                readblocktocache = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            readBlockToCache readblocktocache2 = readblocktocache;
            Integer num2 = (Integer) p0.write("rating");
            return new setTitleOverrideText(str2, str4, iIntValue, readblocktocache2, num2 != null ? num2.intValue() : 0);
        }

        private static setTitleOverrideText RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.getString("lesson_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("module_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            int i = p0.getInt("filter_type", -1);
            readBlockToCache serializable = p0.getSerializable("module_type");
            if (serializable == null) {
                serializable = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            toMagicModuleMetaRepoModel.read(serializable, "");
            return new setTitleOverrideText(string, string2, i, (readBlockToCache) serializable, p0.getInt("rating", 0));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final Bundle read() {
        Bundle bundle = new Bundle();
        bundle.putString("lesson_id", this.RemoteActionCompatParcelizer);
        bundle.putString("module_id", this.write);
        bundle.putInt("filter_type", this.IconCompatParcelizer);
        bundle.putSerializable("module_type", this.read);
        bundle.putInt("rating", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    public final void read(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("lesson_id", this.RemoteActionCompatParcelizer);
        p0.putExtra("module_id", this.write);
        p0.putExtra("filter_type", this.IconCompatParcelizer);
        p0.putExtra("module_type", this.read);
        p0.putExtra("rating", this.AudioAttributesCompatParcelizer);
    }

    public setTitleOverrideText() {
        this(null, null, 0, null, 0, 31, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setTitleOverrideText)) {
            return false;
        }
        setTitleOverrideText settitleoverridetext = (setTitleOverrideText) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) settitleoverridetext.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) settitleoverridetext.write) && this.IconCompatParcelizer == settitleoverridetext.IconCompatParcelizer && this.read == settitleoverridetext.read && this.AudioAttributesCompatParcelizer == settitleoverridetext.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        int i = this.IconCompatParcelizer;
        readBlockToCache readblocktocache = this.read;
        int i2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("setTitleOverrideText(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(readblocktocache);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
