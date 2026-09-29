package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015"}, d2 = {"Lo/Rattr;", "Lo/HorizontalSquareImageView;", "Lo/switchToNext;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Lo/parseDouble;", "read", "(ZLo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "RemoteActionCompatParcelizer", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "J", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Rattr implements HorizontalSquareImageView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    private Rattr(long j, long j2, long j3, long j4) {
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
        this.IconCompatParcelizer = j3;
        this.AudioAttributesCompatParcelizer = j4;
    }

    @Override // kotlin.HorizontalSquareImageView
    public final parseDouble<switchToNext> read(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-655254499);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:581)");
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(z ? this.write : this.IconCompatParcelizer), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    @Override // kotlin.HorizontalSquareImageView
    public final parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-2133647540);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:586)");
        }
        parseDouble<switchToNext> parsedouble = _qbuf.read(switchToNext.write(z ? this.RemoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer), _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        Rattr rattr = (Rattr) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.write, rattr.write) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, rattr.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, rattr.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, rattr.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.write);
        return (((((iMediaBrowserCompatItemReceiver * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
    }

    public /* synthetic */ Rattr(long j, long j2, long j3, long j4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4);
    }
}
