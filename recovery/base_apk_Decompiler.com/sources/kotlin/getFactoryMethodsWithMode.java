package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001a\u0010*\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010 R\u001c\u0010)\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010#\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b!\u0010.R\u001c\u00101\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010,R\u001a\u00100\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b2\u0010.R\u001a\u00102\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010.R\u001a\u00105\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b/\u0010 R\u001a\u0010/\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b5\u0010 R\u001a\u00106\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b1\u0010.R\u001a\u00107\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b3\u0010.R\u001a\u00104\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b6\u0010.R\u001a\u00103\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b7\u0010."}, d2 = {"Lo/getFactoryMethodsWithMode;", "Lo/getConstructors;", "", "p0", "", "Lo/getBeanClass;", "p1", "Lo/instance;", "p2", "Lo/Instantiatable;", "p3", "", "p4", "p5", "p6", "p7", "Lo/findAutoDetectVisibility;", "p8", "Lo/findCreatorBinding;", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/util/List;ILo/Instantiatable;FLo/Instantiatable;FFIIFFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "I", "write", "IconCompatParcelizer", "Lo/Instantiatable;", "()Lo/Instantiatable;", "F", "()F", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "RatingCompat", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "MediaMetadataCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getFactoryMethodsWithMode extends getConstructors {
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Instantiatable MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;
    private final float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final float RatingCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final float MediaMetadataCompat;
    private final List<getBeanClass> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;
    private final Instantiatable write;

    /* JADX WARN: Multi-variable type inference failed */
    private getFactoryMethodsWithMode(String str, List<? extends getBeanClass> list, int i, Instantiatable instantiatable, float f, Instantiatable instantiatable2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = i;
        this.write = instantiatable;
        this.read = f;
        this.MediaBrowserCompatCustomActionResultReceiver = instantiatable2;
        this.AudioAttributesImplBaseParcelizer = f2;
        this.AudioAttributesImplApi26Parcelizer = f3;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.MediaDescriptionCompat = f4;
        this.MediaMetadataCompat = f5;
        this.RatingCompat = f6;
        this.MediaBrowserCompatMediaItem = f7;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<getBeanClass> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Instantiatable getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final Instantiatable getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final float getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final float getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final float getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final float getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final float getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && getClass() == p0.getClass()) {
            getFactoryMethodsWithMode getfactorymethodswithmode = (getFactoryMethodsWithMode) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getfactorymethodswithmode.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getfactorymethodswithmode.write) && this.read == getfactorymethodswithmode.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, getfactorymethodswithmode.MediaBrowserCompatCustomActionResultReceiver) && this.AudioAttributesImplBaseParcelizer == getfactorymethodswithmode.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == getfactorymethodswithmode.AudioAttributesImplApi26Parcelizer && findAutoDetectVisibility.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, getfactorymethodswithmode.MediaBrowserCompatItemReceiver) && findCreatorBinding.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, getfactorymethodswithmode.AudioAttributesImplApi21Parcelizer) && this.MediaDescriptionCompat == getfactorymethodswithmode.MediaDescriptionCompat && this.MediaMetadataCompat == getfactorymethodswithmode.MediaMetadataCompat && this.RatingCompat == getfactorymethodswithmode.RatingCompat && this.MediaBrowserCompatMediaItem == getfactorymethodswithmode.MediaBrowserCompatMediaItem && instance.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, getfactorymethodswithmode.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getfactorymethodswithmode.RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Instantiatable instantiatable = this.write;
        int iHashCode3 = instantiatable != null ? instantiatable.hashCode() : 0;
        int iHashCode4 = Float.hashCode(this.read);
        Instantiatable instantiatable2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode5 = instantiatable2 != null ? instantiatable2.hashCode() : 0;
        int iHashCode6 = Float.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode7 = Float.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iAudioAttributesCompatParcelizer = findAutoDetectVisibility.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        int iWrite = findCreatorBinding.write(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode8 = Float.hashCode(this.MediaDescriptionCompat);
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iAudioAttributesCompatParcelizer) * 31) + iWrite) * 31) + iHashCode8) * 31) + Float.hashCode(this.MediaMetadataCompat)) * 31) + Float.hashCode(this.RatingCompat)) * 31) + Float.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + instance.read(this.IconCompatParcelizer);
    }

    public /* synthetic */ getFactoryMethodsWithMode(String str, List list, int i, Instantiatable instantiatable, float f, Instantiatable instantiatable2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, list, i, instantiatable, f, instantiatable2, f2, f3, i2, i3, f4, f5, f6, f7);
    }
}
