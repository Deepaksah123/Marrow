package kotlin;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.access2400;
import kotlin.access2502;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0003()*B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J(\u0010#\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0011H\u0016RX\u0010\u0005\u001a>\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0006j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n`\u000b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "logger", "Lcoil/util/Logger;", "(Lcoil/util/Logger;)V", "cache", "Ljava/util/HashMap;", "Lcoil/memory/MemoryCache$Key;", "Ljava/util/ArrayList;", "Lcoil/memory/RealWeakMemoryCache$WeakValue;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "getCache$coil_base_release$annotations", "()V", "getCache$coil_base_release", "()Ljava/util/HashMap;", "operationsSinceCleanUp", "", "getOperationsSinceCleanUp$coil_base_release$annotations", "getOperationsSinceCleanUp$coil_base_release", "()I", "setOperationsSinceCleanUp$coil_base_release", "(I)V", "cleanUp", "", "cleanUp$coil_base_release", "cleanUpIfNecessary", "clearMemory", "get", "Lcoil/memory/RealMemoryCache$Value;", "key", "remove", "", "bitmap", "Landroid/graphics/Bitmap;", "set", "isSampled", "size", "trimMemory", "level", "Companion", "StrongValue", "WeakValue", "coil-base_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class access2502 implements evaluateMediaItemTransitionReason {
    public static final read write = new read(null);
    private final setSurfaceTextureInternal IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final HashMap<MemoryCache.Key, ArrayList<IconCompatParcelizer>> read = new HashMap<>();

    public access2502(setSurfaceTextureInternal setsurfacetextureinternal) {
        this.IconCompatParcelizer = setsurfacetextureinternal;
    }

    private HashMap<MemoryCache.Key, ArrayList<IconCompatParcelizer>> RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.evaluateMediaItemTransitionReason
    public final access2400.RemoteActionCompatParcelizer read(MemoryCache.Key key) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(key, "");
            ArrayList<IconCompatParcelizer> arrayList = this.read.get(key);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = null;
            if (arrayList == null) {
                return null;
            }
            ArrayList<IconCompatParcelizer> arrayList2 = arrayList;
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    IconCompatParcelizer iconCompatParcelizer = arrayList2.get(i);
                    Bitmap bitmap = iconCompatParcelizer.read().get();
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = bitmap == null ? null : new AudioAttributesCompatParcelizer(bitmap, iconCompatParcelizer.AudioAttributesCompatParcelizer());
                    if (audioAttributesCompatParcelizer2 != null) {
                        audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                        break;
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            IconCompatParcelizer();
            return audioAttributesCompatParcelizer;
        }
    }

    @Override // kotlin.evaluateMediaItemTransitionReason
    public final void write(MemoryCache.Key key, Bitmap bitmap, boolean z, int i) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(key, "");
            toMagicModuleMetaRepoModel.write(bitmap, "");
            HashMap<MemoryCache.Key, ArrayList<IconCompatParcelizer>> map = this.read;
            ArrayList<IconCompatParcelizer> arrayList = map.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(key, arrayList);
            }
            ArrayList<IconCompatParcelizer> arrayList2 = arrayList;
            access2502 access2502Var = this;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(iIdentityHashCode, new WeakReference(bitmap), z, i);
            int size = arrayList2.size() - 1;
            if (size < 0) {
                arrayList2.add(iconCompatParcelizer);
                IconCompatParcelizer();
            } else {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    IconCompatParcelizer iconCompatParcelizer2 = arrayList2.get(i2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer2, "");
                    IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer2;
                    if (i < iconCompatParcelizer3.IconCompatParcelizer()) {
                        if (i3 > size) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    } else if (iconCompatParcelizer3.write() == iIdentityHashCode && iconCompatParcelizer3.read().get() == bitmap) {
                        arrayList2.set(i2, iconCompatParcelizer);
                    } else {
                        arrayList2.add(i2, iconCompatParcelizer);
                    }
                }
                IconCompatParcelizer();
            }
        }
    }

    @Override // kotlin.evaluateMediaItemTransitionReason
    public final void IconCompatParcelizer(int i) {
        synchronized (this) {
            setSurfaceTextureInternal setsurfacetextureinternal = this.IconCompatParcelizer;
            if (setsurfacetextureinternal != null && setsurfacetextureinternal.RemoteActionCompatParcelizer() <= 2) {
                toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("trimMemory, level=", (Object) Integer.valueOf(i));
            }
            if (i >= 10 && i != 20) {
                write();
            }
        }
    }

    private final void IconCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        if (i >= 10) {
            write();
        }
    }

    private void write() {
        this.RemoteActionCompatParcelizer = 0;
        Iterator<ArrayList<IconCompatParcelizer>> it = this.read.values().iterator();
        while (it.hasNext()) {
            ArrayList<IconCompatParcelizer> next = it.next();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
            ArrayList<IconCompatParcelizer> arrayList = next;
            if (arrayList.size() <= 1) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList);
                if ((iconCompatParcelizer == null ? null : iconCompatParcelizer.read().get()) == null) {
                    it.remove();
                }
            } else {
                arrayList.removeIf(new Predicate() { // from class: o.access2600
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return access2502.AudioAttributesCompatParcelizer((access2502.IconCompatParcelizer) obj);
                    }
                });
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        return iconCompatParcelizer.read().get() == null;
    }

    public static final class IconCompatParcelizer {
        private final boolean AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final WeakReference<Bitmap> write;

        public IconCompatParcelizer(int i, WeakReference<Bitmap> weakReference, boolean z, int i2) {
            toMagicModuleMetaRepoModel.write(weakReference, "");
            this.IconCompatParcelizer = i;
            this.write = weakReference;
            this.AudioAttributesCompatParcelizer = z;
            this.RemoteActionCompatParcelizer = i2;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }

        public final WeakReference<Bitmap> read() {
            return this.write;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    static final class AudioAttributesCompatParcelizer implements access2400.RemoteActionCompatParcelizer {
        private final boolean IconCompatParcelizer;
        private final Bitmap write;

        public AudioAttributesCompatParcelizer(Bitmap bitmap, boolean z) {
            toMagicModuleMetaRepoModel.write(bitmap, "");
            this.write = bitmap;
            this.IconCompatParcelizer = z;
        }

        @Override // o.access2400.RemoteActionCompatParcelizer
        public final Bitmap write() {
            return this.write;
        }

        @Override // o.access2400.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/access2502$read;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.evaluateMediaItemTransitionReason
    public final boolean write(Bitmap bitmap) {
        boolean z;
        int i;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(bitmap, "");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            access2502 access2502Var = this;
            Collection<ArrayList<IconCompatParcelizer>> collectionValues = RemoteActionCompatParcelizer().values();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionValues, "");
            Iterator<T> it = collectionValues.iterator();
            loop0: while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                ArrayList arrayList = (ArrayList) it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        if (((IconCompatParcelizer) arrayList.get(i)).write() == iIdentityHashCode) {
                            arrayList.remove(i);
                            z = true;
                            break loop0;
                        }
                        i = i2 <= size ? i2 : 0;
                    }
                }
            }
            IconCompatParcelizer();
        }
        return z;
    }
}
