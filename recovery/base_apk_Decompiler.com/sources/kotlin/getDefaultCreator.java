package kotlin;

import android.graphics.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\f\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\n\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012"}, d2 = {"Lo/getDefaultCreator;", "", "Lo/parseDouble;", "p0", "p1", "<init>", "(Lo/parseDouble;Lo/getDefaultCreator;)V", "RemoteActionCompatParcelizer", "Lo/parseDouble;", "write", "read", "Lo/getDefaultCreator;", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "IconCompatParcelizer", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getDefaultCreator {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final parseDouble<Object> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getDefaultCreator RemoteActionCompatParcelizer;

    public getDefaultCreator(parseDouble<? extends Object> parsedouble, getDefaultCreator getdefaultcreator) {
        this.write = parsedouble;
        this.RemoteActionCompatParcelizer = getdefaultcreator;
        this.IconCompatParcelizer = parsedouble.read();
    }

    public final Typeface IconCompatParcelizer() {
        Object obj = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.read(obj, "");
        return (Typeface) obj;
    }

    public final boolean read() {
        if (this.write.read() != this.IconCompatParcelizer) {
            return true;
        }
        getDefaultCreator getdefaultcreator = this.RemoteActionCompatParcelizer;
        return getdefaultcreator != null && getdefaultcreator.read();
    }
}
