package kotlin;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._deserializeFromObjectId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u0007\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0004\u0012\u00020\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012"}, d2 = {"Lo/getDelegateType;", "", "<init>", "()V", "Lo/handleUnknownVanilla;", "p0", "Landroid/text/style/URLSpan;", "IconCompatParcelizer", "(Lo/handleUnknownVanilla;)Landroid/text/style/URLSpan;", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_deserializeFromObjectId$IconCompatParcelizer;", "read", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Landroid/text/style/URLSpan;", "Lo/_deserializeFromObjectId;", "Landroid/text/style/ClickableSpan;", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "RemoteActionCompatParcelizer", "Ljava/util/WeakHashMap;", "AudioAttributesCompatParcelizer", "write", "Lo/createFromString;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDelegateType {
    private final WeakHashMap<handleUnknownVanilla, URLSpan> RemoteActionCompatParcelizer = new WeakHashMap<>();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final WeakHashMap<AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId.IconCompatParcelizer>, URLSpan> write = new WeakHashMap<>();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final WeakHashMap<AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId>, createFromString> read = new WeakHashMap<>();

    public final URLSpan IconCompatParcelizer(handleUnknownVanilla p0) {
        WeakHashMap<handleUnknownVanilla, URLSpan> weakHashMap = this.RemoteActionCompatParcelizer;
        URLSpan uRLSpan = weakHashMap.get(p0);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(p0.getRead());
            weakHashMap.put(p0, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan read(AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId.IconCompatParcelizer> p0) {
        WeakHashMap<AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId.IconCompatParcelizer>, URLSpan> weakHashMap = this.write;
        URLSpan uRLSpan = weakHashMap.get(p0);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(p0.IconCompatParcelizer().getRemoteActionCompatParcelizer());
            weakHashMap.put(p0, uRLSpan);
        }
        return uRLSpan;
    }

    public final ClickableSpan IconCompatParcelizer(AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> p0) {
        WeakHashMap<AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId>, createFromString> weakHashMap = this.read;
        createFromString createfromstring = weakHashMap.get(p0);
        if (createfromstring == null) {
            createfromstring = new createFromString(p0.IconCompatParcelizer());
            weakHashMap.put(p0, createfromstring);
        }
        return createfromstring;
    }
}
