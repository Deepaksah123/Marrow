package kotlin;

import android.graphics.Canvas;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\"\u0019\u0010\n\u001a\u00060\u0005j\u0002`\b*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\"\u0014\u0010\u0003\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b*\n\u0010\f\"\u00020\u00052\u00020\u0005"}, d2 = {"Lo/unshare;", "p0", "Lo/JsonParserDelegate;", "AudioAttributesCompatParcelizer", "(Lo/unshare;)Lo/JsonParserDelegate;", "Landroid/graphics/Canvas;", "RemoteActionCompatParcelizer", "(Landroid/graphics/Canvas;)Lo/JsonParserDelegate;", "Lo/read;", "(Lo/JsonParserDelegate;)Landroid/graphics/Canvas;", "IconCompatParcelizer", "Landroid/graphics/Canvas;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class balloc {
    private static final Canvas RemoteActionCompatParcelizer = new Canvas();

    public static final JsonParserDelegate AudioAttributesCompatParcelizer(unshare unshareVar) {
        charBufferLength charbufferlength = new charBufferLength();
        charbufferlength.write(new Canvas(_allocMore.AudioAttributesCompatParcelizer(unshareVar)));
        return charbufferlength;
    }

    public static final JsonParserDelegate RemoteActionCompatParcelizer(Canvas canvas) {
        charBufferLength charbufferlength = new charBufferLength();
        charbufferlength.write(canvas);
        return charbufferlength;
    }

    public static final Canvas RemoteActionCompatParcelizer(JsonParserDelegate jsonParserDelegate) {
        toMagicModuleMetaRepoModel.read(jsonParserDelegate, "");
        return ((charBufferLength) jsonParserDelegate).read();
    }
}
