package kotlin;

/* JADX INFO: loaded from: classes.dex */
public interface maybeThrowInternalException {
    read AudioAttributesCompatParcelizer();

    /* JADX INFO: loaded from: classes3.dex */
    public enum read {
        NONE(0),
        /* JADX INFO: Fake field, exist only in values array */
        SDK(1),
        GLOBAL(2),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(3);

        private final int write;

        read(int i) {
            this.write = i;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }
}
