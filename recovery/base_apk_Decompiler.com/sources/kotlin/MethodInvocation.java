package kotlin;

import android.os.Bundle;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b!\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\"\u0010\u0018"}, d2 = {"Lo/MethodInvocation;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "AudioAttributesImplBaseParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "read", "AudioAttributesImplApi26Parcelizer", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MethodInvocation {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatItemReceiver;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String read;
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public MethodInvocation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.AudioAttributesImplApi21Parcelizer = str6;
        this.AudioAttributesImplBaseParcelizer = str7;
        this.MediaBrowserCompatItemReceiver = str8;
        this.MediaBrowserCompatCustomActionResultReceiver = str9;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final Bundle AudioAttributesImplBaseParcelizer() {
        return _getIndexResolver.write(setAction.write("planName", this.read), setAction.write("phone", this.write), setAction.write("alternatePhone", this.IconCompatParcelizer), setAction.write("addressLine1", this.AudioAttributesCompatParcelizer), setAction.write("addressLine2", this.RemoteActionCompatParcelizer), setAction.write("addressLine3", this.AudioAttributesImplApi21Parcelizer), setAction.write(NotesDispatchAddressRequestKt.KEY_CITY, this.AudioAttributesImplBaseParcelizer), setAction.write("pin", this.MediaBrowserCompatItemReceiver), setAction.write(NotesDispatchAddressRequestKt.KEY_STATE, this.MediaBrowserCompatCustomActionResultReceiver));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MethodInvocation)) {
            return false;
        }
        MethodInvocation methodInvocation = (MethodInvocation) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) methodInvocation.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) methodInvocation.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) methodInvocation.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) methodInvocation.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) methodInvocation.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) methodInvocation.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) methodInvocation.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) methodInvocation.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) methodInvocation.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.write;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.IconCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.RemoteActionCompatParcelizer;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.AudioAttributesImplBaseParcelizer;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.MediaBrowserCompatItemReceiver;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.AudioAttributesCompatParcelizer;
        String str5 = this.RemoteActionCompatParcelizer;
        String str6 = this.AudioAttributesImplApi21Parcelizer;
        String str7 = this.AudioAttributesImplBaseParcelizer;
        String str8 = this.MediaBrowserCompatItemReceiver;
        String str9 = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("MethodInvocation(read=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(str3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str4);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str5);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str6);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str7);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str8);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.MethodInvocation$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/MethodInvocation$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/MethodInvocation;", "RemoteActionCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/MethodInvocation;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static MethodInvocation RemoteActionCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new MethodInvocation((String) p0.write("planName"), (String) p0.write("phone"), (String) p0.write("alternatePhone"), (String) p0.write("addressLine1"), (String) p0.write("addressLine2"), (String) p0.write("addressLine3"), (String) p0.write(NotesDispatchAddressRequestKt.KEY_CITY), (String) p0.write("pin"), (String) p0.write(NotesDispatchAddressRequestKt.KEY_STATE));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
