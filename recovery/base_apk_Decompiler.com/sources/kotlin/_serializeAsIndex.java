package kotlin;

import android.net.Uri;
import java.io.IOException;
import kotlin.StdKeySerializer;
import kotlin._resolveSuperClass;

/* JADX INFO: loaded from: classes2.dex */
public interface _serializeAsIndex {

    public interface AudioAttributesCompatParcelizer {
        _serializeAsIndex read(_getReferenced _getreferenced, _resolveSuperClass _resolvesuperclass, _isShapeWrittenUsingIndex _isshapewrittenusingindex);
    }

    public interface read {
        void AudioAttributesImplApi26Parcelizer();

        boolean write(Uri uri, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z);
    }

    public interface write {
        void onPrimaryPlaylistRefreshed(_acceptJsonFormatVisitor _acceptjsonformatvisitor);
    }

    EnumSerializer AudioAttributesCompatParcelizer();

    boolean AudioAttributesCompatParcelizer(Uri uri);

    _acceptJsonFormatVisitor IconCompatParcelizer(Uri uri, boolean z);

    default void IconCompatParcelizer(Uri uri) {
    }

    boolean IconCompatParcelizer();

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(Uri uri) throws IOException;

    void RemoteActionCompatParcelizer(read readVar);

    void read() throws IOException;

    void read(Uri uri, StdKeySerializer.read readVar, write writeVar);

    void read(read readVar);

    long write();

    void write(Uri uri);

    boolean write(Uri uri, long j);

    public static final class IconCompatParcelizer extends IOException {
        public final Uri read;

        public IconCompatParcelizer(Uri uri) {
            this.read = uri;
        }
    }

    public static final class RemoteActionCompatParcelizer extends IOException {
        public final Uri RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(Uri uri) {
            this.RemoteActionCompatParcelizer = uri;
        }
    }
}
