package kotlin;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Timeline implements Closeable {
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final Reader RemoteActionCompatParcelizer;
    private final lambdaonReceive0 read;
    private final Map<String, List<String>> write;

    /* JADX WARN: Multi-variable type inference failed */
    public Timeline(lambdaonReceive0 lambdaonreceive0, int i, Map<String, ? extends List<String>> map, InputStream inputStream, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(lambdaonreceive0, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.read = lambdaonreceive0;
        this.IconCompatParcelizer = i;
        this.write = map;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.RemoteActionCompatParcelizer = inputStream != null ? new BufferedReader(new InputStreamReader(inputStream, getSubmissionTimestamp.IconCompatParcelizer), 8192) : null;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer == 200;
    }

    public final String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        List<String> list = this.write.get(str);
        if (list != null) {
            return (String) IntermediateLoginResponseBody.MediaMetadataCompat((List) list);
        }
        return null;
    }

    public final String write() {
        Reader reader = this.RemoteActionCompatParcelizer;
        if (reader != null) {
            return getMagicModuleDetail.write(reader);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Reader reader = this.RemoteActionCompatParcelizer;
        if (reader != null) {
            reader.close();
        }
        this.AudioAttributesCompatParcelizer.invoke();
    }
}
