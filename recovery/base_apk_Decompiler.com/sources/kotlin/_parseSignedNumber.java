package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0016J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0017J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u000b\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00108\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\b\u0010\u001b"}, d2 = {"Lo/_parseSignedNumber;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "IconCompatParcelizer", "(C)V", "", "write", "(Ljava/lang/String;)Ljava/lang/Void;", "", "RemoteActionCompatParcelizer", "(C)Z", "", "(Ljava/lang/String;)I", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "read", "()Ljava/lang/String;", "(I)V", "()C", "()Z", "Ljava/lang/String;", "I", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _parseSignedNumber {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public _parseSignedNumber(String str) {
        this.AudioAttributesCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(char p0) throws _parseNumber2 {
        if (RemoteActionCompatParcelizer(p0)) {
            return;
        }
        write("expected ".concat(String.valueOf(p0)));
        throw new PlanDetailsCreator();
    }

    public final Void write(String p0) throws _parseNumber2 {
        int iMin = Math.min(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer.length());
        StringBuilder sb = new StringBuilder("Error while parsing source information: ");
        sb.append(p0);
        sb.append(" at ");
        String strSubstring = this.AudioAttributesCompatParcelizer.substring(0, iMin);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        sb.append(strSubstring);
        sb.append('|');
        String strSubstring2 = this.AudioAttributesCompatParcelizer.substring(iMin);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
        sb.append(strSubstring2);
        throw new _parseNumber2(sb.toString());
    }

    public final boolean RemoteActionCompatParcelizer(char p0) {
        return this.IconCompatParcelizer < this.AudioAttributesCompatParcelizer.length() && this.AudioAttributesCompatParcelizer.charAt(this.IconCompatParcelizer) == p0;
    }

    public final int RemoteActionCompatParcelizer(String p0) throws _parseNumber2 {
        Integer numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(AudioAttributesCompatParcelizer(p0));
        if (numAudioAttributesImplApi26Parcelizer != null) {
            return numAudioAttributesImplApi26Parcelizer.intValue();
        }
        write("expected int");
        throw new PlanDetailsCreator();
    }

    public final String AudioAttributesCompatParcelizer(String p0) {
        int i = this.IconCompatParcelizer;
        read(p0);
        int i2 = this.IconCompatParcelizer;
        if (i2 <= i) {
            return "";
        }
        String strSubstring = this.AudioAttributesCompatParcelizer.substring(i, i2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final String read() {
        String str = this.AudioAttributesCompatParcelizer;
        String strSubstring = str.substring(this.IconCompatParcelizer, str.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final void read(String p0) {
        while (this.IconCompatParcelizer < this.AudioAttributesCompatParcelizer.length() && !TestGroupLSModel.RemoteActionCompatParcelizer(p0, this.AudioAttributesCompatParcelizer.charAt(this.IconCompatParcelizer), false)) {
            this.IconCompatParcelizer++;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(_parseSignedNumber _parsesignednumber, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        _parsesignednumber.RemoteActionCompatParcelizer(i);
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        this.IconCompatParcelizer += p0;
    }

    public final char RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.charAt(this.IconCompatParcelizer);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer >= this.AudioAttributesCompatParcelizer.length();
    }
}
