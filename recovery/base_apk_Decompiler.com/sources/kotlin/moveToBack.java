package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class moveToBack implements poll {
    private nonNullString AudioAttributesCompatParcelizer;
    private MinimalClassNameIdResolver RemoteActionCompatParcelizer;
    private C0170format read;

    public moveToBack(String str) {
        this.read = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(str).IconCompatParcelizer();
    }

    @Override // kotlin.poll
    public final void read(MinimalClassNameIdResolver minimalClassNameIdResolver, findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        this.RemoteActionCompatParcelizer = minimalClassNameIdResolver;
        writeVar.read();
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 5);
        this.AudioAttributesCompatParcelizer = nonnullstringIconCompatParcelizer;
        nonnullstringIconCompatParcelizer.write(this.read);
    }

    @Override // kotlin.poll
    public final void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        AudioAttributesCompatParcelizer();
        long jIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        long jWrite = this.RemoteActionCompatParcelizer.write();
        if (jIconCompatParcelizer == C.TIME_UNSET || jWrite == C.TIME_UNSET) {
            return;
        }
        if (jWrite != this.read.onSeekTo) {
            C0170format c0170formatIconCompatParcelizer = this.read.write().write(jWrite).IconCompatParcelizer();
            this.read = c0170formatIconCompatParcelizer;
            this.AudioAttributesCompatParcelizer.write(c0170formatIconCompatParcelizer);
        }
        int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iIconCompatParcelizer);
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(jIconCompatParcelizer, 1, iIconCompatParcelizer, 0, null);
    }

    private void AudioAttributesCompatParcelizer() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }
}
