package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class BasicBeanDescription {
    private AnnotatedWithParams IconCompatParcelizer;
    private volatile constructPropertyCollector read;
    private volatile AnnotatedWithParams write;

    public int hashCode() {
        return 1;
    }

    static {
        asAnnotations.read();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicBeanDescription)) {
            return false;
        }
        BasicBeanDescription basicBeanDescription = (BasicBeanDescription) obj;
        constructPropertyCollector constructpropertycollector = this.read;
        constructPropertyCollector constructpropertycollector2 = basicBeanDescription.read;
        if (constructpropertycollector == null && constructpropertycollector2 == null) {
            return AudioAttributesCompatParcelizer().equals(basicBeanDescription.AudioAttributesCompatParcelizer());
        }
        if (constructpropertycollector != null && constructpropertycollector2 != null) {
            return constructpropertycollector.equals(constructpropertycollector2);
        }
        if (constructpropertycollector != null) {
            return constructpropertycollector.equals(basicBeanDescription.write(constructpropertycollector.handleMediaPlayPauseIfPendingOnHandler()));
        }
        return write(constructpropertycollector2.handleMediaPlayPauseIfPendingOnHandler()).equals(constructpropertycollector2);
    }

    public final constructPropertyCollector write(constructPropertyCollector constructpropertycollector) {
        IconCompatParcelizer(constructpropertycollector);
        return this.read;
    }

    public final constructPropertyCollector AudioAttributesCompatParcelizer(constructPropertyCollector constructpropertycollector) {
        constructPropertyCollector constructpropertycollector2 = this.read;
        this.IconCompatParcelizer = null;
        this.write = null;
        this.read = constructpropertycollector;
        return constructpropertycollector2;
    }

    public final int IconCompatParcelizer() {
        if (this.write != null) {
            return this.write.read();
        }
        if (this.read != null) {
            return this.read.onCustomAction();
        }
        return 0;
    }

    public final AnnotatedWithParams AudioAttributesCompatParcelizer() {
        if (this.write != null) {
            return this.write;
        }
        synchronized (this) {
            if (this.write != null) {
                return this.write;
            }
            if (this.read == null) {
                this.write = AnnotatedWithParams.AudioAttributesCompatParcelizer;
            } else {
                this.write = this.read.MediaDescriptionCompat();
            }
            return this.write;
        }
    }

    private void IconCompatParcelizer(constructPropertyCollector constructpropertycollector) {
        if (this.read == null) {
            synchronized (this) {
                if (this.read != null) {
                    return;
                }
                try {
                    this.read = constructpropertycollector;
                    this.write = AnnotatedWithParams.AudioAttributesCompatParcelizer;
                } catch (_add unused) {
                    this.read = constructpropertycollector;
                    this.write = AnnotatedWithParams.AudioAttributesCompatParcelizer;
                }
            }
        }
    }
}
