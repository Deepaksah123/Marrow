package kotlin;

import kotlin.Metadata;
import kotlin.isArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/AudioAttributesImplBase;", "Lo/isArray;", "Lo/AudioAttributesCompat;", "p0", "<init>", "(Lo/AudioAttributesCompat;)V", "Lo/isArray$read;", "", "write", "(Lo/isArray$read;)V", "", "p1", "", "read", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "IconCompatParcelizer", "Lo/AudioAttributesCompat;", "Lo/AlertDialogLayout;", "RemoteActionCompatParcelizer", "Lo/AlertDialogLayout;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AudioAttributesImplBase implements isArray {
    private final AudioAttributesCompat IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final AlertDialogLayout<Object> write = setSupportCompoundDrawablesTintList.IconCompatParcelizer();

    public AudioAttributesImplBase(AudioAttributesCompat audioAttributesCompat) {
        this.IconCompatParcelizer = audioAttributesCompat;
    }

    @Override // kotlin.isArray
    public final void write(isArray.read p0) {
        this.write.AudioAttributesCompatParcelizer();
        setCustomSelectionActionModeCallback<Object> setcustomselectionactionmodecallback = p0.read();
        Object[] objArr = setcustomselectionactionmodecallback.AudioAttributesCompatParcelizer;
        long[] jArr = setcustomselectionactionmodecallback.MediaBrowserCompatItemReceiver;
        int i = setcustomselectionactionmodecallback.MediaBrowserCompatCustomActionResultReceiver;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(obj);
            int i3 = this.write.read(objIconCompatParcelizer, 0);
            if (i3 == 7) {
                p0.remove(obj);
            } else {
                this.write.RemoteActionCompatParcelizer(objIconCompatParcelizer, i3 + 1);
            }
            i = i2;
        }
    }

    @Override // kotlin.isArray
    public final boolean read(Object p0, Object p1) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer(p0), this.IconCompatParcelizer.IconCompatParcelizer(p1));
    }
}
