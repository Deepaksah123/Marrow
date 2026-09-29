package kotlin;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeWrappedValue {
    private String AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private IconCompat read;
    private CharSequence write;

    public static _deserializeWrappedValue IconCompatParcelizer(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new write().IconCompatParcelizer(bundle.getCharSequence("name")).RemoteActionCompatParcelizer(bundle2 != null ? IconCompat.AudioAttributesCompatParcelizer(bundle2) : null).write(bundle.getString("uri")).IconCompatParcelizer(bundle.getString("key")).RemoteActionCompatParcelizer(bundle.getBoolean("isBot")).AudioAttributesCompatParcelizer(bundle.getBoolean("isImportant")).RemoteActionCompatParcelizer();
    }

    public static _deserializeWrappedValue AudioAttributesCompatParcelizer(Person person) {
        return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(person);
    }

    _deserializeWrappedValue(write writeVar) {
        this.write = writeVar.read;
        this.read = writeVar.RemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = writeVar.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesCompatParcelizer = writeVar.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = writeVar.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = writeVar.write;
    }

    public final Bundle AudioAttributesImplApi26Parcelizer() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.write);
        IconCompat iconCompat = this.read;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.AudioAttributesImplApi26Parcelizer() : null);
        bundle.putString("uri", this.AudioAttributesImplApi21Parcelizer);
        bundle.putString("key", this.AudioAttributesCompatParcelizer);
        bundle.putBoolean("isBot", this.RemoteActionCompatParcelizer);
        bundle.putBoolean("isImportant", this.IconCompatParcelizer);
        return bundle;
    }

    public final Person AudioAttributesImplApi21Parcelizer() {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    public final CharSequence AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final IconCompat write() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof _deserializeWrappedValue)) {
            return false;
        }
        _deserializeWrappedValue _deserializewrappedvalue = (_deserializeWrappedValue) obj;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        String strRemoteActionCompatParcelizer2 = _deserializewrappedvalue.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null && strRemoteActionCompatParcelizer2 == null) {
            return Objects.equals(Objects.toString(AudioAttributesCompatParcelizer()), Objects.toString(_deserializewrappedvalue.AudioAttributesCompatParcelizer())) && Objects.equals(IconCompatParcelizer(), _deserializewrappedvalue.IconCompatParcelizer()) && Objects.equals(Boolean.valueOf(read()), Boolean.valueOf(_deserializewrappedvalue.read())) && Objects.equals(Boolean.valueOf(MediaBrowserCompatCustomActionResultReceiver()), Boolean.valueOf(_deserializewrappedvalue.MediaBrowserCompatCustomActionResultReceiver()));
        }
        return Objects.equals(strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2);
    }

    public final int hashCode() {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            return strRemoteActionCompatParcelizer.hashCode();
        }
        return Objects.hash(AudioAttributesCompatParcelizer(), IconCompatParcelizer(), Boolean.valueOf(read()), Boolean.valueOf(MediaBrowserCompatCustomActionResultReceiver()));
    }

    public static class write {
        boolean AudioAttributesCompatParcelizer;
        String AudioAttributesImplBaseParcelizer;
        String IconCompatParcelizer;
        IconCompat RemoteActionCompatParcelizer;
        CharSequence read;
        boolean write;

        public final write IconCompatParcelizer(CharSequence charSequence) {
            this.read = charSequence;
            return this;
        }

        public final write RemoteActionCompatParcelizer(IconCompat iconCompat) {
            this.RemoteActionCompatParcelizer = iconCompat;
            return this;
        }

        public final write write(String str) {
            this.AudioAttributesImplBaseParcelizer = str;
            return this;
        }

        public final write IconCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        public final write RemoteActionCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(boolean z) {
            this.write = z;
            return this;
        }

        public final _deserializeWrappedValue RemoteActionCompatParcelizer() {
            return new _deserializeWrappedValue(this);
        }
    }

    static class AudioAttributesCompatParcelizer {
        static _deserializeWrappedValue RemoteActionCompatParcelizer(Person person) {
            return new write().IconCompatParcelizer(person.getName()).RemoteActionCompatParcelizer(person.getIcon() != null ? IconCompat.RemoteActionCompatParcelizer(person.getIcon()) : null).write(person.getUri()).IconCompatParcelizer(person.getKey()).RemoteActionCompatParcelizer(person.isBot()).AudioAttributesCompatParcelizer(person.isImportant()).RemoteActionCompatParcelizer();
        }

        static Person AudioAttributesCompatParcelizer(_deserializeWrappedValue _deserializewrappedvalue) {
            return new Person.Builder().setName(_deserializewrappedvalue.AudioAttributesCompatParcelizer()).setIcon(_deserializewrappedvalue.write() != null ? _deserializewrappedvalue.write().MediaBrowserCompatCustomActionResultReceiver() : null).setUri(_deserializewrappedvalue.IconCompatParcelizer()).setKey(_deserializewrappedvalue.RemoteActionCompatParcelizer()).setBot(_deserializewrappedvalue.read()).setImportant(_deserializewrappedvalue.MediaBrowserCompatCustomActionResultReceiver()).build();
        }
    }
}
