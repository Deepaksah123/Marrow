package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
abstract class hasName<T, B> {
    abstract int AudioAttributesCompatParcelizer(T t);

    abstract void AudioAttributesCompatParcelizer(Object obj, B b);

    abstract T AudioAttributesImplBaseParcelizer(B b);

    abstract B IconCompatParcelizer(Object obj);

    abstract void IconCompatParcelizer(Object obj, T t);

    abstract B RemoteActionCompatParcelizer();

    abstract T RemoteActionCompatParcelizer(Object obj);

    abstract T RemoteActionCompatParcelizer(T t, T t2);

    abstract void RemoteActionCompatParcelizer(B b, int i, long j);

    abstract void RemoteActionCompatParcelizer(B b, int i, T t);

    abstract int read(T t);

    abstract void read(B b, int i, long j);

    abstract void read(B b, int i, AnnotatedWithParams annotatedWithParams);

    abstract void read(T t, CollectorBase collectorBase) throws IOException;

    abstract void write(Object obj);

    abstract void write(B b, int i, int i2);

    abstract void write(T t, CollectorBase collectorBase) throws IOException;

    hasName() {
    }

    final boolean RemoteActionCompatParcelizer(B b, getGetter getgetter) throws IOException {
        int i = getgetter.read();
        int i2 = _ignorableAnnotation.read(i);
        int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(i);
        if (iRemoteActionCompatParcelizer == 0) {
            RemoteActionCompatParcelizer(b, i2, getgetter.MediaBrowserCompatMediaItem());
            return true;
        }
        if (iRemoteActionCompatParcelizer == 1) {
            read(b, i2, getgetter.MediaBrowserCompatCustomActionResultReceiver());
            return true;
        }
        if (iRemoteActionCompatParcelizer == 2) {
            read(b, i2, getgetter.AudioAttributesCompatParcelizer());
            return true;
        }
        if (iRemoteActionCompatParcelizer != 3) {
            if (iRemoteActionCompatParcelizer == 4) {
                return false;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                write(b, i2, getgetter.AudioAttributesImplBaseParcelizer());
                return true;
            }
            throw _add.write();
        }
        B bRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(i2, 4);
        read(bRemoteActionCompatParcelizer, getgetter);
        if (iRemoteActionCompatParcelizer2 != getgetter.read()) {
            throw _add.IconCompatParcelizer();
        }
        RemoteActionCompatParcelizer(b, i2, AudioAttributesImplBaseParcelizer(bRemoteActionCompatParcelizer));
        return true;
    }

    private void read(B b, getGetter getgetter) throws IOException {
        while (getgetter.IconCompatParcelizer() != Integer.MAX_VALUE && RemoteActionCompatParcelizer((Object) b, getgetter)) {
        }
    }
}
