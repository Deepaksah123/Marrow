package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/hasDelegatingCreator;", "p0", "Lkotlin/Function0;", "", "p1", "write", "(Lo/hasDelegatingCreator;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class addStringCreator {
    public static final void write(final hasDelegatingCreator hasdelegatingcreator, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1504045604);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(hasdelegatingcreator) : _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(hasdelegatingcreator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1504045604, i2, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.android.kt:53)");
            }
            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(hasdelegatingcreator, "");
            Set<JsonReadContext> setWrite = ((constructValueInstantiator) hasdelegatingcreator).write();
            setWrite.add(_handleunrecognizedcharacterescapeWrite.onAddQueueItem());
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{JsonDeserialize.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Boolean.TRUE), _handleOddName2.read().AudioAttributesCompatParcelizer(setWrite)}, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, ContentReference.write | (i2 & 112));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.hasPropertyBasedCreator
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return addStringCreator.write(hasdelegatingcreator, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(hasDelegatingCreator hasdelegatingcreator, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write(hasdelegatingcreator, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
