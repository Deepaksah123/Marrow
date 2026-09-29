package kotlin;

import android.text.Layout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lo/_isSetterlessType;", "", "<init>", "()V", "", "p0", "Landroid/text/Layout$Alignment;", "IconCompatParcelizer", "(I)Landroid/text/Layout$Alignment;", "write", "Landroid/text/Layout$Alignment;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _isSetterlessType {
    public static final _isSetterlessType INSTANCE = new _isSetterlessType();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final Layout.Alignment AudioAttributesCompatParcelizer;
    private static final Layout.Alignment write;

    private _isSetterlessType() {
    }

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) alignment3.name(), (Object) "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) alignment3.name(), (Object) "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        write = alignment;
        AudioAttributesCompatParcelizer = alignment2;
    }

    public final Layout.Alignment IconCompatParcelizer(int p0) {
        if (p0 == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (p0 == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (p0 == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (p0 == 3) {
            return write;
        }
        if (p0 == 4) {
            return AudioAttributesCompatParcelizer;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
