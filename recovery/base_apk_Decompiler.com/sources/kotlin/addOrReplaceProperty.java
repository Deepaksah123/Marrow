package kotlin;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r"}, d2 = {"Lo/addOrReplaceProperty;", "", "<init>", "()V", "Landroid/text/Layout$Alignment;", "AudioAttributesCompatParcelizer", "Landroid/text/Layout$Alignment;", "read", "()Landroid/text/Layout$Alignment;", "RemoteActionCompatParcelizer", "Landroid/text/TextDirectionHeuristic;", "IconCompatParcelizer", "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addOrReplaceProperty {
    public static final addOrReplaceProperty INSTANCE = new addOrReplaceProperty();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final Layout.Alignment RemoteActionCompatParcelizer = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final TextDirectionHeuristic write = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    public static final int RemoteActionCompatParcelizer = 8;

    private addOrReplaceProperty() {
    }

    public final Layout.Alignment read() {
        return RemoteActionCompatParcelizer;
    }

    public final TextDirectionHeuristic AudioAttributesCompatParcelizer() {
        return write;
    }
}
