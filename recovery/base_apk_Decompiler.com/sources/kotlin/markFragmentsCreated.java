package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u000e\u0010\u001dR\u0014\u0010\f\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001fR\u0014\u0010\"\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010!"}, d2 = {"Lo/markFragmentsCreated;", "Lo/onPostResume;", "Lo/onActivityPostCreated;", "p0", "Lo/lambdainit1androidxfragmentappFragmentActivity;", "p1", "Lo/MdtaMetadataEntry;", "p2", "<init>", "(Lo/onActivityPostCreated;Lo/lambdainit1androidxfragmentappFragmentActivity;Lo/MdtaMetadataEntry;)V", "", "", "IconCompatParcelizer", "(I)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "", "(ILjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)V", "write", "(Ljava/lang/Object;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "read", "Lo/onActivityPostCreated;", "AudioAttributesCompatParcelizer", "Lo/lambdainit1androidxfragmentappFragmentActivity;", "Lo/MdtaMetadataEntry;", "()Lo/MdtaMetadataEntry;", "Lo/setWindowTitle;", "()Lo/setWindowTitle;", "Lo/onActivityPostStarted;", "()Lo/onActivityPostStarted;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class markFragmentsCreated implements onPostResume {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final lambdainit1androidxfragmentappFragmentActivity RemoteActionCompatParcelizer;
    private final onActivityPostCreated read;
    private final MdtaMetadataEntry write;

    public markFragmentsCreated(onActivityPostCreated onactivitypostcreated, lambdainit1androidxfragmentappFragmentActivity lambdainit1androidxfragmentappfragmentactivity, MdtaMetadataEntry mdtaMetadataEntry) {
        this.read = onactivitypostcreated;
        this.RemoteActionCompatParcelizer = lambdainit1androidxfragmentappfragmentactivity;
        this.write = mdtaMetadataEntry;
    }

    @Override // kotlin.onPostResume
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final MdtaMetadataEntry getWrite() {
        return this.write;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final int read() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final Object IconCompatParcelizer(int p0) {
        Object objRemoteActionCompatParcelizer = getWrite().RemoteActionCompatParcelizer(p0);
        return objRemoteActionCompatParcelizer == null ? this.RemoteActionCompatParcelizer.write(p0) : objRemoteActionCompatParcelizer;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final Object RemoteActionCompatParcelizer(int p0) {
        return this.RemoteActionCompatParcelizer.read(p0);
    }

    @Override // kotlin.onPostResume
    public final setWindowTitle write() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final void IconCompatParcelizer(final int i, final Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1493551140);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(obj) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1493551140, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:79)");
            }
            createMessage.write(obj, i, this.read.getOnMediaButtonEvent(), multiplyFft.AudioAttributesCompatParcelizer(726189336, true, new MagicModuleSubmissionRequestBody() { // from class: o.supportStartPostponedEnterTransition
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return markFragmentsCreated.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.startIntentSenderFromFragment
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return markFragmentsCreated.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, i, obj, i2, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(markFragmentsCreated markfragmentscreated, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(726189336, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:81)");
            }
            onForceLoad.write<lambdainit2androidxfragmentappFragmentActivity> writeVarRemoteActionCompatParcelizer = markfragmentscreated.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(i);
            writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().read().write(setDrawDisappearingViewsLast.INSTANCE, Integer.valueOf(i - writeVarRemoteActionCompatParcelizer.getIconCompatParcelizer()), _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.onPostResume
    public final onActivityPostStarted IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getRead();
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final int write(Object p0) {
        return getWrite().read(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof markFragmentsCreated) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((markFragmentsCreated) p0).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(markFragmentsCreated markfragmentscreated, int i, Object obj, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        markfragmentscreated.IconCompatParcelizer(i, obj, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}
