package kotlin;

import android.graphics.ColorFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Lo/DefaultPrettyPrinterIndenter;", "Lo/switchAndReturnNext;", "Lo/switchToNext;", "p0", "Lo/createInstance;", "p1", "Landroid/graphics/ColorFilter;", "Lo/AudioAttributesCompatParcelizer;", "p2", "<init>", "(JILandroid/graphics/ColorFilter;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "(JILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "J", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultPrettyPrinterIndenter extends switchAndReturnNext {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    private DefaultPrettyPrinterIndenter(long j, int i, ColorFilter colorFilter) {
        super(colorFilter);
        this.IconCompatParcelizer = j;
        this.write = i;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    private DefaultPrettyPrinterIndenter(long j, int i) {
        this(j, i, releaseCharBuffer.AudioAttributesCompatParcelizer(j, i), null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DefaultPrettyPrinterIndenter)) {
            return false;
        }
        DefaultPrettyPrinterIndenter defaultPrettyPrinterIndenter = (DefaultPrettyPrinterIndenter) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, defaultPrettyPrinterIndenter.IconCompatParcelizer) && createInstance.IconCompatParcelizer(this.write, defaultPrettyPrinterIndenter.write);
    }

    public final int hashCode() {
        return (switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer) * 31) + createInstance.IconCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer));
        sb.append(", blendMode=");
        sb.append((Object) createInstance.read(this.write));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ DefaultPrettyPrinterIndenter(long j, int i, ColorFilter colorFilter, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, i, colorFilter);
    }

    public /* synthetic */ DefaultPrettyPrinterIndenter(long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, i);
    }
}
