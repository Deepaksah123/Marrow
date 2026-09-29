package kotlin;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0086\u0002J\u0006\u0010\u0012\u001a\u00020\rR6\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "<init>", "()V", "map", "Ljava/util/HashMap;", "Landroidx/compose/ui/res/ImageVectorCache$Key;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "Lkotlin/collections/HashMap;", "get", "key", "prune", "", "configChanges", "", "set", "imageVectorEntry", "clear", "Key", "ImageVectorEntry", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class shouldIntrospectorImplicitConstructors {
    private final HashMap<IconCompatParcelizer, WeakReference<read>> AudioAttributesCompatParcelizer = new HashMap<>();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/shouldIntrospectorImplicitConstructors$IconCompatParcelizer;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "p0", "", "p1", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Landroid/content/res/Resources$Theme;", "AudioAttributesCompatParcelizer", "read", "I", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final Resources.Theme AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        public IconCompatParcelizer(Resources.Theme theme, int i) {
            this.AudioAttributesCompatParcelizer = theme;
            this.IconCompatParcelizer = i;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0014\u0010\f"}, d2 = {"Lo/shouldIntrospectorImplicitConstructors$read;", "", "Lo/findExpectedFormat;", "p0", "", "p1", "<init>", "(Lo/findExpectedFormat;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/findExpectedFormat;", "AudioAttributesCompatParcelizer", "()Lo/findExpectedFormat;", "RemoteActionCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class read {
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final findExpectedFormat RemoteActionCompatParcelizer;

        public read(findExpectedFormat findexpectedformat, int i) {
            this.RemoteActionCompatParcelizer = findexpectedformat;
            this.AudioAttributesCompatParcelizer = i;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final findExpectedFormat getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("read(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public final read AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        WeakReference<read> weakReference = this.AudioAttributesCompatParcelizer.get(iconCompatParcelizer);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void IconCompatParcelizer(int i) {
        Iterator<Map.Entry<IconCompatParcelizer, WeakReference<read>>> it = this.AudioAttributesCompatParcelizer.entrySet().iterator();
        while (it.hasNext()) {
            read readVar = it.next().getValue().get();
            if (readVar == null || Configuration.needNewResources(i, readVar.getAudioAttributesCompatParcelizer())) {
                it.remove();
            }
        }
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer, read readVar) {
        this.AudioAttributesCompatParcelizer.put(iconCompatParcelizer, new WeakReference<>(readVar));
    }

    public final void read() {
        this.AudioAttributesCompatParcelizer.clear();
    }
}
