package kotlin;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class getAnnotation {
    private final IconCompatParcelizer IconCompatParcelizer;

    interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        Object IconCompatParcelizer();

        ClipDescription RemoteActionCompatParcelizer();

        Uri read();

        Uri write();
    }

    static final class RemoteActionCompatParcelizer implements IconCompatParcelizer {
        final InputContentInfo write;

        RemoteActionCompatParcelizer(Object obj) {
            this.write = (InputContentInfo) obj;
        }

        @Override // o.getAnnotation.IconCompatParcelizer
        public final Uri read() {
            return this.write.getContentUri();
        }

        @Override // o.getAnnotation.IconCompatParcelizer
        public final ClipDescription RemoteActionCompatParcelizer() {
            return this.write.getDescription();
        }

        @Override // o.getAnnotation.IconCompatParcelizer
        public final Uri write() {
            return this.write.getLinkUri();
        }

        @Override // o.getAnnotation.IconCompatParcelizer
        public final Object IconCompatParcelizer() {
            return this.write;
        }

        @Override // o.getAnnotation.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.write.requestPermission();
        }
    }

    private getAnnotation(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final Uri RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.read();
    }

    public final ClipDescription read() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final Uri AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.write();
    }

    public static getAnnotation write(Object obj) {
        if (obj == null) {
            return null;
        }
        return new getAnnotation(new RemoteActionCompatParcelizer(obj));
    }

    public final Object write() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
