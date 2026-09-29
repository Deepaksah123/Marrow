package kotlin;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setOnKeyStatusChangeListener {
    public abstract long read();

    private static setOnKeyStatusChangeListener read(long j) {
        return new openSession(j);
    }

    public static setOnKeyStatusChangeListener AudioAttributesCompatParcelizer(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return read(Long.parseLong(jsonReader.nextString()));
                    }
                    return read(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
