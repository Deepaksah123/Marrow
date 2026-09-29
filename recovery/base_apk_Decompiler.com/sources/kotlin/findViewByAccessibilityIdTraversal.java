package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u001aH\u0016¢\u0006\u0004\b\u0011\u0010\u001bR\u001c\u0010\u0018\u001a\u00020\u00058\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u0015\u0010\u001eR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001f\"\u0004\b\u0018\u0010 R\u001c\u0010\u0011\u001a\u00020\t8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010!\"\u0004\b\u0011\u0010\"R\"\u0010\u001c\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u0018\u0010%\"\u0004\b\u001c\u0010&R\u001a\u0010\u0015\u001a\u00020'8\u0017X\u0097D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001a\u0010,\u001a\u00020'8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b+\u0010*R\u0016\u0010(\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001dR\u0018\u0010.\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0018\u0010#\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010$R\u0018\u00104\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00101"}, d2 = {"Lo/findViewByAccessibilityIdTraversal;", "Lo/addKeySerializers;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_prefetchRootDeserializer;", "Lo/hasIndex;", "Lo/switchToNext;", "p0", "Lo/Instantiatable;", "p1", "", "p2", "Lo/findAndAddVirtualProperties;", "p3", "<init>", "(JLo/Instantiatable;FLo/findAndAddVirtualProperties;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/findSerializer;", "", "write", "(Lo/findSerializer;)V", "MediaMetadataCompat", "()V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/resetWithString;", "read", "(Lo/findSerializer;)Lo/resetWithString;", "Lo/getConfigOverride;", "(Lo/getConfigOverride;)V", "AudioAttributesCompatParcelizer", "J", "(J)V", "Lo/Instantiatable;", "(Lo/Instantiatable;)V", "F", "(F)V", "MediaBrowserCompatItemReceiver", "Lo/findAndAddVirtualProperties;", "()Lo/findAndAddVirtualProperties;", "(Lo/findAndAddVirtualProperties;)V", "", "AudioAttributesImplBaseParcelizer", "Z", "()Z", "j_", "AudioAttributesImplApi26Parcelizer", "Lo/calloc;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/tryToResolveUnresolved;", "Lo/tryToResolveUnresolved;", "Lo/resetWithString;", "AudioAttributesImplApi21Parcelizer", "MediaDescriptionCompat", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class findViewByAccessibilityIdTraversal extends _handleOddName.IconCompatParcelizer implements addKeySerializers, _prefetchRootDeserializer, hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long read;
    private findAndAddVirtualProperties AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private resetWithString MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private tryToResolveUnresolved MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private findAndAddVirtualProperties AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private resetWithString RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Instantiatable RemoteActionCompatParcelizer;

    private findViewByAccessibilityIdTraversal(long j, Instantiatable instantiatable, float f, findAndAddVirtualProperties findandaddvirtualproperties) {
        this.read = j;
        this.RemoteActionCompatParcelizer = instantiatable;
        this.write = f;
        this.AudioAttributesCompatParcelizer = findandaddvirtualproperties;
        this.AudioAttributesImplBaseParcelizer = calloc.INSTANCE.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(long j) {
        this.read = j;
    }

    public final void read(Instantiatable instantiatable) {
        this.RemoteActionCompatParcelizer = instantiatable;
    }

    public final void write(float f) {
        this.write = f;
    }

    public final void AudioAttributesCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties) {
        this.AudioAttributesCompatParcelizer = findandaddvirtualproperties;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final findAndAddVirtualProperties getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: j_, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        if (this.AudioAttributesCompatParcelizer == parseVersion.read()) {
            IconCompatParcelizer(findserializer);
        } else {
            RemoteActionCompatParcelizer(findserializer);
        }
        findserializer.write();
    }

    @Override // kotlin._prefetchRootDeserializer
    public final void MediaMetadataCompat() {
        this.AudioAttributesImplBaseParcelizer = calloc.INSTANCE.IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        addDeserializers.read(this);
    }

    private final void IconCompatParcelizer(findSerializer findserializer) {
        if (!switchToNext.RemoteActionCompatParcelizer(this.read, switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            findSetterInfo.read$default(findserializer, this.read, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
        }
        Instantiatable instantiatable = this.RemoteActionCompatParcelizer;
        if (instantiatable != null) {
            findSetterInfo.write$default(findserializer, instantiatable, 0L, 0L, this.write, null, null, 0, 118, null);
        }
    }

    private final void RemoteActionCompatParcelizer(findSerializer findserializer) {
        resetWithString resetwithstring = read(findserializer);
        if (!switchToNext.RemoteActionCompatParcelizer(this.read, switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            resetWithCopy.RemoteActionCompatParcelizer(findserializer, resetwithstring, this.read, (60 & 4) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, (60 & 8) != 0 ? findTypeResolver.INSTANCE : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? findSetterInfo.INSTANCE.write() : 0);
        }
        Instantiatable instantiatable = this.RemoteActionCompatParcelizer;
        if (instantiatable != null) {
            resetWithCopy.RemoteActionCompatParcelizer$default(findserializer, resetwithstring, instantiatable, this.write, (findViews) null, (switchAndReturnNext) null, 0, 56, (Object) null);
        }
    }

    private final resetWithString read(final findSerializer findserializer) {
        resetWithString resetwithstring;
        if (calloc.RemoteActionCompatParcelizer(findserializer.MediaBrowserCompatCustomActionResultReceiver(), this.AudioAttributesImplBaseParcelizer) && findserializer.RemoteActionCompatParcelizer() == this.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer)) {
            resetwithstring = this.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.write(resetwithstring);
        } else {
            _detectBindAndClose.read(this, new getCreatedOnDateMs() { // from class: o.getConfiguration
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return findViewByAccessibilityIdTraversal.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, findserializer);
                }
            });
            resetwithstring = this.RatingCompat;
            this.RatingCompat = null;
        }
        this.MediaBrowserCompatItemReceiver = resetwithstring;
        this.AudioAttributesImplBaseParcelizer = findserializer.MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatCustomActionResultReceiver = findserializer.RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(resetwithstring);
        return resetwithstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(findViewByAccessibilityIdTraversal findviewbyaccessibilityidtraversal, findSerializer findserializer) {
        findviewbyaccessibilityidtraversal.RatingCompat = findviewbyaccessibilityidtraversal.AudioAttributesCompatParcelizer.write(findserializer.MediaBrowserCompatCustomActionResultReceiver(), findserializer.RemoteActionCompatParcelizer(), findserializer);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        MapperBuilder.IconCompatParcelizer(getconfigoverride, this.AudioAttributesCompatParcelizer);
    }

    public /* synthetic */ findViewByAccessibilityIdTraversal(long j, Instantiatable instantiatable, float f, findAndAddVirtualProperties findandaddvirtualproperties, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, instantiatable, f, findandaddvirtualproperties);
    }
}
