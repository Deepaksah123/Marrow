package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017"}, d2 = {"Lo/disable;", "Lo/AudioAttributesImplApi21;", "Lo/ApicFrame;", "p0", "Lo/registerListener;", "Lo/updateMediaItem;", "p1", "Lo/MdtaMetadataEntry;", "p2", "<init>", "(Lo/ApicFrame;Lo/registerListener;Lo/MdtaMetadataEntry;)V", "", "", "", "IconCompatParcelizer", "(ILjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)V", "(I)Ljava/lang/Object;", "write", "(Ljava/lang/Object;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RemoteActionCompatParcelizer", "Lo/ApicFrame;", "AudioAttributesCompatParcelizer", "Lo/registerListener;", "Lo/MdtaMetadataEntry;", "Lo/SphericalGLSurfaceView;", "Lo/SphericalGLSurfaceView;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class disable implements AudioAttributesImplApi21 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SphericalGLSurfaceView read = SphericalGLSurfaceView.INSTANCE;
    private final registerListener<updateMediaItem> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ApicFrame AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MdtaMetadataEntry RemoteActionCompatParcelizer;

    public disable(ApicFrame apicFrame, registerListener<updateMediaItem> registerlistener, MdtaMetadataEntry mdtaMetadataEntry) {
        this.AudioAttributesCompatParcelizer = apicFrame;
        this.IconCompatParcelizer = registerlistener;
        this.RemoteActionCompatParcelizer = mdtaMetadataEntry;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final int read() {
        return this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final void IconCompatParcelizer(final int i, final Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1201380429);
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
                _validJsonValueList.AudioAttributesCompatParcelizer(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:208)");
            }
            createMessage.write(obj, i, this.AudioAttributesCompatParcelizer.getOnSkipToNext(), multiplyFft.AudioAttributesCompatParcelizer(1142237095, true, new MagicModuleSubmissionRequestBody() { // from class: o.enable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return disable.write(this.RemoteActionCompatParcelizer, i, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getPlayerId
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return disable.read(this.write, i, obj, i2, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(disable disableVar, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1142237095, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:210)");
            }
            onForceLoad.write writeVarRemoteActionCompatParcelizer = disableVar.IconCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(i);
            ((updateMediaItem) writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).write().write(disableVar.read, Integer.valueOf(i - writeVarRemoteActionCompatParcelizer.getIconCompatParcelizer()), _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final Object IconCompatParcelizer(int p0) {
        Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0);
        return objRemoteActionCompatParcelizer == null ? this.IconCompatParcelizer.write(p0) : objRemoteActionCompatParcelizer;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final int write(Object p0) {
        return this.RemoteActionCompatParcelizer.read(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof disable) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((disable) p0).IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(disable disableVar, int i, Object obj, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        disableVar.IconCompatParcelizer(i, obj, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}
