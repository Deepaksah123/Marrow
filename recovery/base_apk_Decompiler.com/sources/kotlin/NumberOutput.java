package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000b\u001a\u00020\t\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\t\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000b\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019\u0088\u0001\u001a\u0092\u0001\u00020\u0003"}, d2 = {"Lo/NumberOutput;", "T", "", "Lo/_handleUnrecognizedCharacterEscape;", "p0", "read", "(Lo/_handleUnrecognizedCharacterEscape;)Lo/_handleUnrecognizedCharacterEscape;", "V", "Lkotlin/Function2;", "", "p1", "write", "(Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V", "RemoteActionCompatParcelizer", "Lkotlin/Function1;", "(Lo/_handleUnrecognizedCharacterEscape;Lo/getAnswerMap;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/_handleUnrecognizedCharacterEscape;", "composer"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class NumberOutput<T> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _handleUnrecognizedCharacterEscape read;

    public static <T> _handleUnrecognizedCharacterEscape read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        return _handleunrecognizedcharacterescape;
    }

    public static final <V> void write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, V v, MagicModuleSubmissionRequestBody<? super T, ? super V, getShowPopup> magicModuleSubmissionRequestBody) {
        if (_handleunrecognizedcharacterescape.onPlayFromMediaId() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape.onPause(), v)) {
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(v);
            _handleunrecognizedcharacterescape.read(v, magicModuleSubmissionRequestBody);
        }
    }

    public static final <V> void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, V v, MagicModuleSubmissionRequestBody<? super T, ? super V, getShowPopup> magicModuleSubmissionRequestBody) {
        if (_handleunrecognizedcharacterescape.onPlayFromMediaId()) {
            _handleunrecognizedcharacterescape.read(v, magicModuleSubmissionRequestBody);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj, getShowPopup getshowpopup) {
        getanswermap.invoke(obj);
        return getShowPopup.INSTANCE;
    }

    public static final void write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final getAnswerMap<? super T, getShowPopup> getanswermap) {
        _handleunrecognizedcharacterescape.read(getShowPopup.INSTANCE, new MagicModuleSubmissionRequestBody() { // from class: o._outputFullBillion
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NumberOutput.RemoteActionCompatParcelizer(getanswermap, obj, (getShowPopup) obj2);
            }
        });
    }

    public static boolean RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Object obj) {
        return (obj instanceof NumberOutput) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, ((NumberOutput) obj).getRead());
    }

    public static int write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        return _handleunrecognizedcharacterescape.hashCode();
    }

    public static String AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        StringBuilder sb = new StringBuilder("Updater(composer=");
        sb.append(_handleunrecognizedcharacterescape);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return write(this.read);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ _handleUnrecognizedCharacterEscape getRead() {
        return this.read;
    }
}
