package kotlin;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonAnyFormatVisitor {

    /* JADX INFO: loaded from: classes2.dex */
    public interface AudioAttributesCompatParcelizer<D> {
        JsonFormatVisitable<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(JsonFormatVisitable<D> jsonFormatVisitable, D d);

        void onLoaderReset(JsonFormatVisitable<D> jsonFormatVisitable);
    }

    public abstract void RemoteActionCompatParcelizer();

    public abstract <D> JsonFormatVisitable<D> read(AudioAttributesCompatParcelizer<D> audioAttributesCompatParcelizer);

    @Deprecated
    public abstract void write(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static <T extends hasGetter & TypeResolutionContext> JsonAnyFormatVisitor RemoteActionCompatParcelizer(T t) {
        return new JsonBooleanFormatVisitor(t, t.getViewModelStore());
    }
}
