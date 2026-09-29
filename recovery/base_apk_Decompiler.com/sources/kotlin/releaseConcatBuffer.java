package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\u0003"}, d2 = {"Lo/releaseConcatBuffer;", "T", "", "Lo/_handleUnrecognizedCharacterEscape;", "p0", "write", "(Lo/_handleUnrecognizedCharacterEscape;)Lo/_handleUnrecognizedCharacterEscape;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/_handleUnrecognizedCharacterEscape;", "composer"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class releaseConcatBuffer<T> {
    private final _handleUnrecognizedCharacterEscape AudioAttributesCompatParcelizer;

    public static <T> _handleUnrecognizedCharacterEscape write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        return _handleunrecognizedcharacterescape;
    }

    private /* synthetic */ releaseConcatBuffer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        this.AudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape;
    }

    public static final /* synthetic */ releaseConcatBuffer RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        return new releaseConcatBuffer(_handleunrecognizedcharacterescape);
    }

    public static boolean IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Object obj) {
        return (obj instanceof releaseConcatBuffer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, ((releaseConcatBuffer) obj).getAudioAttributesCompatParcelizer());
    }

    public static int AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        return _handleunrecognizedcharacterescape.hashCode();
    }

    public static String IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        StringBuilder sb = new StringBuilder("SkippableUpdater(composer=");
        sb.append(_handleunrecognizedcharacterescape);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ _handleUnrecognizedCharacterEscape getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
