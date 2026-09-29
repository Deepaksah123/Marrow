package kotlin;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface handleIoException {

    @submitMagicModule
    public static final class AudioAttributesCompatParcelizer implements handleIoException {
        private final String RemoteActionCompatParcelizer;

        private static boolean read(String str, Object obj) {
            return (obj instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer());
        }

        private static int read(String str) {
            return str.hashCode();
        }

        private static String write(String str) {
            StringBuilder sb = new StringBuilder("JsonString(jsonString=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return read(this.RemoteActionCompatParcelizer, obj);
        }

        public final int hashCode() {
            return read(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            return write(this.RemoteActionCompatParcelizer);
        }

        public final /* synthetic */ String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @submitMagicModule
    public static final class AudioAttributesImplBaseParcelizer implements handleIoException {
        private final String read;

        private static boolean RemoteActionCompatParcelizer(String str, Object obj) {
            return (obj instanceof AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((AudioAttributesImplBaseParcelizer) obj).RemoteActionCompatParcelizer());
        }

        private static int AudioAttributesCompatParcelizer(String str) {
            return str.hashCode();
        }

        private static String read(String str) {
            StringBuilder sb = new StringBuilder("Url(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return RemoteActionCompatParcelizer(this.read, obj);
        }

        public final int hashCode() {
            return AudioAttributesCompatParcelizer(this.read);
        }

        public final String toString() {
            return read(this.read);
        }

        public final /* synthetic */ String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    @submitMagicModule
    public static final class IconCompatParcelizer implements handleIoException {
        private final int RemoteActionCompatParcelizer;

        private static boolean write(int i, Object obj) {
            return (obj instanceof IconCompatParcelizer) && i == ((IconCompatParcelizer) obj).read();
        }

        private static int read(int i) {
            return Integer.hashCode(i);
        }

        private static String IconCompatParcelizer(int i) {
            StringBuilder sb = new StringBuilder("RawRes(resId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return write(this.RemoteActionCompatParcelizer, obj);
        }

        public final int hashCode() {
            return read(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            return IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        public final /* synthetic */ int read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @submitMagicModule
    public static final class RemoteActionCompatParcelizer implements handleIoException {
        private final String AudioAttributesCompatParcelizer;

        private static boolean RemoteActionCompatParcelizer(String str, Object obj) {
            return (obj instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((RemoteActionCompatParcelizer) obj).read());
        }

        private static int write(String str) {
            return str.hashCode();
        }

        private static String read(String str) {
            StringBuilder sb = new StringBuilder("File(fileName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, obj);
        }

        public final int hashCode() {
            return write(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            return read(this.AudioAttributesCompatParcelizer);
        }

        public final /* synthetic */ String read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @submitMagicModule
    public static final class read implements handleIoException {
        private final Uri AudioAttributesCompatParcelizer;

        private static boolean AudioAttributesCompatParcelizer(Uri uri, Object obj) {
            return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, ((read) obj).read());
        }

        private static int RemoteActionCompatParcelizer(Uri uri) {
            return uri.hashCode();
        }

        private static String read(Uri uri) {
            StringBuilder sb = new StringBuilder("ContentProvider(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, obj);
        }

        public final int hashCode() {
            return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            return read(this.AudioAttributesCompatParcelizer);
        }

        public final /* synthetic */ Uri read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @submitMagicModule
    public static final class write implements handleIoException {
        private final String write;

        private /* synthetic */ write(String str) {
            this.write = str;
        }

        public static final /* synthetic */ write IconCompatParcelizer(String str) {
            return new write(str);
        }

        public static String AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return str;
        }

        private static boolean read(String str, Object obj) {
            return (obj instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((write) obj).read());
        }

        private static int RemoteActionCompatParcelizer(String str) {
            return str.hashCode();
        }

        private static String write(String str) {
            StringBuilder sb = new StringBuilder("Asset(assetName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return read(this.write, obj);
        }

        public final int hashCode() {
            return RemoteActionCompatParcelizer(this.write);
        }

        public final String toString() {
            return write(this.write);
        }

        public final /* synthetic */ String read() {
            return this.write;
        }
    }
}
