package kotlin;

import android.content.ClipData;
import android.content.ClipDescription;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setRootWindowInsets;", "", "<init>", "()V", "Lo/findNullValueSerializer;", "p0", "Lo/AbstractDeserializer;", "IconCompatParcelizer", "(Lo/findNullValueSerializer;)Lo/AbstractDeserializer;", "read", "(Lo/AbstractDeserializer;)Lo/findNullValueSerializer;", "Lo/findNullKeySerializer;", "", "AudioAttributesCompatParcelizer", "(Lo/findNullKeySerializer;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setRootWindowInsets {
    public static final setRootWindowInsets INSTANCE = new setRootWindowInsets();

    private setRootWindowInsets() {
    }

    @getMagicModuleMeta
    public static final AbstractDeserializer IconCompatParcelizer(findNullValueSerializer p0) {
        CharSequence text;
        ClipData.Item itemAt = p0.getWrite().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return setStableInsets.RemoteActionCompatParcelizer(text);
    }

    @getMagicModuleMeta
    public static final findNullValueSerializer read(AbstractDeserializer p0) {
        if (p0 == null) {
            return null;
        }
        return new findNullValueSerializer(ClipData.newPlainText("plain text", setStableInsets.AudioAttributesCompatParcelizer(p0)));
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(findNullKeySerializer p0) {
        ClipDescription primaryClipDescription = p0.write().getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }
}
