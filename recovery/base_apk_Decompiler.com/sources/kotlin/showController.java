package kotlin;

import android.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0004\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\f\u0088\u0001\r\u0092\u0001\u00020\u0002"}, d2 = {"Lo/showController;", "", "", "p0", "write", "(I)I", "", "(ILjava/lang/Object;)Z", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class showController {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public static int write(int i) {
        return i;
    }

    public static boolean write(int i, Object obj) {
        return (obj instanceof showController) && i == ((showController) obj).getIconCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public static String AudioAttributesCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("ContextMenuIcons(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return write(this.IconCompatParcelizer, obj);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.showController$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lo/showController$IconCompatParcelizer;", "", "<init>", "()V", "Lo/showController;", "read", "()I", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int read() {
            return showController.write(R.attr.actionModeCutDrawable);
        }

        public final int write() {
            return showController.write(R.attr.actionModeCopyDrawable);
        }

        public final int AudioAttributesCompatParcelizer() {
            return showController.write(R.attr.actionModePasteDrawable);
        }

        public final int RemoteActionCompatParcelizer() {
            return showController.write(R.attr.actionModeSelectAllDrawable);
        }

        public final int IconCompatParcelizer() {
            return showController.write(0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
