package kotlin;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0010\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010$\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b#\u0010'R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b%\u0010\u001aR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b$\u0010\u001a"}, d2 = {"Lo/setStaticLayoutBuilderConfigurer;", "", "", "p0", "", "p1", "p2", "p3", "Lo/getMediaMimeType;", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;ZZZLo/getMediaMimeType;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "", "write", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Z", "MediaBrowserCompatItemReceiver", "()Z", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Lo/getMediaMimeType;", "()Lo/getMediaMimeType;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setStaticLayoutBuilderConfigurer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getMediaMimeType read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String MediaBrowserCompatItemReceiver;

    public setStaticLayoutBuilderConfigurer(String str, boolean z, boolean z2, boolean z3, getMediaMimeType getmediamimetype, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        this.write = str;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.read = getmediamimetype;
        this.MediaBrowserCompatItemReceiver = str2;
        this.AudioAttributesImplApi21Parcelizer = str3;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ setStaticLayoutBuilderConfigurer(String str, boolean z, boolean z2, boolean z3, getMediaMimeType getmediamimetype, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? getMediaMimeType.AudioAttributesImplBaseParcelizer : getmediamimetype, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? str3 : null);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getMediaMimeType getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void write(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("parent_id", this.write);
        p0.putExtra("is_qbank", this.AudioAttributesCompatParcelizer);
        p0.putExtra("is_test", this.IconCompatParcelizer);
        p0.putExtra("is_custom_module", this.RemoteActionCompatParcelizer);
        p0.putExtra("filter_type", this.read);
        p0.putExtra("subject_filter", this.MediaBrowserCompatItemReceiver);
        p0.putExtra("schema_filter", this.AudioAttributesImplApi21Parcelizer);
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putString("parent_id", this.write);
        bundle.putBoolean("is_qbank", this.AudioAttributesCompatParcelizer);
        bundle.putBoolean("is_test", this.IconCompatParcelizer);
        bundle.putBoolean("is_custom_module", this.RemoteActionCompatParcelizer);
        bundle.putSerializable("filter_type", this.read);
        bundle.putString("subject_filter", this.MediaBrowserCompatItemReceiver);
        bundle.putString("schema_filter", this.AudioAttributesImplApi21Parcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setStaticLayoutBuilderConfigurer)) {
            return false;
        }
        setStaticLayoutBuilderConfigurer setstaticlayoutbuilderconfigurer = (setStaticLayoutBuilderConfigurer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setstaticlayoutbuilderconfigurer.write) && this.IconCompatParcelizer == setstaticlayoutbuilderconfigurer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == setstaticlayoutbuilderconfigurer.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == setstaticlayoutbuilderconfigurer.RemoteActionCompatParcelizer && this.read == setstaticlayoutbuilderconfigurer.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) setstaticlayoutbuilderconfigurer.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) setstaticlayoutbuilderconfigurer.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: renamed from: o.setStaticLayoutBuilderConfigurer$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setStaticLayoutBuilderConfigurer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/setStaticLayoutBuilderConfigurer;", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)Lo/setStaticLayoutBuilderConfigurer;", "Lo/POJOPropertyBuilder5;", "read", "(Lo/POJOPropertyBuilder5;)Lo/setStaticLayoutBuilderConfigurer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setStaticLayoutBuilderConfigurer RemoteActionCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            boolean booleanExtra = p0.getBooleanExtra("is_test", false);
            boolean booleanExtra2 = p0.getBooleanExtra("is_qbank", false);
            boolean booleanExtra3 = p0.getBooleanExtra("is_custom_module", false);
            String stringExtra = p0.getStringExtra("parent_id");
            Serializable serializableExtra = p0.getSerializableExtra("filter_type");
            getMediaMimeType getmediamimetype = serializableExtra instanceof getMediaMimeType ? (getMediaMimeType) serializableExtra : null;
            if (getmediamimetype == null) {
                getmediamimetype = getMediaMimeType.AudioAttributesImplBaseParcelizer;
            }
            getMediaMimeType getmediamimetype2 = getmediamimetype;
            String stringExtra2 = p0.getStringExtra("subject_filter");
            String stringExtra3 = p0.getStringExtra("schema_filter");
            String str = stringExtra;
            if (str == null || str.length() == 0) {
                return null;
            }
            return new setStaticLayoutBuilderConfigurer(stringExtra, booleanExtra, booleanExtra2, booleanExtra3, getmediamimetype2, stringExtra2, stringExtra3);
        }

        public static setStaticLayoutBuilderConfigurer read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object objWrite = p0.write("parent_id");
            if (objWrite == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str = (String) objWrite;
            Object objWrite2 = p0.write("is_test");
            if (objWrite2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            boolean zBooleanValue = ((Boolean) objWrite2).booleanValue();
            Object objWrite3 = p0.write("is_qbank");
            if (objWrite3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            boolean zBooleanValue2 = ((Boolean) objWrite3).booleanValue();
            Object objWrite4 = p0.write("is_custom_module");
            if (objWrite4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            boolean zBooleanValue3 = ((Boolean) objWrite4).booleanValue();
            getMediaMimeType getmediamimetype = (getMediaMimeType) p0.write("filter_type");
            if (getmediamimetype == null) {
                getmediamimetype = getMediaMimeType.AudioAttributesImplBaseParcelizer;
            }
            return new setStaticLayoutBuilderConfigurer(str, zBooleanValue, zBooleanValue2, zBooleanValue3, getmediamimetype, (String) p0.write("subject_filter"), (String) p0.write("schema_filter"));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode3 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode4 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode5 = this.read.hashCode();
        String str = this.MediaBrowserCompatItemReceiver;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.write;
        boolean z = this.IconCompatParcelizer;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        boolean z3 = this.RemoteActionCompatParcelizer;
        getMediaMimeType getmediamimetype = this.read;
        String str2 = this.MediaBrowserCompatItemReceiver;
        String str3 = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("setStaticLayoutBuilderConfigurer(write=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(z);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z3);
        sb.append(", read=");
        sb.append(getmediamimetype);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str2);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
