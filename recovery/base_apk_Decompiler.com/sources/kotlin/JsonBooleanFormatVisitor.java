package kotlin;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kotlin.JsonAnyFormatVisitor;
import kotlin.JsonFormatVisitable;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
final class JsonBooleanFormatVisitor extends JsonAnyFormatVisitor {
    static boolean AudioAttributesCompatParcelizer = false;
    private final read read;
    private final hasGetter write;

    public static class RemoteActionCompatParcelizer<D> extends POJOPropertyBuilder2<D> implements JsonFormatVisitable.RemoteActionCompatParcelizer<D> {
        private hasGetter AudioAttributesImplApi21Parcelizer;
        private JsonFormatVisitable<D> AudioAttributesImplApi26Parcelizer = null;
        private final JsonFormatVisitable<D> AudioAttributesImplBaseParcelizer;
        private final int IconCompatParcelizer;
        private IconCompatParcelizer<D> MediaBrowserCompatCustomActionResultReceiver;
        private final Bundle write;

        RemoteActionCompatParcelizer(int i, Bundle bundle, JsonFormatVisitable<D> jsonFormatVisitable, JsonFormatVisitable<D> jsonFormatVisitable2) {
            this.IconCompatParcelizer = i;
            this.write = bundle;
            this.AudioAttributesImplBaseParcelizer = jsonFormatVisitable;
            jsonFormatVisitable.registerListener(i, this);
        }

        private JsonFormatVisitable<D> MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        @Override // kotlin.removeIgnored
        public final void RemoteActionCompatParcelizer() {
            boolean z = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.startLoading();
        }

        @Override // kotlin.removeIgnored
        public final void read() {
            boolean z = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.stopLoading();
        }

        final JsonFormatVisitable<D> RemoteActionCompatParcelizer(hasGetter hasgetter, JsonAnyFormatVisitor.AudioAttributesCompatParcelizer<D> audioAttributesCompatParcelizer) {
            IconCompatParcelizer<D> iconCompatParcelizer = new IconCompatParcelizer<>(this.AudioAttributesImplBaseParcelizer, audioAttributesCompatParcelizer);
            AudioAttributesCompatParcelizer(hasgetter, iconCompatParcelizer);
            IconCompatParcelizer<D> iconCompatParcelizer2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (iconCompatParcelizer2 != null) {
                write(iconCompatParcelizer2);
            }
            this.AudioAttributesImplApi21Parcelizer = hasgetter;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
            return this.AudioAttributesImplBaseParcelizer;
        }

        final void MediaBrowserCompatCustomActionResultReceiver() {
            hasGetter hasgetter = this.AudioAttributesImplApi21Parcelizer;
            IconCompatParcelizer<D> iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (hasgetter == null || iconCompatParcelizer == null) {
                return;
            }
            super.write(iconCompatParcelizer);
            AudioAttributesCompatParcelizer(hasgetter, iconCompatParcelizer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.removeIgnored
        public final void write(POJOPropertyBuilder1<? super D> pOJOPropertyBuilder1) {
            super.write(pOJOPropertyBuilder1);
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        }

        final JsonFormatVisitable<D> write() {
            boolean z = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.cancelLoad();
            this.AudioAttributesImplBaseParcelizer.abandon();
            IconCompatParcelizer<D> iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (iconCompatParcelizer != null) {
                write(iconCompatParcelizer);
                iconCompatParcelizer.IconCompatParcelizer();
            }
            this.AudioAttributesImplBaseParcelizer.unregisterListener(this);
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.RemoteActionCompatParcelizer();
            }
            this.AudioAttributesImplBaseParcelizer.reset();
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // o.JsonFormatVisitable.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(JsonFormatVisitable<D> jsonFormatVisitable, D d) {
            boolean z = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                IconCompatParcelizer(d);
            } else {
                boolean z2 = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
                AudioAttributesCompatParcelizer(d);
            }
        }

        @Override // kotlin.POJOPropertyBuilder2, kotlin.removeIgnored
        public final void IconCompatParcelizer(D d) {
            super.IconCompatParcelizer(d);
            JsonFormatVisitable<D> jsonFormatVisitable = this.AudioAttributesImplApi26Parcelizer;
            if (jsonFormatVisitable != null) {
                jsonFormatVisitable.reset();
                this.AudioAttributesImplApi26Parcelizer = null;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.IconCompatParcelizer);
            sb.append(" : ");
            Class<?> cls = this.AudioAttributesImplBaseParcelizer.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }

        public final void RemoteActionCompatParcelizer(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.IconCompatParcelizer);
            printWriter.print(" mArgs=");
            printWriter.println(this.write);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.AudioAttributesImplBaseParcelizer);
            JsonFormatVisitable<D> jsonFormatVisitable = this.AudioAttributesImplBaseParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            jsonFormatVisitable.dump(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.MediaBrowserCompatCustomActionResultReceiver);
                IconCompatParcelizer<D> iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("  ");
                iconCompatParcelizer.IconCompatParcelizer(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(MediaBrowserCompatItemReceiver().dataToString(AudioAttributesCompatParcelizer()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(IconCompatParcelizer());
        }
    }

    static class IconCompatParcelizer<D> implements POJOPropertyBuilder1<D> {
        private boolean AudioAttributesCompatParcelizer = false;
        private final JsonFormatVisitable<D> IconCompatParcelizer;
        private final JsonAnyFormatVisitor.AudioAttributesCompatParcelizer<D> read;

        IconCompatParcelizer(JsonFormatVisitable<D> jsonFormatVisitable, JsonAnyFormatVisitor.AudioAttributesCompatParcelizer<D> audioAttributesCompatParcelizer) {
            this.IconCompatParcelizer = jsonFormatVisitable;
            this.read = audioAttributesCompatParcelizer;
        }

        @Override // kotlin.POJOPropertyBuilder1
        public final void RemoteActionCompatParcelizer(D d) {
            boolean z = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = true;
            this.read.onLoadFinished(this.IconCompatParcelizer, d);
        }

        final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        final void IconCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer) {
                boolean z = JsonBooleanFormatVisitor.AudioAttributesCompatParcelizer;
                this.read.onLoaderReset(this.IconCompatParcelizer);
            }
        }

        public final String toString() {
            return this.read.toString();
        }

        public final void IconCompatParcelizer(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.AudioAttributesCompatParcelizer);
        }
    }

    static class read extends POJOPropertyBuilderWithMember {
        private static final VisibilityChecker.RemoteActionCompatParcelizer write = new VisibilityChecker.RemoteActionCompatParcelizer() { // from class: o.JsonBooleanFormatVisitor.read.5
            @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
            public final <T extends POJOPropertyBuilderWithMember> T read(Class<T> cls) {
                return new read();
            }
        };
        private setSupportButtonTintList<RemoteActionCompatParcelizer> read = new setSupportButtonTintList<>();
        private boolean IconCompatParcelizer = false;

        read() {
        }

        static read RemoteActionCompatParcelizer(hasMixIns hasmixins) {
            return (read) new VisibilityChecker(hasmixins, write).RemoteActionCompatParcelizer(read.class);
        }

        final void AudioAttributesImplBaseParcelizer() {
            this.IconCompatParcelizer = true;
        }

        final boolean AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        final void IconCompatParcelizer() {
            this.IconCompatParcelizer = false;
        }

        final void IconCompatParcelizer(int i, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.read.AudioAttributesCompatParcelizer(i, remoteActionCompatParcelizer);
        }

        final <D> RemoteActionCompatParcelizer<D> RemoteActionCompatParcelizer(int i) {
            return this.read.IconCompatParcelizer(0);
        }

        final void read() {
            int i = this.read.read();
            for (int i2 = 0; i2 < i; i2++) {
                this.read.MediaBrowserCompatCustomActionResultReceiver(i2).MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        @Override // kotlin.POJOPropertyBuilderWithMember
        public void write() {
            super.write();
            int i = this.read.read();
            for (int i2 = 0; i2 < i; i2++) {
                this.read.MediaBrowserCompatCustomActionResultReceiver(i2).write();
            }
            this.read.IconCompatParcelizer();
        }

        public final void write(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.read.read() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String string = sb.toString();
                for (int i = 0; i < this.read.read(); i++) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = this.read.MediaBrowserCompatCustomActionResultReceiver(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.read.AudioAttributesCompatParcelizer(i));
                    printWriter.print(": ");
                    printWriter.println(remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.toString());
                    remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(string, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    JsonBooleanFormatVisitor(hasGetter hasgetter, hasMixIns hasmixins) {
        this.write = hasgetter;
        this.read = read.RemoteActionCompatParcelizer(hasmixins);
    }

    private <D> JsonFormatVisitable<D> read(int i, Bundle bundle, JsonAnyFormatVisitor.AudioAttributesCompatParcelizer<D> audioAttributesCompatParcelizer) {
        try {
            this.read.AudioAttributesImplBaseParcelizer();
            JsonFormatVisitable<D> jsonFormatVisitableOnCreateLoader = audioAttributesCompatParcelizer.onCreateLoader(0, null);
            if (jsonFormatVisitableOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (jsonFormatVisitableOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(jsonFormatVisitableOnCreateLoader.getClass().getModifiers())) {
                StringBuilder sb = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb.append(jsonFormatVisitableOnCreateLoader);
                throw new IllegalArgumentException(sb.toString());
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(0, null, jsonFormatVisitableOnCreateLoader, null);
            this.read.IconCompatParcelizer(0, remoteActionCompatParcelizer);
            this.read.IconCompatParcelizer();
            return remoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write, audioAttributesCompatParcelizer);
        } catch (Throwable th) {
            this.read.IconCompatParcelizer();
            throw th;
        }
    }

    @Override // kotlin.JsonAnyFormatVisitor
    public final <D> JsonFormatVisitable<D> read(JsonAnyFormatVisitor.AudioAttributesCompatParcelizer<D> audioAttributesCompatParcelizer) {
        if (this.read.AudioAttributesCompatParcelizer()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        RemoteActionCompatParcelizer<D> RemoteActionCompatParcelizer2 = this.read.RemoteActionCompatParcelizer(0);
        if (RemoteActionCompatParcelizer2 == null) {
            return read(0, null, audioAttributesCompatParcelizer);
        }
        return RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(this.write, audioAttributesCompatParcelizer);
    }

    @Override // kotlin.JsonAnyFormatVisitor
    public final void RemoteActionCompatParcelizer() {
        this.read.read();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.write.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    @Override // kotlin.JsonAnyFormatVisitor
    @Deprecated
    public final void write(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.read.write(str, fileDescriptor, printWriter, strArr);
    }
}
