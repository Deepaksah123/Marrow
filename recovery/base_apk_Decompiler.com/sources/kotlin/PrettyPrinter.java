package kotlin;

import kotlin.Metadata;
import kotlin.getSystemGestureInsets;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lo/PrettyPrinter;", "", "<init>", "()V", "Lo/isRound;", "p0", "Lo/setOrientation;", "Lo/assignParameter;", "write", "(Lo/isRound;)Lo/setOrientation;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PrettyPrinter {
    public static final PrettyPrinter INSTANCE = new PrettyPrinter();

    private PrettyPrinter() {
    }

    public final setOrientation<assignParameter> write(isRound p0) {
        if ((p0 instanceof setOverriddenInsets.read) || (p0 instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer) || (p0 instanceof isVisible.read) || (p0 instanceof getTappableElementInsets.RemoteActionCompatParcelizer)) {
            return writeObjectFieldValueSeparator.AudioAttributesCompatParcelizer;
        }
        return null;
    }

    public final setOrientation<assignParameter> read(isRound p0) {
        if (!(p0 instanceof setOverriddenInsets.read) && !(p0 instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer)) {
            if (p0 instanceof isVisible.read) {
                return writeObjectFieldValueSeparator.read;
            }
            if (p0 instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                return writeObjectFieldValueSeparator.write;
            }
            return null;
        }
        return writeObjectFieldValueSeparator.write;
    }
}
