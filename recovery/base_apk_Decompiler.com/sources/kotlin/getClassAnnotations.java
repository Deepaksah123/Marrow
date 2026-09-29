package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0014\u0010%R\u001a\u0010&\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010%R\u001a\u0010'\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b\"\u0010%R\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010%R\u001a\u0010)\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b(\u0010%R\u001a\u0010*\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b+\u0010%R\u001a\u0010+\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b'\u0010-R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0011\u0010.\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b#\u0010\u001e"}, d2 = {"Lo/getClassAnnotations;", "Lo/getConstructors;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "Lo/getBeanClass;", "p8", "p9", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "", "AudioAttributesCompatParcelizer", "(I)Lo/getConstructors;", "", "iterator", "()Ljava/util/Iterator;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "F", "()F", "write", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Ljava/util/List;", "()Ljava/util/List;", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getClassAnnotations extends getConstructors implements Iterable<getConstructors>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<getConstructors> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<getBeanClass> MediaBrowserCompatCustomActionResultReceiver;
    private final float write;

    /* JADX WARN: Multi-variable type inference failed */
    public getClassAnnotations(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends getBeanClass> list, List<? extends getConstructors> list2) {
        super(null);
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = f;
        this.write = f2;
        this.read = f3;
        this.IconCompatParcelizer = f4;
        this.AudioAttributesImplBaseParcelizer = f5;
        this.AudioAttributesImplApi21Parcelizer = f6;
        this.MediaBrowserCompatItemReceiver = f7;
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.AudioAttributesImplApi26Parcelizer = list2;
    }

    public /* synthetic */ getClassAnnotations(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : BitmapDescriptorFactory.HUE_RED, (i & 256) != 0 ? getFactoryMethods.AudioAttributesCompatParcelizer() : list, (i & 512) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final float getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final float getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<getBeanClass> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.size();
    }

    public final getConstructors AudioAttributesCompatParcelizer(int p0) {
        return this.AudioAttributesImplApi26Parcelizer.get(p0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/getClassAnnotations$IconCompatParcelizer;", "", "Lo/getConstructors;", "", "hasNext", "()Z", "write", "()Lo/getConstructors;", "AudioAttributesCompatParcelizer", "Ljava/util/Iterator;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements Iterator<getConstructors>, getCurrentAnsweredMcqProgress {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final Iterator<getConstructors> RemoteActionCompatParcelizer;

        IconCompatParcelizer(getClassAnnotations getclassannotations) {
            this.RemoteActionCompatParcelizer = getclassannotations.AudioAttributesImplApi26Parcelizer.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final getConstructors next() {
            return this.RemoteActionCompatParcelizer.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<getConstructors> iterator() {
        return new IconCompatParcelizer(this);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && (p0 instanceof getClassAnnotations)) {
            getClassAnnotations getclassannotations = (getClassAnnotations) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getclassannotations.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == getclassannotations.AudioAttributesCompatParcelizer && this.write == getclassannotations.write && this.read == getclassannotations.read && this.IconCompatParcelizer == getclassannotations.IconCompatParcelizer && this.AudioAttributesImplBaseParcelizer == getclassannotations.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == getclassannotations.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == getclassannotations.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, getclassannotations.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getclassannotations.AudioAttributesImplApi26Parcelizer);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Float.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode3 = Float.hashCode(this.write);
        int iHashCode4 = Float.hashCode(this.read);
        int iHashCode5 = Float.hashCode(this.IconCompatParcelizer);
        int iHashCode6 = Float.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode7 = Float.hashCode(this.AudioAttributesImplApi21Parcelizer);
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + Float.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode();
    }

    public getClassAnnotations() {
        this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }
}
