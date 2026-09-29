package kotlin;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f\u001a\u0011\u0010\u0002\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u0002\u0010\r"}, d2 = {"Lo/WritableTypeIdInclusion;", "Landroid/graphics/Rect;", "read", "(Lo/WritableTypeIdInclusion;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "IconCompatParcelizer", "(Lo/WritableTypeIdInclusion;)Landroid/graphics/RectF;", "write", "(Landroid/graphics/Rect;)Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer", "(Landroid/graphics/RectF;)Lo/WritableTypeIdInclusion;", "Lo/appendReferring;", "(Lo/appendReferring;)Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)Lo/appendReferring;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VersionUtil {
    @getRenewGrpId
    public static final Rect read(WritableTypeIdInclusion writableTypeIdInclusion) {
        return new Rect((int) writableTypeIdInclusion.getAudioAttributesCompatParcelizer(), (int) writableTypeIdInclusion.getRemoteActionCompatParcelizer(), (int) writableTypeIdInclusion.getWrite(), (int) writableTypeIdInclusion.getIconCompatParcelizer());
    }

    public static final RectF IconCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        return new RectF(writableTypeIdInclusion.getAudioAttributesCompatParcelizer(), writableTypeIdInclusion.getRemoteActionCompatParcelizer(), writableTypeIdInclusion.getWrite(), writableTypeIdInclusion.getIconCompatParcelizer());
    }

    public static final WritableTypeIdInclusion write(Rect rect) {
        return new WritableTypeIdInclusion(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final WritableTypeIdInclusion AudioAttributesCompatParcelizer(RectF rectF) {
        return new WritableTypeIdInclusion(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final Rect write(appendReferring appendreferring) {
        return new Rect(appendreferring.getRead(), appendreferring.getWrite(), appendreferring.getAudioAttributesCompatParcelizer(), appendreferring.getIconCompatParcelizer());
    }

    public static final appendReferring read(Rect rect) {
        return new appendReferring(rect.left, rect.top, rect.right, rect.bottom);
    }
}
