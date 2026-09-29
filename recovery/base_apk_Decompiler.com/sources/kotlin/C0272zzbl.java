package kotlin;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.zzbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/marrow2/ui/qbank/score/QbankScoreArguments;", "", "lessonId", "", "stepId", "filterType", "", "mcqParentType", "Lcom/marrow2/data/mcq/local/model/McqParentType;", "showAnimatedTransition", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/marrow2/data/mcq/local/model/McqParentType;Z)V", "getLessonId", "()Ljava/lang/String;", "getStepId", "getFilterType", "()I", "getMcqParentType", "()Lcom/marrow2/data/mcq/local/model/McqParentType;", "getShowAnimatedTransition", "()Z", "loadToIntent", "", "intent", "Landroid/content/Intent;", "get", "Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class C0272zzbl {
    public static final write read = new write(null);
    private final boolean AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final readBlockToCache IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int write;

    public C0272zzbl(String str, String str2, int i, readBlockToCache readblocktocache, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.write = i;
        this.IconCompatParcelizer = readblocktocache;
        this.AudioAttributesCompatParcelizer = z;
    }

    public /* synthetic */ C0272zzbl(String str, String str2, int i, readBlockToCache readblocktocache, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, i, readblocktocache, (i2 & 16) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final readBlockToCache getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.zzbl$write */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/zzbl$write;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/zzbl;", "write", "(Landroid/content/Intent;)Lo/zzbl;", "Landroid/os/Bundle;", "", "AudioAttributesCompatParcelizer", "(Landroid/os/Bundle;)Z", "Lo/POJOPropertyBuilder5;", "read", "(Lo/POJOPropertyBuilder5;)Lo/zzbl;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public static C0272zzbl write(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            String string = extras.getString("lesson_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = extras.getString("step_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            int i = extras.getInt("filter_type");
            readBlockToCache serializable = extras.getSerializable("parent_type");
            if (serializable == null) {
                serializable = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            toMagicModuleMetaRepoModel.read(serializable, "");
            return new C0272zzbl(string, string2, i, (readBlockToCache) serializable, extras.getBoolean("show_animated_transition", true));
        }

        public static boolean AudioAttributesCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getBoolean("show_animated_transition", true);
        }

        public static C0272zzbl read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("lesson_id");
            String str2 = str == null ? "" : str;
            String str3 = (String) p0.write("step_id");
            String str4 = str3 == null ? "" : str3;
            Integer num = (Integer) p0.write("filter_type");
            int iIntValue = num != null ? num.intValue() : -1;
            readBlockToCache readblocktocache = (readBlockToCache) p0.write("parent_type");
            if (readblocktocache == null) {
                readblocktocache = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            readBlockToCache readblocktocache2 = readblocktocache;
            Boolean bool = (Boolean) p0.write("show_animated_transition");
            return new C0272zzbl(str2, str4, iIntValue, readblocktocache2, bool != null ? bool.booleanValue() : true);
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void RemoteActionCompatParcelizer(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        intent.putExtra("lesson_id", this.RemoteActionCompatParcelizer);
        intent.putExtra("step_id", this.AudioAttributesImplBaseParcelizer);
        intent.putExtra("filter_type", this.write);
        intent.putExtra("parent_type", this.IconCompatParcelizer);
        intent.putExtra("show_animated_transition", this.AudioAttributesCompatParcelizer);
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putString("lesson_id", this.RemoteActionCompatParcelizer);
        bundle.putString("step_id", this.AudioAttributesImplBaseParcelizer);
        bundle.putInt("filter_type", this.write);
        bundle.putSerializable("parent_type", this.IconCompatParcelizer);
        bundle.putBoolean("show_animated_transition", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0272zzbl AudioAttributesCompatParcelizer(String str, String str2, int i, readBlockToCache readblocktocache, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        return new C0272zzbl(str, str2, i, readblocktocache, false);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0272zzbl)) {
            return false;
        }
        C0272zzbl c0272zzbl = (C0272zzbl) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) c0272zzbl.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) c0272zzbl.AudioAttributesImplBaseParcelizer) && this.write == c0272zzbl.write && this.IconCompatParcelizer == c0272zzbl.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == c0272zzbl.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesImplBaseParcelizer;
        int i = this.write;
        readBlockToCache readblocktocache = this.IconCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("QbankScoreArguments(lessonId=");
        sb.append(str);
        sb.append(", stepId=");
        sb.append(str2);
        sb.append(", filterType=");
        sb.append(i);
        sb.append(", mcqParentType=");
        sb.append(readblocktocache);
        sb.append(", showAnimatedTransition=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
