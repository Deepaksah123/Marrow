package kotlin;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA implements isKycAuditIncomplete, Serializable {
    public static final Object MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
    private final Class AudioAttributesCompatParcelizer;
    public final Object AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private transient isKycAuditIncomplete write;

    protected abstract isKycAuditIncomplete AudioAttributesImplApi26Parcelizer();

    /* JADX INFO: loaded from: classes4.dex */
    static class RemoteActionCompatParcelizer implements Serializable {
        private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        private Object readResolve() throws ObjectStreamException {
            return AudioAttributesCompatParcelizer;
        }
    }

    public r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA() {
        this(MediaBrowserCompatItemReceiver);
    }

    protected r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA(Object obj) {
        this(obj, null, null, null, false);
    }

    protected r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA(Object obj, Class cls, String str, String str2, boolean z) {
        this.AudioAttributesImplApi26Parcelizer = obj;
        this.AudioAttributesCompatParcelizer = cls;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = z;
    }

    public Object AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public isKycAuditIncomplete AudioAttributesImplApi21Parcelizer() {
        isKycAuditIncomplete iskycauditincomplete = this.write;
        if (iskycauditincomplete != null) {
            return iskycauditincomplete;
        }
        isKycAuditIncomplete iskycauditincompleteAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        this.write = iskycauditincompleteAudioAttributesImplApi26Parcelizer;
        return iskycauditincompleteAudioAttributesImplApi26Parcelizer;
    }

    protected isKycAuditIncomplete RatingCompat() {
        isKycAuditIncomplete iskycauditincompleteAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (iskycauditincompleteAudioAttributesImplApi21Parcelizer != this) {
            return iskycauditincompleteAudioAttributesImplApi21Parcelizer;
        }
        throw new getFeedbacks();
    }

    public isAuthError MediaDescriptionCompat() {
        Class cls = this.AudioAttributesCompatParcelizer;
        if (cls == null) {
            return null;
        }
        return this.read ? toMagicModuleMetaDataUcModel.RemoteActionCompatParcelizer(cls) : toMagicModuleMetaDataUcModel.write(cls);
    }

    @Override // kotlin.isKycAuditIncomplete
    public String MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public String MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.isKycAuditIncomplete
    public List<ApplicationData> MediaBrowserCompatSearchResultReceiver() {
        return RatingCompat().MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.isKycAuditIncomplete
    public deleteOfflineDownloadedFiles MediaMetadataCompat() {
        return RatingCompat().MediaMetadataCompat();
    }

    @Override // kotlin.McqFaq
    public List<Annotation> MediaBrowserCompatItemReceiver() {
        return RatingCompat().MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.isKycAuditIncomplete
    public Object RemoteActionCompatParcelizer(Object... objArr) {
        return RatingCompat().RemoteActionCompatParcelizer(objArr);
    }

    @Override // kotlin.isKycAuditIncomplete
    public Object AudioAttributesCompatParcelizer(Map map) {
        return RatingCompat().AudioAttributesCompatParcelizer(map);
    }

    @Override // kotlin.isKycAuditIncomplete, kotlin.getErrorMessageId
    public boolean handleMediaPlayPauseIfPendingOnHandler() {
        return RatingCompat().handleMediaPlayPauseIfPendingOnHandler();
    }
}
