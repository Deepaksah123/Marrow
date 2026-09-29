package kotlin;

/* JADX INFO: loaded from: classes.dex */
public abstract class MagicModuleUseCaseImpl extends r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA implements isResolutionNotSupported {
    private final boolean AudioAttributesCompatParcelizer;

    public MagicModuleUseCaseImpl() {
        this.AudioAttributesCompatParcelizer = false;
    }

    public MagicModuleUseCaseImpl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.AudioAttributesCompatParcelizer = (i & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
    /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
    public isResolutionNotSupported RatingCompat() {
        if (this.AudioAttributesCompatParcelizer) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (isResolutionNotSupported) super.RatingCompat();
    }

    @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
    public isKycAuditIncomplete AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer ? this : super.AudioAttributesImplApi21Parcelizer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MagicModuleUseCaseImpl) {
            MagicModuleUseCaseImpl magicModuleUseCaseImpl = (MagicModuleUseCaseImpl) obj;
            return MediaDescriptionCompat().equals(magicModuleUseCaseImpl.MediaDescriptionCompat()) && MediaBrowserCompatCustomActionResultReceiver().equals(magicModuleUseCaseImpl.MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatMediaItem().equals(magicModuleUseCaseImpl.MediaBrowserCompatMediaItem()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), magicModuleUseCaseImpl.AudioAttributesImplBaseParcelizer());
        }
        if (obj instanceof isResolutionNotSupported) {
            return obj.equals(AudioAttributesImplApi21Parcelizer());
        }
        return false;
    }

    public int hashCode() {
        return (((MediaDescriptionCompat().hashCode() * 31) + MediaBrowserCompatCustomActionResultReceiver().hashCode()) * 31) + MediaBrowserCompatMediaItem().hashCode();
    }

    public String toString() {
        isKycAuditIncomplete iskycauditincompleteAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (iskycauditincompleteAudioAttributesImplApi21Parcelizer != this) {
            return iskycauditincompleteAudioAttributesImplApi21Parcelizer.toString();
        }
        StringBuilder sb = new StringBuilder("property ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
