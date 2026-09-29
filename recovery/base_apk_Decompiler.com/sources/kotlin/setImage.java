package kotlin;

import android.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\f\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setImage;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "read", "(ILjava/lang/Object;)Z", "", "write", "(I)Ljava/lang/String;", "I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setImage {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public static int IconCompatParcelizer(int i) {
        return i;
    }

    public static boolean read(int i, Object obj) {
        return (obj instanceof setImage) && i == ((setImage) obj).getRemoteActionCompatParcelizer();
    }

    public static int read(int i) {
        return Integer.hashCode(i);
    }

    public static String write(int i) {
        StringBuilder sb = new StringBuilder("ContextMenuStrings(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return read(this.RemoteActionCompatParcelizer, obj);
    }

    public final int hashCode() {
        return read(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return write(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.setImage$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006"}, d2 = {"Lo/setImage$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/setImage;", "AudioAttributesCompatParcelizer", "()I", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return setImage.IconCompatParcelizer(R.string.cut);
        }

        public final int IconCompatParcelizer() {
            return setImage.IconCompatParcelizer(R.string.copy);
        }

        public final int RemoteActionCompatParcelizer() {
            return setImage.IconCompatParcelizer(R.string.paste);
        }

        public final int read() {
            return setImage.IconCompatParcelizer(R.string.selectAll);
        }

        public final int write() {
            return setImage.IconCompatParcelizer(R.string.autofill);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
