package kotlin;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class packetFinished<T> {
    private final Class<? extends Annotation> RemoteActionCompatParcelizer;
    private final Class<T> write;

    /* JADX INFO: loaded from: classes.dex */
    @interface RemoteActionCompatParcelizer {
    }

    private packetFinished(Class<? extends Annotation> cls, Class<T> cls2) {
        this.RemoteActionCompatParcelizer = cls;
        this.write = cls2;
    }

    public static <T> packetFinished<T> read(Class<T> cls) {
        return new packetFinished<>(RemoteActionCompatParcelizer.class, cls);
    }

    public static <T> packetFinished<T> RemoteActionCompatParcelizer(Class<? extends Annotation> cls, Class<T> cls2) {
        return new packetFinished<>(cls, cls2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        packetFinished packetfinished = (packetFinished) obj;
        if (this.write.equals(packetfinished.write)) {
            return this.RemoteActionCompatParcelizer.equals(packetfinished.RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        if (this.RemoteActionCompatParcelizer == RemoteActionCompatParcelizer.class) {
            return this.write.getName();
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.RemoteActionCompatParcelizer.getName());
        sb.append(" ");
        sb.append(this.write.getName());
        return sb.toString();
    }
}
