package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class MagicModuleRepoModelsKt extends r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA implements MagicModuleMetaRepoModel, getErrorMessageId {
    private final int AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    public MagicModuleRepoModelsKt(int i) {
        this(i, MediaBrowserCompatItemReceiver, null, null, null, 0);
    }

    public MagicModuleRepoModelsKt(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public MagicModuleRepoModelsKt(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2 >> 1;
    }

    @Override // kotlin.MagicModuleMetaRepoModel
    public int getArity() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
    /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
    public getErrorMessageId RatingCompat() {
        return (getErrorMessageId) super.RatingCompat();
    }

    @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
    protected isKycAuditIncomplete AudioAttributesImplApi26Parcelizer() {
        return toMagicModuleMetaDataUcModel.AudioAttributesCompatParcelizer(this);
    }

    @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete, kotlin.getErrorMessageId
    public boolean handleMediaPlayPauseIfPendingOnHandler() {
        return RatingCompat().handleMediaPlayPauseIfPendingOnHandler();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MagicModuleRepoModelsKt) {
            MagicModuleRepoModelsKt magicModuleRepoModelsKt = (MagicModuleRepoModelsKt) obj;
            return MediaBrowserCompatCustomActionResultReceiver().equals(magicModuleRepoModelsKt.MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatMediaItem().equals(magicModuleRepoModelsKt.MediaBrowserCompatMediaItem()) && this.AudioAttributesCompatParcelizer == magicModuleRepoModelsKt.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == magicModuleRepoModelsKt.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), magicModuleRepoModelsKt.AudioAttributesImplBaseParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(MediaDescriptionCompat(), magicModuleRepoModelsKt.MediaDescriptionCompat());
        }
        if (obj instanceof getErrorMessageId) {
            return obj.equals(AudioAttributesImplApi21Parcelizer());
        }
        return false;
    }

    public int hashCode() {
        return (((MediaDescriptionCompat() == null ? 0 : MediaDescriptionCompat().hashCode() * 31) + MediaBrowserCompatCustomActionResultReceiver().hashCode()) * 31) + MediaBrowserCompatMediaItem().hashCode();
    }

    public String toString() {
        isKycAuditIncomplete iskycauditincompleteAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (iskycauditincompleteAudioAttributesImplApi21Parcelizer != this) {
            return iskycauditincompleteAudioAttributesImplApi21Parcelizer.toString();
        }
        if ("<init>".equals(MediaBrowserCompatCustomActionResultReceiver())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder("function ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
