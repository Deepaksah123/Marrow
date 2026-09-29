package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u00020\u0002"}, d2 = {"Lo/getInputCodeLatin1JsNames;", "", "Lo/setExpandActivityOverflowButtonDrawable;", "p0", "write", "(Lo/setExpandActivityOverflowButtonDrawable;)Lo/setExpandActivityOverflowButtonDrawable;", "", "", "IconCompatParcelizer", "(Lo/setExpandActivityOverflowButtonDrawable;I)V", "", "(Lo/setExpandActivityOverflowButtonDrawable;)Z", "RemoteActionCompatParcelizer", "(Lo/setExpandActivityOverflowButtonDrawable;)I", "AudioAttributesCompatParcelizer", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/setExpandActivityOverflowButtonDrawable;", "list"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class getInputCodeLatin1JsNames {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setExpandActivityOverflowButtonDrawable write;

    public static setExpandActivityOverflowButtonDrawable write(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return setexpandactivityoverflowbuttondrawable;
    }

    public static final void IconCompatParcelizer(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, int i) {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2 = setexpandactivityoverflowbuttondrawable;
        if (setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer == 0 || !(setexpandactivityoverflowbuttondrawable.read(0) == i || setexpandactivityoverflowbuttondrawable.read(setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer - 1) == i)) {
            int i2 = setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer;
            setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int i4 = setexpandactivityoverflowbuttondrawable.read(i3);
                if (i <= i4) {
                    break;
                }
                setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i2, i4);
                i2 = i3;
            }
            setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i2, i);
        }
    }

    public static final boolean IconCompatParcelizer(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return setexpandactivityoverflowbuttondrawable.AudioAttributesCompatParcelizer != 0;
    }

    public static final int RemoteActionCompatParcelizer(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer();
    }

    public static final int AudioAttributesCompatParcelizer(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        int i;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2 = setexpandactivityoverflowbuttondrawable;
        int i2 = setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer;
        int i3 = setexpandactivityoverflowbuttondrawable.read(0);
        while (setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer != 0 && setexpandactivityoverflowbuttondrawable.read(0) == i3) {
            setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(0, setexpandactivityoverflowbuttondrawable.write());
            setexpandactivityoverflowbuttondrawable.MediaBrowserCompatCustomActionResultReceiver(setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer - 1);
            int i4 = setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer;
            int i5 = setexpandactivityoverflowbuttondrawable2.AudioAttributesCompatParcelizer;
            int i6 = 0;
            while (i6 < (i5 >>> 1)) {
                int i7 = setexpandactivityoverflowbuttondrawable.read(i6);
                int i8 = (i6 + 1) << 1;
                int i9 = i8 - 1;
                int i10 = setexpandactivityoverflowbuttondrawable.read(i9);
                if (i8 >= i4 || (i = setexpandactivityoverflowbuttondrawable.read(i8)) <= i10) {
                    if (i10 > i7) {
                        setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i6, i10);
                        setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i9, i7);
                        i6 = i9;
                    }
                } else if (i > i7) {
                    setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i6, i);
                    setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i8, i7);
                    i6 = i8;
                }
            }
        }
        return i3;
    }

    public static /* synthetic */ setExpandActivityOverflowButtonDrawable write(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        int i2 = 1;
        if ((i & 1) != 0) {
            setexpandactivityoverflowbuttondrawable = new setExpandActivityOverflowButtonDrawable(0, i2, null);
        }
        return write(setexpandactivityoverflowbuttondrawable);
    }

    public static boolean AudioAttributesCompatParcelizer(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, Object obj) {
        return (obj instanceof getInputCodeLatin1JsNames) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandactivityoverflowbuttondrawable, ((getInputCodeLatin1JsNames) obj).getWrite());
    }

    public static int read(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return setexpandactivityoverflowbuttondrawable.hashCode();
    }

    public static String MediaBrowserCompatItemReceiver(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        StringBuilder sb = new StringBuilder("PrioritySet(list=");
        sb.append(setexpandactivityoverflowbuttondrawable);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return read(this.write);
    }

    public final String toString() {
        return MediaBrowserCompatItemReceiver(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ setExpandActivityOverflowButtonDrawable getWrite() {
        return this.write;
    }
}
