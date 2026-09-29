package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000b\u001a\u00020\u000e8\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011\"\u0004\b\u000f\u0010\u0012R\"\u0010\u000f\u001a\u00020\u00138\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\b\u0010\u0016"}, d2 = {"Lo/setCustomErrorMessage;", "Lo/setDefaultArtwork;", "Lo/BaseSettings;", "p0", "<init>", "(Lo/BaseSettings;)V", "Lo/ResolvableDeserializer;", "", "AudioAttributesCompatParcelizer", "(I)Z", "read", "IconCompatParcelizer", "Lo/BaseSettings;", "RemoteActionCompatParcelizer", "Lo/setErrorMessageProvider;", "write", "Lo/setErrorMessageProvider;", "()Lo/setErrorMessageProvider;", "(Lo/setErrorMessageProvider;)V", "Lo/_resizeAndFindOffsetForAdd;", "Lo/_resizeAndFindOffsetForAdd;", "()Lo/_resizeAndFindOffsetForAdd;", "(Lo/_resizeAndFindOffsetForAdd;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCustomErrorMessage implements setDefaultArtwork {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final BaseSettings RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public _resizeAndFindOffsetForAdd write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public setErrorMessageProvider IconCompatParcelizer;

    public setCustomErrorMessage(BaseSettings baseSettings) {
        this.RemoteActionCompatParcelizer = baseSettings;
    }

    public final setErrorMessageProvider RemoteActionCompatParcelizer() {
        setErrorMessageProvider seterrormessageprovider = this.IconCompatParcelizer;
        if (seterrormessageprovider != null) {
            return seterrormessageprovider;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void write(setErrorMessageProvider seterrormessageprovider) {
        this.IconCompatParcelizer = seterrormessageprovider;
    }

    public final void AudioAttributesCompatParcelizer(_resizeAndFindOffsetForAdd _resizeandfindoffsetforadd) {
        this.write = _resizeandfindoffsetforadd;
    }

    public final _resizeAndFindOffsetForAdd read() {
        _resizeAndFindOffsetForAdd _resizeandfindoffsetforadd = this.write;
        if (_resizeandfindoffsetforadd != null) {
            return _resizeandfindoffsetforadd;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer(int p0) {
        getAnswerMap<setDefaultArtwork, getShowPopup> getanswermapMediaBrowserCompatItemReceiver;
        if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.RemoteActionCompatParcelizer())) {
            getanswermapMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().read();
        } else if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.write())) {
            getanswermapMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        } else if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.read())) {
            getanswermapMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
        } else if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.MediaBrowserCompatItemReceiver())) {
            getanswermapMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().IconCompatParcelizer();
        } else if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            getanswermapMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer();
        } else if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            getanswermapMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver();
        } else {
            if (!ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.IconCompatParcelizer()) && !ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.AudioAttributesCompatParcelizer())) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            getanswermapMediaBrowserCompatItemReceiver = null;
        }
        if (getanswermapMediaBrowserCompatItemReceiver != null) {
            getanswermapMediaBrowserCompatItemReceiver.invoke(this);
            return true;
        }
        return read(p0);
    }

    private final boolean read(int p0) {
        BaseSettings baseSettings;
        if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.read())) {
            read().RemoteActionCompatParcelizer(_checkNeedForRehash.INSTANCE.write());
            return true;
        }
        if (ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.MediaBrowserCompatItemReceiver())) {
            read().RemoteActionCompatParcelizer(_checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer());
            return true;
        }
        if (!ResolvableDeserializer.write(p0, ResolvableDeserializer.INSTANCE.RemoteActionCompatParcelizer()) || (baseSettings = this.RemoteActionCompatParcelizer) == null) {
            return false;
        }
        baseSettings.read();
        return true;
    }
}
