package kotlin;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.models.LessonMcqUpdateInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\r\u0010\u0019R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001e\u0010\u0019"}, d2 = {"Lo/getExtraArgs;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "", "read", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "()Landroid/os/Bundle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getExtraArgs {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    public getExtraArgs(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: o.getExtraArgs$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getExtraArgs$write;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/getExtraArgs;", "IconCompatParcelizer", "(Landroid/content/Intent;)Lo/getExtraArgs;", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;)Lo/getExtraArgs;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getExtraArgs IconCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            Companion companion = getExtraArgs.INSTANCE;
            return RemoteActionCompatParcelizer(extras);
        }

        public static getExtraArgs RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.getString(LessonMcqUpdateInfo.KEY_MCQ_ID, SessionDescription.SUPPORTED_SDP_VERSION);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("step_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            String string3 = p0.getString("lesson_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            String string4 = p0.getString("content_title", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
            String string5 = p0.getString("content_subtitle", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
            String string6 = p0.getString("image_url", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string6, "");
            return new getExtraArgs(string, string2, string3, string4, string5, string6);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void read(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra(LessonMcqUpdateInfo.KEY_MCQ_ID, this.write);
        p0.putExtra("step_id", this.RemoteActionCompatParcelizer);
        p0.putExtra("lesson_id", this.read);
        p0.putExtra("content_title", this.IconCompatParcelizer);
        p0.putExtra("content_subtitle", this.AudioAttributesCompatParcelizer);
        p0.putExtra("image_url", this.AudioAttributesImplBaseParcelizer);
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putString(LessonMcqUpdateInfo.KEY_MCQ_ID, this.write);
        bundle.putString("step_id", this.RemoteActionCompatParcelizer);
        bundle.putString("lesson_id", this.read);
        bundle.putString("content_title", this.IconCompatParcelizer);
        bundle.putString("content_subtitle", this.AudioAttributesCompatParcelizer);
        bundle.putString("image_url", this.AudioAttributesImplBaseParcelizer);
        return bundle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getExtraArgs)) {
            return false;
        }
        getExtraArgs getextraargs = (getExtraArgs) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getextraargs.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getextraargs.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getextraargs.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getextraargs.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getextraargs.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getextraargs.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.read;
        String str4 = this.IconCompatParcelizer;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("getExtraArgs(write=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", IconCompatParcelizer=");
        sb.append(str4);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str5);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
