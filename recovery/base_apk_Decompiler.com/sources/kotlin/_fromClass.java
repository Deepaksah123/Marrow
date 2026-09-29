package kotlin;

import java.util.UUID;
import kotlin._fromClass;

/* JADX INFO: loaded from: classes2.dex */
public final class _fromClass {
    public final String AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final String read;
    public final write write;

    public interface IconCompatParcelizer {
        _fromClass write(JsonSerializableSchema jsonSerializableSchema);

        static {
            new IconCompatParcelizer() { // from class: o._fromParamType
                @Override // o._fromClass.IconCompatParcelizer
                public final _fromClass write(JsonSerializableSchema jsonSerializableSchema) {
                    return _fromClass.IconCompatParcelizer.read(jsonSerializableSchema);
                }
            };
        }

        static /* synthetic */ _fromClass read(JsonSerializableSchema jsonSerializableSchema) {
            String str;
            String string = UUID.randomUUID().toString();
            if (jsonSerializableSchema.write != null) {
                str = jsonSerializableSchema.write;
            } else {
                str = "";
            }
            return new _fromClass(string, str, new write() { // from class: o._fromClass.IconCompatParcelizer.5
            });
        }
    }

    public interface write {
        default boolean RemoteActionCompatParcelizer() {
            return true;
        }

        default onContainerAtomRead<String, String> AudioAttributesCompatParcelizer() {
            return onContainerAtomRead.IconCompatParcelizer();
        }
    }

    public _fromClass(String str, String str2, write writeVar) {
        this(str, str2, writeVar, (byte) 0);
    }

    private _fromClass(String str, String str2, write writeVar, byte b) {
        boolean z = true;
        buildTypeSerializer.IconCompatParcelizer(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z = false;
        }
        buildTypeSerializer.IconCompatParcelizer(z);
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.write = writeVar;
        this.IconCompatParcelizer = 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean write() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean read() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean MediaDescriptionCompat() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean onCommand() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean IconCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean RatingCompat() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean MediaMetadataCompat() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }
}
