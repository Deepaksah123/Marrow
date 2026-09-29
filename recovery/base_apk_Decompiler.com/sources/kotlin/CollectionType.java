package kotlin;

import java.io.IOException;
import java.util.List;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public interface CollectionType {

    /* JADX INFO: loaded from: classes4.dex */
    public interface AudioAttributesCompatParcelizer {
        default AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            return this;
        }

        default C0170format IconCompatParcelizer(C0170format c0170format) {
            return c0170format;
        }

        CollectionType RemoteActionCompatParcelizer(int i, C0170format c0170format, boolean z, List<C0170format> list, nonNullString nonnullstring);

        default AudioAttributesCompatParcelizer write(boolean z) {
            return this;
        }
    }

    public interface write {
        nonNullString RemoteActionCompatParcelizer(int i);
    }

    void AudioAttributesCompatParcelizer();

    _failGetClassMethods IconCompatParcelizer();

    void read(write writeVar, long j, long j2);

    boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException;

    C0170format[] write();
}
