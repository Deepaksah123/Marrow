package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000f\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setThumbTintList;", "T", "Lo/setOnQueryTextListener;", "Lo/setThumbTintList$RemoteActionCompatParcelizer;", "p0", "<init>", "(Lo/setThumbTintList$RemoteActionCompatParcelizer;)V", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/ViewLayerContainer;", "AudioAttributesCompatParcelizer", "(Lo/evictionCount;)Lo/ViewLayerContainer;", "read", "Lo/setThumbTintList$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setThumbTintList<T> implements setOnQueryTextListener<T> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer<T> RemoteActionCompatParcelizer;

    public setThumbTintList(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/setThumbTintList$RemoteActionCompatParcelizer;", "T", "Lo/setTrackResource;", "Lo/setThumbTintList$IconCompatParcelizer;", "<init>", "()V", "", "p0", "write", "(Ljava/lang/Object;I)Lo/setThumbTintList$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer<T> extends setTrackResource<T, IconCompatParcelizer<T>> {
        public RemoteActionCompatParcelizer() {
            super(null);
        }

        public final IconCompatParcelizer<T> write(T t, int i) {
            IconCompatParcelizer<T> iconCompatParcelizer = new IconCompatParcelizer<>(t, null, 0, 6, null);
            write().write(i, iconCompatParcelizer);
            return iconCompatParcelizer;
        }
    }

    @Override // kotlin.setOnQueryTextListener
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final <V extends ScrollingTabContainerView> ViewLayerContainer<V> IconCompatParcelizer(evictionCount<T, V> p0) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = new setExpandActivityOverflowButtonDrawable(this.RemoteActionCompatParcelizer.write().getWrite() + 2);
        setProvider setprovider = new setProvider(this.RemoteActionCompatParcelizer.write().getWrite());
        setProvider<IconCompatParcelizer<T>> setproviderWrite = this.RemoteActionCompatParcelizer.write();
        int[] iArr3 = setproviderWrite.IconCompatParcelizer;
        Object[] objArr = setproviderWrite.MediaBrowserCompatItemReceiver;
        long[] jArr3 = setproviderWrite.RemoteActionCompatParcelizer;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[i6];
                            setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            setprovider.write(i7, new ViewLayer(p0.RemoteActionCompatParcelizer().invoke(iconCompatParcelizer.RemoteActionCompatParcelizer()), iconCompatParcelizer.getRead(), iconCompatParcelizer.getRead(), null));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(0)) {
            setexpandactivityoverflowbuttondrawable.read();
        }
        if (!this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(this.RemoteActionCompatParcelizer.getRead())) {
            setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.getRead());
        }
        setexpandactivityoverflowbuttondrawable.IconCompatParcelizer();
        return new ViewLayerContainer<>(setexpandactivityoverflowbuttondrawable, setprovider, this.RemoteActionCompatParcelizer.getRead(), this.RemoteActionCompatParcelizer.getIconCompatParcelizer(), setShowText.read(), setSelected.INSTANCE.read(), null);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u00068\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/setThumbTintList$IconCompatParcelizer;", "T", "Lo/setTrackDrawable;", "p0", "Lo/setOnQueryTextFocusChangeListener;", "p1", "Lo/setSelected;", "p2", "<init>", "(Ljava/lang/Object;Lo/setOnQueryTextFocusChangeListener;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "read", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer<T> extends setTrackDrawable<T> {
        private int read;

        private IconCompatParcelizer(T t, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i) {
            super(t, setonquerytextfocuschangelistener, null);
            this.read = i;
        }

        public /* synthetic */ IconCompatParcelizer(Object obj, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(obj, (i2 & 2) != 0 ? setShowText.read() : setonquerytextfocuschangelistener, (i2 & 4) != 0 ? setSelected.INSTANCE.read() : i, null);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (p0 == this) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.getRead(), getRead()) && setSelected.write(iconCompatParcelizer.read, this.read);
        }

        public final int hashCode() {
            T tRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            return ((((tRemoteActionCompatParcelizer != null ? tRemoteActionCompatParcelizer.hashCode() : 0) * 31) + setSelected.IconCompatParcelizer(this.read)) * 31) + getRead().hashCode();
        }

        public /* synthetic */ IconCompatParcelizer(Object obj, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(obj, setonquerytextfocuschangelistener, i);
        }
    }
}
