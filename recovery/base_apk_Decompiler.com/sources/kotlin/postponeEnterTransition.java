package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001a\u0010\u001a\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u0013\u0010!R\u0014\u0010\u0013\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010$\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010#"}, d2 = {"Lo/postponeEnterTransition;", "Lo/performStart;", "Lo/setSharedElementReturnTransition;", "p0", "Lo/performMultiWindowModeChanged;", "p1", "Lo/performDestroyView;", "p2", "Lo/MdtaMetadataEntry;", "p3", "<init>", "(Lo/setSharedElementReturnTransition;Lo/performMultiWindowModeChanged;Lo/performDestroyView;Lo/MdtaMetadataEntry;)V", "", "", "", "IconCompatParcelizer", "(ILjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)V", "(I)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "write", "(Ljava/lang/Object;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesCompatParcelizer", "Lo/setSharedElementReturnTransition;", "Lo/performMultiWindowModeChanged;", "read", "Lo/performDestroyView;", "()Lo/performDestroyView;", "Lo/MdtaMetadataEntry;", "()Lo/MdtaMetadataEntry;", "Lo/setWindowTitle;", "()Lo/setWindowTitle;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class postponeEnterTransition implements performStart {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setSharedElementReturnTransition RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final performMultiWindowModeChanged read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final performDestroyView AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final MdtaMetadataEntry IconCompatParcelizer;

    public postponeEnterTransition(setSharedElementReturnTransition setsharedelementreturntransition, performMultiWindowModeChanged performmultiwindowmodechanged, performDestroyView performdestroyview, MdtaMetadataEntry mdtaMetadataEntry) {
        this.RemoteActionCompatParcelizer = setsharedelementreturntransition;
        this.read = performmultiwindowmodechanged;
        this.AudioAttributesCompatParcelizer = performdestroyview;
        this.IconCompatParcelizer = mdtaMetadataEntry;
    }

    @Override // kotlin.performStart
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final performDestroyView getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.performStart
    /* JADX INFO: renamed from: write, reason: from getter */
    public final MdtaMetadataEntry getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final int read() {
        return this.read.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final void IconCompatParcelizer(final int i, final Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-462424778);
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
                _validJsonValueList.AudioAttributesCompatParcelizer(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            createMessage.write(obj, i, this.RemoteActionCompatParcelizer.getOnPlayFromMediaId(), multiplyFft.AudioAttributesCompatParcelizer(-824725566, true, new MagicModuleSubmissionRequestBody() { // from class: o.registerForContextMenu
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return postponeEnterTransition.read(this.IconCompatParcelizer, i, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.performViewCreated
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return postponeEnterTransition.AudioAttributesCompatParcelizer(this.write, i, obj, i2, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(postponeEnterTransition postponeentertransition, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-824725566, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:78)");
            }
            onForceLoad.write<performPause> writeVarRemoteActionCompatParcelizer = postponeentertransition.read.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(i);
            writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().read().write(postponeentertransition.getAudioAttributesCompatParcelizer(), Integer.valueOf(i - writeVarRemoteActionCompatParcelizer.getIconCompatParcelizer()), _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final Object IconCompatParcelizer(int p0) {
        Object objRemoteActionCompatParcelizer = getIconCompatParcelizer().RemoteActionCompatParcelizer(p0);
        return objRemoteActionCompatParcelizer == null ? this.read.write(p0) : objRemoteActionCompatParcelizer;
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final Object RemoteActionCompatParcelizer(int p0) {
        return this.read.read(p0);
    }

    @Override // kotlin.performStart
    public final setWindowTitle RemoteActionCompatParcelizer() {
        return this.read.read();
    }

    @Override // kotlin.AudioAttributesImplApi21
    public final int write(Object p0) {
        return getIconCompatParcelizer().read(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof postponeEnterTransition) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((postponeEnterTransition) p0).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(postponeEnterTransition postponeentertransition, int i, Object obj, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        postponeentertransition.IconCompatParcelizer(i, obj, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}
