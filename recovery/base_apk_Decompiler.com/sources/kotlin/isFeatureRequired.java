package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public enum isFeatureRequired {
    /* JADX INFO: Fake field, exist only in values array */
    TERABYTES { // from class: o.isFeatureRequired.1
    },
    /* JADX INFO: Fake field, exist only in values array */
    GIGABYTES { // from class: o.isFeatureRequired.4
    },
    MEGABYTES { // from class: o.isFeatureRequired.5
    },
    KILOBYTES { // from class: o.isFeatureRequired.3
    },
    BYTES { // from class: o.isFeatureRequired.2
    };

    private long IconCompatParcelizer;

    /* synthetic */ isFeatureRequired(long j, byte b) {
        this(j);
    }

    isFeatureRequired(long j) {
        this.IconCompatParcelizer = j;
    }

    public final long IconCompatParcelizer(long j) {
        return (j * this.IconCompatParcelizer) / KILOBYTES.IconCompatParcelizer;
    }
}
