package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lo/height;", "Lo/JsonIgnorePropertiesValue;", "Lo/switchToNext;", "p0", "p1", "p2", "<init>", "(JJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Lo/parseDouble;", "RemoteActionCompatParcelizer", "(ZZLo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "read", "J", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class height implements JsonIgnorePropertiesValue {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    private height(long j, long j2, long j3) {
        this.write = j;
        this.IconCompatParcelizer = j2;
        this.RemoteActionCompatParcelizer = j3;
    }

    @Override // kotlin.JsonIgnorePropertiesValue
    public final parseDouble<switchToNext> RemoteActionCompatParcelizer(boolean z, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long j;
        parseDouble<switchToNext> parsedouble;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1243421834);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:176)");
        }
        if (!z) {
            j = this.RemoteActionCompatParcelizer;
        } else if (!z2) {
            j = this.IconCompatParcelizer;
        } else {
            j = this.write;
        }
        long j2 = j;
        if (z) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1312667467);
            parsedouble = setTextMetricsParamsCompat.read(j2, setVerticalGravity.RemoteActionCompatParcelizer$default(100, 0, (setOnQueryTextFocusChangeListener) null, 6, (Object) null), null, null, _handleunrecognizedcharacterescape, 48, 12);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1312564764);
            parsedouble = _qbuf.read(switchToNext.write(j2), _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
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
        height heightVar = (height) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.write, heightVar.write) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, heightVar.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, heightVar.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((switchToNext.MediaBrowserCompatItemReceiver(this.write) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ height(long j, long j2, long j3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3);
    }
}
