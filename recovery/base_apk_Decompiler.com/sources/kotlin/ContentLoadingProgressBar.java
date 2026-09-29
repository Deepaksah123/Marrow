package kotlin;

import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001d\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0002\b(J\u0013\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\u000e\u001a\u00070\u000b¢\u0006\u0002\b\f2\u0010\u0010\n\u001a\f0\u000b¢\u0006\u0002\b\f¢\u0006\u0002\b\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "type", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getType$foundation_layout", "()I", "<set-?>", "Landroidx/core/graphics/Insets;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "insets", "getInsets$foundation_layout", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout", "(Landroidx/core/graphics/Insets;)V", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "", "isVisible", "()Z", "setVisible", "(Z)V", "isVisible$delegate", "getLeft", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getTop", "getRight", "getBottom", "update", "", "windowInsetsCompat", "Landroidx/core/view/WindowInsetsCompat;", "typeMask", "update$foundation_layout", "equals", "other", "", "hashCode", "toString", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentLoadingProgressBar implements onCreateView {
    private final int IconCompatParcelizer;
    private final InputAccessor RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(_verifyEndArrayForSingle.RemoteActionCompatParcelizer, null, 2, null);
    private final InputAccessor read = available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, 2, null);
    private final String write;

    public ContentLoadingProgressBar(int i, String str) {
        this.IconCompatParcelizer = i;
        this.write = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final _verifyEndArrayForSingle IconCompatParcelizer() {
        return (_verifyEndArrayForSingle) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        this.RemoteActionCompatParcelizer.write(_verifyendarrayforsingle);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read.write(Boolean.valueOf(z));
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved) {
        return IconCompatParcelizer().read;
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
        return IconCompatParcelizer().write;
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved) {
        return IconCompatParcelizer().IconCompatParcelizer;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty) {
        return IconCompatParcelizer().AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(WindowInsetsCompat windowInsetsCompat, int i) {
        if (i == 0 || (i & this.IconCompatParcelizer) != 0) {
            IconCompatParcelizer(windowInsetsCompat.read(this.IconCompatParcelizer));
            AudioAttributesCompatParcelizer(windowInsetsCompat.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        }
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentLoadingProgressBar) && this.IconCompatParcelizer == ((ContentLoadingProgressBar) other).IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append('(');
        sb.append(IconCompatParcelizer().read);
        sb.append(", ");
        sb.append(IconCompatParcelizer().write);
        sb.append(", ");
        sb.append(IconCompatParcelizer().IconCompatParcelizer);
        sb.append(", ");
        sb.append(IconCompatParcelizer().AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
