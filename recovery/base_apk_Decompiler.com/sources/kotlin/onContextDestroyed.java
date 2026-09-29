package kotlin;

import android.view.textclassifier.TextClassification;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d"}, d2 = {"Lo/onContextDestroyed;", "", "", "p0", "Lo/findProperty;", "p1", "Landroid/view/textclassifier/TextClassification;", "p2", "<init>", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/CharSequence;", "AudioAttributesCompatParcelizer", "()Ljava/lang/CharSequence;", "IconCompatParcelizer", "J", "()J", "write", "RemoteActionCompatParcelizer", "Landroid/view/textclassifier/TextClassification;", "()Landroid/view/textclassifier/TextClassification;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class onContextDestroyed {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TextClassification IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final CharSequence AudioAttributesCompatParcelizer;

    private onContextDestroyed(CharSequence charSequence, long j, TextClassification textClassification) {
        this.AudioAttributesCompatParcelizer = charSequence;
        this.write = j;
        this.IconCompatParcelizer = textClassification;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final CharSequence getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final TextClassification getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ onContextDestroyed(CharSequence charSequence, long j, TextClassification textClassification, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(charSequence, j, textClassification);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof onContextDestroyed)) {
            return false;
        }
        onContextDestroyed oncontextdestroyed = (onContextDestroyed) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, oncontextdestroyed.AudioAttributesCompatParcelizer) && findProperty.IconCompatParcelizer(this.write, oncontextdestroyed.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, oncontextdestroyed.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + findProperty.MediaBrowserCompatItemReceiver(this.write)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("onContextDestroyed(AudioAttributesCompatParcelizer=");
        sb.append((Object) this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append((Object) findProperty.RatingCompat(this.write));
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
