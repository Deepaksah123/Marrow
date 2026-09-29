package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface constructPropertyCollector extends forClassAnnotations {

    public interface RemoteActionCompatParcelizer extends forClassAnnotations, Cloneable {
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer(constructPropertyCollector constructpropertycollector);

        constructPropertyCollector read();

        constructPropertyCollector write();
    }

    void AudioAttributesCompatParcelizer(getParameterAnnotations getparameterannotations) throws IOException;

    AnnotatedWithParams MediaDescriptionCompat();

    int onCustomAction();

    RemoteActionCompatParcelizer onMediaButtonEvent();

    RemoteActionCompatParcelizer onPrepareFromMediaId();
}
