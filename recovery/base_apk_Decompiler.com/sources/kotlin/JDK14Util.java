package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/JDK14Util;", "", "<init>", "()V", "Lo/CharacterEscapes;", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "Lo/CharacterEscapes;", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/TypeResolutionContext;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JDK14Util {
    public static final JDK14Util INSTANCE = new JDK14Util();
    private static final CharacterEscapes<TypeResolutionContext> IconCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: o.getRecordFieldNames
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return JDK14Util.write();
        }
    }, 1, null);
    public static final int write = 0;

    public static /* synthetic */ TypeResolutionContext write() {
        return null;
    }

    private JDK14Util() {
    }

    public static TypeResolutionContext IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-584162872, i, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        TypeResolutionContext typeResolutionContextAudioAttributesCompatParcelizer = (TypeResolutionContext) _handleunrecognizedcharacterescape.write(IconCompatParcelizer);
        if (typeResolutionContextAudioAttributesCompatParcelizer == null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1260197609);
            typeResolutionContextAudioAttributesCompatParcelizer = JDK14UtilCreatorLocator.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape);
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1260196493);
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return typeResolutionContextAudioAttributesCompatParcelizer;
    }
}
