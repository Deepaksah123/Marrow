package kotlin;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class StdKeyDeserializers implements StdKeyDeserializerStringKD {
    private final LocaleList AudioAttributesCompatParcelizer;

    StdKeyDeserializers(Object obj) {
        this.AudioAttributesCompatParcelizer = (LocaleList) obj;
    }

    @Override // kotlin.StdKeyDeserializerStringKD
    public final Object write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.StdKeyDeserializerStringKD
    public final Locale write(int i) {
        return this.AudioAttributesCompatParcelizer.get(i);
    }

    @Override // kotlin.StdKeyDeserializerStringKD
    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    @Override // kotlin.StdKeyDeserializerStringKD
    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    public final boolean equals(Object obj) {
        return this.AudioAttributesCompatParcelizer.equals(((StdKeyDeserializerStringKD) obj).write());
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        return this.AudioAttributesCompatParcelizer.toString();
    }

    @Override // kotlin.StdKeyDeserializerStringKD
    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.toLanguageTags();
    }
}
