package kotlin;

import java.lang.annotation.Annotation;
import kotlin.InterfaceC0165copy;

/* JADX INFO: loaded from: classes5.dex */
public final class AsynchronousMediaCodecAdapter1 {
    private InterfaceC0165copy.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = InterfaceC0165copy.AudioAttributesCompatParcelizer.DEFAULT;
    private int write;

    public final AsynchronousMediaCodecAdapter1 AudioAttributesCompatParcelizer(int i) {
        this.write = i;
        return this;
    }

    public static AsynchronousMediaCodecAdapter1 write() {
        return new AsynchronousMediaCodecAdapter1();
    }

    public final InterfaceC0165copy AudioAttributesCompatParcelizer() {
        return new read(this.write, this.AudioAttributesCompatParcelizer);
    }

    static final class read implements InterfaceC0165copy {
        private final InterfaceC0165copy.AudioAttributesCompatParcelizer read;
        private final int write;

        read(int i, InterfaceC0165copy.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.write = i;
            this.read = audioAttributesCompatParcelizer;
        }

        @Override // java.lang.annotation.Annotation
        public final Class<? extends Annotation> annotationType() {
            return InterfaceC0165copy.class;
        }

        @Override // kotlin.InterfaceC0165copy
        public final int IconCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.InterfaceC0165copy
        public final InterfaceC0165copy.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            return this.read;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC0165copy)) {
                return false;
            }
            InterfaceC0165copy interfaceC0165copy = (InterfaceC0165copy) obj;
            return this.write == interfaceC0165copy.IconCompatParcelizer() && this.read.equals(interfaceC0165copy.RemoteActionCompatParcelizer());
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (this.write ^ 14552422) + (this.read.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            StringBuilder sb = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
            sb.append(this.write);
            sb.append("intEncoding=");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }
    }
}
