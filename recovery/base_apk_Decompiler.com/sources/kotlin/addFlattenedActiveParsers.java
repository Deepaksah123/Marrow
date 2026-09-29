package kotlin;

import android.graphics.Canvas;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/addFlattenedActiveParsers;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "", "p1", "", "read", "(Landroid/graphics/Canvas;Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addFlattenedActiveParsers {
    public static final addFlattenedActiveParsers INSTANCE = new addFlattenedActiveParsers();
    public static final int write = 8;

    private addFlattenedActiveParsers() {
    }

    public final void read(Canvas p0, boolean p1) {
        JsonParserSequence.INSTANCE.AudioAttributesCompatParcelizer(p0, p1);
    }
}
