package kotlin;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.removeSoftRefsClearedByGc;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u0004\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0004\u0010\r"}, d2 = {"Lo/removeSoftRefsClearedByGc;", "write", "()Lo/removeSoftRefsClearedByGc;", "Landroid/graphics/Path;", "RemoteActionCompatParcelizer", "(Landroid/graphics/Path;)Lo/removeSoftRefsClearedByGc;", "", "p0", "", "read", "(Ljava/lang/String;)V", "Lo/removeSoftRefsClearedByGc$write;", "Landroid/graphics/Path$Direction;", "(Lo/removeSoftRefsClearedByGc$write;)Landroid/graphics/Path$Direction;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeIndentation {
    /* JADX WARN: Multi-variable type inference failed */
    public static final removeSoftRefsClearedByGc write() {
        return new getCurrentSegment(null, 1, 0 == true ? 1 : 0);
    }

    public static final removeSoftRefsClearedByGc RemoteActionCompatParcelizer(Path path) {
        return new getCurrentSegment(path);
    }

    public static final void read(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction RemoteActionCompatParcelizer(removeSoftRefsClearedByGc.write writeVar) {
        int i = writeIndentation$IconCompatParcelizer$WhenMappings.write[writeVar.ordinal()];
        if (i == 1) {
            return Path.Direction.CCW;
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return Path.Direction.CW;
    }
}
