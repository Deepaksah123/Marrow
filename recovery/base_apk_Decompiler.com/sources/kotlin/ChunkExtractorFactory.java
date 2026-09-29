package kotlin;

import java.util.HashMap;
import kotlin.ChunkHolder;

/* JADX INFO: loaded from: classes.dex */
public final class ChunkExtractorFactory implements ChunkHolder {
    private static final HashMap<String, Boolean> RemoteActionCompatParcelizer = new HashMap<>();
    private final ChunkHolder.read AudioAttributesCompatParcelizer;

    public ChunkExtractorFactory(ChunkHolder.read readVar) {
        this.AudioAttributesCompatParcelizer = readVar;
    }

    public static void read() {
        RemoteActionCompatParcelizer.clear();
    }

    @Override // kotlin.ChunkHolder
    public final boolean IconCompatParcelizer(String str) {
        HashMap<String, Boolean> map = RemoteActionCompatParcelizer;
        Boolean boolValueOf = map.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str));
            map.put(str, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // kotlin.ChunkHolder
    public final boolean read(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        String string = sb.toString();
        HashMap<String, Boolean> map = RemoteActionCompatParcelizer;
        Boolean boolValueOf = map.get(string);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.AudioAttributesCompatParcelizer.read(str, str2));
            map.put(string, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // kotlin.ChunkHolder
    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.ChunkHolder
    public final boolean MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.ChunkHolder
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("video");
    }

    @Override // kotlin.ChunkHolder
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.ChunkHolder
    public final String write() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.ChunkHolder
    public final String[][] MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.ChunkHolder
    public final String[][] RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.ChunkHolder
    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.write();
    }
}
